package br.com.computex.apigestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.apigestor.models.RacaCor;

@Repository
public interface RacaCorRepository extends JpaRepository<RacaCor, Long> {

	RacaCor findById(long id);
}
