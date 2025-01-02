package ma.xproce.charity_app.dao.repositories;

import ma.xproce.charity_app.dao.entities.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Action,Integer> {
}
