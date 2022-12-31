package com.example.imdb

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.imdb.model.Movie

class HomeViewModel : ViewModel() {
    val movieList = MutableLiveData<ArrayList<Movie>>()

    init {
        /*viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = Retrofit.getClient().getMovies(apiKey = API_KEY).execute()
                Log.d(
                    "HomeViewModel",
                    "init:Response " + response.body() + "  code:  " + response.code()
                + "\n " + response.errorBody().toString()
                )
                movieList.postValue(response.body()!!.dataMovies as ArrayList<Movie>?)
            } catch (e: Exception) {
                e.printStackTrace()
                Log.e("HomeViewModel", "init:ERROR ", e)
            }
        }*/
    }

}