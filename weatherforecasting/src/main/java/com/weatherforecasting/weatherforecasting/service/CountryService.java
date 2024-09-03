package com.weatherforecasting.weatherforecasting.service;

import java.util.List;
import java.util.Map;

public interface CountryService {
    List<Map<String, Object>> getAllCountry(List<Integer> indices);

}
