package com.research.hardbobby.databinding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.research.hardbobby.databinding.adapter.MovieAdapter
import com.research.hardbobby.databinding.databinding.ActivitySecondBinding
import com.research.hardbobby.databinding.model.MovieModelView

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_second) as ActivitySecondBinding
        initRecyclerView()
        binding.button.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
            )
        }
    }

    private fun initRecyclerView() {
        val listMovie = mutableListOf<MovieModelView>().apply {
            add(
                MovieModelView(
                    "My Spy",
                    "A hardened CIA operative finds himself at the mercy of a precocious 9-year-old girl, having been sent undercover to surveil her family.",
                    "2020-02-27",
                    6.8
                )
            )
            add(
                MovieModelView(
                    "Like a Boss",
                    "Two female friends with very different ideals decide to start a beauty company together. One is more practical, while the other wants to earn her fortune and live a lavish lifestyle.",
                    "2020-01-09",
                    6.7
                )
            )
            add(
                MovieModelView(
                    "Ad Astra",
                    "The near future, a time when both hope and hardships drive humanity to look to the stars and beyond. While a mysterious phenomenon menaces to destroy life on planet Earth, astronaut Roy McBride undertakes a mission across the immensity of space and its many perils to uncover the truth about a lost expedition that decades before boldly faced emptiness and silence in search of the unknown.\"",
                    "2019-09-17",
                    6.0
                )
            )
            add(
                MovieModelView(
                    "Trolls World Tour",
                    "Queen Poppy and Branch make a surprising discovery — there are other Troll worlds beyond their own, and their distinct differences create big clashes between these various tribes. When a mysterious threat puts all of the Trolls across the land in danger, Poppy, Branch, and their band of friends must embark on an epic quest to create harmony among the feuding Trolls to unite them against certain doom.",
                    "2020-03-20",
                    7.7
                )
            )
        }

        binding.recyclerView.layoutManager = LinearLayoutManager(this);
        binding.recyclerView.adapter = MovieAdapter(movieList = listMovie)
    }
}
