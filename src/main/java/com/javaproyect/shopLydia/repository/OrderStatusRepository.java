package com.javaproyect.shopLydia.repository;

import com.javaproyect.shopLydia.entity.Order_status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepository extends CrudRepository<Order_status,Integer>{

}
