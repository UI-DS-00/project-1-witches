package com.example.imdb.api

import com.example.imdb.model.Account
import retrofit2.Call
import retrofit2.http.GET

interface AccountApi {

    @GET("accounts")
    fun getAccount(): Call<List<Account>>

}