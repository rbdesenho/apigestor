package br.com.computex.apigestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.computex.apigestor.models.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
	
	Menu findById(long id);

}
