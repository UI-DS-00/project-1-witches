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
import com.example.imdb.model.DataMovie
import com.example.imdb.model.Movie
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter(var movieItems: MutableList<Movie>, var context: Context) :
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return ViewHolder(view)
    }

    // برای مقدار دهی ایتم ها
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movieModels = movieItems[position]
        holder.bind(movieModels)

    }
    fun updateMovies(movies: List<Movie>){
        movieItems.addAll(movies)
       // movieItems = movies
        notifyItemRangeInserted(0,movies.indexOf(movies[movies.size - 1]))
       // notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return movieItems.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtMovieName: TextView
        var textMovieVote : TextView
        var cardView: CardView
        var imageView: ImageView

        init {
            txtMovieName = itemView.findViewById(R.id.movieName)
            textMovieVote = itemView.findViewById(R.id.movieVote)
            imageView = itemView.findViewById(R.id.movieImage)
            cardView = itemView.findViewById(R.id.cardView)
        }

        fun bind(movieModels: Movie) {
            txtMovieName.text = movieModels.title
            textMovieVote.text = movieModels.voteAverage.toString()
//            Glide.with(imageView.context).load(movieModels.image).into(imageView)
           cardView.setOnClickListener {
                // NULL
            }
        }
    }
}