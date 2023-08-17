package dev.votes.votes.repos;

import dev.votes.votes.domain.PoliticalParty;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PoliticalPartyRepository extends JpaRepository<PoliticalParty, Long> {
}
