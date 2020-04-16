package com.research.hardbobby.databinding.model

import java.io.Serializable

/**
 * Created by Bobby.Hardian on 16/04/2020.
 */

class MovieModelView(
    var titleMovie: String = "",
    var desc: String = "",
    var releaseDate: String = "",
    var rating: Double = 0.toDouble()
) : Serializable