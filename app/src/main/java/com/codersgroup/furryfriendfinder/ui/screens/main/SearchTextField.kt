package com.codersgroup.furryfriendfinder.ui.screens.main

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SearchTextField(
  text: String,
  label: String,
  modifier: Modifier = Modifier,
  onTextChange: (String) -> Unit

) {
  OutlinedTextField(modifier = modifier, value = text, onValueChange = { onTextChange(it) },
    label = { Text(text = label) }
  )
}