package com.example.room.ui.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.room.data.model.Contact
import com.example.room.domain.AddNewContactUseCase
import com.example.room.domain.GetContactsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContactViewModel @Inject constructor(
    val getContactsUseCase: GetContactsUseCase,
    val addNewContactUseCase: AddNewContactUseCase
): ViewModel() {

    fun addNewContact(firstName: String, lastName: String, phoneNumber: String) {
        val contact = Contact(
            firstName = firstName,
            lastName = lastName,
            phoneNumber = phoneNumber
        )
        viewModelScope.launch(Dispatchers.IO) {
            addNewContactUseCase(contact)
        }

    }
}