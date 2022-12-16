package com.javaproyect.shopLydia.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Class that selects the status of a selected payment
 */
@Entity
@Table(name = "payment_status")
public class Payment_status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_paymentstatus;
    @Column(name="status_payment")
    private String status_payment;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "paymentStatus", cascade = CascadeType.ALL)
    private Set<Purchase_order> purchaseOrder;

    public Payment_status() {
        super();
    }

    /**
     * Contructor of the class payment_status
     * @param idPaymentStatus identifier of the status
     * @param statusPayment actual status
     */
    public Payment_status(int id_paymentstatus, String status_payment, Set<Purchase_order> purchaseOrder) {
        this.id_paymentstatus = id_paymentstatus;
        this.status_payment = status_payment;
        this.purchaseOrder = purchaseOrder;
    }

    public int getId_paymentstatus() {
        return id_paymentstatus;
    }

    public void setId_paymentstatus(int id_paymentstatus) {
        this.id_paymentstatus = id_paymentstatus;
    }

    public String getStatus_payment() {
        return status_payment;
    }

    public void setStatus_payment(String status_payment) {
        this.status_payment = status_payment;
    }

    public Set<Purchase_order> getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(Set<Purchase_order> purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }
}
