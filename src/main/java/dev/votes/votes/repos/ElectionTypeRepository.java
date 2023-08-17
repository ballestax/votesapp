package dev.votes.votes.repos;

import dev.votes.votes.domain.ElectionType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ElectionTypeRepository extends JpaRepository<ElectionType, Long> {
}
