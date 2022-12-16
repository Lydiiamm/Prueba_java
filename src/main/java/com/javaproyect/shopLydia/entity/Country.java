package com.javaproyect.shopLydia.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * This class is a foreign key of address, it has the country and one id that identifies
 * each one. It is in case we want to access to all the orders in one country for example.
 */
@Entity
@Table(name="country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_country")
    private int id_country;
    @Column(name="country_name")
    private String country_name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "country_id", cascade = CascadeType.ALL)
    private Set<Address> address;

    /**
     * Contructor of the class country
     * @param idCountry identifier of the country
     * @param countryName name of the countrys
     */
    public Country() {

    }

    public Country(int id_country, String country_name, Set<Address> address) {
        this.id_country = id_country;
        this.country_name = country_name;
        this.address = address;
    }

    public int getId_country() {
        return id_country;
    }

    public void setId_country(int id_country) {
        this.id_country = id_country;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }
}
