package com.example.demo.model;

public class Campaign {

    private Long id;
    private String name;
    private double budget;

    public Campaign() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBudget() { return budget; }
    public void setBudget(double budget) { this.budget = budget; }
}
