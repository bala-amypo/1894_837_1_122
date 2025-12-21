package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class SaleTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double saleAmount;
    private LocalDateTime saleDate = LocalDateTime.now();

    @ManyToOne
    private DiscountCode discountCode;
}
