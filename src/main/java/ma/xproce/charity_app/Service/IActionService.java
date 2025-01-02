package ma.xproce.charity_app.Service;

import ma.xproce.charity_app.dao.entities.Action;
import ma.xproce.charity_app.dto.ActionDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IActionService {
    public Action enregistrerAction(ActionDto reservationDto);
    public List<ActionDto> donsParAction(Integer idAction);
}
