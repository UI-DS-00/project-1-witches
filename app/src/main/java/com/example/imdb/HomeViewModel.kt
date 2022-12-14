package com.example.imdb

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.imdb.api.Retrofit
import com.example.imdb.api.Retrofit.API_KEY
import com.example.imdb.model.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    val movieList = MutableLiveData<List<Movie>>()

    init {
        movieList.value = emptyList()
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = Retrofit.getClient().getMovies(apiKey = API_KEY).execute()
                Log.d(
                    "HomeViewModel",
                    "init:Response " + response.body() + "  code:  " + response.code()
                + "\n " + response.errorBody().toString()
                )
                movieList.postValue(response.body()!!)
            } catch (e: Exception) {
                e.printStackTrace()
                Log.e("HomeViewModel", "init:ERROR ", e)
            }
        }
    }
}