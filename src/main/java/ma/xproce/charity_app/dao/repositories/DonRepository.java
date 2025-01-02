package ma.xproce.charity_app.dao.repositories;

import ma.xproce.charity_app.dao.entities.Action;
import ma.xproce.charity_app.dao.entities.Don;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonRepository extends JpaRepository<Don,Integer> {
}
