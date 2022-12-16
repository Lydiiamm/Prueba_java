package com.javaproyect.shopLydia.controller;


import com.javaproyect.shopLydia.entity.Payment_status;
import com.javaproyect.shopLydia.service.PaymentStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paymentStatus") //http://localhost:8080/api/paymentStatus
public class PaymentStatusController {

    @Autowired
    private PaymentStatusService paymentStatusService;

    //http://localhost:8080/api/paymentStatus
    @PostMapping
    public Payment_status addPaymentStatus(@RequestBody Payment_status o){
        return paymentStatusService.save(o);
    }

    @PutMapping("/{paymentStatusId}") //http://localhost:8080/api/paymentStatus/10 PUT
    public Payment_status updatePaymentStatus(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/paymentStatus/20 GET
    public List<Payment_status> getAllPaymentStatus(){
        return paymentStatusService.getAllPaymentStatus();
    }

    @GetMapping ("/{paymentStatusId}") //http://localhost:8080/paymentStatus GET
    public Payment_status getPaymentStatusById(){

        return null;
    }

    @DeleteMapping ("/{paymentStatusId}") //http://localhost:8080/api/paymentStatus DELETE
    public void deletePaymentStatus(){

    }
}
