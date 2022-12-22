package com.example.imdb.model

import com.google.gson.annotations.SerializedName

data class Account(
    @SerializedName("id")
     var id: Int,
    @SerializedName("username")
     var userName: String,
     var password: String,
    @SerializedName("name")
     var email: String){

    

    var favoriteLists: ArrayList<FavoriteList>? = null
    var watchlist: ArrayList<Movie>? = null
}