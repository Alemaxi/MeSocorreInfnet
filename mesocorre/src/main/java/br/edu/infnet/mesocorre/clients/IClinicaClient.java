package br.edu.infnet.mesocorre.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.mesocorre.model.domain.Clinica;


@FeignClient(url = "localhost:8083/api/clinica",name = "clinicaClient")
public interface IClinicaClient {
	
	@GetMapping(value = "/")
	public List<Clinica> listaClinica();
	
	@GetMapping(value = "/{id}")
	public Clinica searchForId(@PathVariable(name = "id") Integer id);
	
	@GetMapping(value ="/byplano/{idPlano}")
	public List<Clinica> searchForIdPlano(@PathVariable(name = "idPlano") Integer idPlano);
	
	@PostMapping(value = "/")
	public void incluir(@RequestBody Clinica clinica);

	@DeleteMapping(value = "/{id}")
	public void excluirClinica(@PathVariable(name = "id") Integer id);
}
