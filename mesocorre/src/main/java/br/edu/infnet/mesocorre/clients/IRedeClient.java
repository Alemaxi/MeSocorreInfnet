package br.edu.infnet.mesocorre.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.mesocorre.model.domain.Rede;

@FeignClient(url = "localhost:8082/api/rede",name = "redeClient")
public interface IRedeClient {
	
	@GetMapping(value = "/")
	public List<Rede> telaLista();
	
	@GetMapping(value = "/{id}")
	public Rede searchForId(@PathVariable Integer id);
	
	@PostMapping(value = "/")
	public void incluirPost(@RequestBody Rede rede);
	
	@DeleteMapping(value = "/{id}")
	public void Excluir(@PathVariable Integer id);
}
