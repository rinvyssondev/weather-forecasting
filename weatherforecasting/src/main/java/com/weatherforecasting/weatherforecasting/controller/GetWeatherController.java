package com.weatherforecasting.weatherforecasting.controller;

import com.weatherforecasting.weatherforecasting.remote.DTO.weather.GetWeatherDTO;
import com.weatherforecasting.weatherforecasting.service.WeatherService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather/")
public class GetWeatherController {

    //Injecting the WeatherService
    @Autowired
    private WeatherService weatherService;

    @Operation(summary = "Get weather data by latitude and longitude")
    @GetMapping("lat={lat}&lon={lon}")
    public GetWeatherDTO getWeather(@PathVariable String lat, @PathVariable String lon) {
        return weatherService.getWeatherByLatLon(lat, lon);
    }

    @Operation(summary = "Get weather data by city name")
    @GetMapping("city={city}")
    public GetWeatherDTO getWeatherByCity(@PathVariable String city) {
        return weatherService.getWeatherByCity(city);
    }
}
