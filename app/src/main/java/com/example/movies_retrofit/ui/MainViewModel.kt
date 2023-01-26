package com.example.movies_retrofit.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.movies_retrofit.data.repositories.MovieRepository
import com.example.movies_retrofit.data.model.Movie

class MainViewModel : ViewModel() , MovieInteractionListener {

    private val repository = MovieRepository()

    val popularMovies = repository.getPopularMovies().asLiveData()

    override fun onClickMovie(movie: Movie) {

    }

}