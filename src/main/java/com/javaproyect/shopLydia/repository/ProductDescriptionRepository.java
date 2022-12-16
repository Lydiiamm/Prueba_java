package com.javaproyect.shopLydia.repository;

import com.javaproyect.shopLydia.entity.Product_description;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDescriptionRepository extends CrudRepository<Product_description,Integer>{

}
