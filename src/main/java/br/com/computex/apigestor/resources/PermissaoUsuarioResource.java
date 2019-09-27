package br.com.computex.apigestor.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.computex.apigestor.models.PermissaoUsuario;
import br.com.computex.apigestor.repository.PermissaoUsuarioRepository;

@RestController
@RequestMapping(value = "/api")
public class PermissaoUsuarioResource {

	@Autowired
    private PermissaoUsuarioRepository permissaoUsuarioRepository;
	
	@GetMapping("/permissoesusuarios")
	public List<PermissaoUsuario> listaPermissoesUsuarios() {
		return permissaoUsuarioRepository.findAll();
	}
	
	@PostMapping("/permissaousuario")
	public PermissaoUsuario salvaPermissaoUsuario(@RequestBody PermissaoUsuario permissaoUsuario) {
		return permissaoUsuarioRepository.save(permissaoUsuario);
	}
	
	@DeleteMapping("/permissaousuario")
	public void deletaPermissaoUsuario(@RequestBody PermissaoUsuario permissaoUsuario) {
		permissaoUsuarioRepository.delete(permissaoUsuario);
	}
	
	@PutMapping("/permissaousuario")
	public PermissaoUsuario atualizaPermissaoUsuario(@RequestBody PermissaoUsuario permissaoUsuario) {
		return permissaoUsuarioRepository.save(permissaoUsuario);
	}
}
