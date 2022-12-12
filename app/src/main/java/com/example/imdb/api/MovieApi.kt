package com.example.imdb.api

import com.example.imdb.model.Movie
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("3/movie/popular")
    fun getMovies(@Query("api_key") apiKey:String): Call<List<Movie>>

}