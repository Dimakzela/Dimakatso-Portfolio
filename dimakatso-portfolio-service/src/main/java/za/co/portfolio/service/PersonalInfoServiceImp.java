package za.co.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.portfolio.domain.PersonalInfo;
import za.co.portfolio.repo.PersonalInfoRepo;

import java.util.List;

@Service
public class PersonalInfoServiceImp implements PersonalInfoService {

    @Autowired
    private PersonalInfoRepo personalInfoRepo;

    @Override
    public void save(PersonalInfo personalInfo) {
        personalInfoRepo.save(personalInfo);
    }

    @Override
    public List<PersonalInfo> get() {
        return personalInfoRepo.findAll();
    }
}
