import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.useResource
import androidx.compose.ui.window.singleWindowApplication
import org.bibletools.common.MainView

fun main() = singleWindowApplication(
    title = "Compose Demo",
    icon = BitmapPainter(useResource("ic_launcher.png", ::loadImageBitmap))
) {
    MainView()
}
