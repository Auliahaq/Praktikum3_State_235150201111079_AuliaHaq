package com.example.praktikum3_state_235150201111079_auliahaq.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun ProfileCardSection() {
    var isFollowed by remember { mutableStateOf(false) }  // state follow

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Text("Aplikasi Profil Interaktif", style = MaterialTheme.typography.titleMedium,modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        // Avatar dummy (lingkaran dengan inisial)
        Box(
            modifier = Modifier
                .size(96.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primaryContainer),
            contentAlignment = Alignment.Center
        ) {
            Text("AH", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
        }

        Text("Aulia Haq", style = MaterialTheme.typography.titleMedium)
        Text("Mahasiswa Teknik Informatika — Semester 5",
            style = MaterialTheme.typography.bodyMedium)

        Button(onClick = { isFollowed = !isFollowed }) {
            Text(if (isFollowed) "Unfollow" else "Follow")
        }

        Text(
            if (isFollowed) "Anda mengikuti akun ini"
            else "Anda belum mengikuti akun ini",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
