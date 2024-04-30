package com.gonzalez.blanchard.democomponentesbasicos.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DemoTextField(){
    val texto = remember {
        mutableStateOf("")
    }

    TextField(
        value = texto.value,
        onValueChange = { texto.value = it },
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(16.dp),
        placeholder = {
            Text("Ingresa tu texto aquí")
        },
        textStyle = TextStyle(
            fontSize = 18.sp,
            color = Color.Black,
            fontWeight = FontWeight.Medium
        ),
        singleLine = true
    )

}

@Preview(showBackground = true)
@Composable
fun PreviewDemoTextField(){
    DemoTextField()
}