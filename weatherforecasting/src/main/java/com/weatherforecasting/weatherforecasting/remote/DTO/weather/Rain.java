package com.weatherforecasting.weatherforecasting.remote.DTO.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {

    @JsonProperty("1h")
    private double _1h;

    public double get_1h() {
        return _1h;
    }

    public void set_1h(double _1h) {
        this._1h = _1h;
    }
}
