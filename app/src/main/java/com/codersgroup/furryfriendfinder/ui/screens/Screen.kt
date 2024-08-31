package com.codersgroup.furryfriendfinder.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.codersgroup.furryfriendfinder.ui.theme.FurryFriendFinderTheme

@Composable
fun Screen(content: @Composable () -> Unit) {
  FurryFriendFinderTheme {
    Surface(
      modifier = Modifier.fillMaxSize(),
      content = content
    )
  }
}
