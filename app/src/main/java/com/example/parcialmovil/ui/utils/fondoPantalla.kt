package com.example.parcialmovil.ui.utils


import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import com.example.parcialmovil.ui.theme.fondoPantalla
import androidx.compose.ui.tooling.preview.Preview
@Composable
fun FondoPantalla(
    modifier: Modifier = Modifier
){
    Box(modifier = modifier.fillMaxSize().background(color = fondoPantalla)){

    }
}


@Composable
@Preview
fun FondoPantallaPreview() {
    FondoPantalla()
}
