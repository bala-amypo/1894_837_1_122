@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoiReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double totalRevenue;
    private double roiPercentage;
}
