package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;


@Entity
public class Security {

    @Id
    @GeneratedValue
    private Long securityId;

    @ManyToOne
    private Portfolio portfolio;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private float purchasePrice;

    @Column
    private String purchaseDate;

    @Column
    private float quantity;

    protected Security(){
    }

    public Security(Portfolio portfolio, String name, String category, float purchasePrice,  String purchaseDate, float quantity) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

}

