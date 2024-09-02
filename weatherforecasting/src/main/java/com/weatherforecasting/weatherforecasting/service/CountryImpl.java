package com.weatherforecasting.weatherforecasting.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weatherforecasting.weatherforecasting.remote.DTO.country.CountryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CountryImpl implements CountryService{

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper mapper = new ObjectMapper();

//    @Override
//    public List<Map<String, Object>> getAllCountry() {
//        String url = "https://api-paises.pages.dev/paises.json";
//
//        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
//
//        try {
//            Map<String, CountryDTO> map = mapper.readValue(response.getBody(), new TypeReference<Map<String, CountryDTO>>(){});
//
//            List<Map<String, Object>> countryData = new ArrayList<>();
//
//            int index = 0;
//
//            for (CountryDTO country : map.values()) {
//
//                Map<String, Object> data = new HashMap<>();
//
//                data.put("index", index);
//                data.put("pais", country.getPais());
//                data.put("img", country.getImg());
//                countryData.add(data);
//                index++;
//
//            }
//
//            return countryData;
//        } catch (Exception e) {
//            throw new RuntimeException("Erro ao deserializar o JSON", e);
//        }
//    }

    @Override
    public List<Map<String, Object>> getAllCountry(List<Integer> indices) {
        String url = "https://api-paises.pages.dev/paises.json";

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        try {
            Map<String, CountryDTO> map = mapper.readValue(response.getBody(), new TypeReference<Map<String, CountryDTO>>(){});

            List<Map<String, Object>> countryData = new ArrayList<>();
            List<Map<String, Object>> selectedCountryData = new ArrayList<>();

            int index = 0;

            for (CountryDTO country : map.values()) {

                Map<String, Object> data = new HashMap<>();

                data.put("index", index);
                data.put("pais", country.getPais());
                data.put("img", country.getImg());
                countryData.add(data);
                index++;

            }

            // Add only the elements with the specified indices to the new list
            for (Integer i : indices) {
                selectedCountryData.add(countryData.get(i));
            }

            return selectedCountryData;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deserializar o JSON", e);
        }
    }
}
