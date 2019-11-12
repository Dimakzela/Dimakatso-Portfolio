package za.co.portfolio.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class WorkExperience {

    @Id
    private long id;

    @Column
    private String title;

    @Column
    private String jobDescription;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

}
