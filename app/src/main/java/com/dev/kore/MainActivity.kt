package com.dev.kore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.CatchingPokemon
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Light
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.dev.korelibrary.src.Components.Buttons.ButtonSizes
import com.dev.korelibrary.src.Components.Buttons.GhostButton
import com.dev.korelibrary.src.Components.Buttons.GhostIconButton
import com.dev.korelibrary.src.Components.Buttons.Icon

import com.dev.korelibrary.src.Components.Buttons.OutlinedButton
import com.dev.korelibrary.src.Components.Buttons.OutlinedIconButton
import com.dev.korelibrary.src.Components.Buttons.PrimaryButton
import com.dev.korelibrary.src.Components.Buttons.PrimaryIconButton
import com.dev.korelibrary.src.Components.Buttons.SecondaryButton
import com.dev.korelibrary.src.Components.Buttons.SecondaryIconButton
import com.dev.korelibrary.src.Components.Scaffold.Scaffold
import com.dev.korelibrary.src.Components.Text
import com.dev.korelibrary.src.Components.Themes.KoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var enabled by remember { mutableStateOf(true) }
            val kore = "Hello Kore"
            KoreTheme(
            ) {
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
                            Text(
                                color = KoreTheme.colorScheme.primary,
                                text = "Buttons",
                                textStyle = KoreTheme.typography.headingMedium
                            )
                            Spacer(
                                modifier = Modifier.height(12.dp)
                            )
                            Text(
                                //color = KoreTheme.colorScheme.primary,
                                text = "Enabled",
                                textStyle = KoreTheme.typography.titleMedium
                                    .copy(
                                        color = KoreTheme.colorScheme.primary
                                    )
                            )
                            Spacer(
                                modifier = Modifier.height(12.dp)
                            )
                            FlowRow(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Start,

                            ) {
                                PrimaryButton(
                                   onClick = {}
                               ) {
                                   Text(
                                       text = "Hello Kore"
                                   )
                               }
                                Spacer(
                                    modifier = Modifier.width(12.dp)
                                )

                               SecondaryButton(
                                   onClick = {}
                               ) {
                                   Text(
                                       text = "Hello Kore"
                                   )
                               }
                                Spacer(
                                    modifier = Modifier.width(12.dp)
                                )
                               OutlinedButton(
                                   onClick = {}
                               ) {
                                   Text(
                                       text = "Hello Kore"
                                   )
                               }

                               GhostButton(
                                   modifier = Modifier.padding(
                                       top = 8.dp
                                   ),
                                   onClick = {}
                               ) {
                                   Text(
                                       text = "Hello Kore"
                                   )
                               }
                           }
                            Spacer(
                                modifier = Modifier.height(12.dp)
                            )
                            Text(
                                //color = KoreTheme.colorScheme.primary,
                                text = "Disabled",
                                textStyle = KoreTheme.typography.titleMedium
                                    .copy(
                                        color = KoreTheme.colorScheme.primary
                                    )
                            )
                            Spacer(
                                modifier = Modifier.height(12.dp)
                            )
                            FlowRow(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Start,

                                ) {
                                PrimaryButton(
                                    enabled = false,
                                    onClick = {}
                                ) {
                                    Text(
                                        text = "Hello Kore"
                                    )
                                }
                                Spacer(
                                    modifier = Modifier.width(12.dp)
                                )
                                SecondaryButton(
                                    enabled = false,
                                    onClick = {}
                                ) {
                                    Text(
                                        text = "Hello Kore"
                                    )
                                }
                                Spacer(
                                    modifier = Modifier.width(12.dp)
                                )
                                OutlinedButton(
                                    enabled = false,
                                    onClick = {}
                                ) {
                                    Text(
                                        text = "Hello Kore"
                                    )
                                }

                                GhostButton(
                                    enabled = false,
                                    modifier = Modifier.padding(
                                        top = 8.dp
                                    ),
                                    onClick = {}
                                ) {
                                    Text(
                                        text = "Hello Kore"
                                    )
                                }
                            }
                            Spacer(
                                modifier = Modifier.height(12.dp)
                            )
                            Text(
                                color = KoreTheme.colorScheme.primary,
                                text = "Icon Buttons",
                                textStyle = KoreTheme.typography.headingMedium
                                    .copy(
                                        color = KoreTheme.colorScheme.primary
                                    )
                            )
                            Spacer(
                                modifier = Modifier.height(12.dp)
                            )
                            Text(
                                //color = KoreTheme.colorScheme.primary,
                                text = "Enabled",
                                textStyle = KoreTheme.typography.titleMedium
                                    .copy(
                                        color = KoreTheme.colorScheme.primary
                                    )
                            )
                            Spacer(
                                modifier = Modifier.height(12.dp)
                            )
                            FlowRow(
                                horizontalArrangement = Arrangement.SpaceAround,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                PrimaryIconButton(
                                    onClick = {},
                                    content = {
                                        Icon(
                                            imageVector = Icons.Rounded.CatchingPokemon,
                                            contentDescription = ""
                                        )
                                    }
                                )

                                SecondaryIconButton(
                                    onClick = {}
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.CatchingPokemon,
                                        contentDescription = ""
                                    )
                                }

                                OutlinedIconButton (
                                    onClick = {}
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.CatchingPokemon,
                                        contentDescription = ""
                                    )
                                }
                                GhostIconButton(
                                    onClick = {}
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.CatchingPokemon,
                                        contentDescription = ""
                                    )
                                }



                            }
                            Spacer(
                                modifier = Modifier.height(12.dp)
                            )
                            Text(
                                //color = KoreTheme.colorScheme.primary,
                                text = "Disabled",
                                textStyle = KoreTheme.typography.titleMedium
                                    .copy(
                                        color = KoreTheme.colorScheme.primary
                                    )
                            )
                            Spacer(
                                modifier = Modifier.height(12.dp)
                            )
                            FlowRow(
                                horizontalArrangement = Arrangement.SpaceAround,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                PrimaryIconButton(
                                    enabled = false,
                                    onClick = {},
                                    content = {
                                        Icon(
                                            imageVector = Icons.Rounded.CatchingPokemon,
                                            contentDescription = ""
                                        )
                                    }
                                )

                                SecondaryIconButton(
                                    enabled = false,
                                    onClick = {}
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.CatchingPokemon,
                                        contentDescription = ""
                                    )
                                }
                                OutlinedIconButton (
                                    enabled = false,
                                    onClick = {}
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.CatchingPokemon,
                                        contentDescription = ""
                                    )
                                }

                                GhostIconButton(
                                    enabled = false,
                                    onClick = {}
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.CatchingPokemon,
                                        contentDescription = ""
                                    )
                                }



                            }

                        }
                    }
                )
            }
        }
    }
}

