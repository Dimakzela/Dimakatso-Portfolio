package za.co.portfolio.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(generator = "native", strategy = GenerationType.IDENTITY)
    private long id;
}
