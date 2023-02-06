ackage com.example.greetingscard

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingscard.ui.theme.GreetingsCardTheme

@Composable
fun Greeting(name: String) {
 {
        Text(text = "Hello am $name! \n who are you")
    }

@Preview(showBackground = true)
@Composable
fun Karibusana() {
    GreetingsCardTheme {
        Greeting("Hope Subiri")
    }