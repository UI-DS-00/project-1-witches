package com.example.imdb.api

import com.example.imdb.model.Movie
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface MovieApi {

    @GET
    fun getMovies(): Call<List<Movie>>

}