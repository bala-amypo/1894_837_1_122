package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Influencer;
import com.example.demo.repository.InfluencerRepository;
import com.example.demo.service.InfluencerService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InfluencerServiceImpl implements InfluencerService {

    private final InfluencerRepository repo;

    public InfluencerServiceImpl(InfluencerRepository repo) {
        this.repo = repo;
    }

    public Influencer createInfluencer(Influencer influencer) {
        repo.findBySocialHandle(influencer.getSocialHandle())
            .ifPresent(i -> { throw new RuntimeException("Duplicate social handle"); });
        return repo.save(influencer);
    }

    public List<Influencer> getAllInfluencers() {
        return repo.findAll();
    }

    public Influencer getInfluencerById(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Influencer not found"));
    }
}
