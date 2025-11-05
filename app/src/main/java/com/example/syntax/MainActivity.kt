package com.example.syntax

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.syntax.ui.theme.SyntaxTheme
import com.example.syntax.ui.ChatPreviewCard

class MainActivity : ComponentActivity() {
    external fun stringFromC(): String

//
    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SyntaxTheme { // Reemplaza SyntaxTheme por el nombre de tu tema
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(), // Ocupa todo el espacio
                    ) {
//                        Icon(Icons.Default.Star, contentDescription = "Estrella")
                        // 3. Llamada a la función C y muestra el resultado
                        val numbers = listOf(1, 2, 3, 4, 5)
                        for (i in numbers){
                            ChatPreviewCard("joselmy", "adios", "titulo", true  )
                        }
                        val mensaje = stringFromC()
                        Text(text = mensaje, fontSize = 16.em)
                    }
                }
            }
        }
    }

    private fun onChatClick(string: String) {

    }
}
