package za.co.portfolio.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@Table(name = "contact_details")
public class ContactDetails extends BaseEntity {

    @Column
    private String CellNo;

    @Column
    private String emailAddress;

    @Override
    public String toString() {
        return "Cell: " + CellNo + ", EmailAddress: " + emailAddress;
    }
}
