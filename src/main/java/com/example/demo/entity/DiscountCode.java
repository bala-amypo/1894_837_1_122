package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DiscountCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private double percentage;

    @ManyToOne
    private Influencer influencer;

    @ManyToOne
    private Campaign campaign;
}
