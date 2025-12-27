package com.dev.korelibrary.src.Components.TextFields

import android.graphics.drawable.shapes.Shape
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.dev.korelibrary.src.Components.Text
import com.dev.korelibrary.src.Components.Themes.KoreTheme
import com.dev.korelibrary.src.Components.Themes.LocalContentColor
import com.dev.korelibrary.src.Components.Themes.LocalTextStyle


// the base text field which other text field with style will implement
@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
internal fun BaseTextField(
    value: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit,
    enabled : Boolean = true,
    readOnly : Boolean = false,
    singleLine: Boolean = false,
    isError: Boolean = false,
    label : String,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    shape : androidx.compose.ui.graphics.Shape = TextFieldDefaults.defaultTextFieldShape,
    textStyle: TextStyle ?,
    textFieldColors: TextFieldColors,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
) {
    val textFieldInteractionSource = remember { MutableInteractionSource() }
    val isFocused by textFieldInteractionSource.collectIsFocusedAsState()
    val shouldFloat = value.isNotEmpty() || isFocused
    CompositionLocalProvider(
        LocalTextStyle provides TextStyle.Default.merge(
            KoreTheme.typography.titleSmall
        ),
        LocalContentColor provides textFieldColors.contentColor(
            enabled = enabled,
            error = isError,
            isFocused = isFocused
        )
    ) {


        Column { ->
            BasicTextField(
                modifier = modifier
                    .defaultMinSize(
                        minHeight = TextFieldDefaults.minimumTextFieldHeight,
                        minWidth =300.dp
                    )
                    .clip(
                        shape = shape
                    )
                    .border(
                        color = textFieldColors.borderColor(
                            enabled = enabled,
                            isFocused = isFocused,
                            hasError = isError
                        ),
                        width = when {
                            isFocused -> 2.dp
                            isError -> 2.dp
                            else -> 1.dp
                        },
                        shape = shape
                    ),
                enabled = enabled,
                readOnly = readOnly,
                singleLine = singleLine,
                keyboardActions = keyboardActions,
                keyboardOptions = keyboardOptions,
                visualTransformation = visualTransformation,
                interactionSource = textFieldInteractionSource,
                textStyle = textStyle ?: LocalTextStyle.current.copy(
                    color = LocalContentColor.current
                ),
                cursorBrush = SolidColor(
                    value = textFieldColors.indicatorColor(
                        enabled = enabled,
                        hasError = isError,
                        isFocused = isFocused
                        )
                    ),
                    decorationBox = { innerField ->
                        DecorationBox(
                            value = value,
                            //modifier = modifier,
                            innerTextField = innerField,
                            enabled = enabled,
                            singleLine = singleLine,
                            textFieldColors = textFieldColors,
                            visualTransformation = visualTransformation,
                            interactionSource = textFieldInteractionSource,
                            leadingIcon = leadingIcon,
                            trailingIcon = trailingIcon,
                            label = label,
                            isError = isError,
                            isFocused = isFocused,
                            shouldFloat = shouldFloat,

                        )
                    }, value = value, onValueChange = {
                        onValueChange.invoke(it)
                    })
            }
    }

}

// decoration box for the text field <idk i am so dumb idk why i am doing this>
@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun DecorationBox(
    value: String,
    modifier: Modifier = Modifier,
    innerTextField : @Composable () -> Unit,
    enabled: Boolean,
    label : String?,
    isError:  Boolean,
    isFocused : Boolean,
    singleLine : Boolean,
    shouldFloat: Boolean,
    textFieldColors: TextFieldColors,
    visualTransformation: VisualTransformation,
    interactionSource: MutableInteractionSource,
    leadingIcon : @Composable (()-> Unit) ?,
    trailingIcon: @Composable (() -> Unit)?,

    ) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(
                TextFieldDefaults.textFieldPadding
            )

            .height(IntrinsicSize.Min)
            .width(IntrinsicSize.Max)
            .wrapContentWidth()
    ) {
        if (leadingIcon != null) {
            Box(
                modifier = Modifier
                    .defaultMinSize(
                        minWidth = TextFieldDefaults.maxLeadingIconHeight,
                        minHeight = TextFieldDefaults.maxLeadingIconHeight
                    )
                    .padding(
                        TextFieldDefaults.leadingIconPaddingValues
                    ),
                contentAlignment = Alignment.Center
            ) {
               CompositionLocalProvider(
                   value = LocalContentColor provides textFieldColors.indicatorColor(
                       enabled = enabled,
                       hasError = isError,
                       isFocused = isFocused
                   )
               ) {
                   leadingIcon()
               }
            }
        }



        Box(
            modifier = Modifier.weight(
                1f
            )
        ) {

            if (!shouldFloat && label != null) {
                Text(
                    text = label,
                )

            }
            innerTextField()
        }


        if (trailingIcon != null) {
            Box(
                modifier = Modifier
                    .defaultMinSize(
                        minWidth = TextFieldDefaults.maxTrailingIconHeight,
                        minHeight = TextFieldDefaults.maxTrailingIconHeight,
                    )
                    .padding(
                        TextFieldDefaults.trailingIconPaddingValues
                    ),
                contentAlignment = Alignment.Center
            ) {
                trailingIcon()
            }
        }
    }}





@Composable
fun OutlinedTextField(
    value: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit,
    enabled : Boolean = true,
    readOnly : Boolean = false,
    singleLine: Boolean = false,
    isError: Boolean = false,
    label : String,
    textStyle: TextStyle? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    textFieldColors: TextFieldColors = TextFieldDefaults.outlinedTextFieldColors(),
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
) {
    BaseTextField(
        value = value,
        modifier = modifier,
        onValueChange = onValueChange,
        enabled = enabled,
        readOnly = readOnly,
        singleLine = singleLine,
        isError = isError,
        label = label,
        textStyle =textStyle ,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        textFieldColors = textFieldColors,
        visualTransformation = visualTransformation,
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
    )
}



