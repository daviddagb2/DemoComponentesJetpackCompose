package com.gonzalez.blanchard.democomponentesbasicos.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun DemoDropdownMenu(){
    val options = listOf("Opción 1", "Opción 2", "Opción 3", "Opción 4")
    var expanded by remember {
        mutableStateOf(false)
    }
    var selectedOption by remember {
        mutableStateOf(options[0])
    }

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "Selecciona una opción: $selectedOption")
        DropdownMenu(
            modifier = Modifier.width(200.dp),
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            options.forEach{option ->
                DropdownMenuItem(text = {
                    Text(
                        text = option,
                        color = Color.Black,
                        )
                                        },
                    onClick = {
                        selectedOption = option
                        expanded = false
                    },
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth()
                )
            }
        }
        Text(text = "Seleccionar una opción")
        IconButton(onClick = { expanded = true }) {
            Icon(Icons.Filled.ArrowDropDown, contentDescription = null)
        }
    }

}