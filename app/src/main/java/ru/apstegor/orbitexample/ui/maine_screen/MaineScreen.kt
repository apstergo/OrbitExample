package ru.apstegor.orbitexample.ui.maine_screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import org.orbitmvi.orbit.compose.collectAsState
import ru.apstegor.orbitexample.ui.components.screencontent.MaineScreenContent
import ru.apstegor.orbitexample.ui.viewmodels.MaineScreenViewModel

@Composable
fun MaineScreen(navController: NavHostController) {
    val viewModel: MaineScreenViewModel = hiltViewModel()

    val state = viewModel.collectAsState().value

    MaineScreenContent(modifier = Modifier.fillMaxSize(), state = state)
}