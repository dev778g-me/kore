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
        // background and background variant
        background = TailwindColors.Neutral50,
        onBackGround = TailwindColors.Neutral900,
        backGroundVariant = TailwindColors.Neutral300,
        onBackGroundVariant = TailwindColors.Neutral800,

        // disabled colors
        disabled = TailwindColors.Neutral200,
        onDisabled = TailwindColors.Neutral400,

        // primary colors
        primary = TailwindColors.Blue500,
        onPrimary = TailwindColors.Blue50,
        primaryContainer = TailwindColors.Blue100,
        onPrimaryContainer = TailwindColors.Blue500,

        secondary = TailwindColors.Sky500,
        onSecondary = TailwindColors.Sky100,
        secondaryContainer = TailwindColors.Sky300,
        onSecondaryContainer = TailwindColors.Sky900,



        // success colors
        success = TailwindColors.Green500,
        onSuccess = TailwindColors.Green100,

        // error colors
        error = TailwindColors.Red600,
        onError = TailwindColors.Red50,
        transParentColor = Color.Transparent
    )


    val defaultDarkColorScheme = KoreColors(
        // background and background variant
        background = TailwindColors.Neutral950,
        onBackGround = TailwindColors.Blue50,
        backGroundVariant = TailwindColors.Neutral800,
        onBackGroundVariant = TailwindColors.Neutral200,

        // disabled colors
        disabled = TailwindColors.Neutral900,
        onDisabled = TailwindColors.Neutral700,

        // primary colors
        primary = TailwindColors.Blue600,
        onPrimary = TailwindColors.Blue100,
        primaryContainer = TailwindColors.Blue200,
        onPrimaryContainer = TailwindColors.Blue900,

        secondary = TailwindColors.Sky600,
        onSecondary = TailwindColors.Sky900,
        secondaryContainer = TailwindColors.Sky700,
        onSecondaryContainer = TailwindColors.Blue700,



        // success colors
        success = TailwindColors.Green700,
        onSuccess = TailwindColors.Green200,

        // error colors
        error = TailwindColors.Red500,
        onError = TailwindColors.Red100,
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
            fontWeight = FontWeight.Medium,
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



