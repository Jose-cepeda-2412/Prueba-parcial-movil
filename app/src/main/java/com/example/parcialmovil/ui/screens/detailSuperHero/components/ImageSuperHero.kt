package com.example.parcialmovil.ui.screens.detailSuperHero.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.parcialmovil.R
import com.example.parcialmovil.ui.theme.colorBorde
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.shape.CircleShape
@Composable
fun ImageSuperHero(
    modifier: Modifier = Modifier
) {
    Image(
        painter = (painterResource(id = R.drawable.spiderman)),
        contentDescription = "Spiderman",
        modifier = Modifier.size(150.dp)
            .clip((CircleShape))
            .border(
                width = 4.dp,
                color = colorBorde,
                shape = CircleShape
            ),
        contentScale = ContentScale.Crop
    )
}

@Preview
@Composable
fun ImageSuperHeroPreview() {
    ImageSuperHero()
}

