package com.weatherforecasting.weatherforecasting.remote.DTO.country;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryDTO {

    private String pais;
    private String img;
    private int ddi;
    private String continente;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
}
