package com.example.odysseynavigationsample.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.example.odysseynavigationsample.navigation.NavigationTree.Main.ScreenOne
import ru.alexgladkov.odyssey.compose.extensions.present
import ru.alexgladkov.odyssey.compose.local.LocalRootController
import ru.alexgladkov.odyssey.core.LaunchFlag.SingleNewTask

@Composable
internal fun SplashScreen() {
    val rootController = LocalRootController.current
    LaunchedEffect(Unit) { rootController.present(ScreenOne.name, launchFlag = SingleNewTask) }
}