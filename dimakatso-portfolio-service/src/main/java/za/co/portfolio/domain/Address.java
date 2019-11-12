package za.co.portfolio.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address extends BaseEntity {

    @Column
    private String town;

    @Column
    private String suburb;

    @Column
    private long areaCode;
}
