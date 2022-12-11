package com.example.imdb.api

import com.example.imdb.model.Artist
import retrofit2.Call
import retrofit2.http.GET

interface ArtistApi {

    @GET
    fun getArtist(): Call<List<Artist>>

}