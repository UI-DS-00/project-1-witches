package com.example.imdb.api

import com.example.imdb.model.Account
import com.example.imdb.model.Movie
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MovieRetrofit {
    const val API_KEY = "4728Bb48a4a73a20e3b4109dc6d55114"

    val retrofitBuilder = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.themoviedb.org/")
        .build()
        .create(MovieApi::class.java)!!
}