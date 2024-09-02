package com.weatherforecasting.weatherforecasting.remote.DTO.forecast5;

import java.util.List;

public class GetForecast5DTO {
    private String cod;
    private int message;
    private int cnt;
    private List<ListForecast5> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<ListForecast5> getList() {
        return list;
    }

    public void setList(List<ListForecast5> list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    private City city;
}
