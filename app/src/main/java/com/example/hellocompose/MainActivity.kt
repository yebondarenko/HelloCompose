package com.example.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                HelloComposeApp()
            }
        }
    }
}

@Composable
fun HelloComposeApp() {
    var name by remember { mutableStateOf("Студент") }
    Surface {
        Column {
            Text(text = "Привіт, $name!", style = MaterialTheme.typography.headlineMedium)
            Button(onClick = { name = "Світ" }) {
                Text(text = "Натисни мене")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHello() {
    HelloComposeApp()
}