package com.example.parcialmovil.ui.screens.homeScreen

import com.example.parcialmovil.data.dataClassScreens.InfoSuperHero

data class SuperHeroScreenState(
    val listaSuperHero: List<InfoSuperHero> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)
