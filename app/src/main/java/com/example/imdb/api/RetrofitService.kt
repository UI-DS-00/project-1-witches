package com.example.imdb.api

import com.example.imdb.model.Account
import com.example.imdb.model.Artist
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface RetrofitService {


    @GET("/3/movie/popular")
    fun getMovies(@Query("api_key") apiKey: String): Call<MovieResponse >

    @GET("/3/account")
    fun getAccounts(@Query("api_key") apiKey: String): Call<ArrayList<Account>>

    

}