package com.javaproyect.shopLydia.repository;

import com.javaproyect.shopLydia.entity.Payment_status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentStatusRepository extends CrudRepository<Payment_status,Integer>{

}
