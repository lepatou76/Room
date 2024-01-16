package com.example.room.di

import com.example.room.data.repository.ContactRepository
import com.example.room.data.repository.ContactRpositoryImpl
import com.example.room.data.service.ContactDatabaseImpl
import com.example.room.data.service.ContactDatabaseService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {
    @Binds
    abstract fun bindContactDatabaseService(
        contactDatabaseServiceImpl: ContactDatabaseImpl
    ): ContactDatabaseService

    @Binds
    abstract fun bindContactRepository(
        contactRpositoryImpl: ContactRpositoryImpl
    ): ContactRepository
}