package com.example.parcialmovil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.parcialmovil.ui.theme.ParcialMovilTheme
import com.example.parcialmovil.ui.screens.homeScreen.SuperHeroScreen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ParcialMovilTheme {
                SuperHeroScreen()
            }
        }
    }
}
