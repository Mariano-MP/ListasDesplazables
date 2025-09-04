package com.example.listasdesplazables.data

import com.example.listasdesplazables.R
import com.example.listasdesplazables.model.Platillo

class DataSource {
    fun loadPlatillos(): List<Platillo>{
        return listOf<Platillo>(
            Platillo(R.string.desayuno, R.drawable.desayuno),
            Platillo(R.string.pozole, R.drawable.pozole),
            Platillo(R.string.tacos, R.drawable.tacos),
            Platillo(R.string.hamburger, R.drawable.hamburger),
            Platillo(R.string.pizza, R.drawable.pizza),
            Platillo(R.string.postre, R.drawable.postre)
        )
    }
}