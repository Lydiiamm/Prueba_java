package com.javaproyect.shopLydia.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Class that selects the status of the order
 */
@Entity
@Table(name = "order_status")
public class Order_status {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_orderstatus;
    @Column(name="status_order", length=50, nullable=true, unique=false)
    private String status_order;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "orderStatus", cascade = CascadeType.ALL)
    private Set<Purchase_order> purchaseOrder;

    public Order_status() {

    }

    /**
     * Constructor of the class order_status
     * @param idOrderStatus identifier of the status
     * @param status_order real status
     */
    public Order_status(int id_orderstatus, String status_order, Set<Purchase_order> purchaseOrder) {
        this.id_orderstatus = id_orderstatus;
        this.status_order = status_order;
        this.purchaseOrder = purchaseOrder;
    }

    public int getId_orderstatus() {
        return id_orderstatus;
    }

    public void setId_orderstatus(int id_orderstatus) {
        this.id_orderstatus = id_orderstatus;
    }

    public String getStatus_order() {
        return status_order;
    }

    public void setStatus_order(String status_order) {
        this.status_order = status_order;
    }

    public Set<Purchase_order> getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(Set<Purchase_order> purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }
}
