package com.codersgroup.furryfriendfinder.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MainScreen ) {
        composable<MainScreen> {
           // MainScreen()
        }
    }
}