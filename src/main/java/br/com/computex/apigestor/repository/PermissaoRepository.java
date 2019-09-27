package br.com.computex.apigestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.apigestor.models.Permissao;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

	Permissao findById(long id);
}
