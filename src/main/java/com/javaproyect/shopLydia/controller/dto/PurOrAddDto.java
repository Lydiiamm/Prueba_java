package com.javaproyect.shopLydia.controller.dto;

public class PurOrAddDto {

    private String reference;
    private Integer idAddress;
    private Integer idOrderStatus;
    private Integer idPaymentStatus;
    private Integer idPaymentMethod;
    private Integer idCustomer;


    public PurOrAddDto() {
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    public Integer getIdOrderStatus() {
        return idOrderStatus;
    }

    public void setIdOrderStatus(Integer idOrderStatus) {
        this.idOrderStatus = idOrderStatus;
    }

    public Integer getIdPaymentStatus() {
        return idPaymentStatus;
    }

    public void setIdPaymentStatus(Integer idPaymentStatus) {
        this.idPaymentStatus = idPaymentStatus;
    }

    public Integer getIdPaymentMethod() {
        return idPaymentMethod;
    }

    public void setIdPaymentMethod(Integer idPaymentMethod) {
        this.idPaymentMethod = idPaymentMethod;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }
}
