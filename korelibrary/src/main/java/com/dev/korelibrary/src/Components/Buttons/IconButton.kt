package com.dev.korelibrary.src.Components.Buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dev.korelibrary.src.Components.Themes.KoreTheme
import com.dev.korelibrary.src.Components.Themes.LocalContentColor


enum class IconButtonSize(

)




// base icon button for all the styles
@Composable
internal fun BaseIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean,
    border: BorderStroke ? = null,
    iconButtonColors: IconButtonColors,
    content: @Composable () -> Unit,

) {
    CompositionLocalProvider(
       value =  LocalContentColor provides if (enabled) iconButtonColors.iconButtonContentColor else null  // Only override if enabled
            ?: LocalContentColor.current
    ) {
        Box(
            modifier = modifier
                .clip(CircleShape)
                .background(
                    shape = CircleShape,
                    color = if (enabled) iconButtonColors.iconButtonContainerColor else iconButtonColors.disabledIconButtonColor
                )
                .then(
                    if (border != null) Modifier.border(
                        border = border,
                        shape = CircleShape
                    ) else Modifier
                )

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
fun PrimaryIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    primaryIconButtonColors: IconButtonColors = IconButtonDefaults.primaryIconButtonColors(),
    content: @Composable () -> Unit,
) {
    BaseIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        iconButtonColors = primaryIconButtonColors,
        content = content
    )
}


@Composable
fun SecondaryIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    secondaryIconButtonColors: IconButtonColors = IconButtonDefaults.secondaryIconButtonColors(),
    content: @Composable () -> Unit,
) {
    BaseIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        iconButtonColors =  secondaryIconButtonColors,
        content = content
    )
}


@Composable
fun OutlinedIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    outlinedIconButtonColors: IconButtonColors = IconButtonDefaults.outlinedIconButtonColors(),
    content: @Composable () -> Unit,
) {
    BaseIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        iconButtonColors = IconButtonDefaults.outlinedIconButtonColors(),
        border =  BorderStroke(width = 1.dp, color =if (enabled) outlinedIconButtonColors.iconButtonContentColor else outlinedIconButtonColors.disabledIconContentColor),
        content = content
    )
}


@Composable
fun GhostIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable () -> Unit,
) {
    BaseIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        iconButtonColors = IconButtonDefaults.ghostIconButton(),
        content = content
    )
}









object IconButtonDefaults{

    @Composable
    fun primaryIconButtonColors(
        iconButtonContainerColor: Color = KoreTheme.colorScheme.primary,
        iconButtonContentColor: Color = KoreTheme.colorScheme.onPrimary,
        disabledIconButtonColor: Color = KoreTheme.colorScheme.backGroundVariantDim,
        disabledIconContentColor: Color = KoreTheme.colorScheme.onBackGroundVariantDim

    ) = IconButtonColors(
        iconButtonContainerColor = iconButtonContainerColor,
        iconButtonContentColor = iconButtonContentColor,
        disabledIconButtonColor = disabledIconButtonColor,
        disabledIconContentColor = disabledIconContentColor
    )


    @Composable
    fun secondaryIconButtonColors(
        iconButtonContainerColor: Color = KoreTheme.colorScheme.backGroundVariant,
        iconButtonContentColor: Color = KoreTheme.colorScheme.onBackGroundVariant,
        disabledIconButtonColor: Color = KoreTheme.colorScheme.backGroundVariantDim,
        disabledIconContentColor: Color = KoreTheme.colorScheme.onBackGroundVariantDim
    ) = IconButtonColors(
        iconButtonContainerColor = iconButtonContainerColor,
        iconButtonContentColor = iconButtonContentColor,
        disabledIconButtonColor = disabledIconButtonColor,
        disabledIconContentColor = disabledIconContentColor
    )

    @Composable
    fun outlinedIconButtonColors(
        iconButtonContainerColor: Color = KoreTheme.colorScheme.primary.copy(alpha = 0.1f),
        iconButtonContentColor: Color = KoreTheme.colorScheme.primary,
        disabledIconButtonColor: Color = KoreTheme.colorScheme.transParentColor,
        disabledIconContentColor: Color = KoreTheme.colorScheme.onBackGroundVariantDim
    ) = IconButtonColors(
        iconButtonContainerColor = iconButtonContainerColor,
        iconButtonContentColor = iconButtonContentColor,
        disabledIconButtonColor = disabledIconButtonColor,
        disabledIconContentColor = disabledIconContentColor
    )


    @Composable
    fun ghostIconButton(
        iconButtonContainerColor: Color = KoreTheme.colorScheme.transParentColor,
        iconButtonContentColor: Color = KoreTheme.colorScheme.onBackGround,
        disabledIconButtonColor: Color = KoreTheme.colorScheme.transParentColor,
        disabledIconContentColor: Color = KoreTheme.colorScheme.onBackGroundVariantDim
    ) = IconButtonColors(
        iconButtonContainerColor = iconButtonContainerColor,
        iconButtonContentColor = iconButtonContentColor,
        disabledIconButtonColor = disabledIconButtonColor,
        disabledIconContentColor = disabledIconContentColor
    )


}





data class IconButtonColors(
    val iconButtonContainerColor : Color,
    val iconButtonContentColor : Color,
    val disabledIconButtonColor : Color,
    val disabledIconContentColor : Color
)