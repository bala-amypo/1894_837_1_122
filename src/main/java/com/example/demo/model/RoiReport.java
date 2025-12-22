package com.example.demo.model;

public class RoiReport {

    private Long id;
    private double revenue;
    private double cost;

    public RoiReport() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getRevenue() { return revenue; }
    public void setRevenue(double revenue) { this.revenue = revenue; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }
}
