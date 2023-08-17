package dev.votes.votes.repos;

import dev.votes.votes.domain.VotingTable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VotingTableRepository extends JpaRepository<VotingTable, Long> {
}
