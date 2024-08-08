package ru.apstegor.orbitexample.ui.components.screencontent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.apstegor.orbitexample.ui.components.cards.UserCard
import ru.apstegor.orbitexample.ui.contract.MainScreenState

@Composable
fun MaineScreenContent(
    modifier: Modifier,
    state: MainScreenState
) {
    if (state.isLoading){
        Column(modifier = Modifier.fillMaxSize()) {
            CircularProgressIndicator()
        }
    } else{
        Column(modifier = modifier.verticalScroll(rememberScrollState())) {
            state.currentUser?.let {
                UserCard(userDataVo = it)
            }

            state.users.forEach {
                UserCard(userDataVo = it)
            }
        }
    }
}

@Preview
@Composable
private fun MaineScreenContentPreview() {
    MaineScreenContent(modifier = Modifier, state = MainScreenState())
}