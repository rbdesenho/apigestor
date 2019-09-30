package br.com.computex.apigestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.apigestor.models.Guarda;

@Repository
public interface GuardaRepository extends JpaRepository<Guarda, Long> {

	Guarda findById(long id);
}
