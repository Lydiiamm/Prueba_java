package com.javaproyect.shopLydia.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Class that has all the information of a selected product
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private int id_product;
    @Column(name="price", nullable=false, unique=false)
    private int price;
    @Column(name="category", length=50, nullable=false, unique=false)
    private String category;
    @Column(name="weight", nullable=false, unique=false)
    private float weight;
    @Column(name="volume", nullable=false, unique=false)
    private float volume;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "product", cascade = CascadeType.ALL)
    private Set<Product_description> productDescription;

    /**
     * Constructor of the class product
     * @param idProduct identifier of the product
     * @param price price of the product
     * @param category category of the product
     * @param weight weight of the product
     * @param volume volume of the product
     */
    public Product(int id_product, int price, String category, float weight, float volume, Set<Product_description> productDescription) {
        this.id_product = id_product;
        this.price = price;
        this.category = category;
        this.weight = weight;
        this.volume = volume;
        this.productDescription = productDescription;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public Set<Product_description> getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(Set<Product_description> productDescription) {
        this.productDescription = productDescription;
    }
}
