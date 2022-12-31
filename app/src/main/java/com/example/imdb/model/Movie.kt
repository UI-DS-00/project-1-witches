package com.example.imdb.model

import com.google.gson.annotations.SerializedName

class Movie (
             @SerializedName("id")
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
             @SerializedName("poster_path")
             var image: String,
             @SerializedName("backdrop_path")
             var backdropImage: String
){

//    var comments: ArrayList<Comment>? = null

}

