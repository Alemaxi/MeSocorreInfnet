package com.example.mesocorre.unidadesaude.controller;

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

import com.example.mesocorre.unidadesaude.model.domain.Laboratorio;
import com.example.mesocorre.unidadesaude.model.service.LaboratorioService;

@RestController
@RequestMapping("/api/laboratorio")
public class LaboratorioController {
	
	@Autowired
	private LaboratorioService laboratorioService;
	
	@GetMapping(value = "/")
	public List<Laboratorio> listaLaboratorio() {

		return (List<Laboratorio>) laboratorioService.GetCollection();
	}
	
	@GetMapping(value = "/{id}/")
	public Laboratorio searchForId(@PathVariable(name = "id") Integer id) {

		return laboratorioService.BuscarUm(id);
	}
	
	@GetMapping(value ="/byplano/{idPlano}/")
	public List<Laboratorio> searchForIdPlano(@PathVariable(name = "idPlano") Integer idPlano) {

		return laboratorioService.BuscarPorIdPlano(idPlano);
	}
	
	@PostMapping(value = "/")	
	public void incluir(@RequestBody Laboratorio lab) {
		laboratorioService.AddLaboratorio(lab);
	}

	@DeleteMapping(value = "/{id}")
	public void excluirLaboratorio(@PathVariable(name = "id") Integer id) {
		laboratorioService.ExcluirUm(id);
	}

}
