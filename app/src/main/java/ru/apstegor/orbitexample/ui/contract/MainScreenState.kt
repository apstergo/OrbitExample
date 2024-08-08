package ru.apstegor.orbitexample.ui.contract

import ru.apstegor.orbitexample.ui.models.UserDataVo

data class MainScreenState(
    val currentUser: UserDataVo? = null,
    val users: List<UserDataVo> = listOf(),
    val isLoading: Boolean = false,
)