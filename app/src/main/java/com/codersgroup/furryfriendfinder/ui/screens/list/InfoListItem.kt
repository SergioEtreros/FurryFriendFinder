package com.codersgroup.furryfriendfinder.ui.screens.list

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun InfoListItem(pet: Pet, onItemClick: (id: Int) -> Unit) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .clickable { onItemClick(pet.id) }
            .background(MaterialTheme.colorScheme.primaryContainer, RoundedCornerShape(8.dp)),
        verticalArrangement = Arrangement.Center
    ) {
        AsyncImage(
            model = pet.image,
            contentDescription = "Imagen de Mascota",
            modifier = Modifier
                .aspectRatio(2f)
                .clip(MaterialTheme.shapes.small)
        )
        Text(
            text = pet.name,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(8.dp)
        )
        MySimpleListText(title = "Especie", content = pet.kind)

        MySimpleListText(title = "Sexo", content = pet.sex)

        MySimpleListText(title = "Raza", content = pet.raza)


    }

}