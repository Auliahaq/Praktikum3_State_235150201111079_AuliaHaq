package com.example.praktikum3_state_235150201111079_auliahaq.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign


@Composable
fun ColorBoxSection() {
    var isRed by remember { mutableStateOf(true) }  // state warna

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Tombol Toggle Warna", style = MaterialTheme.typography.titleMedium,modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(if (isRed) Color.Red else Color.Green)
                .clickable { isRed = !isRed }
        )

        Text(if (isRed) "Warna: Merah" else "Warna: Hijau")
    }
}
