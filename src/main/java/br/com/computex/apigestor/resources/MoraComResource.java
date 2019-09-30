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

import br.com.computex.apigestor.models.MoraCom;
import br.com.computex.apigestor.repository.MoraComRepository;

@RestController
@RequestMapping(value = "/api")
public class MoraComResource {

	@Autowired
	MoraComRepository moraComRepository;
	
	@GetMapping("/morascons")
	public List<MoraCom> listaMorasCons() {
		return moraComRepository.findAll();
	}
	
	@GetMapping("/moracom/{id}")
	public MoraCom listaMoraComUnico(@PathVariable(value="id") long id){
		return moraComRepository.findById(id);
	}
	
	@PostMapping("/moracom")
	public MoraCom salvaMoraCom(@RequestBody MoraCom moraCom) {
		return moraComRepository.save(moraCom);
	}
	
	@DeleteMapping("/moracom")
	public void deletaMoraCom(@RequestBody MoraCom moraCom) {
		moraComRepository.delete(moraCom);
	}
	
	@PutMapping("/moracom")
	public MoraCom atualizaMoraCom(@RequestBody MoraCom moraCom) {
		return moraComRepository.save(moraCom);
	}
}
