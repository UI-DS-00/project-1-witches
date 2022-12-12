package com.example.imdb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imdb.api.MovieRetrofit
import com.example.imdb.model.Movie


class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var adapter: MovieAdapter
    private lateinit var recyclerView: RecyclerView
    var items: ArrayList<Movie> = ArrayList<Movie>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       var view :View= inflater.inflate(R.layout.fragment_home, container, false)
        MovieRetrofit.getMovie()
        return view

    }

}