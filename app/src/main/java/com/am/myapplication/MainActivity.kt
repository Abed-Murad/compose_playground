package com.am.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.am.myapplication.ui.hello.HelloScreen
import com.am.myapplication.ui.theme.AbedComposePlaygroundTheme

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




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AbedComposePlaygroundTheme {
        HelloScreen()
    }
}