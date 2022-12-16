package com.javaproyect.shopLydia.controller;

import com.javaproyect.shopLydia.entity.Payment_method;
import com.javaproyect.shopLydia.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment_method") //http://localhost:8080/api/payment_method
public class PaymentMethodController {

    @Autowired
    private PaymentMethodService paymentMethodService;

    //http://localhost:8080/api/payment_method
    @PostMapping
    public Payment_method addPaymentMethod(@RequestBody Payment_method o){
        return paymentMethodService.save(o);
    }

    @PutMapping("/{payment_methodId}") //http://localhost:8080/api/payment_method/10 PUT
    public Payment_method updatePaymentMethod(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/payment_method/20 GET
    public List<Payment_method> getAllPaymentMethod(){
        return paymentMethodService.getAllPaymentMethod();
    }

    @GetMapping ("/{payment_methodId}") //http://localhost:8080/payment_method GET
    public Payment_method getPayment_methodById(){

        return null;
    }

    @DeleteMapping ("/{payment_methodId}") //http://localhost:8080/api/payment_method DELETE
    public void deletePayment_method(){

    }
}
