package com.dev.korelibrary.src.Components.Switchs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev.korelibrary.src.Components.Themes.KoreTheme

@Preview(showBackground = true)
@Composable
fun Switch(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
    ) {
        Box(
            modifier = modifier.size(24.dp).background(
                shape = CircleShape,
                color = KoreTheme.colorScheme.primary
            )
        )
    }
}