package com.example.imdb.api

import com.example.imdb.model.Account
import retrofit2.Response
import retrofit2.http.POST

interface AccountApi {

    @POST("accounts")
    suspend fun getAccounts(): Response<List<Account>>
}