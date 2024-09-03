package com.weatherforecasting.weatherforecasting.service;

import com.weatherforecasting.weatherforecasting.remote.DTO.weather.GetWeatherDTO;

public interface WeatherService {
    GetWeatherDTO getWeatherByLatLon(String lat, String lon);
    GetWeatherDTO getWeatherByCity(String city);
}
