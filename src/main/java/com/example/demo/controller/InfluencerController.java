package com.example.demo.controller;

import com.example.demo.Service.InfluencerService;
import com.example.demo.model.Influencer;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Influencer> create(@RequestBody Influencer influencer) {
        return ResponseEntity.ok(influencerService.createInfluencer(influencer));
    }

    @GetMapping
    public ResponseEntity<List<Influencer>> getAll() {
        return ResponseEntity.ok(influencerService.getAllInfluencers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Influencer> getById(@PathVariable Long id) {
        return ResponseEntity.ok(influencerService.getInfluencerById(id));
    }
}
