package za.co.portfolio.service;

import za.co.portfolio.domain.PersonalInfo;

import java.util.List;


public interface PersonalInfoService {
    void save(PersonalInfo personalInfo);
    List<PersonalInfo> get();
}
