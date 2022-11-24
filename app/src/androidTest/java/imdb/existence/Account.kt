package imdb.existence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "account_table")
data class Account(
     @PrimaryKey(autoGenerate = true)
     var numberAccount: Int,
     var userName: String,
     var password: String,
     var email: String){

    init {
        numAccount++
    }

    companion object {
        var numAccount = 1
    }

    var favoriteLists: ArrayList<FavoriteList>? = null
    var watchlist: ArrayList<Movie>? = null
}