package com.example.imdb

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
        viewModelScope.launch(Dispatchers.Default) {
            try {
                val response = Retrofit.retrofitBuilder.getMovies(apiKey = API_KEY).execute()

                movieList.value = response.body()
            }catch (e:Exception){

            }
        }
    }
}