package com.javaproyect.shopLydia.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Clas that selects the payment method
 */
@Entity
@Table(name = "payment_method")
public class Payment_method {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id_method;
    @Column(name="method", length=50, nullable=true, unique=false)
    private String method;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "paymentMethod", cascade = CascadeType.ALL)
    private Set<Purchase_order> purchaseOrder;

    public Payment_method() {

    }

    /**
     * Constructor of the class payment method
     * @param idMethod identifier of the payment method
     * @param method actual payment method
     */
    public Payment_method(int id_method, String method, Set<Purchase_order> purchaseOrder) {
        this.id_method = id_method;
        this.method = method;
        this.purchaseOrder = purchaseOrder;
    }

    public int getId_method() {
        return id_method;
    }

    public void setId_method(int id_method) {
        this.id_method = id_method;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Set<Purchase_order> getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(Set<Purchase_order> purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }
}
