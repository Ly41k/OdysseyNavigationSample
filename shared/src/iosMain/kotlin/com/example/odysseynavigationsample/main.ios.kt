import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeUIViewController
import com.example.odysseynavigationsample.navigation.navigationGraph
import com.example.odysseynavigationsample.theme.MainTheme
import platform.UIKit.UIViewController
import ru.alexgladkov.odyssey.compose.setup.OdysseyConfiguration
import ru.alexgladkov.odyssey.compose.setup.setNavigationContent

fun MainViewController(): UIViewController =
    ComposeUIViewController {
        MainTheme {
            val backgroundColor = Color.LightGray
            val odysseyConfiguration = OdysseyConfiguration(backgroundColor = backgroundColor)

            CompositionLocalProvider {
                Column {
                    Box(modifier = Modifier.fillMaxWidth().height(30.dp).background(backgroundColor))
                    setNavigationContent(odysseyConfiguration) { navigationGraph() }
                    Box(modifier = Modifier.fillMaxWidth().height(30.dp).background(backgroundColor))
                }
            }
        }
    }