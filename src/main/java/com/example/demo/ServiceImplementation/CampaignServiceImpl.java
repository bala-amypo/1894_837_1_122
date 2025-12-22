import com.example.demo.service.impl;

@Service
public class CampaignServiceImpl implements CampaignService {
    public Campaign updateCampaign(Long id, Campaign c){ return c; }
    public Campaign getCampaignById(Long id){ return new Campaign(); }
    public List<Campaign> getAllCampaigns(){ return new ArrayList<>(); }
}
