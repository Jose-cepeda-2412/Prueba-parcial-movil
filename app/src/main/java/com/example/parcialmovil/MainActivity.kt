package com.example.parcialmovil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.parcialmovil.ui.theme.ParcialMovilTheme
import com.example.parcialmovil.ui.screens.homeScreen.SuperHeroScreen
import com.example.parcialmovil.ui.screens.detailSuperHero.DetailSuperHeroScreen
import com.example.parcialmovil.data.dataClassScreens.StatisticsInfo
import com.example.parcialmovil.data.dataClassScreens.InfoSuperHero
import com.example.parcialmovil.data.dataClassScreens.InfoAppearance
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ParcialMovilTheme {

                SuperHeroScreen(
                    infoSuperHero = InfoSuperHero(
                        id = 1,
                        nameSuperHero = "Spiderman",
                        fullNameSuperHeroe = "Peter Parker",
                        publisherName = "Marvel Comics"
                    )
                )


/*
                DetailSuperHeroScreen(
                    infoAppearance = InfoAppearance(
                        gender = "Masculino",
                        race = "Humano",
                        height = "1.78 m",
                        weight = "75 kg",
                        eyeColor = "Marrón",
                        hairColor = "Castaño"
                    ),
                    infoSuperHero = InfoSuperHero(
                        id = 1,
                        nameSuperHero = "Spider-Man",
                        fullNameSuperHeroe = "Peter Parker",
                        publisherName = "Marvel Comics"
                    ),
                    statisticsInfo = StatisticsInfo(
                        intelligence = 90,
                        strength = 55,
                        speed = 67,
                        durability = 75,
                        power = 74,
                        combat = 85
                    ),
                    onBackClick = {}
                )

 */

            }
        }
    }
}
