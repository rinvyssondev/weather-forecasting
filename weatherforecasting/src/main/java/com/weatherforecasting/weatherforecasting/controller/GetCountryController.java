package com.weatherforecasting.weatherforecasting.controller;

import com.weatherforecasting.weatherforecasting.service.CountryService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/country", produces = "application/json")
public class GetCountryController {

    @Autowired
    private CountryService countryService;

    @Operation(summary = "Get all countries")
    @GetMapping("/{indices}")
    public ResponseEntity<?> getAllCountries(@PathVariable List<Integer> indices) {
        try {
            return new ResponseEntity<>(countryService.getAllCountry(indices), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Erro ao encontrar países",HttpStatus.NOT_FOUND);
        }
    }
}
