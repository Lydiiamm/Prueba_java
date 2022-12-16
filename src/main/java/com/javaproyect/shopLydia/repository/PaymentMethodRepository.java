package com.javaproyect.shopLydia.repository;

import com.javaproyect.shopLydia.entity.Payment_method;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepository extends CrudRepository<Payment_method,Integer>{

}
