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

import br.com.computex.apigestor.models.Operadora;
import br.com.computex.apigestor.repository.OperadoraRepository;

@RestController
@RequestMapping(value = "/api")
public class OperadoraResource {

	@Autowired
	OperadoraRepository operadoraRepository;
	
	@GetMapping("/operadoras")
	public List<Operadora> listaOperadoraes() {
		return operadoraRepository.findAll();
	}
	
	@GetMapping("/operadora/{id}")
	public Operadora listaOperadoraUnica(@PathVariable(value="id") long id){
		return operadoraRepository.findById(id);
	}
	
	@PostMapping("/operadora")
	public Operadora salvaOperadora(@RequestBody Operadora operadora) {
		return operadoraRepository.save(operadora);
	}
	
	@DeleteMapping("/operadora")
	public void deletaOperadora(@RequestBody Operadora operadora) {
		operadoraRepository.delete(operadora);
	}
	
	@PutMapping("/operadora")
	public Operadora atualizaOperadora(@RequestBody Operadora operadora) {
		return operadoraRepository.save(operadora);
	}
}
