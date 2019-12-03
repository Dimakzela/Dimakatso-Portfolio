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

    @Override
    public String toString() {
        return suburb + ", " + town + ", " + areaCode;
    }
}
