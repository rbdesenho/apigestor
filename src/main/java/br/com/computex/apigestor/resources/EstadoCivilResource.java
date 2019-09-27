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

import br.com.computex.apigestor.models.EstadoCivil;
import br.com.computex.apigestor.repository.EstadoCivilRepository;

@RestController
@RequestMapping(value = "/api")
public class EstadoCivilResource {

	@Autowired
	EstadoCivilRepository estadoCivilRepository;
	
	@GetMapping("/estadoscivis")
	public List<EstadoCivil> listaEstadoCiviles() {
		return estadoCivilRepository.findAll();
	}
	
	@GetMapping("/estadocivil/{id}")
	public EstadoCivil listaEstadoCivilUnico(@PathVariable(value="id") long id){
		return estadoCivilRepository.findById(id);
	}
	
	@PostMapping("/estadocivil")
	public EstadoCivil salvaEstadoCivil(@RequestBody EstadoCivil estadoCivil) {
		return estadoCivilRepository.save(estadoCivil);
	}
	
	@DeleteMapping("/estadocivil")
	public void deletaEstadoCivil(@RequestBody EstadoCivil estadoCivil) {
		estadoCivilRepository.delete(estadoCivil);
	}
	
	@PutMapping("/estadocivil")
	public EstadoCivil atualizaEstadoCivil(@RequestBody EstadoCivil estadoCivil) {
		return estadoCivilRepository.save(estadoCivil);
	}
}
