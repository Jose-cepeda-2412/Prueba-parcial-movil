package com.example.parcialmovil.ui.screens.detailSuperHero.components
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.parcialmovil.ui.theme.textoPrincipal
import androidx.compose.ui.text.style.TextAlign

@Composable
fun InfoStatistics(
    typeInfo: String,
    typeStatistics: Int,
    modifier: Modifier = Modifier
){
    Text(
        text = typeInfo + " :" + typeStatistics.toString(),
        color = textoPrincipal,
        fontSize = 13.sp,
        textAlign = TextAlign.Center,
        modifier = modifier
    )
}


