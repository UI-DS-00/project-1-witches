package com.example.imdb

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.imdb.databinding.FragmentHomeBinding
import com.example.imdb.model.Movie
import com.example.imdb.model.Slide


class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var binding: FragmentHomeBinding

    private lateinit var sliderItemList: ArrayList<Movie>
    private lateinit var sliderAdapter: SliderAdapter
    private lateinit var sliderHandle: Handler
    private lateinit var sliderRun: Runnable
    private lateinit var viewPager2: ViewPager2
    private lateinit var imageList1: ArrayList<Slide>
    private lateinit var imageList2: ArrayList<Slide>
    private lateinit var imageList: ArrayList<Slide>



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    //   var view :View= inflater.inflate(R.layout.fragment_home, container, false)

        binding = FragmentHomeBinding.inflate(layoutInflater)
        val view = binding.root

        sliderViewInit()

        // recyclerview
        recyclerView = binding.RecyclerViewMovies
        recyclerView.layoutManager = LinearLayoutManager(context, HORIZONTAL, false)
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

    fun sliderViewInit()
    {
        viewPager2 = binding.sliderPaper

        sliderHandle = Handler(Looper.myLooper()!!)

        imageList1 = ArrayList()
        imageList2 = ArrayList()

        //fantasy
        imageList2.add(Slide(R.drawable.avatar_fantesi, "Avatar: The Way of Water", "Fantasy"))
        imageList2.add(Slide(R.drawable.pinocio, "Pinocchio", "Fantasy"))
        imageList2.add(Slide(R.drawable.slumberland_fantasy, "Slumberland", "Fantasy"))
        imageList2.add(Slide(R.drawable.fantastic_beasts, "Fantastic Beasts: The Secrets of Dumbledore",
        "Fantasy"))

        //horror
        imageList2.add(Slide(R.drawable.halloween_ends_2, "Halloween Ends", "Horror"))
        imageList2.add(Slide(R.drawable.nope, "Nope", "Horror"))
        imageList2.add(Slide(R.drawable.the_black_phone, "The black phone", "Horror"))
        imageList2.add(Slide(R.drawable.wednesday, "Wednesday", "Horror"))

        //action
        imageList2.add(Slide(R.drawable.doctor_strange, "Doctor Strange in the Multiverse of Madness"
            , "Action"))
        imageList2.add(Slide(R.drawable.ambulance, "Ambulance", "Action"))
        imageList2.add(Slide(R.drawable.black_adam, "Black Adam", "Action"))
        imageList2.add(Slide(R.drawable.the_batman, "The Batman", "Action"))

        //science fiction
        imageList2.add(Slide(R.drawable.bigbug_science_fiction, "Bigbug", "Science Fiction"))
        imageList2.add(Slide(R.drawable.moonfall_science_fiction, "Moonfall", "Science Fiction"))
        imageList2.add(Slide(R.drawable.moonshot_science_fiction, "Moonshot", "Science Fiction"))
        imageList2.add(Slide(R.drawable.the_adam_project_science_fiction, "The Adam Project"
            , "Science Fiction"))

        val r1 = (0..15).random()
        var genres: String = imageList2[r1].genres

        for (i in 0 until imageList2.size)
        {
            if(imageList2[i].genres == genres)
            {
                imageList1.add(imageList2[i])
            }
        }

        sliderAdapter = SliderAdapter(imageList1, viewPager2)
        viewPager2.adapter = sliderAdapter
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager2.offscreenPageLimit = 3
        viewPager2.clipToPadding = false
        viewPager2.clipChildren = false
        viewPager2.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

        val comPosPageTarn = CompositePageTransformer()
        comPosPageTarn.addTransformer(MarginPageTransformer(40))
        comPosPageTarn.addTransformer { page, position ->
            val r :Float = 1 - kotlin.math.abs(position)
            page.scaleY = 0.85f + r * 0.14f
        }
        viewPager2.setPageTransformer(comPosPageTarn)

        viewPager2.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {

                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    sliderHandle.removeCallbacks(runnable)
                    sliderHandle.postDelayed(runnable, 3000)
                }
            })

    }

    override fun onPause() {
        super.onPause()
        sliderHandle.removeCallbacks(runnable)
    }

    override fun onResume() {
        super.onResume()
        sliderHandle.postDelayed(runnable, 3000)

    }

    private val runnable = Runnable{
        viewPager2.currentItem = viewPager2.currentItem +1
    }


}

