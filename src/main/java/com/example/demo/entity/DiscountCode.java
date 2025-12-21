package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "discount_codes")
public class DiscountCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codeValue;
    private Double discountPercentage;

    @ManyToOne
    private Influencer influencer;

    @ManyToOne
    private Campaign campaign;

    @OneToMany(mappedBy = "discountCode")
    private List<SaleTransaction> sales;

    public DiscountCode() {}

    public DiscountCode(String codeValue, Double discountPercentage) {
        this.codeValue = codeValue;
        this.discountPercentage = discountPercentage;
    }
}
