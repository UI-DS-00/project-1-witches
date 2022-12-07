package com.example.imdb.model

import com.google.gson.annotations.SerializedName

data class Movie (
             @SerializedName("imdb_id")
             var imdbID: String,
             @SerializedName("title")
             var title: String,
             @SerializedName("original_title")
             var originalTitle: String,
             @SerializedName("original_language")
             var originalLanguage: String,
             @SerializedName("adult")
             var adult: Boolean,
             @SerializedName("release_date")
             var releaseDate: String,
             @SerializedName("production_countries")
             var countries: ArrayList<String>,
             @SerializedName("runtime")
             var runtimeMinutes: Int,
             @SerializedName("genres")
             var genres: ArrayList<String>,
             @SerializedName("vote_average ")
             var voteAverage: Double,
             var image: String
             ){

//    var comments: ArrayList<Comment>? = null

}

