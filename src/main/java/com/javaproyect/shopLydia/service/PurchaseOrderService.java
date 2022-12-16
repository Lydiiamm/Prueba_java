package com.javaproyect.shopLydia.service;


import com.javaproyect.shopLydia.entity.Payment_status;
import com.javaproyect.shopLydia.entity.Purchase_order;
import com.javaproyect.shopLydia.repository.PaymentStatusRepository;
import com.javaproyect.shopLydia.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseOrderService implements IPurchaseOrder{

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;
    @Override
    public Purchase_order save(Purchase_order purchaseOrder) {
        return purchaseOrderRepository.save(purchaseOrder);
    }
    @Override
    public List<Purchase_order> getAllPurchaseOrder() {
        return (List<Purchase_order>) purchaseOrderRepository.findAll();
    }
    @Override
    public Purchase_order update(Purchase_order purchaseOrder) {
        return purchaseOrderRepository.save(purchaseOrder);
    }
    @Override
    public Purchase_order findById(Integer id) {
        Optional<Purchase_order> PurchaseOrderOptional = purchaseOrderRepository.findById(id);
        return PurchaseOrderOptional.orElse(null);
    }

    @Override
    public List<Purchase_order> findAll() {
        return null;
    }
    @Override
    public void delete(Integer id) {
        purchaseOrderRepository.deleteById(id);

    }
}


