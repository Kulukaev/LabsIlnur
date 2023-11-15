package com.example.worl0311



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.worl0311.botton_navigation.MainScreen
import com.example.worl0311.ui.theme.Worl0311Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Worl0311Theme {
                MainScreen()
            }
        }
    }
}