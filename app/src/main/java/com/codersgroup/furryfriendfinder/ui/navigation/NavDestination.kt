package com.codersgroup.furryfriendfinder.ui.navigation

import kotlinx.serialization.Serializable


@Serializable
object SplashScreen

@Serializable
object MainScreen

@Serializable
data class ListScreen(
    val sex: String?,
    val species: String?,
    val race: String?,
    val dangerous: Boolean?,
    val location: String?,
    val sterilized: Boolean?
)

@Serializable
data class DetailScreen(val id: Int)

