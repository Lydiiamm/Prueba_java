package com.javaproyect.shopLydia.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Class customer, it has all the data needed for the sign up
 */
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private int id_customer;
    @Column(name = "customer_name", length = 50, nullable = false, unique = false)
    private String customer_name;
    @Column(name = "customer_surname", length = 50, nullable = true, unique = false)
    private String customer_surname;
    @Column(name = "birth", nullable = false, unique = false)
    private Date birth;
    @Column(name = "email", length = 50, nullable = false, unique = false)
    private String email;
    @Column(name = "accountPassword", length = 50, nullable = false, unique = false)
    private String accountPassword;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Purchase_order> purchaseOrder;

    @ManyToMany
    @JoinTable(name = "customer_address", joinColumns = @JoinColumn(name = "id_customer", nullable = false), inverseJoinColumns = @JoinColumn(name = "id_address"))
    Set<Address> addresses;

    public Customer() {

    }

    public Customer(int id_customer, String customer_name, String customer_surname, Date birth, String email, String accountPassword, Set<Purchase_order> purchaseOrder, Set<Address> addresses) {
        this.id_customer = id_customer;
        this.customer_name = customer_name;
        this.customer_surname = customer_surname;
        this.birth = birth;
        this.email = email;
        this.accountPassword = accountPassword;
        this.purchaseOrder = purchaseOrder;
        this.addresses = addresses;
    }

    /**
     * Constructor of the class customer
     *
     * @param idCustomer      identifier of the user
     * @param idAddress       identifier of the address
     * @param customerName    name of the customer
     * @param customerSurname surname of the customer
     * @param dateofBirth     date of birth
     * @param email           email of the customer
     * @param accountPassword password
     */


    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Address address) {
        if (this.addresses == null) {
            this.addresses = new HashSet<>();
        }
        this.addresses.add(address);
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_surname() {
        return customer_surname;
    }

    public void setCustomer_surname(String customer_surname) {
        this.customer_surname = customer_surname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public Set<Purchase_order> getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(Set<Purchase_order> purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }
}
