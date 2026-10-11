package com.example.parcialmovil.ui.screens.homeScreen.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import com.example.parcialmovil.ui.theme.textoPrincipal
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FullNameSuperHero(
    fullNameSuperHeroe: String,
    modifier: Modifier = Modifier
){
    Text(
        text = fullNameSuperHeroe,
        modifier = modifier.padding(8.dp),
        color = textoPrincipal
    )

}

@Preview (showBackground = false)
@Composable
fun FullNameSuperHeroPreview() {
    FullNameSuperHero(
        fullNameSuperHeroe = "peter parker"
    )
}
