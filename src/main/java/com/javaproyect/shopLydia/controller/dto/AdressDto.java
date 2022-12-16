package com.javaproyect.shopLydia.controller.dto;

public class AdressDto {
    private String city;
    private Integer idCountry;

    public AdressDto() {
    }

    public AdressDto(String city, Integer idCountry) {
        this.city = city;
        this.idCountry = idCountry;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }
}
