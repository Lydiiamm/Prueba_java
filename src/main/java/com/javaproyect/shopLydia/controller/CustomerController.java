package com.javaproyect.shopLydia.controller;

import com.javaproyect.shopLydia.entity.Customer;
import com.javaproyect.shopLydia.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer") //http://localhost:8080/api/customer
public class CustomerController {

    //http://localhost:8080/api/customer
    @PostMapping
    public Customer addCustomer(@RequestBody Customer c){
        return CustomerService.save(c);
    }

    @PutMapping("/{customerId}") //http://localhost:8080/api/customer/10 PUT
    public Customer updateCustomer(Customer c){
        return CustomerService.save(c);
    }

    @GetMapping //http://localhost:8080/api/customer GET
    public List<Customer> getAllCustomer(){
        return CustomerService.getAllCustomer();
    }

    @GetMapping ("/{customerId}") //http://localhost:8080/api/customer GET
    public Customer getCustomerById(){

        return null;
    }

    @DeleteMapping ("/{customerId}") //http://localhost:8080/api/customer DELETE
    public void deleteCustomer(Integer id){
        CustomerService.delete(id);
    }
}
