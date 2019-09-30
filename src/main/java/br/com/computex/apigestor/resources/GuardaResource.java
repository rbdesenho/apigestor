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

import br.com.computex.apigestor.models.Guarda;
import br.com.computex.apigestor.repository.GuardaRepository;

@RestController
@RequestMapping(value = "/api")
public class GuardaResource {

	@Autowired
	GuardaRepository guardaRepository;
	
	@GetMapping("/guardas")
	public List<Guarda> listaGuardaes() {
		return guardaRepository.findAll();
	}
	
	@GetMapping("/guarda/{id}")
	public Guarda listaGuardaUnica(@PathVariable(value="id") long id){
		return guardaRepository.findById(id);
	}
	
	@PostMapping("/guarda")
	public Guarda salvaGuarda(@RequestBody Guarda guarda) {
		return guardaRepository.save(guarda);
	}
	
	@DeleteMapping("/guarda")
	public void deletaGuarda(@RequestBody Guarda guarda) {
		guardaRepository.delete(guarda);
	}
	
	@PutMapping("/guarda")
	public Guarda atualizaGuarda(@RequestBody Guarda guarda) {
		return guardaRepository.save(guarda);
	}
}
