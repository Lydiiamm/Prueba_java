package com.javaproyect.shopLydia.controller;

import com.javaproyect.shopLydia.service.CountryService;
import com.javaproyect.shopLydia.entity.Country;
import com.javaproyect.shopLydia.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/country") //http://localhost:8080/api/country
public class CountryController {

    @Autowired
    private CountryService countryService;

    //http://localhost:8080/api/country
    @PostMapping
        public Country addCountry(@RequestBody Country c){
        return countryService.save(c);
    }

    @PutMapping("/{countryId}") //http://localhost:8080/api/country/10 PUT
    public Country updateCountry(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/country/20 GET
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    @GetMapping ("/{countryId}") //http://localhost:8080/api/country GET
    public Country getCountryById(){

        return null;
    }

    @DeleteMapping ("/{countryId}") //http://localhost:8080/api/country DELETE
    public void deleteCountry(){

    }
}