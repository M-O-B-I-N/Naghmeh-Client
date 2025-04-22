package mobin.shabanifar.naghmeh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import mobin.shabanifar.naghmeh.ui.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HomeScreen()
        }
    }
}
