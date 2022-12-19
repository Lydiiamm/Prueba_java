package com.javaproyect.shopLydia.service;


import com.javaproyect.shopLydia.entity.Address;
import com.javaproyect.shopLydia.entity.Country;
import com.javaproyect.shopLydia.entity.Customer;
import com.javaproyect.shopLydia.repository.AddressRepository;
import com.javaproyect.shopLydia.repository.CountryRepository;
import com.javaproyect.shopLydia.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService implements  IAddressService{

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Address save(String cityName, Integer countryId, Integer customerId) {
        Optional<Country> foundCountry = countryRepository.findById(countryId);

        if (foundCountry.isPresent()) {
            Country country = foundCountry.get();

            Address address = new Address();
            address.setCity(cityName);
            address.setCountry(country);
            Address savedAddress = addressRepository.save(address);
            Optional<Customer> customer =customerRepository.findById(customerId);
            customer.ifPresent(customer1 -> {
                customer1.addAddress(savedAddress);
                customerRepository.save(customer1);
            });
            return savedAddress;
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
    public List<Address> findAll() {return (List<Address>) addressRepository.findAll();
    }
    @Override
    public List<Address> getAllAddress() {
        return (List<Address>) addressRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        addressRepository.deleteById(id);

    }


}
