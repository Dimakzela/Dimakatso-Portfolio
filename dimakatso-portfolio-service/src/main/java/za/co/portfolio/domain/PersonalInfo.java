package za.co.portfolio.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@Table(name = "personal_info")
public class PersonalInfo extends BaseEntity {

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "contact_details", referencedColumnName = "id")
    private ContactDetails contactDetails;

    @OneToOne
    @JoinColumn(name = "address", referencedColumnName = "id")
    private Address address;

}
