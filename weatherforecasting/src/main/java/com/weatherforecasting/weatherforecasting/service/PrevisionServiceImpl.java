package com.weatherforecasting.weatherforecasting.service;

import com.weatherforecasting.weatherforecasting.RestTemplateSingleton;
import com.weatherforecasting.weatherforecasting.UrlBuilder;
import com.weatherforecasting.weatherforecasting.remote.DTO.prevision.GetPrevisionDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PrevisionServiceImpl implements PrevisionService {

    @Value("${weather.api.key}")
    private String apikey;

    private final RestTemplate restTemplate = RestTemplateSingleton.getInstance();

    @Override
    public GetPrevisionDTO getPrevisionByCity(String city) {
//        String url = String.format("https://api.openweathermap.org/data/2.5/forecast?q=%s&lang=pt_br&appid=%s", city, apikey);
        String url = new UrlBuilder("https://api.openweathermap.org/data/2.5/forecast")
                .addQueryParam("q", city)
                .addQueryParam("lang", "pt_br")
                .addQueryParam("appid", apikey)
                .build();
        return fetchPrevisionData(url);
    }

    private GetPrevisionDTO fetchPrevisionData(String url) {
        try {
            ResponseEntity<GetPrevisionDTO> response = restTemplate.getForEntity(url, GetPrevisionDTO.class);
            return response.getBody();
        } catch (Exception e) {
            throw new RuntimeException("Error in getting weather data", e);
        }
    }
}
