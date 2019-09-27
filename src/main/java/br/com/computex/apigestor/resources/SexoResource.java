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

import br.com.computex.apigestor.models.Sexo;
import br.com.computex.apigestor.repository.SexoRepository;

@RestController
@RequestMapping(value = "/api")
public class SexoResource {

	@Autowired
	SexoRepository sexoRepository;
	
	@GetMapping("/sexos")
	public List<Sexo> listaSexos() {
		return sexoRepository.findAll();
	}
	
	@GetMapping("/sexo/{id}")
	public Sexo listaSexoUnico(@PathVariable(value="id") long id){
		return sexoRepository.findById(id);
	}
	
	@PostMapping("/sexo")
	public Sexo salvaSexo(@RequestBody Sexo sexo) {
		return sexoRepository.save(sexo);
	}
	
	@DeleteMapping("/sexo")
	public void deletaSexo(@RequestBody Sexo sexo) {
		sexoRepository.delete(sexo);
	}
	
	@PutMapping("/sexo")
	public Sexo atualizaSexo(@RequestBody Sexo sexo) {
		return sexoRepository.save(sexo);
	}
}
