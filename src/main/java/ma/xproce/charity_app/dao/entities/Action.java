package ma.xproce.charity_app.dao.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAction;
    private String titreAction;
    private String Description;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date dateCreation;
    private double montantAction;
    private EtatAction etat;
    public enum EtatAction {
        PREPARATION, OUVERTE, SUSPENDUE, TERMINEE;
    }
    @ManyToOne
    private Organisateur organisateur;
    @OneToMany(mappedBy = "action", fetch = FetchType.EAGER)
    private List<Don> dons;



}
