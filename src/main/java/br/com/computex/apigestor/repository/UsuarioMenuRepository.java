package br.com.computex.apigestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.apigestor.models.UsuarioMenu;

@Repository
public interface UsuarioMenuRepository extends JpaRepository<UsuarioMenu, Long> {

	UsuarioMenu findById(long id);
	
}
