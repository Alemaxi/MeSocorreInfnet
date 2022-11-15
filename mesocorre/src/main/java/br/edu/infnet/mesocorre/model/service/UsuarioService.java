package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.model.domain.Clinica;
import br.edu.infnet.mesocorre.model.domain.Usuario;
import br.edu.infnet.mesocorre.model.repository.ClinicaRepository;
import br.edu.infnet.mesocorre.model.repository.UsuarioRepository;

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
	
	public Usuario Validar(String email, String senha) {
		Usuario usuario = repository.findByEmail(email);
		
		if(usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}
		
		return null;
		
	}
}
