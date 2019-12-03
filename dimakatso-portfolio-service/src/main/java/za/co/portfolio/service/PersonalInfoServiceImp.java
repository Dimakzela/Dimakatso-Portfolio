package za.co.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.portfolio.domain.PersonalInfo;
import za.co.portfolio.dto.PersonalInfoDto;
import za.co.portfolio.dto.mapper.PersonalInfoMapper;
import za.co.portfolio.repo.PersonalInfoRepo;

@Service
public class PersonalInfoServiceImp implements PersonalInfoService {

    @Autowired
    private PersonalInfoRepo personalInfoRepo;
    @Autowired
    private PersonalInfoMapper mapper;

    @Override
    public void save(PersonalInfo personalInfo) {
        personalInfoRepo.save(personalInfo);
    }

    @Override
    public PersonalInfoDto getPersonalInfo() {
        return mapper.toDto(personalInfoRepo.findAll().get(0));
    }
}
