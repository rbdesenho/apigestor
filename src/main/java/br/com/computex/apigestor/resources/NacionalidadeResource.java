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

import br.com.computex.apigestor.models.Nacionalidade;
import br.com.computex.apigestor.repository.NacionalidadeRepository;

@RestController
@RequestMapping(value = "/api")
public class NacionalidadeResource {

	@Autowired
	NacionalidadeRepository nacionalidadeRepository;
	
	@GetMapping("/nacionalidades")
	public List<Nacionalidade> listaNacionalidades() {
		return nacionalidadeRepository.findAll();
	}
	
	@GetMapping("/nacionalidade/{id}")
	public Nacionalidade listaNacionalidadeUnica(@PathVariable(value="id") long id){
		return nacionalidadeRepository.findById(id);
	}
	
	@PostMapping("/nacionalidade")
	public Nacionalidade salvaNacionalidade(@RequestBody Nacionalidade nacionalidade) {
		return nacionalidadeRepository.save(nacionalidade);
	}
	
	@DeleteMapping("/nacionalidade")
	public void deletaNacionalidade(@RequestBody Nacionalidade nacionalidade) {
		nacionalidadeRepository.delete(nacionalidade);
	}
	
	@PutMapping("/nacionalidade")
	public Nacionalidade atualizaNacionalidade(@RequestBody Nacionalidade nacionalidade) {
		return nacionalidadeRepository.save(nacionalidade);
	}
}
