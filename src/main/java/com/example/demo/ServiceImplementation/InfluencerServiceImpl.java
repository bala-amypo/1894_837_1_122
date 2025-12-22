import com.example.demo.service.impl;

@Service
public class InfluencerServiceImpl implements InfluencerService {
    public Influencer createInfluencer(Influencer i){ return i; }
    public List<Influencer> getAllInfluencers(){ return new ArrayList<>(); }
    public Influencer getInfluencerById(Long id){ return new Influencer(); }
}
