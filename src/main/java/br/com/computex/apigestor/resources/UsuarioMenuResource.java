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

import br.com.computex.menu.apirestmenu.models.Usuario;
import br.com.computex.menu.apirestmenu.models.UsuarioMenu;
import br.com.computex.menu.apirestmenu.repository.UsuarioMenuRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
public class UsuarioMenuResource {

@Autowired
    private UsuarioMenuRepository usuarioMenuRepository;

@ApiOperation(value="Retorna uma lista usuariomenu")
@GetMapping("/usuariosmenus")
public List<UsuarioMenu> listaUsuariosmenus() {
return usuarioMenuRepository.findAll();
}

@ApiOperation(value="Retorna um usuariomenu único")
@GetMapping("/usuariomenu/{id}")
public UsuarioMenu listaUsuarioMenuUnico(@PathVariable(value="id") long id){
	return usuarioMenuRepository.findById(id);
}

@ApiOperation(value="Salva um usuáriomenu")
@PostMapping("/usuariomenu")
public UsuarioMenu salvaUsuarioMenu(@RequestBody UsuarioMenu usuariomenu) {
return usuarioMenuRepository.save(usuariomenu);
}

@ApiOperation(value="Deleta um usuariomenu")
@DeleteMapping("/usuariomenu")
public void deletaUsuarioMenu(@RequestBody UsuarioMenu usuariomenu) {
	usuarioMenuRepository.delete(usuariomenu);
}

@ApiOperation(value="Atualiza um usuariomenu")
@PutMapping("/usuariomenu")
public UsuarioMenu atualizaUsuarioMenu(@RequestBody UsuarioMenu usuariomenu) {
	return usuarioMenuRepository.save(usuariomenu);
}
}
