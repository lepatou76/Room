package com.example.room.data.service

import com.example.room.data.room.ContactDao
import com.example.room.data.room.ContactEntity
import javax.inject.Inject

class ContactDatabaseImpl @Inject constructor(
    private val contactDao: ContactDao
): ContactDatabaseService {
    override fun addNewContact(contactEntity: ContactEntity) = contactDao.addNewContact(contactEntity)
    
    override fun getContacts(): List<ContactEntity> = contactDao.getContacts()

    override fun updateContact(contactEntity: ContactEntity) = contactDao.updateContact(contactEntity)

    override fun deleteContact(idContact: Long) = contactDao.deleteContact(idContact)

}