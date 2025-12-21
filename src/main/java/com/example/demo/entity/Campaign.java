package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "campaigns")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String campaignName;
    private LocalDate startDate;
    private LocalDate endDate;

    @OneToMany(mappedBy = "campaign")
    private List<DiscountCode> discountCodes;

    public Campaign() {}

    public Campaign(String campaignName, LocalDate startDate, LocalDate endDate) {
        this.campaignName = campaignName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
