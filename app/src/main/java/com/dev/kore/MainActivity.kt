package com.dev.kore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccessAlarm
import androidx.compose.material.icons.rounded.Code
import androidx.compose.material.icons.rounded.Error
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.dev.habity.icons.OutputIconFile
import com.dev.korelibrary.src.Components.Buttons.Icon
import com.dev.korelibrary.src.Components.Buttons.OutlinedButton
import com.dev.korelibrary.src.Components.Buttons.PrimaryButton
import com.dev.korelibrary.src.Components.Buttons.PrimaryIconButton
import com.dev.korelibrary.src.Components.Chips.ErrorChip
import com.dev.korelibrary.src.Components.Chips.OutlinedChip
import com.dev.korelibrary.src.Components.Chips.PrimaryChip
import com.dev.korelibrary.src.Components.Chips.SecondaryChip
import com.dev.korelibrary.src.Components.Chips.SuccessChip
import com.dev.korelibrary.src.Components.Dialogs.AlertDialog
import com.dev.korelibrary.src.Components.Scaffold.Scaffold
import com.dev.korelibrary.src.Components.Text
import com.dev.korelibrary.src.Components.Themes.KoreTheme
import io.jadu.nivi.presentation.utils.squircleShape.CornerSmoothing
import io.jadu.nivi.presentation.utils.squircleShape.SquircleShape

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var enabled by rememberSaveable() { mutableStateOf(false) }

            KoreTheme{
                Scaffold(
                    content = {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(
                                    it

                                )
                        ) {

                           PrimaryIconButton(
                               onClick = {}
                           ) {
                               Icon(
                                   imageVector = OutputIconFile,
                                   contentDescription = ""
                               )
                           }
                            if (enabled){
                                AlertDialog(
                                    onDismissRequest = {
                                        enabled = false
                                    },
                                    title = {
                                        Text(
                                            text = "Are you sure you want to delete this item?"
                                        )
                                    },
                                    description = {
                                        Text(
                                            text = "Deleting this item will permanently remove all its details and associated item data. This action cannot be undone."
                                        )
                                    },
                                    confirmButton = {
                                        PrimaryButton(
                                            onClick = {
                                                enabled = false
                                            }
                                        ) {
                                            Text(
                                                text = "Cancel"
                                            )
                                        }
                                    },
                                    dismissButton = {
                                        OutlinedButton(
                                            onClick = {
                                                enabled = false
                                            }
                                        ) {
                                            Text(
                                                text = "Delete"
                                            )
                                        }
                                    }
                                )
                            }
                            Text(
                                text = "Basic dialog compose foundation",
                                color = KoreTheme.colorScheme.primary
                            )
                            PrimaryButton(
                                onClick = {
                                    enabled = true
                                }
                            ) {
                                Text(
                                    text = "Show Dialog"
                                )
                            }


                            Spacer(
                                modifier = Modifier.height(12.dp)
                            )

                            OutlinedButton(
                                buttonPadding = PaddingValues(
                                    horizontal = 12.dp
                                ),
                                onClick = {}
                            ) {
                                Text(
                                    text = "Outlinesd"
                                )
                            }


//                            AlertDialog(
//                                onDismissRequest = {}
//                            )
//                            OutlinedChip(
//                               // enabled = false,
//                                content = {
//                                    Text(
//                                        text = "Primary Chip"
//                                    )
//                                },
//                                leadingIcon = {
//                                    Icon(
//                                        imageVector = Icons.Rounded.AccessAlarm,
//                                        contentDescription = ""
//                                    )
//                                },
//                            )
//
//                            Spacer(
//                                modifier = Modifier.height(8.dp)
//                            )
//                            SecondaryChip(
//                                content = {
//                                    Text(
//                                        text = "Primary Chip"
//                                    )
//                                },
//                                leadingIcon = {
//                                    Icon(
//                                        imageVector = Icons.Rounded.AccessAlarm,
//                                        contentDescription = ""
//                                    )
//                                },
//                            )
//                            Spacer(
//                                modifier = Modifier.height(8.dp)
//                            )
//                            SuccessChip(
//                              //  enabled = false,
//                                content = {
//                                    Text(
//                                        text = "Success Chip"
//                                    )
//                                },
//                                leadingIcon = {
//                                    Icon(
//                                        imageVector = Icons.Rounded.Code,
//                                        contentDescription = ""
//                                    )
//                                },
//
//                                )
//
//                            Spacer(
//                                modifier = Modifier.height(8.dp)
//                            )
//
//                            ErrorChip(
//                                content = {
//                                    Text(
//                                        text = "Error Chip"
//                                    )
//                                },
//                                leadingIcon = {
//                                    Icon(
//                                        imageVector = Icons.Rounded.Error,
//                                        contentDescription = ""
//                                    )
//                                },
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


@Preview
@Composable
private fun testButton() {
    OutlinedButton(
        onClick = {}
    ) {
        Text(
            text = "afk"
        )
    }
}