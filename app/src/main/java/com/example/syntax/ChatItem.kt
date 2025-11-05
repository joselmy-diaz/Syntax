package com.example.syntax.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.syntax.R

@Composable
fun ChatPreviewCard(
    name: String,
    lastMessage: String,
    time: String,
    unread: Boolean = false,
//    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
//            .clickable(onClick = onClick)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Imagen o inicial del contacto

        Spacer(modifier = Modifier.width(12.dp))

        // Nombre y mensaje
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            Text(
                text = lastMessage,
                fontSize = 14.sp,
                color = if (unread) Color.Black else Color.Gray,
                maxLines = 1
            )
        }

        // Hora
        Text(
            text = time,
            fontSize = 12.sp,
            color = Color.Gray,
            modifier = Modifier.align(Alignment.Top)
        )
    }
}
