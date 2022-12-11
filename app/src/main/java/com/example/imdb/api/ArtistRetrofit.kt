package com.example.imdb.api

import com.example.imdb.model.Artist
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ArtistRetrofit {

    private val retrofitBuilder = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.themoviedb.org")
        .build()
        .create(ArtistApi::class.java)

    private val retrofitArtist = retrofitBuilder.getArtist()

    fun getArtist(){

        retrofitArtist.enqueue(object : Callback<List<Artist>?> {
            override fun onResponse(call: Call<List<Artist>?>, response: Response<List<Artist>?>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<List<Artist>?>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}