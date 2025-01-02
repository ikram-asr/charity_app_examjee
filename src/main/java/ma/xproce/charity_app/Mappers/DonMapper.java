package ma.xproce.charity_app.Mappers;

import ma.xproce.charity_app.dao.entities.Don;
import ma.xproce.charity_app.dto.DonDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DonMapper {
    ModelMapper mapper = new ModelMapper();


    public DonDto fromDonToDonDto(Don don){
        return mapper.map(don, DonDto.class);
    }
    public Don fromDonDtoToDon(DonDto donDto){

        return mapper.map(donDto, Don.class);
    }
}
