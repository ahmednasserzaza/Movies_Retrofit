package com.example.movies_retrofit.data

import android.util.Log
import com.example.movies_retrofit.data.model.State
import com.example.movies_retrofit.networking.API
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class MovieRepository {

    fun getMovieConfig() = wrapWithFlow { API.apiService.getMovieConfiguration(Constants.API_KEY) }
    fun getPopularMovies() = wrapWithFlow { API.apiService.getPopularMovies(Constants.API_KEY) }


    fun <T> wrapWithFlow(function: suspend () -> Response<T>): Flow<State<T?>> {
        return flow {
            emit(State.Loading)
            try {
                val result = function()
                if (result.isSuccessful) {
                    emit(State.Success(result.body()))
                } else {
                    emit(State.Error(result.message()))
                    Log.i("ERROR_LOG", result.code().toString())
                }
            } catch (e: Exception) {
                emit(State.Error(e.message.toString()))
                Log.i("ERROR_LOG", e.message.toString())
            }

        }
    }
}