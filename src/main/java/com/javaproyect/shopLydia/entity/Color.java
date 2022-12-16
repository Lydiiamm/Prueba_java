package com.javaproyect.shopLydia.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Class to choose the clothes color, it can be null. Each color has an id.
 */
@Entity
@Table(name = "color")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_color")
    private int id_color;
    @Column(name="color")
    private String color;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "color", cascade = CascadeType.ALL)
    private Set<Product_description> productDescription;

    public Color() {

    }



    /**
     * Constructor of the class color
     * @param idColor identifier of the color
     * @param color name of the color
     */
    public Color(int id_color, String color, Set<Product_description> productDescription) {
        this.id_color = id_color;
        this.color = color;
        this.productDescription = productDescription;
    }

    public int getId_color() {
        return id_color;
    }

    public void setId_color(int id_color) {
        this.id_color = id_color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Set<Product_description> getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(Set<Product_description> productDescription) {
        this.productDescription = productDescription;
    }
}
