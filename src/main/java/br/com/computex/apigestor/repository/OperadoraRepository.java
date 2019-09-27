package br.com.computex.apigestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.apigestor.models.Operadora;

@Repository
public interface OperadoraRepository extends JpaRepository<Operadora, Long> {

	Operadora findById(long id);
}
