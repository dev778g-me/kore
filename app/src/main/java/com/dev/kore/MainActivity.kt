package com.dev.kore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Php
import androidx.compose.material.icons.rounded.Email
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.dev.korelibrary.src.Components.Buttons.GhostIconButton
import com.dev.korelibrary.src.Components.Buttons.Icon
import com.dev.korelibrary.src.Components.Scaffold.Scaffold
import com.dev.korelibrary.src.Components.TextFields.OutlinedTextField
import com.dev.korelibrary.src.Components.TextFields.TextFieldDefaults
import com.dev.korelibrary.src.Components.Themes.KoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var enabled by remember { mutableStateOf(true) }
            var textField by remember { mutableStateOf("") }
            var textField1 by remember { mutableStateOf("") }
            val kore = "Hello Kore"
            val interactionSource = remember { MutableInteractionSource() }
            val isFocused by interactionSource.collectIsFocusedAsState()

            val interactionSource1 = remember { MutableInteractionSource() }
            val isFocused1 by interactionSource1.collectIsFocusedAsState()
            var isFocus by remember { mutableStateOf(false) }
            KoreTheme{
                Scaffold(
                    content = {
                        Column(
                            //horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(
                                    horizontal = 16.dp,

                                    )
                        ) {


                            OutlinedTextField(
                                visualTransformation = PasswordVisualTransformation(),
//                                enabled = false,
//                                isError = true,
                                leadingIcon = {
                                    Icon(
                                        imageVector = Icons.Rounded.Email,
                                        contentDescription = ""
                                    )
//                                    GhostIconButton(
//                                        //enabled = false,
//                                        onClick = {}
//                                    ) {
//                                        Icon(
//                                            imageVector = Icons.Rounded.Email,
//                                            contentDescription = ""
//                                        )
//                                    }
                                },
                                trailingIcon = {
                                    Icon(
                                        imageVector = Icons.Default.Php,
                                        contentDescription = ""
                                    )
                                },
                                value = textField1,
                                onValueChange = {
                                    textField1 = it
                                },
                                label = "Enter mail",


                                )
                            Spacer(
                                modifier = Modifier.height(23.dp)
                            )

//                            PrimaryButton(
//                                onClick = {}
//                            ) {
//                                Text(
//                                    text = "Primary"
//                                )
//                            }
//                            Spacer(
//                                modifier = Modifier.height(23.dp)
//                            )
//                            SecondaryButton(
//                                onClick = {}
//                            ) {
//                                Text(
//                                    text = "Primary"
//                                )
//                            }
                        }
                    }
                )
            }
        }
    }
}

