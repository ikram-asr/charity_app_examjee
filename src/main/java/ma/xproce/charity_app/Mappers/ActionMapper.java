package ma.xproce.charity_app.Mappers;

import ma.xproce.charity_app.dao.entities.Action;
import ma.xproce.charity_app.dto.ActionDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ActionMapper {
    ModelMapper mapper = new ModelMapper();


    public ActionDto fromActionToActionDto(Action reservation){
        return mapper.map(reservation, ActionDto.class);
    }

    public Action fromActionDtoToAction(ActionDto actionDto){
        return mapper.map(actionDto, Action.class);
    }

}
