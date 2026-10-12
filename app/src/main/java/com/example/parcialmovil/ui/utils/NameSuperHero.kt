package com.example.parcialmovil.ui.utils

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import com.example.parcialmovil.ui.theme.textoPrincipal
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun NameSuperHero(
    nameSuperHero: String,
    modifier: Modifier = Modifier
){
    Text(
        text = "Nombre: " + nameSuperHero,
        modifier = modifier.padding(8.dp),
        color = textoPrincipal,
        fontSize = 13.sp
    )
}

@Preview (showBackground = false)
@Composable
fun NameSuperHeroPreview() {
    NameSuperHero(
        nameSuperHero = "Spiderman"
    )
}