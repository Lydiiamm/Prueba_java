package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Address;

import java.util.List;

public interface IAddressService {

    Address save(String cityName, Integer countryId, Integer customerId);
    Address update(Address address);
    Address findById(Integer id);
    Iterable<Address> findAll();
    List<Address> getAllAddress();
    void delete(Integer id);
}
