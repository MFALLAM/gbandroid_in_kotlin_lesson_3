package com.example.weatherapp.model

abstract class Repo : Repository {
    override fun getWeatherFromLocalSource(): Weather {
        return Weather()
    }

    override fun getWeatherFromServer(): Weather {
        return Weather()
    }
}