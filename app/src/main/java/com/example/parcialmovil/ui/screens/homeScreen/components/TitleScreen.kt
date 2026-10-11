package com.example.parcialmovil.ui.screens.homeScreen.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import com.example.parcialmovil.ui.theme.textoPrincipal
import androidx.compose.ui.unit.sp

@Composable
fun TitleScreen(
    title: String,
    modifier: Modifier = Modifier
){
    Text(
        text = title,
        color = textoPrincipal,
        fontSize = 30.sp,
        modifier = modifier
    )

}

@Preview
@Composable
fun TitleScreenPreview() {
    TitleScreen(
        title = "SuperHeroes"
    )
}

