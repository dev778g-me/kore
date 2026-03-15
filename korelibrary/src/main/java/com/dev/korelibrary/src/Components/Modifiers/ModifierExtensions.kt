package com.dev.korelibrary.src.Components.Modifiers

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import com.dev.korelibrary.src.Components.Themes.KoreTheme


fun Modifier.scaleClickable(
    pressedScale: Float = 0.95f,
    onClick: () -> Unit,
    interactionSource: MutableInteractionSource ? =null
): Modifier = composed {

    val interactionSource = remember { interactionSource ?: MutableInteractionSource() }

    val isPressed by interactionSource.collectIsPressedAsState()

    val animatedScale by animateFloatAsState(
        targetValue = if (isPressed) pressedScale else 1f,
        label = "pressEffect"
    )

    this
        .graphicsLayer {
            scaleX = animatedScale
            scaleY = animatedScale
        }
        .clickable(
            interactionSource = interactionSource,
            indication = null,
            onClick = onClick
        )
}




fun Modifier.noRippleClickable(
    onClick : () -> Unit,
    enabled : Boolean = true,
    interactionSource: MutableInteractionSource ? = null
) : Modifier = composed{

    val scopedInteractionSource = interactionSource ?: remember { MutableInteractionSource() }

    this
        .clickable(
            onClick = onClick,
            interactionSource = scopedInteractionSource,
            indication = null,
            enabled = enabled
        )

}


@Composable
fun Color.animateTo(
    target: Color,
    condition: Boolean,
    animationSpec: AnimationSpec<Color> = tween()
): Color {
    val color by animateColorAsState(
        targetValue = if (condition) target else this,
        animationSpec = animationSpec,
        label = "animateColor"
    )
    return color
}



@Composable
fun Dp.animateTo(
    target: Dp ,
    condition: Boolean,
    animationSpec: AnimationSpec<Dp> = tween()
) : Dp{
    val dp by animateDpAsState(
        targetValue = if (condition) target else this,
        animationSpec = animationSpec,
        label = "animateDp"
    )

    return dp
}



@Composable
fun Float.animateTo(
    target: Float,
    condition: Boolean,
    animationSpec: AnimationSpec<Float> = tween()
): Float{
    val float by animateFloatAsState(
        targetValue = if (condition) target else this,
        animationSpec = animationSpec,
        label = "animateFloat"
    )
    return  float
}



fun Modifier.shimmer(
    colors: List<Color>? = null,
    shape: Shape? = null
): Modifier = composed {

    val resolvedColors = colors ?: listOf(
        KoreTheme.colorScheme.backGroundVariant.copy(alpha = 0.7f),
        KoreTheme.colorScheme.backGroundVariant.copy(alpha = 0.3f),
        KoreTheme.colorScheme.backGroundVariant.copy(alpha = 0.7f),
    )
    val resolvedShape = shape ?: KoreTheme.shapes.medium


    var size by remember {
        mutableStateOf(IntSize.Zero)
    }
    val transition = rememberInfiniteTransition()

    val offsetX by transition.animateFloat(
        initialValue = -2 * size.width.toFloat(),
        targetValue = 2 * size.width.toFloat(),
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 2000,
            )
        )
    )

    this
        .background(
            shape = resolvedShape,
            brush = Brush.linearGradient(
                colors = resolvedColors,
                start = Offset(x = offsetX, y = 0f),
                end = Offset(x = offsetX + size.width.toFloat(), size.height.toFloat())
            )
        )
        .onGloballyPositioned {
            size = it.size
        }
}


