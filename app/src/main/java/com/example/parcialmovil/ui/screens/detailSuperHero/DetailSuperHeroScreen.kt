package com.example.parcialmovil.ui.screens.detailSuperHero

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import com.example.parcialmovil.ui.screens.detailSuperHero.components.ImageSuperHero
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.parcialmovil.ui.utils.FondoPantalla
import com.example.parcialmovil.ui.screens.detailSuperHero.components.BackArrow
import androidx.compose.ui.Alignment
import com.example.parcialmovil.ui.screens.detailSuperHero.components.TittleDetail
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp

@Composable
fun DetailSuperHeroContent(
    titleDetail: String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier){
        FondoPantalla()

        Column(
            modifier = Modifier.align(Alignment.TopStart)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                BackArrow(
                    onBackClick = onBackClick
                )
            }

            TittleDetail(
                titleDetail = titleDetail
            )

            ImageSuperHero()

            Spacer(modifier = Modifier.padding(16.dp))

            //corregir color, separar en composables y enviar los parametros
            Row() {
                Text(text = "Nombre: Spiderman")
                Text(text = "Nombre: Spiderman")
                Text(text = "Nombre: Spiderman")
            }

            //tarjeta para estaditicas

            //tarjeta para apariencia del superherore

        }

    }

}

@Preview
@Composable
fun DetailSuperHeroContentPreview() {
    DetailSuperHeroContent(
        titleDetail = "Detalle del superHeroe",
        onBackClick = {}
    )
}


@Composable
fun DetailSuperHeroScreen(
    modifier: Modifier = Modifier
) {
    DetailSuperHeroContent(
        titleDetail = "Detalle del superHeroe",
        onBackClick = {},
        modifier = modifier)
}

@Composable
@Preview (showBackground = true)
fun DetailSuperHeroScreenPreview() {
    DetailSuperHeroScreen()
}

