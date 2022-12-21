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
    public CustomerRepository customerRepository;
    
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
    public List<Customer> getAllCustomer(){
        return (List<Customer>) customerRepository.findAll();
    }
    public List<Customer> login(String email){
        return (List<Customer>) customerRepository.findByEmail(email);
    }
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findById(Integer id) {
        Optional<Customer> CustomerOptional = customerRepository.findById(id);
        return CustomerOptional.orElse(null);
    }
    public void delete(Integer id) {
        customerRepository.deleteById(id);

    }

}
