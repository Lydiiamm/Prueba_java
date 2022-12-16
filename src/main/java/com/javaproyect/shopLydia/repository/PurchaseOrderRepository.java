package com.javaproyect.shopLydia.repository;

import com.javaproyect.shopLydia.entity.Purchase_order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderRepository extends CrudRepository<Purchase_order,Integer>{

}
