package com.example.odysseynavigationsample.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.odysseynavigationsample.navigation.NavigationTree
import ru.alexgladkov.odyssey.compose.extensions.push
import ru.alexgladkov.odyssey.compose.local.LocalRootController

@Composable
fun ScreenOne() {
    val rootController = LocalRootController.current
    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 32.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "First screen",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colors.primary
        )

        Button(
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
            onClick = { rootController.push(NavigationTree.Main.ScreenTwo.name) },
            shape = RoundedCornerShape(25)
        ) {
            Text(text = "Go to Second screen", color = MaterialTheme.colors.onPrimary)
        }
    }
}