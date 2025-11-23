package com.dev.korelibrary.src.Components.Scaffold

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.dev.korelibrary.src.Components.Themes.LocalContentColor
import com.dev.korelibrary.src.Components.Themes.LocalKoreColorScheme
import com.dev.korelibrary.src.Components.Themes.LocalKoreTypography
import com.dev.korelibrary.src.Components.Themes.LocalTextStyle

@Composable
fun Scaffold(
    modifier: Modifier = Modifier,
    containerColor : Color = LocalKoreColorScheme.current.background,
    contentColor : Color = LocalKoreColorScheme.current.onBackGround,
    content : @Composable () -> Unit
) {
    Box(
        modifier = modifier.fillMaxSize()
            .background(
                color = containerColor
            )
    ){
        CompositionLocalProvider(
            LocalContentColor provides contentColor,
            LocalTextStyle provides LocalKoreTypography.current.titleMedium
        ){
            content()
        }
    }
}