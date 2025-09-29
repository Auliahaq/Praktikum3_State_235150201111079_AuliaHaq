package com.example.praktikum3_state_235150201111079_auliahaq

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.praktikum3_state_235150201111079_auliahaq.ui.ColorBoxSection
import com.example.praktikum3_state_235150201111079_auliahaq.ui.CounterSection
import com.example.praktikum3_state_235150201111079_auliahaq.ui.ProfileCardSection

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Text(
                            "Praktikum 3 — State di Compose",
                            style = MaterialTheme.typography.titleLarge
                        )

                        CounterSection()
                        ColorBoxSection()
                        ProfileCardSection()
                    }
                }
            }
        }
    }
}
