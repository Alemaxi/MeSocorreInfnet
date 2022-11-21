package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.clients.IUsuarioClient;
import br.edu.infnet.mesocorre.model.domain.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioClient client;
	
	public void Add(Usuario usuario) {
		client.Incluir(usuario);
	}
	
	public Collection<Usuario> GetCollection(){
		return client.Listar();
	}
	
	public void ExcluirUm(Integer id) {
		client.Excluir(id);
	}
	
	public Usuario BuscarUm(Integer id) {
		return null;
	}
	
	public Usuario Validar(String email, String senha) {
		Usuario usuario = client.Validar(email);
		
		if(usuario != null) {
			return usuario;
		}
		
		return null;
		
	}
}
