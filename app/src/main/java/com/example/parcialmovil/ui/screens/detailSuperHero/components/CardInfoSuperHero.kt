package com.example.parcialmovil.ui.screens.detailSuperHero.components

import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import com.example.parcialmovil.ui.theme.fondoTarjeta
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.parcialmovil.ui.utils.FullNameSuperHero
import com.example.parcialmovil.ui.utils.NameSuperHero
import com.example.parcialmovil.ui.utils.PublisherSuperHero
import com.example.parcialmovil.data.dataClassScreens.InfoSuperHero
@Composable
fun CardInfoSuperHero(
    infoSuperHero: InfoSuperHero,
    modifier: Modifier = Modifier
){

    Card(
        modifier = modifier.fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = fondoTarjeta
        )
    ) {
       Column(
           modifier = Modifier
       ) {
           NameSuperHero(
               nameSuperHero = infoSuperHero.nameSuperHero
           )
           FullNameSuperHero(
               fullNameSuperHeroe = infoSuperHero.fullNameSuperHeroe
           )
           PublisherSuperHero(
               publisherName = infoSuperHero.publisherName
           )

       }
    }
}


@Preview(showBackground = true)
@Composable
fun CardInfoSuperHeroPreview() {
    CardInfoSuperHero(
        infoSuperHero = InfoSuperHero(
            id = 1,
            nameSuperHero = "Spider-Man",
            fullNameSuperHeroe = "Peter Parker",
            publisherName = "Marvel Comics"
        )
    )
}
