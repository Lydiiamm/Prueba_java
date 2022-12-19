package com.javaproyect.shopLydia.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * This class is the entity of the address of the client, it includes an address id
 * that is the primary key and all the relevant information.
 */
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_address")
    private int id_address;

    //Foreign key country
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "country_id")
    @JsonIgnore
    private Country country_id;
    @Column(name="city")
    private String city;
    @Column(name="postal_code")
    private String postal_code;
    @Column(name="street_line1")
    private String street_line1;
    @Column(name="street_line2")
    private String street_line2;
    @Column(name="home")
    private String home;
    @Column(name="apartment")
    private String apartment;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "address", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Purchase_order> purchaseOrder;

    @ManyToMany(mappedBy = "addresses")
    @JsonIgnore
    private Set<Customer> customer;

    public Address() {

    }


    public Address(int id_address, Country country_id, String city, String postal_code, String street_line1, String street_line2, String home, String apartment, Set<Purchase_order> purchaseOrder, Set<Customer> customer) {
        this.id_address = id_address;
        this.country_id = country_id;
        this.city = city;
        this.postal_code = postal_code;
        this.street_line1 = street_line1;
        this.street_line2 = street_line2;
        this.home = home;
        this.apartment = apartment;
        this.purchaseOrder = purchaseOrder;
        this.customer = customer;
    }

    /**
     *  Constructor of the class
     * @param idAddress identification of the whole address
     * @param idCountry identifier of the country
     * @param city name of the city
     * @param postalCode postalCode
     * @param streetLine1   street
     * @param streetLine2 additional information about the street
     * @param home  number on the street
     * @param apartment floor and letter
     */


    public int getId_address() {
        return id_address;
    }

    public void setId_address(int id_address) {
        this.id_address = id_address;
    }

    public Country getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Country country_id) {
        this.country_id = country_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getStreet_line1() {
        return street_line1;
    }

    public void setStreet_line1(String street_line1) {
        this.street_line1 = street_line1;
    }

    public String getStreet_line2() {
        return street_line2;
    }

    public void setStreet_line2(String street_line2) {
        this.street_line2 = street_line2;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public Set<Purchase_order> getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(Set<Purchase_order> purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public Set<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<Customer> customer) {
        this.customer = customer;
    }
}
