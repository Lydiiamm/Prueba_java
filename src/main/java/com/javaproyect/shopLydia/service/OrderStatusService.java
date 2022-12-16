package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Order_status;
import com.javaproyect.shopLydia.repository.OrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderStatusService {

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    public Order_status save(Order_status orderStatus){
        return orderStatusRepository.save(orderStatus);
    }

    public List<Order_status> getAllOrderStatus() {
        return (List<Order_status>) orderStatusRepository.findAll();
    }

    public Order_status update(Order_status orderStatus) {
        return orderStatusRepository.save(orderStatus);
    }

    public Order_status findById(Integer id) {
        Optional<Order_status> OrderStatusOptional = orderStatusRepository.findById(id);
        return OrderStatusOptional.orElse(null);
    }

    public void delete(Integer id) {
        orderStatusRepository.deleteById(id);

    }
}

