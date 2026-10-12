package com.example.parcialmovil.ui.screens.detailSuperHero.components

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialmovil.ui.theme.textoPrincipal
@Composable
fun TittleDetail(
    titleDetail: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = titleDetail,
        fontSize = 29.sp,
        modifier = modifier.padding(16.dp),
        color = textoPrincipal,
        fontWeight = FontWeight.Bold
    )
}
