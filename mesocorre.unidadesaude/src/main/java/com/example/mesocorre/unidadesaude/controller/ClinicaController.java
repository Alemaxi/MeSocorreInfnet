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

import com.example.mesocorre.unidadesaude.model.domain.Clinica;
import com.example.mesocorre.unidadesaude.model.service.ClinicaService;


@RestController
@RequestMapping("/api/clinica")
public class ClinicaController {
	
	@Autowired
	private ClinicaService clinicaService;
	
	@GetMapping(value = "/")
	public List<Clinica> listaClinica() {

		return (List<Clinica>) clinicaService.GetCollection();
	}
	
	@GetMapping(value = "/{id}")
	public Clinica searchForId(@PathVariable(name = "id") Integer id) {

		return clinicaService.BuscarUm(id);
	}
	
	@GetMapping(value ="/byplano/{idPlano}")
	public List<Clinica> searchForIdPlano(@PathVariable(name = "idPlano") Integer idPlano) {

		return clinicaService.BuscarPorIdPlano(idPlano);
	}
	
	@PostMapping(value = "/")
	public void incluir(@RequestBody Clinica clinica) {
		clinicaService.AddClinica(clinica);
	}

	@DeleteMapping(value = "/{id}")
	public void excluirClinica(@PathVariable(name = "id") Integer id) {
		clinicaService.ExcluirUm(id);
	}

}
