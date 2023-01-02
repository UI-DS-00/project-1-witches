package com.example.imdb.model

data class Account(
     var id: Int,
     var userName: String,
     var password: String,
     var email: String){

    

    var favoriteLists: ArrayList<FavoriteList>? = null
    var watchlist: ArrayList<Movie>? = null
}