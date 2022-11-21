package br.edu.infnet.mesocorre.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.mesocorre.model.domain.Usuario;

@FeignClient(url = "localhost:8084/api/usuario",name = "usuarioClient")
public interface IUsuarioClient {
	
	@GetMapping(value = "/")
	public List<Usuario> Listar();
	
	@PostMapping(value = "/validar")
	public Usuario Validar(@RequestBody String email);
	
	@DeleteMapping(value = "/{id}")
	public void Excluir(@PathVariable Integer id );
	
	@PostMapping(value = "/")
	public void Incluir(@RequestBody Usuario usuario );
}
