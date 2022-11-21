package br.edu.infnet.mesocorre.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.mesocorre.usuario.model.domain.Usuario;
import br.edu.infnet.mesocorre.usuario.model.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping(value = "/")
	public List<Usuario> Listar() {
		
		List<Usuario> usuarios = (List<Usuario>) service.GetCollection();
		
		return usuarios;
	}
	
	@PostMapping(value = "/validar")
	public Usuario Validar(@RequestBody String email) {
		
		Usuario usuario = service.Validar(email);
		
		return usuario;
	}
	
	@DeleteMapping(value = "/{id}")
	public void Excluir(@PathVariable Integer id )
	{
		service.ExcluirUm(id);
		return ;
	}


	@PostMapping(value = "/")
	public void Incluir(@RequestBody Usuario usuario )
	{
		service.Add(usuario);
		return;
	}
}
