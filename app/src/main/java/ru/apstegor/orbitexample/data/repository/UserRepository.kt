package ru.apstegor.orbitexample.data.repository

import ru.apstegor.orbitexample.data.models.UserDto

interface UserRepository {
    suspend fun getCurrentUser(): UserDto
    suspend fun getAllUser(): List<UserDto>
}