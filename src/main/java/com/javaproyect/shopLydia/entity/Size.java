package com.javaproyect.shopLydia.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Class that selects the size of the product
 */
@Entity
@Table(name = "size")
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_size")
    private int id_size;
    @Column(name="size")
    private String size;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "size", cascade = CascadeType.ALL)
    private Set<Product_description> productDescription;

    public Size() {

    }

    /**
     * Constructor of the class size
     * @param idSize identifier of the size
     * @param size real size
     */

    public Size(int id_size, String size, Set<Product_description> productDescription) {
        this.id_size = id_size;
        this.size = size;
        this.productDescription = productDescription;
    }

    public int getId_size() {
        return id_size;
    }

    public void setId_size(int id_size) {
        this.id_size = id_size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Set<Product_description> getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(Set<Product_description> productDescription) {
        this.productDescription = productDescription;
    }
}
