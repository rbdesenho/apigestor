package br.com.computex.apigestor.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.computex.apigestor.models.SituacaoConjugalPais;
import br.com.computex.apigestor.repository.SituacaoConjugalPaisRepository;

@RestController
@RequestMapping(value = "/api")
public class SituacaoConjugalPaisResource {

	@Autowired
	SituacaoConjugalPaisRepository situacaoConjugalPaisRepository;
	
	@GetMapping("/situacoesconjugaispais")
	public List<SituacaoConjugalPais> listaSituacaoConjugalPaises() {
		return situacaoConjugalPaisRepository.findAll();
	}
	
	@GetMapping("/situacaoconjugalpais/{id}")
	public SituacaoConjugalPais listaSituacaoConjugalPaisUnica(@PathVariable(value="id") long id){
		return situacaoConjugalPaisRepository.findById(id);
	}
	
	@PostMapping("/situacaoconjugalpais")
	public SituacaoConjugalPais salvaSituacaoConjugalPais(@RequestBody SituacaoConjugalPais situacaoConjugalPais) {
		return situacaoConjugalPaisRepository.save(situacaoConjugalPais);
	}
	
	@DeleteMapping("/situacaoconjugalpais")
	public void deletaSituacaoConjugalPais(@RequestBody SituacaoConjugalPais situacaoConjugalPais) {
		situacaoConjugalPaisRepository.delete(situacaoConjugalPais);
	}
	
	@PutMapping("/situacaoconjugalpais")
	public SituacaoConjugalPais atualizaSituacaoConjugalPais(@RequestBody SituacaoConjugalPais situacaoConjugalPais) {
		return situacaoConjugalPaisRepository.save(situacaoConjugalPais);
	}
}
