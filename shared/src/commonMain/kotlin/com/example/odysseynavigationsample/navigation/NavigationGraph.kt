package com.example.odysseynavigationsample.navigation

import com.example.odysseynavigationsample.compose.ScreenOne
import com.example.odysseynavigationsample.compose.ScreenTwo
import com.example.odysseynavigationsample.compose.SplashScreen
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder

fun RootComposeBuilder.navigationGraph() {
    screen(NavigationTree.Main.SplashScreen.name) { SplashScreen() }
    screen(NavigationTree.Main.ScreenOne.name) { ScreenOne() }
    screen(NavigationTree.Main.ScreenTwo.name) { ScreenTwo() }
}
