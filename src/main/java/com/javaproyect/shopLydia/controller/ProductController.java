package com.javaproyect.shopLydia.controller;

import com.javaproyect.shopLydia.entity.Product;
import com.javaproyect.shopLydia.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product") //http://localhost:8080/api/product
public class ProductController {

    @Autowired
    private ProductService productService;

    //http://localhost:8080/api/product
    @PostMapping
    public Product addProduct(@RequestBody Product p){
        return productService.save(p);
    }

    @PutMapping("/{productId}") //http://localhost:8080/api/product/10 PUT
    public Product updateProduct(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/product/20 GET
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping ("/{productId}") //http://localhost:8080/api/product GET
    public Product getProductById(){

        return null;
    }

    @DeleteMapping ("/{productId}") //http://localhost:8080/api/product DELETE
    public void deleteProduct(){

    }
}
