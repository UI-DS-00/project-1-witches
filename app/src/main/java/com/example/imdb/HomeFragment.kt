package com.example.imdb

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imdb.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var adapter: MovieAdapter
    private lateinit var recyclerView: RecyclerView

    private var _binding: FragmentHomeBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       var view :View= inflater.inflate(R.layout.fragment_home, container, false)

        _binding = FragmentHomeBinding.inflate(layoutInflater)
        val binding = _binding!!

        recyclerView = binding.recyclerView

        val homeViewModel = HomeViewModel()
        val adapter = MovieAdapter(homeViewModel.movieList.value!!.toList() , requireContext())
        recyclerView.adapter = adapter
        homeViewModel.movieList.observe(viewLifecycleOwner){
            Log.d("HomeViewModel", "onCreateView: observe" )
            adapter.updateMovies(it)
        }

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        return view

    }

}