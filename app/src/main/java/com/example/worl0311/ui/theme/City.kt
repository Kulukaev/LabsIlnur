package com.example.worl0311.ui.theme

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.github.javafaker.Faker
import java.math.BigDecimal
import java.math.RoundingMode

data class City(
    val name: String,
    val temp: Double
)

class MyViewModel : ViewModel() {
    val citiz: MutableList<City> = (1..100).map {
        City(
            Faker().address().city(),
            Faker().random().nextDouble().let {
                BigDecimal(it).setScale(1, RoundingMode.HALF_EVEN).toDouble()
            }
        )
    }.toMutableStateList()
}