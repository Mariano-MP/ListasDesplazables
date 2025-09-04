package com.example.listasdesplazables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.listasdesplazables.data.DataSource
import com.example.listasdesplazables.ui.theme.ListasDesplazablesTheme
import com.example.listasdesplazables.ui.view.MenuCardList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListasDesplazablesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MenuApp(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MenuApp(modifier: Modifier){
    MenuCardList(
        DataSource().loadPlatillos(),
        modifier
    )
}