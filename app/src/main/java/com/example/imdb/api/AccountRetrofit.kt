package com.example.imdb.api

import com.example.imdb.model.Account
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AccountRetrofit {

    private val retrofitBuilder = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.themoviedb.org")
        .build()
        .create(AccountApi::class.java)!!

    private val retrofitAccount = retrofitBuilder.getAccount()

    fun getAccount(){

        retrofitAccount.enqueue(object : Callback<List<Account>?> {
            override fun onResponse(
                call: Call<List<Account>?>,
                response: Response<List<Account>?>
            ) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<List<Account>?>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}