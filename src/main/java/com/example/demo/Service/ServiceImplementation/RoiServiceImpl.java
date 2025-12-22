package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.DiscountCode;
import com.example.demo.model.RoiReport;
import com.example.demo.model.SaleTransaction;
import com.example.demo.repository.DiscountCodeRepository;
import com.example.demo.repository.RoiReportRepository;
import com.example.demo.repository.SaleTransactionRepository;
import com.example.demo.service.RoiService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RoiServiceImpl implements RoiService {

    private final RoiReportRepository roiReportRepository;
    private final SaleTransactionRepository saleTransactionRepository;
    private final DiscountCodeRepository discountCodeRepository;

    public RoiServiceImpl(RoiReportRepository roiReportRepository, SaleTransactionRepository saleTransactionRepository, DiscountCodeRepository discountCodeRepository) {
        this.roiReportRepository = roiReportRepository;
        this.saleTransactionRepository = saleTransactionRepository;
        this.discountCodeRepository = discountCodeRepository;
    }

    @Override
    public RoiReport generateReportForCode(Long discountCodeId) {
        DiscountCode discountCode = discountCodeRepository.findById(discountCodeId)
                .orElseThrow(() -> new ResourceNotFoundException("Discount code not found"));
        List<SaleTransaction> sales = saleTransactionRepository.findByDiscountCodeId(discountCodeId);
        BigDecimal totalSales = sales.stream()
                .map(SaleTransaction::getTransactionAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        int totalTransactions = sales.size();
        // Example ROI calculation: assume simple formula, e.g., (totalSales * discountPercentage / 100)
        double roiPercentage = totalSales.doubleValue() * (discountCode.getDiscountPercentage() / 100);
        RoiReport report = new RoiReport(discountCode, totalSales, totalTransactions, roiPercentage);
        return roiReportRepository.save(report);
    }

    @Override
    public RoiReport getReportById(Long reportId) {
        return roiReportRepository.findById(reportId)
                .orElseThrow(() -> new ResourceNotFoundException("ROI report not found"));
    }

    @Override
    public List<RoiReport> getReportsForInfluencer(Long influencerId) {
        return roiReportRepository.findByDiscountCodeInfluencerId(influencerId);
    }
}