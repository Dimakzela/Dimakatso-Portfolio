package za.co.portfolio.dto.mapper;

import org.springframework.stereotype.Component;
import za.co.portfolio.domain.PersonalInfo;
import za.co.portfolio.dto.PersonalInfoDto;

@Component
public class PersonalInfoMapper {

    public PersonalInfoDto toDto(PersonalInfo personalInfo) {
        PersonalInfoDto dto = new PersonalInfoDto();
        dto.setId(personalInfo.getId());
        dto.setFirstName(personalInfo.getFirstName());
        dto.setLastName(personalInfo.getLastName());
        dto.setContactDetails(personalInfo.getContactDetails().toString());
        dto.setAddress(personalInfo.getAddress().toString());
        return dto;
    }
}
