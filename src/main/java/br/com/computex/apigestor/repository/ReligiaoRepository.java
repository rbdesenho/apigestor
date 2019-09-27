package br.com.computex.apigestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.apigestor.models.Religiao;

@Repository
public interface ReligiaoRepository extends JpaRepository<Religiao, Long> {

	Religiao findById(long id);
}
