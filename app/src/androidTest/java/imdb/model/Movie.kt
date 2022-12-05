package imdb.model

data  class Movie (
             var imdbID: String,
             var title: String,
             var originalLanguage: String,
             var originalTitle: String,
             var adult: Boolean,
             var releaseDate: String,
             var country: ArrayList<String>,
             var runtimeMinutes: Int,
             var genres: ArrayList<String>,
             var voteAverage: Double
             ){

//    var comments: ArrayList<Comment>? = null

}

