package br.edu.infnet.mesocorre.clients;

import java.util.List;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.mesocorre.model.domain.Laboratorio;


@FeignClient(url = "localhost:8083/api/hospital",name = "laboratorioClient")
public interface ILaboratorioClient {
	
	@GetMapping(value = "/")
	public List<Laboratorio> listaLaboratorio();
	
	@GetMapping(value = "/{id}/")
	public Laboratorio searchForId(@PathVariable(name = "id") Integer id);
	
	@GetMapping(value ="/byplano/{idPlano}/")
	public List<Laboratorio> searchForIdPlano(@PathVariable(name = "idPlano") Integer idPlano);
	
	@PostMapping(value = "/")	
	public void incluir(@RequestBody Laboratorio lab);

	@DeleteMapping(value = "/{id}")
	public void excluirLaboratorio(@PathVariable(name = "id") Integer id);
}
