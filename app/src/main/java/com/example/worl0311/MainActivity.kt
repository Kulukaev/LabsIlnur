package com.example.worl0311


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.worl0311.ui.theme.MutableStateInsideComposableWithoutRemember

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var checkedState = remember { mutableStateOf(false) }
            var checkedValue = checkedState.value
            MutableStateInsideComposableWithoutRemember()
        }
    }
}