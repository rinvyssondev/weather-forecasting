package com.weatherforecasting.weatherforecasting.remote.DTO.weather;

public class MainWeather {
    private String temp;
    private double feels_like;
    private String temp_min;
    private String temp_max;
    private int pressure;
    private int humidity;
    private int sea_level;
    private int grnd_level;

    public String getTemp() {
        return String.valueOf((int) Math.round(Double.parseDouble(temp) - 273.15)) + "°C";
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public String getTemp_min() {

        return String.valueOf((int) Math.round(Double.parseDouble(String.valueOf(temp_min)) - 273.15)) + "°C";

    }

    public void setTemp_min(String temp_min) {
        this.temp_min = temp_min;
    }

    public String getTemp_max() {

        return String.valueOf((int) Math.round(Double.parseDouble(temp_max) - 273.15)) + "°C";
    }

    public void setTemp_max(String temp_max) {
        this.temp_max = temp_max;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getSea_level() {
        return sea_level;
    }

    public void setSea_level(int sea_level) {
        this.sea_level = sea_level;
    }

    public int getGrnd_level() {
        return grnd_level;
    }

    public void setGrnd_level(int grnd_level) {
        this.grnd_level = grnd_level;
    }
}
