package com.example.listasdesplazables.data

import com.example.listasdesplazables.R
import com.example.listasdesplazables.model.Platillo

class DataSource {
    fun loadPlatillos(): List<Platillo>{
        return listOf<Platillo>(
            Platillo(R.string.desayuno, R.drawable.desayuno, R.string.precioDesayuno),
            Platillo(R.string.hamburger, R.drawable.hamburger, R.string.precioHamburger),
            Platillo(R.string.pizza, R.drawable.pizza, R.string.precioPizza),
            Platillo(R.string.postre, R.drawable.postre, R.string.precioPostre),
            Platillo(R.string.pozole, R.drawable.pozole, R.string.precioPozole),
            Platillo(R.string.tacos, R.drawable.tacos, R.string.precioTacos)
        )
    }
}