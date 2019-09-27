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

import br.com.computex.apigestor.models.RacaCor;
import br.com.computex.apigestor.repository.RacaCorRepository;

@RestController
@RequestMapping(value = "/api")
public class RacaCorResource {

	@Autowired
	RacaCorRepository racaCorRepository;
	
	@GetMapping("/racascores")
	public List<RacaCor> listaRacaCores() {
		return racaCorRepository.findAll();
	}
	
	@GetMapping("/racacor/{id}")
	public RacaCor listaRacaCorUnica(@PathVariable(value="id") long id){
		return racaCorRepository.findById(id);
	}
	
	@PostMapping("/racacor")
	public RacaCor salvaRacaCor(@RequestBody RacaCor racaCor) {
		return racaCorRepository.save(racaCor);
	}
	
	@DeleteMapping("/racacor")
	public void deletaRacaCor(@RequestBody RacaCor racaCor) {
		racaCorRepository.delete(racaCor);
	}
	
	@PutMapping("/racacor")
	public RacaCor atualizaRacaCor(@RequestBody RacaCor racaCor) {
		return racaCorRepository.save(racaCor);
	}
}
