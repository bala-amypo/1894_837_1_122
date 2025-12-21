package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "sale_transactions")
public class SaleTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private DiscountCode discountCode;

    private BigDecimal transactionAmount;
    private LocalDateTime transactionDate;
    private Long customerId;

    public SaleTransaction() {}

    public SaleTransaction(DiscountCode discountCode, BigDecimal transactionAmount,
                           LocalDateTime transactionDate, Long customerId) {
        this.discountCode = discountCode;
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
        this.customerId = customerId;
    }
}
