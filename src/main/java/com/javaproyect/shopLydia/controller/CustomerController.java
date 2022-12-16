package com.javaproyect.shopLydia.controller;

import com.javaproyect.shopLydia.entity.Customer;
import com.javaproyect.shopLydia.service.CustomerService;
import com.javaproyect.shopLydia.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer") //http://localhost:8080/api/customer
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    //http://localhost:8080/api/customer
    @PostMapping
    public Customer addCustomer(@RequestBody Customer c){
        return customerService.save(c);
    }

    @PutMapping("/{customerId}") //http://localhost:8080/api/customer/10 PUT
    public Customer updateCustomer(Customer c){
        return customerService.save(c);
    }

    @GetMapping //http://localhost:8080/api/customer GET
    public List<Customer> getAllCustomer(){
        return null;
    }

    @GetMapping ("/{customerId}") //http://localhost:8080/api/customer GET
    public Customer getCustomerById(){

        return null;
    }

    @DeleteMapping ("/{customerId}") //http://localhost:8080/api/customer DELETE
    public void deleteCustomer(Integer id){
        customerService.delete(id);
    }
}
