package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Address;

import java.util.List;

public interface IAddressService {

    Address save(Address address);
    Address update(Address address);
    Address findById(Integer id);
    List<Address> findAll();
    List<Address> getAllAddress();
    void delete(Integer id);
}
