package dev.votes.votes.repos;

import dev.votes.votes.domain.Election;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ElectionRepository extends JpaRepository<Election, Long> {
}
