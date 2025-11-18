package com.dev.korelibrary.src.Components.Buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.dev.korelibrary.src.Components.Themes.localContentColor


enum class IconButtonSize(

)




// base icon button for all the styles
@Composable
internal fun BaseIconButton(
    onClick: () -> Unit,
    enabled: Boolean,
    content: @Composable () -> Unit,
    modifier: Modifier = Modifier
) {
    CompositionLocalProvider(
        localContentColor provides localContentColor.current
    ) {
        Box(
            modifier = modifier

                .clip(CircleShape)
                .clickable(
                    enabled = enabled,
                    onClick = {
                        onClick.invoke()
                    }
                )
                .padding(
                    8.dp
                ),
            contentAlignment = Alignment.Center
        ){
            content()
        }
    }
}












@Composable
fun IconButton(
    onClick: () -> Unit,
    enabled : Boolean = true,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,

) {

}