package com.example.imdb

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imdb.api.TestMovieApiInterface
import com.example.imdb.api.TestMovieApiService
import com.example.imdb.api.TestMovieResponse
import com.example.imdb.databinding.ActivityStart2Binding
import com.example.imdb.databinding.FragmentHomeBinding
import com.example.imdb.model.Movie
import com.example.imdb.model.TestMovie
import com.example.imdb.model.TestMovieAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_movie.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class HomeFragment : Fragment(R.layout.fragment_home) {

    //private lateinit var adapter: MovieRecyclerAdapter
    private lateinit var recyclerView: RecyclerView


  //  private lateinit var adapter: MovieAdapter
  //  private lateinit var recyclerView: RecyclerView
  private lateinit var binding: FragmentHomeBinding

    //private lateinit var adapter: MovieRecyclerAdapter

    //private var layoutManager:RecyclerView.LayoutManager? = null
   // private var adapter: RecyclerView.Adapter<MovieRecyclerAdapter.ViewHolder>? = null





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    //   var view :View= inflater.inflate(R.layout.fragment_home, container, false)


        // کد درست
        /*
        binding = FragmentHomeBinding.inflate(layoutInflater)
        val view = binding.root
        recyclerView = binding.recyclerView

        val layoutManager = LinearLayoutManager(context)
     //   recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MovieRecyclerAdapter()
        recyclerView.adapter = adapter

         */

        binding = FragmentHomeBinding.inflate(layoutInflater)
        val view = binding.root
        recyclerView = binding.recyclerView
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        val homeViewModel = HomeViewModel()
        val adapter = MovieAdapter(homeViewModel.movieList.value!!.toList(), requireContext())
        recyclerView.adapter = adapter


        homeViewModel.movieList.observe(viewLifecycleOwner){
            Log.d("HomeViewModel", "onCreateView: observe" )

            if(it.isNotEmpty())
            {
                (recyclerView.adapter as MovieAdapter).updateMovies(it)
            }

           Log.d("updateMovie", "$it")
            Log.d("adapterMovieItem", "${adapter.movieItems}")

        }


        return view

    }
}