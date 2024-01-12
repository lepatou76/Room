package com.example.room.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.room.ui.model.ContactUi

@Composable
fun ContactCardView(
    contactUi: ContactUi
) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        ContactInfoView(
            name = "${contactUi.firstName} ${contactUi.lastName}",
            phoneNumber = contactUi.phoneNumber
        )
    }
}

@Composable
fun ContactInfoView(
    name: String,
    phoneNumber: String
) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = name
    )
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = phoneNumber
    )
}