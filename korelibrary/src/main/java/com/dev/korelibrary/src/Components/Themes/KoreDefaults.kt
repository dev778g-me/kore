package com.dev.korelibrary.src.Components.Themes

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.jadu.nivi.presentation.utils.squircleShape.SquircleShape

object KoreDefaults{
    val defaultLightColorScheme = KoreColors(
        background = TailwindColors.Neutral100,
        onBackGround = TailwindColors.Neutral900,
        backGroundVariant = TailwindColors.Neutral300,
        onBackGroundVariant = TailwindColors.Neutral800,

        disabled = TailwindColors.Neutral200,
        onDisabled = TailwindColors.Neutral400,

        primary = TailwindColors.Blue500,
        onPrimary = TailwindColors.Blue50,
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

        success = TailwindColors.Green500,
        onSuccess = TailwindColors.Gray100,

        error = TailwindColors.Red600,
        onError = TailwindColors.White,
        transParentColor = Color.Transparent
    )


    val defaultDarkColorScheme = KoreColors(
        background = TailwindColors.Neutral950,
        onBackGround = TailwindColors.Neutral100,
        backGroundVariant = TailwindColors.Neutral800,
        onBackGroundVariant = TailwindColors.Neutral200,


        disabled = TailwindColors.Neutral900,
        onDisabled = TailwindColors.Neutral700,

        primary = TailwindColors.Blue600,
        onPrimary = TailwindColors.Blue100,
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

        success = TailwindColors.Green700,
        onSuccess = TailwindColors.Gray200,

        error = TailwindColors.Red500,
        onError = TailwindColors.Gray100,
        transParentColor = Color.Transparent
    )


    val defaultTypography = KoreTypography(
        // Display styles (largest)
        displayLarge = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.Normal,
            fontSize = 57.sp,
            lineHeight = 64.sp,
            letterSpacing = 0.sp
        ),
        displayMedium = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.Normal,
            fontSize = 45.sp,
            lineHeight = 52.sp,
            letterSpacing = 0.sp
        ),
        displaySmall = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.Normal,
            fontSize = 36.sp,
            lineHeight = 44.sp,
            letterSpacing = 0.sp
        ),

        // Headline styles
        headingLarge = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            lineHeight = 40.sp,
            letterSpacing = 0.sp
        ),
        headingMedium = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            lineHeight = 36.sp,
            letterSpacing = 0.sp
        ),
        headingSmall = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            lineHeight = 32.sp,
            letterSpacing = 0.sp
        ),

        // Title styles
        titleLarge = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.Medium,
            fontSize = 22.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp
        ),
        titleMedium = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.15.sp
        ),
        titleSmall = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.1.sp
        ),

        // Body styles (for large text blocks)
        bodyLarge = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.15.sp
        ),
        bodyMedium = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.25.sp
        ),
        bodySmall = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.4.sp
        ),

        // Label styles (buttons, chips, etc.)
        labelLarge = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.1.sp
        ),
        labelMedium = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        ),
        labelSmall = TextStyle(
            fontFamily = googleSansFlex,
            fontWeight = FontWeight.SemiBold,
            fontSize = 11.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        )
    )


    val defaultShapes = KoreShapes(
        extraLarge = RoundedCornerShape(34.dp),
        large = RoundedCornerShape(24.dp),
        medium = RoundedCornerShape(16.dp),
        normal = RoundedCornerShape(12.dp),
        small = RoundedCornerShape(8.dp)
    )

    val defaultSquircleShapes = KoreShapes(
        extraLarge = SquircleShape(34.dp),
        large = SquircleShape(24.dp),
        medium = SquircleShape(16.dp),
        normal = SquircleShape(12.dp),
        small = SquircleShape(8.dp)
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



