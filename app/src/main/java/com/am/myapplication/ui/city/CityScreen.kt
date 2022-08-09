package com.am.myapplication.ui.city

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import com.am.myapplication.entity.Car

@Composable
fun CityScreen() {
    val selectedCity = rememberSaveable { mutableStateOf(Car("Madrid", "Spain")) }
}
