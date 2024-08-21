package com.weatherforecasting.weatherforecasting.controller;

import com.weatherforecasting.weatherforecasting.remote.DTO.prevision.GetPrevisionDTO;
import com.weatherforecasting.weatherforecasting.service.PrevisionService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prevision/")
public class GetPrevisionController {

    //Injecting the WeatherService
    @Autowired
    private PrevisionService previsionService;

    @Operation(summary = "Get prevision data by city name")
    @GetMapping("city={city}")
    public GetPrevisionDTO getWeatherByCity(@PathVariable String city) {
        return previsionService.getPrevisionByCity(city);
    }
}
