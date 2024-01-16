package com.example.room.data.repository

import com.example.room.data.model.Contact
import com.example.room.data.room.ContactEntity
import com.example.room.data.service.ContactDatabaseService
import javax.inject.Inject

class ContactRpositoryImpl @Inject constructor(
    private val contactDatabaseService: ContactDatabaseService
): ContactRepository {
    override fun addNewContact(contact: Contact) {
        val contactEntity = ContactEntity(
            firstName = contact.firstName,
            lastName = contact.lastName,
            phoneNumber = contact.phoneNumber
        )
        contactDatabaseService.addNewContact(contactEntity)
    }

    override fun getContacts(): List<Contact> = contactDatabaseService.getContacts().map{
        Contact(
            id = it.id,
            firstName = it.firstName,
            lastName = it.lastName,
            phoneNumber = it.phoneNumber

        )
        TODO("Not yet implemented")
    }

    override fun updateContact(contact: Contact) {
        TODO("Not yet implemented")
    }

    override fun deleteContact(idContact: Long) {
        TODO("Not yet implemented")
    }
}