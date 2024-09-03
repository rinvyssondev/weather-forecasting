package com.weatherforecasting.weatherforecasting.service;

import com.weatherforecasting.weatherforecasting.remote.DTO.prevision.GetPrevisionDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PrevisionServiceImpl implements PrevisionService {

    @Value("${weather.api.key}")
    private String apikey;

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public GetPrevisionDTO getPrevisionByCity(String city) {
        String url = String.format("https://api.openweathermap.org/data/2.5/forecast?q=%s&appid=%s", city, apikey);
        System.out.println(url);
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
