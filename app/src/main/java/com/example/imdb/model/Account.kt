package com.example.imdb.model

import androidx.room.Entity
import androidx.room.PrimaryKey


data class Account(
     var id: Int,
     var userName: String,
     var password: String,
     var email: String){
    var favoriteLists: ArrayList<FavoriteList>? = null
    var watchlist: ArrayList<Movie>? = null
}