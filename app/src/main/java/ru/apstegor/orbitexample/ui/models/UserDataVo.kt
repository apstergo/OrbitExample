package ru.apstegor.orbitexample.ui.models

data class UserDataVo(
    val id: Int,
    val name: String,
    val surname: String,
    val rating: Int,
    val imageUrl: String?,
    val members: Int,
)
