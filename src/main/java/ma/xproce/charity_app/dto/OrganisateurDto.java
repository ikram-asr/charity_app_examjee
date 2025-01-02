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
public class OrganisateurDto {
    @Id
    private Integer idOrganisateur;
    private String nomOrganisateur;
    private String emailOrganisateur;
}
