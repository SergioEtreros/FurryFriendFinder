package com.codersgroup.furryfriendfinder.domain.model

data class Pet (
    val id: Int,
    val name: String,
    val age: String,
    val image: String,
    val sex: String,
    val species: String,
    val race: String,
    val size: String,
    val color: String,
    val dangerous: Boolean,
    val sterilized: Boolean,
    val character : String,
)
