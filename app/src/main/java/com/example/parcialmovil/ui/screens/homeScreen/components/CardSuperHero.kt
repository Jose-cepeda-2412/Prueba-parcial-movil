package com.example.parcialmovil.ui.screens.homeScreen.components

import androidx.compose.foundation.Image
import com.example.parcialmovil.ui.theme.textoPrincipal
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.parcialmovil.R
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.fillMaxWidth
import com.example.parcialmovil.ui.theme.colorBorde
import com.example.parcialmovil.ui.theme.fondoTarjeta
import androidx.compose.material3.CardDefaults
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.layout.ContentScale

@Composable
fun CardSuperHero(
    nameSuperHero: String,
    fullNameSuperHeroe: String,
    publisherName: String,
    modifier: Modifier = Modifier
){

    Card(
        modifier = modifier.fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = fondoTarjeta
        )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            ImageHomeScreenHero()
            Column() {
                NameSuperHero(
                    nameSuperHero = nameSuperHero
                )
                FullNameSuperHero(
                    fullNameSuperHeroe = fullNameSuperHeroe
                )
                PublisherSuperHero(
                    publisherName = publisherName
                )
            }

        }
    }
}


@Preview (showBackground = false)
@Composable
fun CardSuperHeroPreview() {
    CardSuperHero(
        nameSuperHero = "Spiderman",
        fullNameSuperHeroe = "peter parker",
        publisherName = "Marvel comics"
    )
}
