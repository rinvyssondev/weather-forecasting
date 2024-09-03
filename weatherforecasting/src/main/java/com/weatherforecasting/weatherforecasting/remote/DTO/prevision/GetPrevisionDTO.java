package com.weatherforecasting.weatherforecasting.remote.DTO.prevision;

import java.util.List;

public class GetPrevisionDTO {
    private String cod;
    private int message;
    private int cnt;
    private List<PrevisionData> list;
    private City city;

    // Getters and Setters

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

    public List<PrevisionData> getList() {
        return list;
    }

    public void setList(List<PrevisionData> list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
