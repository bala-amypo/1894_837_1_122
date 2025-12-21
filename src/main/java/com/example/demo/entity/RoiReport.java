package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "roi_reports")
public class RoiReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private DiscountCode discountCode;

    private BigDecimal totalSales;
    private Integer totalTransactions;
    private Double roiPercentage;

    public RoiReport() {}

    public RoiReport(DiscountCode discountCode, BigDecimal totalSales,
                     Integer totalTransactions, Double roiPercentage) {
        this.discountCode = discountCode;
        this.totalSales = totalSales;
        this.totalTransactions = totalTransactions;
        this.roiPercentage = roiPercentage;
    }
}
