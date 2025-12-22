package com.example.demo.model;

public class DiscountCode {

    private Long id;
    private String code;
    private double discount;

    public DiscountCode() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }
}
