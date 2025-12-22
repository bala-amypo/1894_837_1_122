package com.example.demo.Service;

import com.example.demo.model.Campaign;
import java.util.List;

public interface CampaignService {

    Campaign createCampaign(Campaign campaign);

    Campaign getCampaignById(Long id);

    List<Campaign> getAllCampaigns();
}
