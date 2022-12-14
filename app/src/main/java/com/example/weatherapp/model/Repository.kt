package com.example.weatherapp.model

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalSourceRus(): List<Weather>
    fun getWeatherFromLocalSourceWorld(): List<Weather>
}
class RepositoryImpl : Repository {
    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalSourceRus(): List<Weather> {
        return getRussianCities()
    }

    override fun getWeatherFromLocalSourceWorld(): List<Weather> {
        return getWorldCities()
    }
}