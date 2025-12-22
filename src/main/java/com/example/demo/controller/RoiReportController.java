package com.example.demo.controller;

import com.example.demo.model.RoiReport;
import com.example.demo.service.RoiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roi")
public class RoiReportController {

    private final RoiService roiService;

    public RoiReportController(RoiService roiService) {
        this.roiService = roiService;
    }

    @PostMapping("/code/{discountCodeId}")
    public ResponseEntity<RoiReport> generateReportForCode(@PathVariable Long discountCodeId) {
        return ResponseEntity.ok(roiService.generateReportForCode(discountCodeId));
    }

    @GetMapping("/{reportId}")
    public ResponseEntity<RoiReport> getReport(@PathVariable Long reportId) {
        return ResponseEntity.ok(roiService.getReportById(reportId));
    }

    @GetMapping("/influencer/{influencerId}")
    public ResponseEntity<List<RoiReport>> getReportsForInfluencer(@PathVariable Long influencerId) {
        return ResponseEntity.ok(roiService.getReportsForInfluencer(influencerId));
    }
}