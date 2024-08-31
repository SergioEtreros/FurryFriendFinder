package com.codersgroup.furryfriendfinder.ui.screens.main

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.codersgroup.furryfriendfinder.R
import com.codersgroup.furryfriendfinder.ui.screens.Screen
import com.codersgroup.furryfriendfinder.ui.theme.largePadding
import com.codersgroup.furryfriendfinder.ui.theme.smallPadding

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
  onSearch: (List<String>) -> Unit
) {

  Screen {
    Scaffold(
      topBar = {
        TopAppBar(
          title = {
            Text(text = stringResource(R.string.app_name))
          },
        )
      }
    ) { padding ->

      var sexText by rememberSaveable { mutableStateOf("") }
      var kindText by rememberSaveable { mutableStateOf("") }
      var breedText by rememberSaveable { mutableStateOf("") }
      var dangerousText by rememberSaveable { mutableStateOf("") }
      var placeText by rememberSaveable { mutableStateOf("") }
      var sterilizedText by rememberSaveable { mutableStateOf("") }
      val modifier = Modifier.fillMaxWidth()

      Column(
        modifier = Modifier
          .fillMaxSize()
          .padding(padding)
          .padding(largePadding),
        verticalArrangement = Arrangement.spacedBy(largePadding)

      ) {

        SearchCombo(
          label = stringResource(R.string.sex),
          optionsList = stringArrayResource(id = R.array.sexOptions).toList(),
          modifier = modifier
        ) { sexText = it }

        SearchTextField(
          text = kindText,
          label = stringResource(R.string.kind),
          modifier = modifier
        ) { kindText = it }

        SearchTextField(
          text = breedText,
          label = stringResource(R.string.breed),
          modifier = modifier
        ) { breedText = it }

        SearchCombo(
          label = stringResource(R.string.dangerous),
          optionsList = stringArrayResource(id = R.array.answerYesNo).toList(),
          modifier = modifier
        ) { dangerousText = it }

        SearchTextField(
          text = placeText,
          label = stringResource(R.string.place),
          modifier = modifier
        ) { placeText = it }

        SearchCombo(
          label = stringResource(R.string.sterilized),
          optionsList = stringArrayResource(id = R.array.answerYesNo).toList(),
          modifier = modifier
        ) { sterilizedText = it }

      }

      Box(
        contentAlignment = Alignment.BottomEnd,
        modifier = Modifier
          .fillMaxSize()
          .padding(padding)
          .padding(largePadding),
      ) {
        Button(
          modifier = modifier.padding(smallPadding),
          onClick = {
            onSearch(listOf(
              sexText,
              kindText,
              breedText,
              dangerousText,
              placeText,
              sterilizedText
            ))
          }) {
          Text(
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(R.string.search)
          )
        }
      }
    }
  }
}

@Preview(showSystemUi = true, showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(showSystemUi = true, showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun MainScreenPreview() {
  Screen {
    MainScreen {}
  }
}