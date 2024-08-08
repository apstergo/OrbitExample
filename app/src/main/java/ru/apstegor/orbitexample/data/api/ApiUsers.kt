package ru.apstegor.orbitexample.data.api

import ru.apstegor.orbitexample.data.models.UserDto

interface ApiUsers {
    suspend fun getAllUsers():List<UserDto>
    suspend fun getCurrentUser():UserDto
}