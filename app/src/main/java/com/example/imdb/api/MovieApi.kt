package com.example.imdb.api

import com.example.imdb.model.Movie
import retrofit2.http.GET

interface MovieApi {

    @GET("movie")
    suspend fun getMovie(): Movie
}