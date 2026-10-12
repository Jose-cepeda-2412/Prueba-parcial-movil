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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import com.example.parcialmovil.ui.screens.detailSuperHero.components.CardInfoSuperHero
import com.example.parcialmovil.ui.screens.detailSuperHero.components.CardPowerstats
import com.example.parcialmovil.ui.screens.detailSuperHero.components.StatisticsTitle
import com.example.parcialmovil.data.dataClassScreens.StatisticsInfo
import com.example.parcialmovil.data.dataClassScreens.InfoSuperHero
import com.example.parcialmovil.ui.screens.detailSuperHero.components.CardAppearance
import com.example.parcialmovil.data.dataClassScreens.InfoAppearance
import com.example.parcialmovil.ui.screens.detailSuperHero.components.TitleAppearence


@Composable
fun DetailSuperHeroContent(
    statistics: String,
    //info super heroe
    infoSuperHero: InfoSuperHero,

    titleDetail: String,
    //info estadisticas
    statisticsInfo: StatisticsInfo,

    infoAppearance: InfoAppearance,
    //boton de atras
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier){
        FondoPantalla()

        Column(
            modifier = Modifier.align(Alignment.TopStart)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,

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
            Column() {
                CardInfoSuperHero(
                    infoSuperHero = infoSuperHero
                )
            }

            StatisticsTitle(
                statistics = statistics
            )

            CardPowerstats(
                statisticsInfo = statisticsInfo
            )

            TitleAppearence()


            //tarjeta para apariencia del superherore
            CardAppearance(
                infoAppearance = infoAppearance
            )

        }

    }

}

@Preview(showBackground = true)
@Composable
fun DetailSuperHeroContentPreview() {
    DetailSuperHeroContent(
        statistics = "Estadísticas",
        infoSuperHero = previewInfoSuperHero,
        titleDetail = "Detalle del Superhéroe",
        statisticsInfo = previewStatistics,
        infoAppearance = previewAppearance,
        onBackClick = {}
    )
}


@Composable
fun DetailSuperHeroScreen(
    infoSuperHero: InfoSuperHero,
    statisticsInfo: StatisticsInfo,
    onBackClick: () -> Unit,
    infoAppearance: InfoAppearance,
    modifier: Modifier = Modifier
) {
    DetailSuperHeroContent(
        infoAppearance = infoAppearance,
        statistics = "Estadísticas",
        infoSuperHero = infoSuperHero,
        titleDetail = "Detalle del Superhéroe",
        statisticsInfo = statisticsInfo,
        onBackClick = onBackClick,
        modifier = modifier
    )
}




@Preview(showBackground = true)
@Composable
fun DetailSuperHeroScreenPreview() {
    DetailSuperHeroScreen(
        infoSuperHero = previewInfoSuperHero,
        statisticsInfo = previewStatistics,
        infoAppearance = previewAppearance,
        onBackClick = {}
    )
}



private val previewInfoSuperHero = InfoSuperHero(
    id = 1,
    nameSuperHero = "Spider-Man",
    fullNameSuperHeroe = "Peter Parker",
    publisherName = "Marvel Comics"
)

private val previewStatistics = StatisticsInfo(
    intelligence = 90,
    strength = 80,
    speed = 75,
    durability = 85,
    power = 95,
    combat = 70
)

private val previewAppearance = InfoAppearance(
    gender = "Male",
    race = "Human",
    height = "178 cm",
    weight = "75 kg",
    eyeColor = "Brown",
    hairColor = "Brown"
)