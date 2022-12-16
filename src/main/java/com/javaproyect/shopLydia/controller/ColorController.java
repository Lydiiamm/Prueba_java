package com.javaproyect.shopLydia.controller;

import com.javaproyect.shopLydia.entity.Color;
import com.javaproyect.shopLydia.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/color") //http://localhost:8080/api/color
public class ColorController {

    @Autowired
    private ColorService colorService;

    //http://localhost:8080/api/color
    @PostMapping
    public Color addColor(@RequestBody Color c){
        return colorService.save(c);
    }

    @PutMapping("/{colorId}") //http://localhost:8080/api/color/10 PUT
    public Color updateColor(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/color/20 GET
    public List<Color> getAllColor(){
        return colorService.getAllColor();
    }

    @GetMapping ("/{colorId}") //http://localhost:8080/api/color GET
    public Color getColorById(){

        return null;
    }

    @DeleteMapping ("/{colorId}") //http://localhost:8080/api/color DELETE
    public void deleteColor(){

    }
}
