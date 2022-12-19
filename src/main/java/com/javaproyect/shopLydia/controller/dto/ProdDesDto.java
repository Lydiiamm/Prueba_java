package com.javaproyect.shopLydia.controller.dto;

public class ProdDesDto {
    private String reference;
    private Integer idProduct;
    private Integer idColor;
    private Integer idSize;

    public ProdDesDto() {
    }

    public ProdDesDto(String reference, Integer idProduct, Integer idColor, Integer idSize) {
        this.reference = reference;
        this.idProduct = idProduct;
        this.idColor = idColor;
        this.idSize = idSize;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdColor() {
        return idColor;
    }

    public void setIdColor(Integer idColor) {
        this.idColor = idColor;
    }

    public Integer getIdSize() {
        return idSize;
    }

    public void setIdSize(Integer idSize) {
        this.idSize = idSize;
    }

}
