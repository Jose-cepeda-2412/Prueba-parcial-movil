package com.example.parcialmovil.ui.screens.detailSuperHero.components
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialmovil.ui.theme.textoPrincipal
import androidx.compose.ui.text.font.FontWeight
@Composable
fun StatisticsTitle(
    statistics: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = statistics,
        color = textoPrincipal,
        modifier = modifier.fillMaxWidth()
            .padding(4.dp),
        fontSize = 24.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold
    )
}

@Preview
@Composable
fun StatisticsPreview() {
    StatisticsTitle(
        statistics = "Estadisticas"
    )
}

