package com.example.imdb.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {
    const val API_KEY = "4728Bb48a4a73a20e3b4109dc6d55114"

    val retrofitBuilder = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.themoviedb.org/")
        .build()
        .create(RetrofitApi::class.java)!!
}