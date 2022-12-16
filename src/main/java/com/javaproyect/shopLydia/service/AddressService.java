package com.javaproyect.shopLydia.service;


import com.javaproyect.shopLydia.entity.Address;
import com.javaproyect.shopLydia.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService implements  IAddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public  Address save(Address address) {
        return addressRepository.save(address);
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
    public  void delete(Integer id) {
        addressRepository.deleteById(id);

    }

}
