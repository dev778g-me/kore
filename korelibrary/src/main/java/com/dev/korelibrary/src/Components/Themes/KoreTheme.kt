package com.dev.korelibrary.src.Components.Themes

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.dev.korelibrary.src.Components.Themes.KoreDefaults.defaultDarkColorScheme
import com.dev.korelibrary.src.Components.Themes.KoreDefaults.defaultLightColorScheme
import com.dev.korelibrary.src.Components.Themes.KoreDefaults.defaultShapes
import com.dev.korelibrary.src.Components.Themes.KoreDefaults.defaultSizes
import com.dev.korelibrary.src.Components.Themes.KoreDefaults.defaultTypography
import com.dev.korelibrary.src.Components.Themes.Ripple.koreRipple

@Immutable
data class KoreColors(
    val background : Color,
    val onBackGround : Color,
    val backGroundVariant : Color,
    val onBackGroundVariant : Color,
    val backGroundVariantDim: Color,
    val onBackGroundVariantDim : Color,
    val primary : Color,
    val onPrimary : Color,
    val primaryContainer : Color,
    val onPrimaryContainer : Color,
    val secondary : Color,
    val onSecondary : Color,
    val secondaryContainer : Color,
    val onSecondaryContainer : Color,
    val tertiary : Color,
    val onTertiary : Color,
    val tertiaryContainer : Color,
    val onTertiaryContainer : Color,
    val error : Color,
    val onError : Color,
    val transParentColor : Color
)

@Immutable
data class KoreTypography(
    val headingLarge : TextStyle,
    val headingMedium : TextStyle,
    val headingSmall : TextStyle,
    val titleLarge : TextStyle,
    val titleMedium : TextStyle,
    val titleSmall : TextStyle,
    val labelLarge : TextStyle,
    val labelMedium : TextStyle,
    val labelSmall : TextStyle
)

@Immutable
data class KoreShapes(
    val extraLarge: Shape,
    val large: Shape,
    val medium: Shape,
    val normal: Shape,
    val small: Shape
)

@Immutable
data class KoreSizes(
    val extraLarge : Dp,
    val large : Dp,
    val medium : Dp,
    val normal : Dp,
    val small : Dp,
    val extraSmall : Dp
)

val LocalKoreColorScheme = staticCompositionLocalOf {
    KoreColors(
        background = Color.Unspecified,
        onBackGround = Color.Unspecified,
        backGroundVariant = Color.Unspecified,
        onBackGroundVariant = Color.Unspecified,
        backGroundVariantDim = Color.Unspecified,
        onBackGroundVariantDim = Color.Unspecified,
        primary = Color.Unspecified,
        onPrimary = Color.Unspecified,
        primaryContainer = Color.Unspecified,
        onPrimaryContainer = Color.Unspecified,
        secondary = Color.Unspecified,
        onSecondary = Color.Unspecified,
        secondaryContainer = Color.Unspecified,
        onSecondaryContainer = Color.Unspecified,
        tertiary = Color.Unspecified,
        onTertiary = Color.Unspecified,
        tertiaryContainer = Color.Unspecified,
        onTertiaryContainer = Color.Unspecified,
        error = Color.Unspecified,
        onError = Color.Unspecified,
        transParentColor = Color.Unspecified
    )
}


val LocalKoreTypography = staticCompositionLocalOf {
    KoreTypography(
        headingLarge = TextStyle.Default,
        headingMedium = TextStyle.Default,
        headingSmall = TextStyle.Default,
        titleLarge = TextStyle.Default,
        titleMedium = TextStyle.Default,
        titleSmall = TextStyle.Default,
        labelLarge = TextStyle.Default,
        labelMedium = TextStyle.Default,
        labelSmall = TextStyle.Default
    )
}

val LocalKoreShapes = staticCompositionLocalOf {
    KoreShapes(
        extraLarge = RectangleShape,
        large = RectangleShape,
        medium = RectangleShape,
        normal = RectangleShape,
        small = RectangleShape,
    )
}

val LocalKoreSizes = staticCompositionLocalOf {
    KoreSizes(
        extraLarge = Dp.Unspecified,
        large = Dp.Unspecified,
        medium = Dp.Unspecified,
        normal = Dp.Unspecified,
        small = Dp.Unspecified,
        extraSmall = Dp.Unspecified,
    )
}

val LocalTextStyle = staticCompositionLocalOf { defaultTypography.headingLarge }


val LocalContentColor = staticCompositionLocalOf { Color.Black }

@Composable
fun KoreTheme(
    isDark : Boolean = isSystemInDarkTheme(),
    content : @Composable () -> Unit
){
    val colorScheme = if (isDark) defaultDarkColorScheme else defaultLightColorScheme
    val rippleIndication = remember(colorScheme) {
        koreRipple(
            // bounded = true,
            color = colorScheme.onBackGround
        )
    }

    CompositionLocalProvider(
        LocalKoreColorScheme provides colorScheme,
        LocalKoreTypography provides defaultTypography,
        LocalTextStyle provides TextStyle.Default,
        LocalIndication provides rippleIndication,
        LocalKoreShapes provides defaultShapes,
        LocalKoreSizes provides defaultSizes,
        content = content
    )

}




object KoreTheme {
    val colorScheme : KoreColors
        @Composable get() = LocalKoreColorScheme.current

    val typography : KoreTypography
        @Composable get() = LocalKoreTypography.current

    val shapes : KoreShapes
        @Composable get() = LocalKoreShapes.current

    val sizes : KoreSizes
        @Composable get() = LocalKoreSizes.current
}