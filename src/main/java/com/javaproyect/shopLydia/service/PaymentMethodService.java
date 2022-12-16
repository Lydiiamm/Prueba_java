package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Color;
import com.javaproyect.shopLydia.entity.Payment_method;
import com.javaproyect.shopLydia.repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentMethodService implements IPaymentMethod{

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;
    @Override
    public Payment_method save(Payment_method paymentMethod) {
        return paymentMethodRepository.save(paymentMethod);
    }
    @Override
    public List<Payment_method> getAllPaymentMethod(){
        return (List<Payment_method>) paymentMethodRepository.findAll();
    }
    @Override
    public Payment_method update(Payment_method paymentMethod) {
        return paymentMethodRepository.save(paymentMethod);
    }
    @Override
    public Payment_method findById(Integer id) {
        Optional<Payment_method> PaymentMethodOptional = paymentMethodRepository.findById(id);
        return PaymentMethodOptional.orElse(null);
    }

    @Override
    public List<Payment_method> findAll() {
        return null;
    }
    @Override
    public void delete(Integer id) {
        paymentMethodRepository.deleteById(id);

    }
}
