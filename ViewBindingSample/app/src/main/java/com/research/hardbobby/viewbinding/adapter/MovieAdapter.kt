package com.research.hardbobby.viewbinding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.research.hardbobby.viewbinding.databinding.ItemMovieLayoutBinding
import com.research.hardbobby.viewbinding.model.MovieModelView

/**
 * Created by Bobby.Hardian on 16/04/2020.
 */
class MovieAdapter(private val movieList: MutableList<MovieModelView>) :
    RecyclerView.Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            ItemMovieLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movieList[position])
    }
}

class MovieViewHolder(private val binding: ItemMovieLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(movieModelView: MovieModelView) {
        binding.textViewTitleMovie.text = movieModelView.titleMovie
        binding.textViewTitleDesc.text = movieModelView.desc
        binding.textViewTitleRelease.text = movieModelView.releaseDate
        binding.textViewTitleRating.text = movieModelView.rating.toString()
    }
}