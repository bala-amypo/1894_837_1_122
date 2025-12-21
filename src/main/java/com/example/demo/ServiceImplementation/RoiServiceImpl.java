package com.example.demo.service.impl;

import com.example.demo.model.RoiReport;
import com.example.demo.model.SaleTransaction;
import com.example.demo.repository.RoiReportRepository;
import com.example.demo.repository.SaleTransactionRepository;
import com.example.demo.service.RoiService;
import org.springframework.stereotype.Service;

@Service
public class RoiServiceImpl implements RoiService {

    private final SaleTransactionRepository saleTransactionRepository;
    private final RoiReportRepository roiReportRepository;

    public RoiServiceImpl(SaleTransactionRepository saleTransactionRepository,
                          RoiReportRepository roiReportRepository) {
        this.saleTransactionRepository = saleTransactionRepository;
        this.roiReportRepository = roiReportRepository;
    }

    @Override
    public RoiReport calculateRoi() {

        double totalRevenue = saleTransactionRepository.findAll()
                .stream()
                .mapToDouble(SaleTransaction::getSaleAmount)
                .sum();

        RoiReport report = new RoiReport();
        report.setTotalRevenue(totalRevenue);
        report.setRoiPercentage(totalRevenue / 1000);

        return roiReportRepository.save(report);
    }
}
