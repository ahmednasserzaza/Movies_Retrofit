package com.example.movies_retrofit.ui

import com.example.movies_retrofit.R
import com.example.movies_retrofit.data.model.Movie
import com.example.movies_retrofit.ui.base.BaseAdapter
import com.example.movies_retrofit.ui.base.BaseInterActionListener

class MoviesAdapter(items:List<Movie>, listener: MovieInteractionListener): BaseAdapter<Movie>(items , listener ) {
    override val layoutId: Int = R.layout.item_movie
}

interface MovieInteractionListener : BaseInterActionListener {
    fun onClickMovie(movie: Movie)
}