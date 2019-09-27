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

import br.com.computex.apigestor.models.Usuario;
import br.com.computex.apigestor.models.UsuarioMenu;
import br.com.computex.apigestor.repository.UsuarioMenuRepository;

@RestController
@RequestMapping(value = "/api")
public class UsuarioMenuResource {

@Autowired
    private UsuarioMenuRepository usuarioMenuRepository;

@GetMapping("/usuariosmenus")
public List<UsuarioMenu> listaUsuariosmenus() {
return usuarioMenuRepository.findAll();
}

@GetMapping("/usuariomenu/{id}")
public UsuarioMenu listaUsuarioMenuUnico(@PathVariable(value="id") long id){
	return usuarioMenuRepository.findById(id);
}

@PostMapping("/usuariomenu")
public UsuarioMenu salvaUsuarioMenu(@RequestBody UsuarioMenu usuariomenu) {
return usuarioMenuRepository.save(usuariomenu);
}

@DeleteMapping("/usuariomenu")
public void deletaUsuarioMenu(@RequestBody UsuarioMenu usuariomenu) {
	usuarioMenuRepository.delete(usuariomenu);
}

@PutMapping("/usuariomenu")
public UsuarioMenu atualizaUsuarioMenu(@RequestBody UsuarioMenu usuariomenu) {
	return usuarioMenuRepository.save(usuariomenu);
}
}
