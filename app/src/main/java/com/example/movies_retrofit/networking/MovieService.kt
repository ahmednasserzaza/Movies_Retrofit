package com.example.movies_retrofit.networking

import com.example.movies_retrofit.data.model.PopularMoviesResponse
import com.example.movies_retrofit.data.model.configuration.ConfigurationResponse
import retrofit2.Response
import retrofit2.http.*


interface MovieService {

    @GET("movie/{movie_id}")
    suspend fun getMovieInfo(
        @Path("movie_id") movieId:Int ,
        @Query("api_key") apiKey:String
    ):Response<PopularMoviesResponse>

    @GET("configuration?")
    suspend fun getMovieConfiguration(
        @Query("api_key") apiKey:String
    ) : Response<ConfigurationResponse>

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey:String
    ) : Response<PopularMoviesResponse>

}