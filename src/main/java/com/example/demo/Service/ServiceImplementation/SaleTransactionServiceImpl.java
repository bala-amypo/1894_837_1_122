import com.example.demo.service.impl;


@Service
public class SaleTransactionServiceImpl implements SaleTransactionService {
    public SaleTransaction createSale(SaleTransaction tx){ return tx; }
    public List<SaleTransaction> getSalesForCode(Long id){ return new ArrayList<>(); }
    public List<SaleTransaction> getSalesForInfluencer(Long id){ return new ArrayList<>(); }
    public List<SaleTransaction> getSalesForCampaign(Long id){ return new ArrayList<>(); }
}
