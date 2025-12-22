package com.example.demo.Service;

import com.example.demo.model.Influencer;
import java.util.List;

public interface SaleTransactionService {
    Influencer createInfluencer(Influencer influencer);
    Influencer getInfluencerById(Long id);
    List<Influencer> getAllInfluencers();
}
