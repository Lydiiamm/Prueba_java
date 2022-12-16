package com.javaproyect.shopLydia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * Class that constains all the relevant information about one order
 */
@Entity
@Table(name = "purchase_order")
public class Purchase_order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private int id_order;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer")
    private Customer customer;
    //Foreign key address
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    private Address address;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentMethod")
    private Payment_method paymentMethod;
    @Column(name="deliveryMethod", length=50, nullable=true, unique=false)
    private String deliveryMethod;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentStatus")
    private Payment_status paymentStatus;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderStatus")
    private Order_status orderStatus;

    @ManyToMany
    @JoinTable(
            name = "good",
            joinColumns = @JoinColumn(name = "id_order",
                    nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_productdescription")
    )
    Set<Product_description> productDescription;

    public Purchase_order() {
        super();
    }




    /**
     * Constructor of the class purchase_order
     * @param idOrder identifier of the order
     * @param idCustomer identifier of the costumer
     * @param idAddress identifier of the address
     * @param paymentMethod identifier of the payment method
     * @param deliveryMethod delivery method selected
     * @param paymentStatus identifier of the payment status
     * @param orderStatus identifier of the order status
     */


    public Purchase_order(int id_order, Customer customer, Address address, Payment_method paymentMethod, String deliveryMethod, Payment_status paymentStatus, Order_status orderStatus, Set<Product_description> productDescription) {
        this.id_order = id_order;
        this.customer = customer;
        this.address = address;
        this.paymentMethod = paymentMethod;
        this.deliveryMethod = deliveryMethod;
        this.paymentStatus = paymentStatus;
        this.orderStatus = orderStatus;
        this.productDescription = productDescription;
    }


    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Payment_method getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Payment_method paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public Payment_status getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Payment_status paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Order_status getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Order_status orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Set<Product_description> getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(Set<Product_description> productDescription) {
        this.productDescription = productDescription;
    }
}
