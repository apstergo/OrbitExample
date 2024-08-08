package ru.apstegor.orbitexample.data.repository

import ru.apstegor.orbitexample.data.api.ApiUsers
import ru.apstegor.orbitexample.data.models.UserDto

class UserRepositoryImpl(
    private val apiUsers: ApiUsers
) : UserRepository {
    override suspend fun getCurrentUser(): UserDto {
        return apiUsers.getCurrentUser()
    }

    override suspend fun getAllUser(): List<UserDto> {
        return apiUsers.getAllUsers()
    }

}