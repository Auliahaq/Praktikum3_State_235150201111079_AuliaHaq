package com.example.praktikum3_state_235150201111079_auliahaq.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign

@Composable
fun CounterSection() {
    var count by remember { mutableStateOf(0) }   // state counter

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Aplikasi Counter Plus-Minus",
            style = MaterialTheme.typography.titleMedium,modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center )

        Text("Nilai: $count", style = MaterialTheme.typography.headlineSmall)

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            Button(
                onClick = { if (count > 0) count-- },
                enabled = count > 0
            ) { Text("Kurang (−)") }

            Button(onClick = { count++ }) { Text("Tambah (+)") }
        }
    }
}
