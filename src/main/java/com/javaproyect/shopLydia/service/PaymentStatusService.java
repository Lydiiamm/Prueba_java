package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Payment_status;
import com.javaproyect.shopLydia.entity.Payment_status;
import com.javaproyect.shopLydia.repository.PaymentStatusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentStatusService {

    @Autowired
    private PaymentStatusRepository paymentStatusRepository;

    public Payment_status save(Payment_status paymentStatus) {
        return paymentStatusRepository.save(paymentStatus);
    }

    public List<Payment_status> getAllPaymentStatus(){
        return (List<Payment_status>) paymentStatusRepository.findAll();
    }

    public Payment_status update(Payment_status paymentStatus) {
        return paymentStatusRepository.save(paymentStatus);
    }

    public Payment_status findById(Integer id) {
        Optional<Payment_status> PaymentStatusOptional = paymentStatusRepository.findById(id);
        return PaymentStatusOptional.orElse(null);
    }

    public void delete(Integer id) {
        paymentStatusRepository.deleteById(id);

    }
}
