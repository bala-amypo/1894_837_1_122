//SaleTransactionController.java
package com.example.demo.controller;

import com.example.demo.model.SaleTransaction;
import com.example.demo.service.SaleTransactionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sales")
public class SaleTransactionController {

    private final SaleTransactionService saleService;

    public SaleTransactionController(SaleTransactionService saleService) {
        this.saleService = saleService;
    }

    @PostMapping
    public SaleTransaction add(@RequestBody SaleTransaction sale) {
        return saleService.save(sale);
    }
}