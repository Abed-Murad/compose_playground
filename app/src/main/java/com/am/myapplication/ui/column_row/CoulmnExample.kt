package com.am.myapplication.ui.column_row

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun ColumnExample() {
    Surface(color = MaterialTheme.colorScheme.primary) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Hello")
            Button(onClick = { }) {
                Text(text = "Show Less")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnExampleWithForLoop() {
    Surface(color = MaterialTheme.colorScheme.primary) {
        Column(
            modifier = Modifier.padding(16.dp).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            for (i in 0..2) {
                Text(text = "Line #${i}", modifier = Modifier.padding(vertical = 16.dp))
            }
        }
    }
}
