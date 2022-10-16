package com.example.weatherapp.model

interface Repository {
    fun getWeatherFromLocalSource() : Weather
    fun getWeatherFromServer() : Weather
}