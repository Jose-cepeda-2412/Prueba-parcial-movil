package com.example.parcialmovil.ui.screens.homeScreen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SuperHeroViewModel : ViewModel(){
    private val _uiState = MutableStateFlow((SuperHeroScreenState()))
    val uiState: StateFlow<SuperHeroScreenState> = _uiState.asStateFlow()
}