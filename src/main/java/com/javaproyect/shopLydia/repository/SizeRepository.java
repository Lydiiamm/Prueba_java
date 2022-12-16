package com.javaproyect.shopLydia.repository;

import com.javaproyect.shopLydia.entity.Size;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends CrudRepository<Size,Integer>{

}
