package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Customer;
import com.javaproyect.shopLydia.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    public static CustomerRepository customerRepository;
    
    public static Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
    
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findById(Integer id) {
        Optional<Customer> CustomerOptional = customerRepository.findById(id);
        return CustomerOptional.orElse(null);
    }

    public static List<Customer> getAllCustomer() {
        return (List<Customer>) customerRepository.findAll();
    }


    public static void delete(Integer id) {
        customerRepository.deleteById(id);

    }

}
