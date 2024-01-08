import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import com.example.odysseynavigationsample.navigation.navigationGraph
import com.example.odysseynavigationsample.theme.MainTheme
import ru.alexgladkov.odyssey.compose.setup.OdysseyConfiguration
import ru.alexgladkov.odyssey.compose.setup.setNavigationContent

@Composable
fun MainView(activity: ComponentActivity) {
    MainTheme {
        val backgroundColor = Color.LightGray
        val odysseyConfiguration = OdysseyConfiguration(
            canvas = activity,
            backgroundColor = backgroundColor
        )

        CompositionLocalProvider {
            setNavigationContent(
                odysseyConfiguration, onApplicationFinish = { activity.finishAffinity() }) {
                navigationGraph()
            }
        }
    }
}