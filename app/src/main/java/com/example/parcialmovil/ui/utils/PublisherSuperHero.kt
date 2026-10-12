package com.example.parcialmovil.ui.utils

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parcialmovil.ui.theme.textoPrincipal
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun PublisherSuperHero(
    publisherName: String,
    modifier: Modifier = Modifier
){
    Text(
        text = "Editorial: " + publisherName,
        modifier = modifier.padding(8.dp),
        color = textoPrincipal,
        fontSize = 13.sp
    )
}

@Preview (showBackground = false)
@Composable
fun PublisherSuperHeroPreview() {
    PublisherSuperHero(
        publisherName = "Marvel comics"
    )
}
