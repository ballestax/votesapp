package dev.votes.votes.repos;

import dev.votes.votes.domain.Municipality;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MunicipalityRepository extends JpaRepository<Municipality, Long> {
}
