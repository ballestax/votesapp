package dev.votes.votes.repos;

import dev.votes.votes.domain.VotingLocation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VotingLocationRepository extends JpaRepository<VotingLocation, Long> {
}
