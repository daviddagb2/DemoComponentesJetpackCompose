package com.gonzalez.blanchard.democomponentesbasicos.components

import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun DemoCheckbox(){
    var isChecked by remember {
        mutableStateOf(false)
    }

    Checkbox(checked = isChecked, onCheckedChange = {
        isChecked = it
    })
}