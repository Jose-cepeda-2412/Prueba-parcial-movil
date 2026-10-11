package com.example.parcialmovil.ui.screens.homeScreen.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parcialmovil.ui.theme.textoPrincipal
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.tooling.preview.Preview
@Composable
fun PublisherSuperHero(
    publisherName: String,
    modifier: Modifier = Modifier
){
    Text(
        text = publisherName,
        modifier = modifier.padding(8.dp),
        color = textoPrincipal
    )
}

@Preview (showBackground = false)
@Composable
fun PublisherSuperHeroPreview() {
    PublisherSuperHero(
        publisherName = "Marvel comics"
    )
}
