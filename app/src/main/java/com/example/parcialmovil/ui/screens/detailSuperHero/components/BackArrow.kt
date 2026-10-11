package com.example.parcialmovil.ui.screens.detailSuperHero.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.parcialmovil.R
import com.example.parcialmovil.ui.theme.textoPrincipal
import androidx.compose.foundation.layout.size
@Composable
fun BackArrow(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = {
            onBackClick()
        }
    ) {
        Icon(
            painter = painterResource(id = R.drawable.retroceso),
            contentDescription = "Retroceso",
            tint = textoPrincipal,
            modifier = modifier.size(80.dp)
                .padding(7.dp)

        )
    }
}

@Preview
@Composable
fun BackArrowPreview() {
    BackArrow(onBackClick = {})
}


