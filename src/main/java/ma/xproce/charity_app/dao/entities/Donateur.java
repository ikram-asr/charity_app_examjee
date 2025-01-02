package ma.xproce.charity_app.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Donateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDonateur;
    private String nomDonateur;
    private String prenomDonateur;
    private String emailDonateur;
    private EvaluationDonateur evaluation;
    public enum EvaluationDonateur {
        DEBUTANT, DONATEUR_ACTIF,DONATEUR_FIDELE;
    }
    @OneToMany(mappedBy = "donateur", fetch = FetchType.EAGER)
    private List<Don> dons;

}
