package com.javaproyect.shopLydia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Class that relates all the relevant information about the products of an order
 */
@Entity
@Table(name = "product_description")
public class Product_description {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_productdescription")
    private int id_productdescription;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "size")
    @JsonIgnore
    private Size size;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "color")
    @JsonIgnore
    private Color color;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product")
    @JsonIgnore
    private Product product;
    @Column(name = "stock", nullable = false, unique = false)
    private int stock;
    @Column(name = "reference", nullable = false, unique = false)
    private String reference;

    //    @ManyToMany(mappedBy = "productDescription")
//    @JsonIgnore
//    private Set<Purchase_order> purchaseOrder;
    @ManyToMany
    @JoinTable(
            name = "good",
            joinColumns = @JoinColumn(name = "id_productdescription",
                    nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_order")
    )
    Set<Purchase_order> purchaseOrder;

    public Product_description() {

    }

    public Product_description(int id_productdescription, Size size, Color color, Product product, int stock, String reference, Set<Purchase_order> purchaseOrder) {
        this.id_productdescription = id_productdescription;
        this.size = size;
        this.color = color;
        this.product = product;
        this.stock = stock;
        this.reference = reference;
        this.purchaseOrder = purchaseOrder;
    }

    /**
     * Constructor of the class product_description
     *
     * @param idProductDescription indentifier of a product with al its characteristics
     * @param idSize               identifier of the size
     * @param idColor              identifier of the color
     * @param idProduct            identifier of the product
     * @param stock                quantity on stock
     */


    public int getId_productdescription() {
        return id_productdescription;
    }

    public void setId_productdescription(int id_productdescription) {
        this.id_productdescription = id_productdescription;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Set<Purchase_order> getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(Set<Purchase_order> purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public void addOrder(Purchase_order order) {
        if (this.purchaseOrder == null) {
            this.purchaseOrder = new HashSet<>();
        }
        this.purchaseOrder.add(order);
    }
}
