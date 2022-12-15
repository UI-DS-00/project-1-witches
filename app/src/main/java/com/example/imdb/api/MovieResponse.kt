package com.example.imdb.api

import com.example.imdb.model.Movie
import com.google.gson.annotations.SerializedName

data class MovieResponse(
    val page:Int,
    @SerializedName("results")
    val dataMovies:List<Movie>,
    val total_pages:Int,
    val total_results:Int

    )
