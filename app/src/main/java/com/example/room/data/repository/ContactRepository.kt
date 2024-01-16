package com.example.room.data.repository

import com.example.room.data.model.Contact


interface ContactRepository {
    fun addNewContact(contact: Contact)
    fun getContacts() : List<Contact>
    fun updateContact(contact: Contact)
    fun deleteContact(idContact : Long)
}