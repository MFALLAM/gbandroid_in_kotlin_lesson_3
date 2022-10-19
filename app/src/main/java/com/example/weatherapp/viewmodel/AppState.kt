package com.example.weatherapp.viewmodel

import com.example.weatherapp.model.Weather

sealed class AppState {
    data class SuccessSingle(val weatherData: Weather) : AppState()
    data class SuccessList(val weatherData: List<Weather>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()

}