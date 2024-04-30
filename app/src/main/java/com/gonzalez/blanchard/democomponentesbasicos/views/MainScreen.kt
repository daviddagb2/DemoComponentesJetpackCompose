package com.gonzalez.blanchard.democomponentesbasicos.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoAsyncImage
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoButton
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoCheckbox
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoCircularProgressIndicator
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoDropdownMenu
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoExposeDropDownMenu
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoIcons
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoLinearProgressBar
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoOutlineTextField
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoOutlinedButton
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoRadioButton
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoRadioButtonWithLabel
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoSwitch
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoText
import com.gonzalez.blanchard.democomponentesbasicos.components.DemoTextField

@Composable
fun MainScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ){
        DemoText("Hola esto es un texto")
        DemoTextField()
        DemoOutlineTextField()
        DemoButton("Demo Button")
        DemoOutlinedButton()
        DemoAsyncImage("https://www.espine.in/blog/wp-content/uploads/2022/08/software-developer.jpg")
        DemoIcons()

        DemoRadioButton()

        DemoDropdownMenu()

        DemoExposeDropDownMenu()


        DemoRadioButtonWithLabel()

        DemoCheckbox()
        DemoSwitch()
        DemoCircularProgressIndicator()
        DemoLinearProgressBar()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen(){
    MainScreen()
}