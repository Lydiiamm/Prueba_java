package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Address;
import com.javaproyect.shopLydia.entity.Country;

import java.util.List;

public interface ICountryService {

    Country save(Country country);
    Country update(Country country);
    Country findById(Integer id);
    List<Country> findAll();
    List<Country> getAllCountries();

    void delete(Integer id);
}
