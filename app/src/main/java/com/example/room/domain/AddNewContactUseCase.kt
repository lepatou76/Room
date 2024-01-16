package com.example.room.domain

import com.example.room.data.model.Contact
import com.example.room.data.repository.ContactRepository
import javax.inject.Inject

class AddNewContactUseCase @Inject constructor(
    private val contactRepository: ContactRepository
) {
    operator fun invoke(contact: Contact) = contactRepository.addNewContact(contact)
}