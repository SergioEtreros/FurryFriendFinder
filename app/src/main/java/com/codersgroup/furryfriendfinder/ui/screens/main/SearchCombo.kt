package com.codersgroup.furryfriendfinder.ui.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalTextInputService

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun SearchCombo(
  label: String,
  optionsList: List<String>,
  modifier: Modifier = Modifier,
  onSelect: (String) -> Unit
) {
  var value by rememberSaveable { mutableStateOf("") }
  var expanded by rememberSaveable { mutableStateOf(false) }

  ExposedDropdownMenuBox(
    expanded = expanded,
    onExpandedChange = { expanded = !expanded }) {

    CompositionLocalProvider(
      LocalTextInputService provides null
    ) {
      OutlinedTextField(
        enabled = true,
        modifier = modifier
          .menuAnchor(),
        readOnly = true,
        value = value,
        onValueChange = {},
        label = { Text(text = label) },
        trailingIcon = {
          ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
        },
      )
    }
    ExposedDropdownMenu(
      expanded = expanded,
      onDismissRequest = { expanded = false }
    ) {
      Column {
        for (option in optionsList) {
          DropdownMenuItem(
            text = { Text(text = option) },
            onClick = {
              value = option
              expanded = false
              onSelect(option)
            })
        }
      }
    }
  }
}