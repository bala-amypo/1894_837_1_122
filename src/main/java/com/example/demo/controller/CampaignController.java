//CampaignController.java
package com.example.demo.controller;

import com.example.demo.model.Campaign;
import com.example.demo.service.CampaignService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/campaigns")
public class CampaignController {

    private final CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @PostMapping
    public Campaign add(@RequestBody Campaign campaign) {
        return campaignService.save(campaign);
    }

    @GetMapping
    public List<Campaign> getAll() {
        return campaignService.getAll();
    }
}