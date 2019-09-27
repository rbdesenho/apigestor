package br.com.computex.apigestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.apigestor.models.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long> {

	Setor findById(long id);
}
