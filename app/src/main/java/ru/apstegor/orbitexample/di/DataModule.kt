package ru.apstegor.orbitexample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.apstegor.orbitexample.data.api.ApiUsers
import ru.apstegor.orbitexample.data.repository.UserRepository
import ru.apstegor.orbitexample.data.repository.UserRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {
    @Provides
    @Singleton
    fun provideUserRepository(
        apiUsers: ApiUsers
    ): UserRepository = UserRepositoryImpl(apiUsers = apiUsers)
}