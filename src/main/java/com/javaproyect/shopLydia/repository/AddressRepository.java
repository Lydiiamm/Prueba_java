package com.javaproyect.shopLydia.repository;

import com.javaproyect.shopLydia.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer>{

}
