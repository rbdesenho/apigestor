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

import br.com.computex.apigestor.models.Setor;
import br.com.computex.apigestor.repository.SetorRepository;

@RestController
@RequestMapping(value = "/api")
public class SetorResource {

	@Autowired
	SetorRepository setorRepository;
	
	@GetMapping("/setores")
	public List<Setor> listaSetores() {
		return setorRepository.findAll();
	}
	
	@GetMapping("/setor/{id}")
	public Setor listaSetorUnico(@PathVariable(value="id") long id){
		return setorRepository.findById(id);
	}
	
	@PostMapping("/setor")
	public Setor salvaSetor(@RequestBody Setor setor) {
		return setorRepository.save(setor);
	}
	
	@DeleteMapping("/setor")
	public void deletaSetor(@RequestBody Setor setor) {
		setorRepository.delete(setor);
	}
	
	@PutMapping("/setor")
	public Setor atualizaSetor(@RequestBody Setor setor) {
		return setorRepository.save(setor);
	}
}
