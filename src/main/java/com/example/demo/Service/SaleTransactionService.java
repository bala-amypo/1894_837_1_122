package com.example.demo.Service;

import com.example.demo.model.SaleTransaction;
import java.util.List;

public interface SaleTransactionService {

    SaleTransaction createTransaction(SaleTransaction transaction);

    List<SaleTransaction> getAllTransactions();
}
