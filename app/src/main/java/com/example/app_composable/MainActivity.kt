package com.example.app_composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app_composable.ui.theme.AppcomposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    AppcomposableTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFFFA500) // Laranja
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ElevatedButtonSample()
                AssistChipSample()
                ButtonSample()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ElevatedButtonSample() {
    Box(
        modifier = Modifier.padding(16.dp)
    ) {
        ElevatedButton(
            onClick = { /* Faça algo! */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Programa")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssistChipSample() {
    AssistChip(
        onClick = { /* Faça algo! */ },
        label = { Text("Programa") },
        leadingIcon = {
            Icon(
                Icons.Filled.Settings,
                contentDescription = "Descrição local",
                modifier = Modifier.size(AssistChipDefaults.IconSize)
            )
        }
    )
}

@Composable
fun ButtonSample() {
    Box(
        modifier = Modifier.padding(16.dp)
    ) {
        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Programa")
        }
    }
}

@Composable
fun Greeting() {
    Text(
        text = "Programa"
    )
}

@Preview(showBackground = true, widthDp = 150, heightDp = 200)
@Composable
fun AppPreview() {
    App()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppcomposableTheme {
        Greeting()
    }
}

@Preview(showBackground = true)
@Composable
fun ElevatedPreview() {
    AppcomposableTheme {
        ElevatedButtonSample()
    }
}

@Preview(showBackground = true)
@Composable
fun AssistChipPreview() {
    AppcomposableTheme {
        AssistChipSample()
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    AppcomposableTheme {
        ButtonSample()
    }
}
