package com.example.imdb

import android.annotation.SuppressLint
import android.content.Context
import androidx.viewpager.widget.PagerAdapter
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.example.imdb.model.Movie
import com.example.imdb.model.Slide
import kotlinx.coroutines.Runnable

class SliderAdapter(var imageList: ArrayList<Slide>, val viewPager: ViewPager2
) :RecyclerView.Adapter<SliderAdapter.SliderViewHolder>()
{

    inner class SliderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
       val imageView: ImageView = itemView.findViewById(R.id.slide_image)
       val imageTitle: TextView = itemView.findViewById(R.id.slide_title)
       val imageGenres:TextView = itemView.findViewById(R.id.slide_genres)

        fun bind(imgList: Slide) {
            imageView.setImageResource(imgList.slideImage)
            imageTitle.text = imgList.slideMovieTitle
            imageGenres.text = imgList.genres
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.slide_item, parent, false)
        return SliderViewHolder(view)
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        val imgList = imageList[position]
        holder.bind(imgList)
        if (position == imageList.size - 1){
            viewPager.post(runnable)
        }
    }

    override fun getItemCount(): Int {
       return imageList.size
    }

     val runnable = Runnable{
        imageList.addAll(imageList)
        notifyDataSetChanged()
    }





}