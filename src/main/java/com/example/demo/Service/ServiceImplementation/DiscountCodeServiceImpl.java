import com.example.demo.service.impl;

@Service
public class DiscountCodeServiceImpl implements DiscountCodeService {
    public DiscountCode getDiscountCodeById(Long id){ return new DiscountCode(); }
    public DiscountCode updateDiscountCode(Long id, DiscountCode c){ return c; }
    public List<DiscountCode> getCodesForInfluencer(Long id){ return new ArrayList<>(); }
    public List<DiscountCode> getCodesForCampaign(Long id){ return new ArrayList<>(); }
}
