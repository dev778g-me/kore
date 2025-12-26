package com.dev.korelibrary.src.Components.Themes

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object KoreDefaults{
    val defaultLightColorScheme = KoreColors(
        background = TailwindColors.Neutral100,
        onBackGround = TailwindColors.Gray900,
        backGroundVariant = TailwindColors.Neutral400,
        onBackGroundVariant = TailwindColors.Neutral800,
        backGroundVariantDim = TailwindColors.Neutral300,
        onBackGroundVariantDim = TailwindColors.Neutral400,

        primary = TailwindColors.Blue500,
        onPrimary = TailwindColors.White,
        primaryContainer = TailwindColors.Blue200,
        onPrimaryContainer = TailwindColors.Blue500,

        secondary = TailwindColors.Sky500,
        onSecondary = TailwindColors.Sky100,
        secondaryContainer = TailwindColors.Sky300,
        onSecondaryContainer = TailwindColors.Sky900,

        tertiary = TailwindColors.Purple600,
        onTertiary = TailwindColors.White,
        tertiaryContainer = TailwindColors.Purple100,
        onTertiaryContainer = TailwindColors.Purple900,

        error = TailwindColors.Red600,
        onError = TailwindColors.White,
        transParentColor = Color.Transparent
    )


    val defaultDarkColorScheme = KoreColors(
        background = TailwindColors.Neutral950,
        onBackGround = TailwindColors.Gray100,
        backGroundVariant = TailwindColors.Neutral800,
        onBackGroundVariant = TailwindColors.Neutral200,
        backGroundVariantDim = TailwindColors.Neutral900,
        onBackGroundVariantDim = TailwindColors.Neutral300,

        primary = TailwindColors.Blue700,
        onPrimary = TailwindColors.Blue200,
        primaryContainer = TailwindColors.Blue300,
        onPrimaryContainer = TailwindColors.Blue900,

        secondary = TailwindColors.Sky600,
        onSecondary = TailwindColors.Sky900,
        secondaryContainer = TailwindColors.Sky700,
        onSecondaryContainer = TailwindColors.Blue700,

        tertiary = TailwindColors.Purple700,
        onTertiary = TailwindColors.Purple200,
        tertiaryContainer = TailwindColors.Purple800,
        onTertiaryContainer = TailwindColors.Purple100,

        error = TailwindColors.Red500,
        onError = TailwindColors.Gray100,
        transParentColor = Color.Transparent
    )


    val defaultTypography = KoreTypography(
        headingLarge = TextStyle(
            fontFamily =googleSansFlex,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            lineHeight = 40.sp
        ),
        headingMedium = TextStyle(
            fontFamily =googleSansFlex,
            fontWeight = FontWeight.SemiBold,
            fontSize = 28.sp,
            lineHeight = 36.sp
        ),
        headingSmall = TextStyle(
            fontFamily =googleSansFlex,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
            lineHeight = 32.sp
        ),

        titleLarge = TextStyle(
            fontFamily =googleSansFlex,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 28.sp
        ),
        titleMedium = TextStyle(
            fontFamily =googleSansFlex,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            lineHeight = 24.sp
        ),
        titleSmall = TextStyle(
            fontFamily =googleSansFlex,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 22.sp
        ),

        labelLarge = TextStyle(
            fontFamily =googleSansFlex,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 20.sp
        ),
        labelMedium = TextStyle(
            fontFamily =googleSansFlex,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            lineHeight = 16.sp
        ),
        labelSmall = TextStyle(
            fontFamily =googleSansFlex,
            fontWeight = FontWeight.Normal,
            fontSize = 11.sp,
            lineHeight = 14.sp
        )
    )


    val defaultShapes = KoreShapes(
        extraLarge = RoundedCornerShape(34.dp),
        large = RoundedCornerShape(24.dp),
        medium = RoundedCornerShape(16.dp),
        normal = RoundedCornerShape(12.dp),
        small = RoundedCornerShape(8.dp)
    )

    val defaultSizes = KoreSizes(
        extraLarge = 34.dp,
        large = 24.dp,
        medium = 16.dp,
        normal = 12.dp,
        small = 8.dp,
        extraSmall = 4.dp
    )


}



