package com.madebyshedrack.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.madebyshedrack.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column() {
                        Greeting("Android", modifier = Modifier.padding(12.dp))
                        NamesColumn(modifier = Modifier.padding(12.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun NamesColumn(modifier: Modifier) {
    Column() {
        Text(
            text = "Mason Lockwood",
            modifier = modifier,
        )
        Text(
            text = "Kyle RittenHouse",
            modifier = modifier,
        )
        Text(
            text = "Michio Kaku",
            modifier = modifier,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeAppTheme {
        Greeting("Android")
    }
}