package ma.xproce.charity_app.dto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DonDto {
    @Id
    private Integer idDon;
    private String titreDon;
    private String montantDon;
    private TypeDon typeDon;
    public enum TypeDon {
        ARGENT, BIEN;
    }
}
