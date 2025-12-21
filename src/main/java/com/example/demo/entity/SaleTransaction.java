@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaleTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double saleAmount;
}
