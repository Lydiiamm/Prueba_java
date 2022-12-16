package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Purchase_order;
import com.javaproyect.shopLydia.entity.Size;
import com.javaproyect.shopLydia.repository.PurchaseOrderRepository;
import com.javaproyect.shopLydia.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SizeService {

    @Autowired
    private SizeRepository sizeRepository;

    public Size save(Size size) {
        return sizeRepository.save(size);
    }

    public List<Size> getAllSize() {
        return (List<Size>) sizeRepository.findAll();
    }

    public Size update(Size size) {
        return sizeRepository.save(size);
    }

    public Size findById(Integer id) {
        Optional<Size> SizeOptional = sizeRepository.findById(id);
        return SizeOptional.orElse(null);
    }

    public void delete(Integer id) {
        sizeRepository.deleteById(id);

    }
}
