package com.example.flagguesser

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MenuScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Flag Guesser",
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 32.dp)
        )
        Button(onClick = { println("Guess button clicked") }) {
            Text(text = "Guess")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { println("Learn button clicked") }) {
            Text(text = "Learn")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMenuScreen() {
    MenuScreen()
}
