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


@Composable
fun SuperHeroContent(
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
                        nameSuperHero = "Spiderman",
                        fullNameSuperHeroe = "peter parker",
                        publisherName = "Marvel comics"
                    )
                }

            }

        }

    }


}




@Composable
fun SuperHeroScreen(
    modifier: Modifier = Modifier
) {
    SuperHeroContent(modifier = modifier)
}


@Composable
@Preview (showBackground = true)
fun SuperHeroScreenPreview() {
    SuperHeroScreen()
}
