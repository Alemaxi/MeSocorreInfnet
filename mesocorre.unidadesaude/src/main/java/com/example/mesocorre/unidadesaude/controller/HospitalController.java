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
import com.example.mesocorre.unidadesaude.model.domain.Hospital;
import com.example.mesocorre.unidadesaude.model.service.HospitalService;

@RestController
@RequestMapping("/api/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping(value = "/")
	public List<Hospital> listaHospital() {

		return (List<Hospital>) hospitalService.GetCollection();
	}
	
	@GetMapping(value = "/{id}")
	public Hospital searchForId(@PathVariable(name = "id") Integer id) {

		return hospitalService.BuscarUm(id);
	}
	
	@GetMapping(value ="/byplano/{idPlano}")
	public List<Hospital> searchForIdPlano(@PathVariable(name = "idPlano") Integer idPlano) {

		return hospitalService.BuscarPorIdPlano(idPlano);
	}
	
	@PostMapping(value = "/")
	public void incluir(@RequestBody Hospital hospital) {
		hospitalService.AddHospital(hospital);
	}

	@DeleteMapping(value = "/{id}")
	public void excluirHospital(@PathVariable(name = "id") Integer id) {
		hospitalService.ExcluirUm(id);
	}

}
