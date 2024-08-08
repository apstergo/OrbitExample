package ru.apstegor.orbitexample.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import ru.apstegor.orbitexample.data.repository.UserRepository
import ru.apstegor.orbitexample.ui.contract.MainScreenState
import javax.inject.Inject

@HiltViewModel
class MaineScreenViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel(), ContainerHost<MainScreenState, Nothing> {

    override val container = container<MainScreenState, Nothing>(MainScreenState()) {
        getCurrentUser()
        getAllUser()
    }

    private fun getCurrentUser() {
        kotlin.runCatching {
            intent { reduce { state.copy(isLoading = true) } }
            viewModelScope.launch(Dispatchers.IO) {
                delay(2000)
                val currentUser = userRepository.getCurrentUser()
                intent { reduce { state.copy(currentUser = currentUser.transform(), isLoading = false) } }
            }
        }
    }

    fun getAllUser() = intent{
        kotlin.runCatching {
            intent { reduce { state.copy(isLoading = true) } }
            viewModelScope.launch(Dispatchers.IO) {
                delay(2000)
                val allUsers = userRepository.getAllUser()
                intent { reduce { state.copy(users = allUsers.map { it.transform() }, isLoading = false) } }
            }
        }
    }

}