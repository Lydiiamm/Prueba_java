package com.javaproyect.shopLydia.controller;

import com.javaproyect.shopLydia.entity.Size;
import com.javaproyect.shopLydia.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/size") //http://localhost:8080/api/size
public class SizeController {

    @Autowired
    private SizeService sizeService;

    //http://localhost:8080/api/size
    @PostMapping
    public Size addSize(@RequestBody Size s){
        return sizeService.save(s);
    }

    @PutMapping("/{sizeId}") //http://localhost:8080/api/size/10 PUT
    public Size updateSize(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/size/20 GET
    public List<Size> getAllSize(){
        return sizeService.getAllSize();
    }

    @GetMapping ("/{sizeId}") //http://localhost:8080/api/size GET
    public Size getSizeById(){

        return null;
    }

    @DeleteMapping ("/{sizeId}") //http://localhost:8080/api/size DELETE
    public void deleteSize(){

    }
}
