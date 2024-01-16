package com.example.room.domain

import com.example.room.data.repository.ContactRepository
import javax.inject.Inject

class GetContactsUseCase @Inject constructor(
    private val contactRepository: ContactRepository
) {
    operator fun invoke() = contactRepository.getContacts()
}