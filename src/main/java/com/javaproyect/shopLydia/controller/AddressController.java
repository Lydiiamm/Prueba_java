package com.javaproyect.shopLydia.controller;


import com.javaproyect.shopLydia.controller.dto.AdressDto;
import com.javaproyect.shopLydia.entity.Address;
import com.javaproyect.shopLydia.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Collections.emptySet;

@RestController
@RequestMapping("/api/address") //http://localhost:8080/api/address
public class AddressController {

    @Autowired
    private AddressService addressService;

    //http://localhost:8080/api/address
    @PostMapping
    public Address addAddress(@RequestBody AdressDto a){
        Address savedAddress = addressService.save(a.getCity(), a.getIdCountry(), a.getIdCustomer());
        return savedAddress;
    }

    @PutMapping("/{addressId}") //http://localhost:8080/api/address/10 PUT
    public Address updateAddress(@RequestBody AdressDto a){
        Address savedAddress = addressService.save(a.getCity(), a.getIdCountry(), a.getIdCustomer());
        return savedAddress;
    }

    @GetMapping //http://localhost:8080/api/address GET
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping ("/{addressId}") //http://localhost:8080/api/address GET
    public Address getAddressById(){

        return null;
    }

    @DeleteMapping ("/{addressId}") //http://localhost:8080/api/address DELETE
    public void deleteAddress(){

    }
}
