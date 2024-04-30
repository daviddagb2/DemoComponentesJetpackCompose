package com.gonzalez.blanchard.democomponentesbasicos.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DemoOutlinedButton(){
    OutlinedButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = Color.Blue,
            containerColor = Color.Transparent
        ),
        contentPadding = PaddingValues(20.dp),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(2.dp, Color.Blue)

    ) {
        Text(text = "Click me")
    }
}

@Preview
@Composable
fun PreviewOutlinedButton(){
    DemoOutlinedButton()
}