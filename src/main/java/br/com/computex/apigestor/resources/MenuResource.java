package br.com.computex.apigestor.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;


// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import br.com.computex.apigestor.models.Menu;

import br.com.computex.apigestor.repository.MenuRepository;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*")

public class MenuResource {
	
	@Autowired
	MenuRepository menuRepository;
	
	@GetMapping("/menus")
	public List<Menu> listaMenus() {
		return menuRepository.findAll();
	}
	
	@GetMapping("/menu/{id}")
	public Menu listaMenuUnico(@PathVariable(value="id") long id){
		return menuRepository.findById(id);
	}
	
	@PostMapping("/menu")
	public Menu salvaMenu(@RequestBody Menu menu) {
		return menuRepository.save(menu);
	}
	
	@DeleteMapping("/menu")
	public void deletaMenu(@RequestBody Menu menu) {
		menuRepository.delete(menu);
	}
	
	@PutMapping("/menu")
	public Menu atualizaMenu(@RequestBody Menu menu) {
		return menuRepository.save(menu);
	}

}
