package br.edu.infnet.mesocorre.usuario.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.usuario.model.domain.Usuario;
import br.edu.infnet.mesocorre.usuario.model.repository.UsuarioRepository;


@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public void Add(Usuario usuario) {
		repository.save(usuario);
	}
	
	public Collection<Usuario> GetCollection(){
		return (Collection<Usuario>) repository.findAll();
	}
	
	public void ExcluirUm(Integer id) {
		repository.deleteById(id);
	}
	
	public Usuario BuscarUm(Integer id) {
		return repository.findById(id).get();
	}
	
	public Usuario Validar(String email) {
		Usuario usuario = repository.findByEmail(email);
		
		if(usuario != null) {
			return usuario;
		}
		
		return null;
		
	}
}
