package com.example.parcialmovil.nagivation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.compose.ui.Modifier
import androidx.navigation.compose.composable

/*

sealed class AppScreen(val route: String) {
    object SuperHeroScreen : AppScreen("start")
    object DetailSuperHeroScreen : AppScreen("detailSuperHero")
}



@Composable
fun AppNavigation(
    navHostController: NavHostController,
    modifier : Modifier = Modifier
) {
    NavHost(
        navController = navHostController,
        startDestination = AppScreen.SuperHeroScreen.route,
        modifier = modifier
    ) {

        composable(AppScreen.SuperHeroScreen.route) {

        }

        //Devolverse a la pantalla anterior
        composable(AppScreen.DetailSuperHeroScreen.route) {
            onBackClickPressed = {
                navHostController.
            }
        }

    }
}



 */