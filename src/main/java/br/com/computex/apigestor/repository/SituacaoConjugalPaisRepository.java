package br.com.computex.apigestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.apigestor.models.SituacaoConjugalPais;

@Repository
public interface SituacaoConjugalPaisRepository extends JpaRepository<SituacaoConjugalPais, Long> {

	SituacaoConjugalPais findById(long id);
}
