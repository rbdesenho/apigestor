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

import br.com.computex.apigestor.models.Permissao;
import br.com.computex.apigestor.repository.PermissaoRepository;

@RestController
@RequestMapping(value = "/api")
public class PermissaoResource {

	@Autowired
	PermissaoRepository permissaoRepository;
	
	@GetMapping("/permissoes")
	public List<Permissao> listaPermissoes() {
		return permissaoRepository.findAll();
	}
	
	@GetMapping("/permissao/{id}")
	public Permissao listaPermissaoUnica(@PathVariable(value="id") long id){
		return permissaoRepository.findById(id);
	}
	
	@PostMapping("/permissao")
	public Permissao salvaPermissao(@RequestBody Permissao permissao) {
		return permissaoRepository.save(permissao);
	}
	
	@DeleteMapping("/permissao")
	public void deletaPermissao(@RequestBody Permissao permissao) {
		permissaoRepository.delete(permissao);
	}
	
	@PutMapping("/permissao")
	public Permissao atualizaPermissao(@RequestBody Permissao permissao) {
		return permissaoRepository.save(permissao);
	}
}
