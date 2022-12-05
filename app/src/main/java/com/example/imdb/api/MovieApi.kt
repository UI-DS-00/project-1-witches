package com.example.imdb.api

import com.example.imdb.model.Movie
import retrofit2.Response
import retrofit2.http.GET

interface MovieApi {

    @GET("Movie")
    suspend fun getMovies(): Response<List<Movie>>
}