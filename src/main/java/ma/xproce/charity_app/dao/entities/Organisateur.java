package ma.xproce.charity_app.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Organisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrganisateur;
    private String nomOrganisateur;
    private String emailOrganisateur;
    @OneToMany(mappedBy = "organisateur", fetch = FetchType.EAGER)
    private List<Action> actions;

}
