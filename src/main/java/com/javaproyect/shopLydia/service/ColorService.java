package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Color;
import com.javaproyect.shopLydia.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColorService {

    @Autowired
    private ColorRepository colorRepository;

    public Color save(Color color) {
        return colorRepository.save(color);
    }

    public List<Color> getAllColor() {
        return (List<Color>) colorRepository.findAll();
    }

    public Color update(Color color) {
        return colorRepository.save(color);
    }

    public Color findById(Integer id) {
        Optional<Color> ColorOptional = colorRepository.findById(id);
        return ColorOptional.orElse(null);
    }

    public void delete(Integer id) {
        colorRepository.deleteById(id);

    }
}

