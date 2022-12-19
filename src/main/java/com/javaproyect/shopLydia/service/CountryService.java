package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Country;
import com.javaproyect.shopLydia.entity.Country;
import com.javaproyect.shopLydia.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService implements ICountryService{

    @Autowired
    private CountryRepository countryRepository;
    @Override
    public Country save(Country country){
        return countryRepository.save(country);
    }
    @Override
    public List<Country> getAllCountries() {
        return (List<Country>) countryRepository.findAll();
    }
    @Override
    public Country update(Country country) {
        return countryRepository.save(country);
    }
    @Override
    public Country findById(Integer id) {
        Optional<Country> CountryOptional = countryRepository.findById(id);
        return CountryOptional.orElse(null);
    }

    @Override
    public List<Country> findAll() {
        return (List<Country>) countryRepository.findAll();
    }
    @Override
    public void delete(Integer id) {
        countryRepository.deleteById(id);

    }
}
