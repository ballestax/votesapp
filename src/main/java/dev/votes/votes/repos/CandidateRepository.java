package dev.votes.votes.repos;

import dev.votes.votes.domain.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
