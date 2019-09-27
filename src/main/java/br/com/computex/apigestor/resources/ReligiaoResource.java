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

import br.com.computex.apigestor.models.Religiao;
import br.com.computex.apigestor.repository.ReligiaoRepository;

@RestController
@RequestMapping(value = "/api")
public class ReligiaoResource {

	@Autowired
	ReligiaoRepository religiaoRepository;
	
	@GetMapping("/religioes")
	public List<Religiao> listaReligiaoes() {
		return religiaoRepository.findAll();
	}
	
	@GetMapping("/religiao/{id}")
	public Religiao listaReligiaoUnica(@PathVariable(value="id") long id){
		return religiaoRepository.findById(id);
	}
	
	@PostMapping("/religiao")
	public Religiao salvaReligiao(@RequestBody Religiao religiao) {
		return religiaoRepository.save(religiao);
	}
	
	@DeleteMapping("/religiao")
	public void deletaReligiao(@RequestBody Religiao religiao) {
		religiaoRepository.delete(religiao);
	}
	
	@PutMapping("/religiao")
	public Religiao atualizaReligiao(@RequestBody Religiao religiao) {
		return religiaoRepository.save(religiao);
	}
}
