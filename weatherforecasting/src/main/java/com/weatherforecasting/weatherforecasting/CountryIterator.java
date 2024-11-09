package com.weatherforecasting.weatherforecasting;

import com.weatherforecasting.weatherforecasting.remote.DTO.country.CountryDTO;

import java.util.Map;

public class CountryIterator implements Iterator<CountryDTO> {
    private final java.util.Iterator<CountryDTO> iterator;

    public CountryIterator(Map<String, CountryDTO> map) {
        this.iterator = map.values().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public CountryDTO next() {
        return iterator.next();
    }
}
