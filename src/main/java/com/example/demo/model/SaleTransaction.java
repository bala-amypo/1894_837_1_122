package com.example.demo.model;

public class SaleTransaction {

    private Long id;
    private double amount;

    public SaleTransaction() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
