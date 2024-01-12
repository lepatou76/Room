package com.example.room.data.service

import com.example.room.data.room.ContactEntity

interface ContactDatabaseService {
    fun addNewContact(contactEntity: ContactEntity)
    fun getContacts() : List<ContactEntity>
    fun updateContact(contactEntity: ContactEntity)
    fun deleteContact(idContact : Long)
}