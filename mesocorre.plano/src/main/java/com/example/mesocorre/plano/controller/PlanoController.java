package com.example.mesocorre.plano.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.mesocorre.plano.model.domain.Plano;
import com.example.mesocorre.plano.model.service.PlanoService;


@RestController
@RequestMapping("/api/plano")
public class PlanoController {

	@Autowired
	private PlanoService planoService;

	@GetMapping(value = "/")
	public List<Plano> BuscarTodos() {

		return planoService.GetCollection();
	}
	
	@GetMapping(value = "/{idUsuario}")
	public List<Plano> searchForIdUsuario(@PathVariable(value = "idUsuario") Integer id) {

		return planoService.GetCollection(id);
	}
	
	@PostMapping(value = "/")
	public void incluir(@RequestBody Plano plano) {
		planoService.Add(plano);
		
	}

	@DeleteMapping(value = "/{id}")
	public void Excluir(@PathVariable Integer id) {
		planoService.ExcluirUm(id);
	}

}
