package br.edu.infnet.mesocorre.clients;

import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.mesocorre.model.domain.Hospital;


@FeignClient(url = "localhost:8083/api/hospital",name = "hospitalClient")
public interface IHospitalClient {
	
	@GetMapping(value = "/")
	public List<Hospital> listaHospital();
	
	@GetMapping(value = "/{id}")
	public Hospital searchForId(@PathVariable(name = "id") Integer id);
	
	@GetMapping(value ="/byplano/{idPlano}")
	public List<Hospital> searchForIdPlano(@PathVariable(name = "idPlano") Integer idPlano);
	
	@PostMapping(value = "/")
	public void incluir(@RequestBody Hospital hospital);
	
	@DeleteMapping(value = "/{id}")
	public void excluirHospital(@PathVariable(name = "id") Integer id);
}
