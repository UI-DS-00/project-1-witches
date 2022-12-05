package imdb.model

import java.time.Year

class Movie (var tConst: String,
             var titleType: String,
             var primaryTitle: String,
             var originalTitle: String,
             var isAdult: Boolean,
             var startYear: Year,
             var endYear: Year,
             var country: String,
             var runtimeMinutes: Int,
             var genres: ArrayList<String>){

    var point: Int? = null
    var comments: ArrayList<Comment>? = null
    var replies: ArrayList<Reply>? = null

}

