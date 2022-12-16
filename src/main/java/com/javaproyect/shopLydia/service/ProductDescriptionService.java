package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Payment_status;
import com.javaproyect.shopLydia.entity.Product_description;
import com.javaproyect.shopLydia.repository.PaymentStatusRepository;
import com.javaproyect.shopLydia.repository.ProductDescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDescriptionService {

    @Autowired
    private ProductDescriptionRepository productDescriptionRepository;

    public Product_description save(Product_description productDescription) {
        return productDescriptionRepository.save(productDescription);
    }

    public List<Product_description> getAllProductDescription(){
        return (List<Product_description>) productDescriptionRepository.findAll();
    }

    public Product_description update(Product_description productDescription) {
        return productDescriptionRepository.save(productDescription);
    }

    public Product_description findById(Integer id) {
        Optional<Product_description> ProductDescriptionOptional = productDescriptionRepository.findById(id);
        return ProductDescriptionOptional.orElse(null);
    }

    public void delete(Integer id) {
        productDescriptionRepository.deleteById(id);

    }
}
