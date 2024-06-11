package com.codersgroup.furryfriendfinder.ui.screens.list

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codersgroup.furryfriendfinder.ui.theme.FurryFriendFinderTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(petsList: List<Pet>, onBackPressed: () -> Unit, onItemClick: (id: Int) -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Furry Friends") },
                navigationIcon = {
                    IconButton(onClick = { onBackPressed() }) {
                        Icon(imageVector = Icons.AutoMirrored.Default.ArrowBack, contentDescription = "Go Back")
                    }
                }
            )
        },
        contentWindowInsets = WindowInsets.safeDrawing
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            LazyColumn {
                items(petsList) { pet ->
                    InfoListItem(pet = pet, onItemClick = onItemClick)
                }
            }
        }
    }
}



@Composable
fun MySimpleListText(title: String, content: String) {
    Row(modifier = Modifier.padding(8.dp)) {
        Text(
            text = "$title: ",
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Bold
            )
        )
        Text(
            text = content,
            style = MaterialTheme.typography.titleMedium
        )
    }
}

data class Pet(
    val id: Int,
    val name: String,
    val kind: String,
    val sex: String,
    val raza: String,
    val image: String
)

@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun InfoListItemPreview() {
    FurryFriendFinderTheme {

        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            ListScreen(
                petsList = listOf(
                    Pet(
                        1,
                        "Lola",
                        "Perro",
                        "Hembra",
                        "Shih Tzu",
                        "https://cdn.pixabay.com/photo/2017/02/12/21/29/dog-2065612_960_720.jpg"
                    ),
                    Pet(
                        2,
                        "Lolo",
                        "Perro",
                        "Macho",
                        "Shih Tzu",
                        "https://cdn.pixabay.com/photo/2017/02/12/21/29/dog-2065612_960_720.jpg"
                    )
                ),
                onBackPressed = {},
                onItemClick = {}
            )
        }
    }
}