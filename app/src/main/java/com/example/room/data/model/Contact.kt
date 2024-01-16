package com.example.room.data.model

import androidx.room.ColumnInfo

data class Contact(
    val id: Long = 0,
    val firstName: String,
    val lastName: String,
    val phoneNumber: String
)