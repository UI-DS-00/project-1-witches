package com.example.imdb

import android.content.Context
//import com.example.imdb.model.Movie.title
//import com.example.imdb.model.Movie.image
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import com.example.imdb.R
import com.bumptech.glide.Glide
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.imdb.model.Movie

class MovieAdapter(var movieItems: ArrayList<Movie>, var context: Context) :
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return ViewHolder(view)
    }

    // برای مقدار دهی ایتم ها
    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val movieModels = movieItems[position]
     //   val (_, title, _, _, _, _, _, _, _, _, image) = movieItems[position]
        holder.txtMovieName.text = movieModels.title
        Glide.with(context).load(movieModels.image).into(holder.imageView)
        holder.cardView.setOnClickListener {
            // NULL
        }
    }

    override fun getItemCount(): Int {
        return movieItems.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtMovieName: TextView
        var cardView: CardView
        var imageView: ImageView

        init {
            txtMovieName = itemView.findViewById(R.id.movieName)
            imageView = itemView.findViewById(R.id.movieImage)
            cardView = itemView.findViewById(R.id.cardView)
        }
    }
}