package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Product;
import com.javaproyect.shopLydia.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProduct(){
        return (List<Product>) productRepository.findAll();
    }

    public Product update(Product product) {
        return productRepository.save(product);
    }

    public Product findById(Integer id) {
        Optional<Product> ProductOptional = productRepository.findById(id);
        return ProductOptional.orElse(null);
    }

    public void delete(Integer id) {
        productRepository.deleteById(id);

    }
}
