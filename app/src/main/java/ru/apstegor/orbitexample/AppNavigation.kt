package ru.apstegor.orbitexample

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost

import androidx.navigation.NavHostController
import ru.apstegor.orbitexample.navigation.maineScreen
import ru.apstegor.orbitexample.navigation.maineScreenRoute



@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
internal fun AppNavigation(
    navController: NavHostController,
) {
    NavHost(modifier = Modifier.fillMaxSize(),navController = navController, startDestination = maineScreenRoute){
        maineScreen(navController)
    }
}