package com.javaproyect.shopLydia.controller;

import com.javaproyect.shopLydia.controller.dto.PurOrAddDto;
import com.javaproyect.shopLydia.entity.Purchase_order;
import com.javaproyect.shopLydia.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Collections.emptySet;

@RestController
@RequestMapping("/api/purchaseOrder") //http://localhost:8080/api/purchaseOrder
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    //http://localhost:8080/api/purchaseOrder
    @PostMapping
    public Purchase_order addPurchaseOrder(@RequestBody PurOrAddDto o){
        Purchase_order savedPurchaseOrder =purchaseOrderService.save(o.getReference(), o.getIdAddress(), o.getIdOrderStatus(), o.getIdPaymentStatus(),o.getIdPaymentMethod(), o.getIdCustomer(), o.getIdProduct());
        return savedPurchaseOrder;
    }

    @PutMapping("/{purchaseOrderId}") //http://localhost:8080/api/purchaseOrder/10 PUT
    public Purchase_order updatePurchaseOrder(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/purchaseOrder/20 GET
    public List<Purchase_order> getAllPurchaseOrder(){
        return purchaseOrderService.getAllPurchaseOrder();
    }

    @GetMapping ("/{purchaseOrderId}") //http://localhost:8080/PurchaseOrder GET
    public Purchase_order getPurchaseOrderById(){

        return null;
    }

    @DeleteMapping ("/{purchaseOrderId}") //http://localhost:8080/api/PurchaseOrder DELETE
    public void deletePurchaseOrder(){

    }
}

