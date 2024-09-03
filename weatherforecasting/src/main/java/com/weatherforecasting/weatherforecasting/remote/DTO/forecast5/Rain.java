package com.weatherforecasting.weatherforecasting.remote.DTO.forecast5;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

public class Rain {

    @JsonProperty("3h")
    private double _3h;

    public double get_3h() {
        return _3h;
    }

    public void set_3h(double _3h) {
        this._3h = _3h;
    }
}
