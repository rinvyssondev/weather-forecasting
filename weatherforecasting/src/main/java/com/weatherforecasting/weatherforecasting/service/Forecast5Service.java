package com.weatherforecasting.weatherforecasting.service;

import com.weatherforecasting.weatherforecasting.remote.DTO.forecast5.GetForecast5DTO;

public interface Forecast5Service {
    GetForecast5DTO getForecast5ByCity(String city);
}
