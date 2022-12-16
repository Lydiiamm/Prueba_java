package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.*;
import com.javaproyect.shopLydia.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDescriptionService {

    @Autowired
    private ProductDescriptionRepository productDescriptionRepository;
    @Autowired
    private ColorRepository colorRepository;
    @Autowired
    private SizeRepository sizeRepository;
    @Autowired
    private ProductRepository productRepository;

    public Product_description save(String reference, Integer idColor, Integer idSize, Integer idProduct){
        Optional<Color> foundColor =colorRepository.findById(idColor);
        Optional<Size> foundSize =sizeRepository.findById(idSize);
        Optional<Product> foundProduct =productRepository.findById(idProduct);

        if (foundProduct.isPresent()) {
            Product product = foundProduct.get();
            Color color = foundColor.get();
            Size size =foundSize.get();

            Product_description productDescription = new Product_description();
            productDescription.setReference(reference);
            productDescription.setColor(color);
            productDescription.setSize(size);
            productDescription.setProduct(product);
            return productDescriptionRepository.save(productDescription);
        }

        return null;
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
