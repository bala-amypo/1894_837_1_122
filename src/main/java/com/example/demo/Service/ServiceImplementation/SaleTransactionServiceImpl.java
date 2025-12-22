package com.example.demo.Service.ServiceImplementation;

import com.example.demo.Service.SaleTransactionService;
import com.example.demo.model.SaleTransaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SaleTransactionServiceImpl implements SaleTransactionService {

    @Override
    public SaleTransaction createTransaction(SaleTransaction transaction) {
        return transaction;
    }

    @Override
    public List<SaleTransaction> getAllTransactions() {
        return new ArrayList<>();
    }
}
