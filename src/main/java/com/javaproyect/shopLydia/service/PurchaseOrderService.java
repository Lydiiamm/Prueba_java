package com.javaproyect.shopLydia.service;


import com.javaproyect.shopLydia.entity.*;
import com.javaproyect.shopLydia.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseOrderService implements IPurchaseOrder{

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private OrderStatusRepository orderStatusRepository;
    @Autowired
    private PaymentStatusRepository paymentStatusRepository;
    @Autowired
    private PaymentMethodRepository paymentMethodRepository;
    @Autowired
    private CustomerRepository customerRepository;

    public Purchase_order save(String reference, Integer idAddress, Integer idOrderStatus, Integer idPaymentMethod, Integer idPaymentStatus, Integer idCustomer){
        Optional<Address> foundAddress =addressRepository.findById(idAddress);
        Optional<Order_status> foundOrderStatus =orderStatusRepository.findById(idOrderStatus);
        Optional<Payment_status> foundPaymentStatus =paymentStatusRepository.findById(idPaymentStatus);
        Optional<Payment_method> foundPaymentMethod = paymentMethodRepository.findById(idPaymentMethod);
        Optional<Customer> foundCustomer =customerRepository.findById(idCustomer);


        if (foundAddress.isPresent()) {
            Address address = foundAddress.get();
            Order_status orderStatus = foundOrderStatus.get();
            Payment_status paymentStatus =foundPaymentStatus.get();
            Payment_method paymentMethod=foundPaymentMethod.get();
            Customer customer =foundCustomer.get();

            Purchase_order purchaseOrder = new Purchase_order();
            purchaseOrder.setReference(reference);
            purchaseOrder.setAddress(address);
            purchaseOrder.setOrderStatus(orderStatus);
            purchaseOrder.setPaymentStatus(paymentStatus);
            purchaseOrder.setPaymentMethod(paymentMethod);
            purchaseOrder.setCustomer(customer);
            return purchaseOrderRepository.save(purchaseOrder);
        }

        return null;
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


