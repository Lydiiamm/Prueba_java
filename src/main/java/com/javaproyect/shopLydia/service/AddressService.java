package com.javaproyect.shopLydia.service;


import com.javaproyect.shopLydia.entity.Address;
import com.javaproyect.shopLydia.entity.Country;
import com.javaproyect.shopLydia.repository.AddressRepository;
import com.javaproyect.shopLydia.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService implements  IAddressService{

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    CountryRepository countryRepository;

    @Override
    public Address save(String cityName, Integer countryId) {
        Optional<Country> foundCountry = countryRepository.findById(countryId);

        if (foundCountry.isPresent()) {
            Country country = foundCountry.get();

            Address address = new Address();
            address.setCity(cityName);
            address.setCountry(country);
            return addressRepository.save(address);
        }

        return null;
    }

    @Override
    public  Address update(Address address) {
        return addressRepository.save(address);
    }
    @Override
    public  Address findById(Integer id) {
        Optional<Address> AddressOptional = addressRepository.findById(id);
        return AddressOptional.orElse(null);
    }

    @Override
    public List<Address> findAll() {
        return null;
    }
    @Override
    public List<Address> getAllAddress() {
        return (List<Address>) addressRepository.findAll();
    }

    @Override
    public void delete(Integer id) {

    }


}
