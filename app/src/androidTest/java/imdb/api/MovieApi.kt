package imdb.api

import imdb.model.Movie
import retrofit2.http.GET

interface MovieApi {

    @GET("movies")
    suspend fun getMovies(): Movie
}