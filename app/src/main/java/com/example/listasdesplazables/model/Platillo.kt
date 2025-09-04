package com.example.listasdesplazables.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
    @StringRes val nombreId: Int,
    @DrawableRes val imagenId: Int,
    @StringRes val precioId: Int
)
