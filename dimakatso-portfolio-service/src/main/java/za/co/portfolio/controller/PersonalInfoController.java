package za.co.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.portfolio.domain.PersonalInfo;
import za.co.portfolio.service.PersonalInfoService;

import java.util.List;

@RestController
@RequestMapping("portfolio")
public class PersonalInfoController {

    @Autowired
    private PersonalInfoService personalInfoService;

    @GetMapping(value = "/personal-info", produces = "application/json")
    public List<PersonalInfo> getPersonalInfo() {
        return personalInfoService.get();
    }

}
