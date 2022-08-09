package com.am.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.am.myapplication.ui.theme.AbedComposePlaygroundTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AbedComposePlaygroundTheme {
                HelloScreen()
            }
        }
    }
}


@Composable
fun HelloScreen() {
    // A surface container using the 'background' color from the theme
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier.padding(16.dp)) {
            var name by rememberSaveable { mutableStateOf("Abed") }
            BodyContent(name = name, onNameChange = { name = it })
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BodyContent(name: String, onNameChange: (String) -> Unit) {
    Column(modifier = Modifier.padding(16.dp)) {
        if (name.isNotEmpty()) {
            Text(
                text = "Hello, $name!",
                modifier = Modifier.padding(bottom = 8.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            OutlinedTextField(
                value = name,
                onValueChange = onNameChange,
                label = { Text(name) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AbedComposePlaygroundTheme {
        HelloScreen()
    }
}