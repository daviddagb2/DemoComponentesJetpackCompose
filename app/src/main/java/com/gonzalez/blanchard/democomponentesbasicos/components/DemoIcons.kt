package com.gonzalez.blanchard.democomponentesbasicos.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gonzalez.blanchard.democomponentesbasicos.R

@Composable
fun DemoIcons(){

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,

    ){

      Icon(painter = painterResource(id = R.drawable.ic_dialog),
          contentDescription = "User")

        Icon(painter = painterResource(id = R.drawable.ic_alarm),
          contentDescription = "Alarm")

        Icon(painter = painterResource(id = R.drawable.ic_dialog),
            contentDescription = "User",
            tint = Color.Green
            )

        Icon(painter = painterResource(id = R.drawable.ic_alarm),
            contentDescription = "Alarm")



    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDemoIcons(){
    DemoIcons()
}