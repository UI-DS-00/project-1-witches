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
import com.example.imdb.model.Movie

class   HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var adapter: MovieAdapter
    private lateinit var recyclerView: RecyclerView

    private var _binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View = inflater.inflate(R.layout.fragment_home, container, false)
        _binding = FragmentHomeBinding.inflate(layoutInflater)
        val binding = _binding!!
        recyclerView = binding.recyclerView

        val homeViewModel = HomeViewModel()
        val adapter = MovieAdapter(
            mutableListOf(
                Movie(
                    "asd", "Asd", "asd", "Asd", true, "sad",
                    arrayListOf("asd"), 12, arrayListOf("ads"), 12.0, ""
                )
            ), requireContext()
        )
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        homeViewModel.movieList.observe(viewLifecycleOwner) {
            Log.d("HomeViewModel", "onCreateView: observe")

            if (it.isNotEmpty()) {
                (recyclerView.adapter as MovieAdapter).updateMovies(it)
            }

            Log.d("updateMovie", "$it")
            Log.d("adapterMovieItem", "${adapter.movieItems}")

        }

        return view

    }

}