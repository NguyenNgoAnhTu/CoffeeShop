package com.example.fooddelivery.ui.theme.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.fooddelivery.ui.theme.screen.components.ProductPreviewSection

@Composable
fun ProductDetailsScreen(
    modifier: Modifier = Modifier,
) {
    val scollableState = rememberScrollState()
    Column (
        modifier = modifier.verticalScroll(scollableState)
    ){
        ProductPreviewSection()
    }

}