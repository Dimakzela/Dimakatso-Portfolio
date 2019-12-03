package za.co.portfolio.service;

import za.co.portfolio.domain.PersonalInfo;
import za.co.portfolio.dto.PersonalInfoDto;


public interface PersonalInfoService {
    void save(PersonalInfo personalInfo);

    PersonalInfoDto getPersonalInfo();
}
