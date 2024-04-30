package com.gonzalez.blanchard.democomponentesbasicos.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


enum class Option{
    OPTION1,
    OPTION2,
    OPTION3
}

@Composable
fun DemoRadioButton(){
    var selectedOption by remember {
        mutableStateOf(Option.OPTION1)
    }

    Column(modifier = Modifier.fillMaxWidth()) {
        RadioButton(selected = selectedOption == Option.OPTION1, onClick = {
            selectedOption = Option.OPTION1
        })

        RadioButton(selected = selectedOption == Option.OPTION2, onClick = {
            selectedOption = Option.OPTION2
        })

        RadioButton(selected = selectedOption == Option.OPTION3, onClick = {
            selectedOption = Option.OPTION3
        })

    }
}


@Composable
fun DemoRadioButtonWithLabel(){
    var selectedOption by remember {
        mutableStateOf(Option.OPTION1)
    }

    Column(modifier = Modifier.fillMaxWidth()) {

        RadioButtonRow(option = Option.OPTION1, label = "Opción 1", isSelected = selectedOption == Option.OPTION1 ) {
            selectedOption = Option.OPTION1
        }

        RadioButtonRow(option = Option.OPTION2, label = "Opción 2", isSelected = selectedOption == Option.OPTION2 ) {
            selectedOption = Option.OPTION2
        }

        RadioButtonRow(option = Option.OPTION3, label = "Opción 3", isSelected = selectedOption == Option.OPTION3 ) {
            selectedOption = Option.OPTION3
        }

    }

}

@Composable
fun RadioButtonRow(
    option: Option,
    label: String,
    isSelected: Boolean,
    onSelected: (Option) -> Unit
){

    Row(
        verticalAlignment = Alignment.CenterVertically
    ){
        RadioButton(selected = isSelected, onClick = {
            onSelected(option)
        })
        Spacer(modifier = Modifier.width(8.dp))
        Text(label)
    }

}