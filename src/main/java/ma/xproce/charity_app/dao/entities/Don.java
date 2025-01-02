package ma.xproce.charity_app.dao.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Don {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDon;
    private String titreDon;
    private String montantDon;
    private TypeDon typeDon;
    public enum TypeDon {
        ARGENT, BIEN;
    }
    @ManyToOne
    private Action action;
    @ManyToOne
    private Donateur donateur;


}
