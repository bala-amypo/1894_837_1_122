//InfluencerService
package com.example.demo.service;

import com.example.demo.model.Influencer;
import java.util.List;

public interface InfluencerService {
    Influencer save(Influencer influencer);
    List<Influencer> getAll();
}