package com.javaproyect.shopLydia.service;

import com.javaproyect.shopLydia.entity.Address;
import com.javaproyect.shopLydia.entity.Country;
import com.javaproyect.shopLydia.entity.Purchase_order;

import java.util.List;

public interface IPurchaseOrder {
    Purchase_order save(String reference, Integer idAddress, Integer idOrderStatus, Integer idPaymentMethod, Integer idPaymentStatus, Integer idCustomer, Integer idProduct);
    Purchase_order update(Purchase_order purchaseOrder);
    Purchase_order findById(Integer id);
    List<Purchase_order> findAll();
    List<Purchase_order> getAllPurchaseOrder();

    void delete(Integer id);
}
