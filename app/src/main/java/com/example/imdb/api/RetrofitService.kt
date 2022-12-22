package com.example.imdb.api

import com.example.imdb.model.Account
import com.example.imdb.model.Artist
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {


    @GET("/3/movie/popular")
    fun getMovies(@Query("api_key") apiKey: String): Call<MovieResponse >

    @GET("/3/account")
    fun getAccount(@Query("api_key") apiKey: String): Call<ArrayList<Account>>

    //@GET()
//    fun getArtist(): Call<List<Artist>>


}