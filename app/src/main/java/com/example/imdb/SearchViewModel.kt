package com.example.imdb

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.imdb.model.Movie

class SearchViewModel : ViewModel() {

    var movieList: MutableLiveData<ArrayList<Movie>>? = null

    // فیلتر بر اساس سال انتشار
    fun searchBaseYear(year: String): MutableLiveData<ArrayList<Movie>>? {
        var movies: MutableLiveData<ArrayList<Movie>>? = null

        movieList!!.value!!.forEach{
            if (it.releaseDate.equals(year)){
                movies?.value?.add(it)
            }
        }

        return movies
     }

    // فیلتر بر اساس ژانر
    fun searchBaseGenre(genre: String): MutableLiveData<ArrayList<Movie>>? {
        var movies: MutableLiveData<ArrayList<Movie>>? = null

        movieList!!.value!!.forEach{
            if (it.releaseDate.equals(genre)){
                movies?.value?.add(it)
            }
        }

        return movies
    }

    // فیلتر بر اساس کشور
    fun searchBaseCountry(country: String): MutableLiveData<ArrayList<Movie>>? {
        var movies: MutableLiveData<ArrayList<Movie>>? = null

        movieList!!.value!!.forEach{
            if (it.releaseDate.equals(country)){
                movies?.value?.add(it)
            }
        }

        return movies
    }
}