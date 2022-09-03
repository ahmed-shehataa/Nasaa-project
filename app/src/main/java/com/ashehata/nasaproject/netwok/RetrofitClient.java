package com.ashehata.nasaproject.netwok;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// TODO
public class RetrofitClient {

    public static NasaApi create() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.nasa.gov/neo/rest/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(NasaApi.class);
    }
}
