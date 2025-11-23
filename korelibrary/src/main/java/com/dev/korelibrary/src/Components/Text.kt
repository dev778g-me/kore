package com.dev.korelibrary.src.Components

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import com.dev.korelibrary.src.Components.Themes.LocalContentColor
import com.dev.korelibrary.src.Components.Themes.LocalTextStyle


@Composable
fun Text(
    text : String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = LocalTextStyle.current,
    color : Color = LocalContentColor.current,
    fontSize : TextUnit  = TextUnit.Unspecified,
    lineHeight : TextUnit = TextUnit.Unspecified,
    letterSpacing : TextUnit  = TextUnit.Unspecified,
    fontWeight: FontWeight ? = null,
    fontFamily: FontFamily ? =null,
    fontStyle : FontStyle? = null,
    textDecoration: TextDecoration ? = TextDecoration.None,
    textAlign: TextAlign ? = null,
    textDirection: TextDirection ? = TextDirection.Unspecified,
    softWrap  : Boolean = true,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    ){
    val textColor = color.takeOrElse { textStyle.color.takeOrElse { LocalContentColor.current } }

    BasicText(
        modifier = modifier,
        text = text,
        style = textStyle.merge(
            color = textColor,
            fontSize = fontSize,
            fontStyle = fontStyle,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            textAlign = textAlign ?: TextAlign.Unspecified,
            textDirection = textDirection ?: TextDirection.Unspecified,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
            textDecoration = textDecoration,
        ),
        maxLines = maxLines,
        minLines = minLines,
        overflow = textOverflow,
        softWrap = softWrap
    )


}