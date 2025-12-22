package com.example.demo.Service.ServiceImplementation;

import com.example.demo.Service.CampaignService;
import com.example.demo.model.Campaign;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CampaignServiceImpl implements CampaignService {

    @Override
    public Campaign createCampaign(Campaign campaign) {
        return campaign;
    }

    @Override
    public Campaign getCampaignById(Long id) {
        return new Campaign();
    }

    @Override
    public List<Campaign> getAllCampaigns() {
        return new ArrayList<>();
    }
}
