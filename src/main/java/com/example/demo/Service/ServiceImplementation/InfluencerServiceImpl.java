package com.example.demo.Service.ServiceImplementation;

import com.example.demo.Service.InfluencerService;
import com.example.demo.model.Influencer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfluencerServiceImpl implements InfluencerService {

    @Override
    public Influencer createInfluencer(Influencer influencer) {
        return influencer;
    }

    @Override
    public Influencer getInfluencerById(Long id) {
        return new Influencer();
    }

    @Override
    public List<Influencer> getAllInfluencers() {
        return new ArrayList<>();
    }
}
