package com.example.imdb.api

import com.example.imdb.model.Account
import com.example.imdb.model.Movie
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MovieRetrofit {

    private val retrofitBuilder = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.themoviedb.org")
        .build()
        .create(MovieApi::class.java)!!

    private val retrofitMovie = retrofitBuilder.getMovies()

    fun getMovie(){

        retrofitMovie.enqueue(object : Callback<List<Movie>?> {
            override fun onResponse(call: Call<List<Movie>?>, response: Response<List<Movie>?>) {
                val responseBody = response.body()!!

                val movies = StringBuilder()

                for (Movie in responseBody){
                    movies.append(Movie.title)
                    movies.append("\n")
                }

            }

            override fun onFailure(call: Call<List<Movie>?>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

}