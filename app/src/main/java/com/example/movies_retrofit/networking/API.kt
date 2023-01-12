package com.example.movies_retrofit.networking

import com.example.movies_retrofit.data.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object API {

    private val retrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiService: MovieService = retrofit.create(MovieService::class.java)

}
