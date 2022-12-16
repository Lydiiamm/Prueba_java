package com.javaproyect.shopLydia.controller;


import com.javaproyect.shopLydia.entity.Order_status;
import com.javaproyect.shopLydia.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderStatus") //http://localhost:8080/api/orderStatus
public class OrderStatusController {

    @Autowired
    private OrderStatusService orderStatusService;

    //http://localhost:8080/api/orderStatus
    @PostMapping
    public Order_status addOrderStatus(@RequestBody Order_status o){
        return orderStatusService.save(o);
    }

    @PutMapping("/{orderStatusId}") //http://localhost:8080/api/orderStatus/10 PUT
    public Order_status updateOrderStatus(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/orderStatus/20 GET
    public List<Order_status> getAllOrderStatus(){
        return orderStatusService.getAllOrderStatus();
    }

    @GetMapping ("/{orderStatusId}") //http://localhost:8080/orderStatus GET
    public Order_status getOrderStatusById(){

        return null;
    }

    @DeleteMapping ("/{orderStatusId}") //http://localhost:8080/api/OrderStatus DELETE
    public void deleteOrderStatus(){

    }
}
