package com.example.fooddelivery.ui.theme.screen.components

import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.theme.AppTheme
import com.example.fooddelivery.R

@Composable
fun ProductPreviewSection(
    modifier: Modifier = Modifier,
) {
}

@Composable
fun ActionBar(
    modifier: Modifier = Modifier,
    headline: String
) {
    Row (
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Absolute.SpaceBetween
    )
    {
        Text(
            text = headline,
            style = AppTheme.typography.headline,
             color= AppTheme.colors.onSecondarySurface
        )
    }
}
@Composable
private fun CloseButton(
    modifier: Modifier = Modifier,
)
{
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        color = AppTheme.colors.actionSurface,
        contentColor = AppTheme.colors.secondarySurface
    ){
        Box(
          modifier =modifier.fillMaxWidth()
        ){
            Icon(
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = null,
                modifier= Modifier.size(24.dp)
            )

        }

    }


}
