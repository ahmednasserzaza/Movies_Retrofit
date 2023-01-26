package com.example.movies_retrofit.networking

import com.example.movies_retrofit.data.model.PopularMoviesResponse
import retrofit2.Response
import retrofit2.http.*

interface MovieService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey:String
    ) : Response<PopularMoviesResponse>

}