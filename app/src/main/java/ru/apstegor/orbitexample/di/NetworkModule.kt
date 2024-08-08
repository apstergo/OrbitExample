package ru.apstegor.orbitexample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.apstegor.orbitexample.data.api.ApiUsers
import ru.apstegor.orbitexample.data.api.ApiUsersImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Provides
    @Singleton
    fun providesApiUsers():ApiUsers=ApiUsersImpl()
}