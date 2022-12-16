package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Address;
import com.javaproyect.shopLydia.entity.Payment_method;

import java.util.List;

public interface IPaymentMethod {

    Payment_method save(Payment_method paymentMethod);
    Payment_method update(Payment_method paymentMethod);
    Payment_method findById(Integer id);
    List<Payment_method> findAll();
    List<Payment_method> getAllPaymentMethod();

    void delete(Integer id);
}
