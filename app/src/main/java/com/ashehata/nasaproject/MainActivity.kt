package com.ashehata.nasaproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ashehata.nasaproject.netwok.MyResponse
import com.ashehata.nasaproject.netwok.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFeed = RetrofitClient.create().getFeed(
            start = "2015-09-07",
            end = "2015-09-08",
            apiKey = "hXe4m2kjtxxyKZdfn4V2kP5uiseTPDqaUiiQrFDE"
        )


        myFeed.enqueue(object : Callback<MyResponse?> {
            override fun onResponse(call: Call<MyResponse?>, response: Response<MyResponse?>) {
                if (response.isSuccessful) {
                    val count = response.body()?.toMapTosimple()
                    Toast.makeText(this@MainActivity, count.toString(), Toast.LENGTH_SHORT).show()

                } else {
                    Toast.makeText(this@MainActivity, "Faild", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<MyResponse?>, t: Throwable) {
                Toast.makeText(this@MainActivity, t.localizedMessage, Toast.LENGTH_SHORT).show()

            }
        })

    }
}

data class Model(
    var name: String
)

private fun MyResponse?.toMapTosimple(): List<Model>? {
    return this?.nearEarthObjects?.x20150907?.map {
        return@map Model(name = it?.name.toString())
    }
}