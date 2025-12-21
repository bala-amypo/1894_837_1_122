package com.example.demo.service.impl;

import com.example.demo.entity.Influencer;
import com.example.demo.repository.InfluencerRepository;
import com.example.demo.service.InfluencerService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InfluencerServiceImpl implements InfluencerService {

    private final InfluencerRepository influencerRepository;

    public InfluencerServiceImpl(InfluencerRepository influencerRepository) {
        this.influencerRepository = influencerRepository;
    }

    @Override
    public Influencer save(Influencer influencer) {
        return influencerRepository.save(influencer);
    }

    @Override
    public List<Influencer> getAll() {
        return influencerRepository.findAll();
    }
}
