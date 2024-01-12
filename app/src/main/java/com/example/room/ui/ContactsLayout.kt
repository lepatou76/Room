package com.example.room.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.room.R
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ContactsLayout() {
    val coroutineScope = rememberCoroutineScope()
    val modalSheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden,
        confirmValueChange = { it != ModalBottomSheetValue.HalfExpanded},
        skipHalfExpanded = false
    )

    ModalBottomSheetLayout(
        modifier = Modifier.fillMaxWidth(),
        sheetState = modalSheetState,
        sheetShape = RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp),
        sheetContent = { BottomSheetContent() }) {
        ListOfContactsView(
            contacts = emptyList(),
            onFABClick = {
                coroutineScope.launch {
                    modalSheetState.show()
                }
            }
        )
    }
}

@Composable
fun BottomSheetContent() {

    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        var firstNameValue by rememberSaveable { mutableStateOf("")}
        var lastNameValue by rememberSaveable { mutableStateOf("")}
        var phoneNumber by rememberSaveable { mutableStateOf("")}

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            label = { Text(stringResource(id = R.string.label_first_name))},
            value = firstNameValue,
            onValueChange = { firstNameValue = it }
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            label = { Text(stringResource(id = R.string.label_last_name))},
            value = lastNameValue,
            onValueChange = { lastNameValue = it }
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            label = { Text(stringResource(id = R.string.label_phone_number))},
            value = phoneNumber,
            onValueChange = { phoneNumber = it }
        )

        Button(onClick = { /*TODO*/ }) {
            Text(stringResource(id = R.string.create_contact))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomSheetContentPreview() {
    BottomSheetContent()
}