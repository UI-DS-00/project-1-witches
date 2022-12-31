package com.example.imdb.model

class Account(
    var id: Int,
    var userName: String,
    var password: String,
    var email: String){

    init {
        id = number++
    }

    companion object{
        var number = 1
    }



    var favoriteLists: ArrayList<FavoriteList>? = null
    var watchlist: ArrayList<Movie>? = null
}