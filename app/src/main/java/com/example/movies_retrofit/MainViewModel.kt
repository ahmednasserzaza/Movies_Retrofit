package com.example.movies_retrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.movies_retrofit.data.MovieRepository
import com.example.movies_retrofit.data.model.Movie

class MainViewModel : ViewModel() , MovieInteractionListener {

    private val repository = MovieRepository()
    val popularMovies = repository.getPopularMovies().asLiveData()

    val movieConfig = repository.getMovieConfig().asLiveData()

    override fun onClickMovie(movie: Movie) {

    }

}