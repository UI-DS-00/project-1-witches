package imdb.api

import retrofit2.Retrofit

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
    }
}