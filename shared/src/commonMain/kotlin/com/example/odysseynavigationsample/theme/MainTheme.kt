package com.example.odysseynavigationsample.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun MainTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(content = content)
}
