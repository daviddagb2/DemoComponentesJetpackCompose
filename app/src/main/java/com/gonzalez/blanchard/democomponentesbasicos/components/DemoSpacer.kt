package com.gonzalez.blanchard.democomponentesbasicos.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DemoSpacer(){

    Column(modifier = Modifier.fillMaxSize()) {
        Text("Elemento 1")
        Spacer(modifier = Modifier.height(20.dp))
        Text("Elemento 2")
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Text("Elemento 3")
            Spacer(modifier = Modifier.width(32.dp))
            Text("Elemento 4")
            Spacer(modifier = Modifier.width(32.dp))
            Text("Elemento 5")
        }

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Text("Elemento 6")
            Spacer(modifier = Modifier.width(32.dp))
            Text("Elemento 7")
            Spacer(modifier = Modifier.width(32.dp))
            Text("Elemento 8")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDemoSpacer(){
    DemoSpacer()
}