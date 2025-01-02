package ma.xproce.charity_app.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ActionDto {
    @Id
    private Integer idAction;
    private String titreAction;
    private String Description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateCreation;
    private double montantAction;
    private EtatAction etat;
    public enum EtatAction {
        PREPARATION, OUVERTE, SUSPENDUE, TERMINEE;
    }


    public void setIdAction(Integer idAction) {
        this.idAction = idAction;
    }

    public void setTitreAction(String titreAction) {
        this.titreAction = titreAction;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setMontantAction(double montantAction) {
        this.montantAction = montantAction;
    }

    public void setEtat(EtatAction etat) {
        this.etat = etat;
    }

    public Integer getIdAction() {
        return idAction;
    }

    public String getTitreAction() {
        return titreAction;
    }

    public String getDescription() {
        return Description;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public double getMontantAction() {
        return montantAction;
    }

    public EtatAction getEtat() {
        return etat;
    }
}
