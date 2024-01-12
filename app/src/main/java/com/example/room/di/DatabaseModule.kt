package com.example.room.di

import android.content.Context
import androidx.room.Room
import com.example.room.data.room.ContactDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {
    @Provides
    fun provideContactDao(contactDatabase: ContactDatabase) = contactDatabase.contactDao()

    @Provides
    @Singleton
    fun provideContactDatabase(@ApplicationContext appContext: Context): ContactDatabase {
        return Room.databaseBuilder(appContext, ContactDatabase::class.java, "contact_db").build()
    }
}