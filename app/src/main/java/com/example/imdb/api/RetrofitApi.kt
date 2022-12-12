package com.example.imdb.api

import com.example.imdb.model.Account
import com.example.imdb.model.Artist
import com.example.imdb.model.Movie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitApi {

    @GET("3/movie/popular")
    fun getMovies(@Query("api_key") apiKey:String): Call<List<Movie>>

    @GET("accounts")
    fun getAccount(): Call<List<Account>>

    @GET()
    fun getArtist(): Call<List<Artist>>

}