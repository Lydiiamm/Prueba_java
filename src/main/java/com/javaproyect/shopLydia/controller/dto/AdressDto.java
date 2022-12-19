package com.javaproyect.shopLydia.controller.dto;

public class AdressDto {
    private String city;
    private Integer idCountry;
    private Integer idCustomer;

    public AdressDto() {
    }

    public AdressDto(String city, Integer idCountry, Integer idCustomer) {
        this.city = city;
        this.idCountry = idCountry;
        this.idCustomer = idCustomer;
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

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }
}
