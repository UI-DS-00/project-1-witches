package logic.imdb

internal class Account
    (var numberAccount: Int, var userName: String, var password: String, var email: String){

    init {
        numAccount++
    }

    companion object {
        var numAccount = 1
    }

    var favoriteLists: ArrayList<FavoriteList>? = null
    var watchlist: ArrayList<Movie>? = null
}