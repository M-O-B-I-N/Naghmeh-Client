package mobin.shabanifar.naghmeh

import App
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Naghmeh"
    ) {
        App()
    }
}
