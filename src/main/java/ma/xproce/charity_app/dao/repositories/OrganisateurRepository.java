package ma.xproce.charity_app.dao.repositories;

import ma.xproce.charity_app.dao.entities.Action;
import ma.xproce.charity_app.dao.entities.Organisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisateurRepository extends JpaRepository<Organisateur,Integer> {
}
