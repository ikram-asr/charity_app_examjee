package ma.xproce.charity_app.Service;

import lombok.AllArgsConstructor;
import ma.xproce.charity_app.Mappers.ActionMapper;
import ma.xproce.charity_app.dao.entities.Action;
import ma.xproce.charity_app.dao.repositories.ActionRepository;
import ma.xproce.charity_app.dto.ActionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class IactionServiceImpl implements IActionService {
    @Autowired
    ActionRepository actionRepository;
    @Autowired
    ActionMapper actionMapper ;
    @Override
    public Action enregistrerAction(ActionDto actionDto) {
        Action reservation = actionMapper.fromActionDtoToAction(actionDto);
        return actionRepository.save(
                reservation);
    }
    @Override
    public List<ActionDto> donsParAction(Integer idEmploye) {
        return  actionRepository.findById(idEmploye)
                .stream()
                .map(actionMapper::fromActionToActionDto)
                .collect(Collectors.toList()); }
}
