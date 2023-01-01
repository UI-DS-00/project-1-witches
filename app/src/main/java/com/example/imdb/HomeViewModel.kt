package com.example.imdb

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.imdb.api.RetrofitInstance
import com.example.imdb.api.RetrofitInstance.API_KEY
import com.example.imdb.model.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit

class HomeViewModel : ViewModel() {
    val movieList = MutableLiveData<ArrayList<Movie>>()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = RetrofitInstance.getRetrofitInstance()?.getMovies(apiKey = API_KEY)?.execute()
                Log.d(
                    "HomeViewModel",
                    "init:Response " + response?.body() + "  code:  " + response?.code()
                + "\n " + response?.errorBody().toString()
                )
                movieList.postValue(response?.body()!!.dataMovies as ArrayList<Movie>?)
            } catch (e: Exception) {
                e.printStackTrace()
                Log.e("HomeViewModel", "init:ERROR ", e)
            }
        }
    }

}