package com.gonzalez.blanchard.democomponentesbasicos.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun DemoAsyncImage(url: String){
    AsyncImage(
        model = url,
        contentDescription = "ImageFromUrl",
        modifier = Modifier.fillMaxWidth()
            .height(400.dp)
    )
}


@Preview
@Composable
fun DemoAsyncImage(){
    DemoAsyncImage("https://www.espine.in/blog/wp-content/uploads/2022/08/software-developer.jpg")
}