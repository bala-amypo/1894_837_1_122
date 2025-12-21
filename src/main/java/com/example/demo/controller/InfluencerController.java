package com.example.demo.controller;

import com.example.demo.model.Influencer;
import com.example.demo.service.InfluencerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/influencers")
public class InfluencerController {

    private final InfluencerService influencerService;

    public InfluencerController(InfluencerService influencerService) {
        this.influencerService = influencerService;
    }

    @PostMapping
    public Influencer add(@RequestBody Influencer influencer) {
        return influencerService.save(influencer);
    }

    @GetMapping
    public List<Influencer> getAll() {
        return influencerService.getAll();
    }
}
