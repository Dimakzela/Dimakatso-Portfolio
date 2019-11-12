package za.co.portfolio.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.portfolio.domain.PersonalInfo;

@Repository
public interface PersonalInfoRepo extends JpaRepository<PersonalInfo, Long> {
}
