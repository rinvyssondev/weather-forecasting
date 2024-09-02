package com.weatherforecasting.weatherforecasting.controller;

import com.weatherforecasting.weatherforecasting.service.Forecast5Service;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/forecast5/", produces = "application/json")
public class GetForecast5Controller {

    @Autowired
    private Forecast5Service forecast5Service;

    @Operation(summary = "Get 5 day forecast data by latitude and longitude")
    @GetMapping("city={city}")
    public ResponseEntity<?> getForecast5ByCity(@PathVariable String city) {
        try {
            return new ResponseEntity<>(forecast5Service.getForecast5ByCity(city), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao encontrar cidade",HttpStatus.NOT_FOUND);
        }
    }
}
