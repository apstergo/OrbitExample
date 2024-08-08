package ru.apstegor.orbitexample.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import ru.apstegor.orbitexample.ui.maine_screen.MaineScreen

val maineScreenRoute = "maine_screen_route"
private const val TRANSITION_DURATION = 300

fun NavController.navigateToMaineScreen() {
    this.navigate(maineScreenRoute)
}

fun NavGraphBuilder.maineScreen(
    navController: NavHostController,
) {
    composable(
        route = maineScreenRoute,
    ) {
       MaineScreen(navController)
    }
}