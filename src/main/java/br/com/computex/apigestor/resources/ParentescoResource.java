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

import br.com.computex.apigestor.models.Parentesco;
import br.com.computex.apigestor.repository.ParentescoRepository;

@RestController
@RequestMapping(value = "/api")
public class ParentescoResource {

	@Autowired
	ParentescoRepository parentescoRepository;
	
	@GetMapping("/parentescos")
	public List<Parentesco> listaParentescoes() {
		return parentescoRepository.findAll();
	}
	
	@GetMapping("/parentesco/{id}")
	public Parentesco listaParentescoUnico(@PathVariable(value="id") long id){
		return parentescoRepository.findById(id);
	}
	
	@PostMapping("/parentesco")
	public Parentesco salvaParentesco(@RequestBody Parentesco parentesco) {
		return parentescoRepository.save(parentesco);
	}
	
	@DeleteMapping("/parentesco")
	public void deletaParentesco(@RequestBody Parentesco parentesco) {
		parentescoRepository.delete(parentesco);
	}
	
	@PutMapping("/parentesco")
	public Parentesco atualizaParentesco(@RequestBody Parentesco parentesco) {
		return parentescoRepository.save(parentesco);
	}
}
