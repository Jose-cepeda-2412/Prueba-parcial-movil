package com.example.parcialmovil.ui.screens.detailSuperHero.components

import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.parcialmovil.ui.theme.fondoTarjeta
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.unit.dp
import com.example.parcialmovil.data.dataClassScreens.StatisticsInfo
@Composable
fun CardPowerstats(
    statisticsInfo: StatisticsInfo,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth().padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = fondoTarjeta
        )
    ) {
        Row(
            modifier = Modifier.padding(8.dp)
        ) {

            InfoStatistics(
                typeInfo = "Inteligencia",
                typeStatistics = statisticsInfo.intelligence,
                modifier = Modifier.weight(1f)
            )
            InfoStatistics(
                typeInfo = "Fuerza",
                typeStatistics = statisticsInfo.strength,
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            InfoStatistics(
                typeInfo = "Velocidad",
                typeStatistics = statisticsInfo.speed,
                modifier = Modifier.weight(1f)
            )
            InfoStatistics(
                typeInfo = "Resistencia",
                typeStatistics = statisticsInfo.durability,
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            InfoStatistics(
                typeInfo = "Poder",
                typeStatistics = statisticsInfo.power,
                modifier = Modifier.weight(1f)
            )
            InfoStatistics(
                typeInfo = "Combate",
                typeStatistics = statisticsInfo.combat,
                modifier = Modifier.weight(1f)
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun CardPowerstatsPreview() {
    CardPowerstats(
        statisticsInfo = StatisticsInfo(
            intelligence = 85,
            strength = 90,
            speed = 75,
            durability = 80,
            power = 95,
            combat = 88
        )
    )
}

