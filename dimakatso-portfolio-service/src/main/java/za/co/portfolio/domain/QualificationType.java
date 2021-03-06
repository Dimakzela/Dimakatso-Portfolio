package za.co.portfolio.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class QualificationType {

    @Id
    private long id;

    @Column
    private String name;
}
