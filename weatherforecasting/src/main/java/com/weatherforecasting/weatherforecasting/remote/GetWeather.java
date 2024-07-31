package com.weatherforecasting.weatherforecasting.remote;

import com.weatherforecasting.weatherforecasting.remote.DTO.GetWeatherDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/weather/")
public class GetWeather {

    @Value("${weather.api.key}")
    private String apikey;

    @Operation(summary = "Get weather data by latitude and longitude")
    @GetMapping("lat={lat}&lon={lon}")
    public GetWeatherDTO getWeather(@PathVariable String lat, @PathVariable String lon) {
        RestTemplate restTemplate = new RestTemplate();

        String url = String.format("https://api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&appid=%s", lat, lon, apikey);

        try {
            ResponseEntity<GetWeatherDTO> resp =
                    restTemplate.getForEntity(url,GetWeatherDTO.class);
            return resp.getBody();
        } catch (Exception e) {
            throw new RuntimeException("Error in getting weather data", e);
        }

    }
}
