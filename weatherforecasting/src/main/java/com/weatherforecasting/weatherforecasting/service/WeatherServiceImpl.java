package com.weatherforecasting.weatherforecasting.service;

import com.weatherforecasting.weatherforecasting.remote.DTO.weather.GetWeatherDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Value("${weather.api.key}")
    private String apikey;

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public GetWeatherDTO getWeatherByLatLon(String lat, String lon) {
        String url = String.format("https://api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&appid=%s", lat, lon, apikey);
        return fetchWeatherData(url);
    }

    public GetWeatherDTO getWeatherByCity(String city) {
        String url = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s", city, apikey);
        return fetchWeatherData(url);
    }

    private GetWeatherDTO fetchWeatherData(String url) {
        try {
            ResponseEntity<GetWeatherDTO> response = restTemplate.getForEntity(url, GetWeatherDTO.class);
            return response.getBody();
        } catch (Exception e) {
            throw new RuntimeException("Error in getting weather data", e);
        }
    }
}