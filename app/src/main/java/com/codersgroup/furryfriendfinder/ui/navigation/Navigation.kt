package com.codersgroup.furryfriendfinder.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.coroutines.delay

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = SplashScreen) {
        composable<SplashScreen> {
            // SplashScreen()
            LaunchedEffect(Unit) {
                delay(3000)
                navController.navigate(MainScreen)
            }
        }

        composable<MainScreen> {
//             MainScreen( onPetClick = { pet ->
//                navController.navigate(
//         ListScreen(pet.sex, pet.species, pet.race, pet.dangerous, pet.location, pet.sterilized)) } )
        }

        composable<ListScreen> { navBackStackEntry ->
            val filters = navBackStackEntry.toRoute<ListScreen>()
             ListScreen(filters.sex, filters.species, filters.race, filters.dangerous, filters.sterilized)
        // { id -> navController.navigate(DetailScreen(id)) }
        }

        composable<DetailScreen> { navBackStackEntry ->
            val detail = navBackStackEntry.toRoute<DetailScreen>()
          //   DetailScreen( id = detail.id ) { navController.popBackStack( MainScreen, true ) }
        }
    }
}