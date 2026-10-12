package com.example.parcialmovil.ui.screens.detailSuperHero.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.example.parcialmovil.ui.theme.textoPrincipal

@Composable
fun TitleAppearence(
    modifier: Modifier = Modifier
){
    Text(
        text = "Apariencia",
        modifier = modifier,
        textAlign = TextAlign.Center,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = textoPrincipal
    )
}