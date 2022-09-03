package com.ashehata.nasaproject.netwok

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

// TODO
interface NasaApi {

    /*
    * GET("cars") -> list of cars
     */

    /*
   * GET("houses") -> list of houses
    */

    @GET("feed")
    fun getFeed(
        @Query("start_date") start: String,
        @Query("end_date") end: String,
        @Query("api_key") apiKey: String,
    ) : Call<MyResponse>

}