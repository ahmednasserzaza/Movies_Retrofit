package com.example.movies_retrofit

import com.example.movies_retrofit.data.model.Movie

class MoviesAdapter(items:List<Movie>, listener: MovieInteractionListener): BaseAdapter<Movie>(items , listener ) {
    override val layoutId: Int = R.layout.item_movie

}

interface MovieInteractionListener : BaseInterActionListener{
    fun onClickMovie(movie: Movie)
}