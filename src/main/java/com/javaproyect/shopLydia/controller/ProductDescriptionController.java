package com.javaproyect.shopLydia.controller;

import com.javaproyect.shopLydia.controller.dto.ProdDesDto;
import com.javaproyect.shopLydia.controller.dto.PurOrAddDto;
import com.javaproyect.shopLydia.entity.Product_description;
import com.javaproyect.shopLydia.entity.Purchase_order;
import com.javaproyect.shopLydia.service.ProductDescriptionService;
import com.javaproyect.shopLydia.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productDescription") //http://localhost:8080/api/productDescription
public class ProductDescriptionController {

    @Autowired
    private ProductDescriptionService productDescriptionService;

    //http://localhost:8080/api/productDescription
    @PostMapping
    public Product_description addProductDescription(@RequestBody ProdDesDto p){
        Product_description savedProductDescription =productDescriptionService.save(p.getReference(), p.getIdProduct(),p.getIdSize(),p.getIdColor());
        return savedProductDescription;
    }

    @PutMapping("/{productDescriptionId}") //http://localhost:8080/api/productDescription/10 PUT
    public Product_description updateProductDescription(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/productDescription/20 GET
    public List<Product_description> getAllProductDescription(){
        return productDescriptionService.getAllProductDescription();
    }

    @GetMapping ("/{productDescriptionId}") //http://localhost:8080/productDescription GET
    public Product_description getProductDescriptionById(){

        return null;
    }

    @DeleteMapping ("/{productDescriptionId}") //http://localhost:8080/api/productDescription DELETE
    public void deleteProductDescription(){

    }
}
