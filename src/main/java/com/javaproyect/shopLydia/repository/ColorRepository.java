package com.javaproyect.shopLydia.repository;

import com.javaproyect.shopLydia.entity.Color;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends CrudRepository<Color,Integer>{

}
