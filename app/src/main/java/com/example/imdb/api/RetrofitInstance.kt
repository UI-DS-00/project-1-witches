package com.example.imdb.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {
    const val API_KEY = "4728bb48a4a73a20e3b4109dc6d55114"
    const val BASE_URL = "https://api.themoviedb.org/"

    var client: RetrofitService? = null
    fun getRetrofitInstance(): RetrofitService? {
        if (client == null)
            client = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitService::class.java)
        return client
    }

//    fun getData(): RetrofitApi {
////        val okHttpClient = OkHttpClient().newBuilder()
////            .connectTimeout(60, TimeUnit.SECONDS)
////            .readTimeout(60, TimeUnit.SECONDS)
////            .writeTimeout(60, TimeUnit.SECONDS)
////            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
////            .build()
//
//
//        val retrofitBuilder = Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            //.client(okHttpClient)
//            .build()
//            .create(RetrofitApi::class.java)!!
//
//        return retrofitBuilder;
//    }
}