package za.co.portfolio.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Qualification {

    @Id
    private long id;

    @Column
    private String name;

    @Column
    private Date startDate;

    @Column
    private Date graduationDate;

    @Column
    private boolean completed;

}
