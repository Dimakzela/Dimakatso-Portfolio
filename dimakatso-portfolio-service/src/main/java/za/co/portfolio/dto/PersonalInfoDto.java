package za.co.portfolio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonalInfoDto {
    private long id;
    private String firstName;
    private String lastName;
    private String contactDetails;
    private String address;
}
