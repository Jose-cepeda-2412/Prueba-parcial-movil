package com.example.parcialmovil.ui.screens.homeScreen
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.parcialmovil.ui.utils.FondoPantalla
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.example.parcialmovil.ui.screens.homeScreen.components.CardSuperHero
import com.example.parcialmovil.ui.screens.homeScreen.components.TitleScreen
import com.example.parcialmovil.data.dataClassScreens.InfoSuperHero


@Composable
fun SuperHeroContent(
    infoSuperHero: InfoSuperHero,
    modifier: Modifier = Modifier
){
    Box(
        modifier=modifier.fillMaxSize()
    ){
        FondoPantalla()

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TitleScreen(
                title = "SuperHeroes",
                modifier = modifier.padding(8.dp)
            )
            LazyColumn() {
                items(9){
                    CardSuperHero(
                        infoSuperHero = infoSuperHero
                    )
                }

            }

        }

    }


}




@Composable
fun SuperHeroScreen(
    infoSuperHero: InfoSuperHero,
    modifier: Modifier = Modifier
) {
    SuperHeroContent(
        infoSuperHero = infoSuperHero ,
        modifier = modifier
    )
}


@Composable
@Preview (showBackground = true)
fun SuperHeroScreenPreview() {
    SuperHeroScreen(
        infoSuperHero = InfoSuperHero(
            id = 1,
            nameSuperHero = "Spiderman",
            fullNameSuperHeroe = "Peter Parker",
            publisherName = "Marvel Comics"
        )
    )
}
