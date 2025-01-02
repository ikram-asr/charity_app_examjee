package ma.xproce.charity_app.dto;
import jakarta.persistence.*;
import lombok.*;
import ma.xproce.charity_app.dao.entities.Don;
import ma.xproce.charity_app.dao.entities.Donateur;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DonateurDto {
    @Id
    private Integer idDonateur;
    private String nomDonateur;
    private String prenomDonateur;
    private String emailDonateur;
    private Donateur.EvaluationDonateur evaluation;
    public enum EvaluationDonateur {
        DEBUTANT, DONATEUR_ACTIF,DONATEUR_FIDELE;
    }
}
