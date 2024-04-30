package com.gonzalez.blanchard.democomponentesbasicos.components

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DemoLinearProgressBar(){

    Column(modifier = Modifier.fillMaxWidth()){
        LinearProgressIndicator(
            modifier = Modifier
                .fillMaxWidth()
                .height(15.dp),
            trackColor = Color.LightGray,
            color = Color.Green
        )
    }
}

@Composable
fun DemoCircularProgressIndicator(){

    val progressValue = 0.75f
    val infiniteTransition = rememberInfiniteTransition(label = "")

    val progressAnimationValue by infiniteTransition.animateFloat(
        initialValue = 0.0f,
        targetValue = progressValue,
        animationSpec = infiniteRepeatable(animation = tween(900)), label = ""
    )

    CircularProgressIndicator(progress = progressAnimationValue)
}


@Preview
@Composable
fun PreviewDemoLinearProgressBar(){
    DemoLinearProgressBar()
}
