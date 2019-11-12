package za.co.portfolio.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@Table(name = "contact_details")
public class ContactDetails extends BaseEntity {

    @Column
    private String emailAddress;

    @Column
    private String CellNo;
}
