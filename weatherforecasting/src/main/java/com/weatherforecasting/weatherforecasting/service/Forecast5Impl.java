package com.weatherforecasting.weatherforecasting.service;

import com.weatherforecasting.weatherforecasting.RestTemplateSingleton;
import com.weatherforecasting.weatherforecasting.UrlBuilder;
import com.weatherforecasting.weatherforecasting.remote.DTO.forecast5.GetForecast5DTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Forecast5Impl implements Forecast5Service{

    @Value("${weather.api.key}")
    private String apikey;

    private final RestTemplate restTemplate = RestTemplateSingleton.getInstance();

    @Override
    public GetForecast5DTO getForecast5ByCity(String city) {
//        String url = String.format("https://api.openweathermap.org/data/2.5/forecast?q=%s&units=metric&lang=pt_br&appid=%s", city, apikey);
        String url = new UrlBuilder("https://api.openweathermap.org/data/2.5/forecast")
                .addQueryParam("q", city)
                .addQueryParam("units", "metric")
                .addQueryParam("lang", "pt_br")
                .addQueryParam("appid", apikey)
                .build();
        return fetchForecast5Data(url);
    }

    private GetForecast5DTO fetchForecast5Data(String url) {
        try {
            ResponseEntity<GetForecast5DTO> response = restTemplate.getForEntity(url, GetForecast5DTO.class);
            return response.getBody();
        } catch (Exception e) {
            throw new RuntimeException("Error in getting weather data", e);
        }
    }
}
