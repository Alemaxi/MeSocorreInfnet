package br.edu.infnet.mesocorre.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.mesocorre.model.domain.Plano;

@FeignClient(url = "localhost:8081/api/plano", name = "planoClient")
public interface IPlanoClient {

	@GetMapping(value = "/")
	public List<Plano> BuscarTodos();

	@GetMapping(value = "/{idUsuario}")
	public List<Plano> searchForIdUsuario(@PathVariable(value = "idUsuario") Integer id);

	@PostMapping(value = "/")
	public void incluir(@RequestBody Plano plano);

	@DeleteMapping(value = "/{id}")
	public void Excluir(@PathVariable Integer id);
}
