package br.com.computex.apigestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.apigestor.models.TipoTelefone;

@Repository
public interface TipoTelefoneRepository extends JpaRepository<TipoTelefone, Long> {

	TipoTelefone findById(long id);
}
