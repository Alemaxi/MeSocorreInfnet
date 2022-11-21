package com.example.mesocorre.unidadesaude.model.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mesocorre.unidadesaude.model.domain.Clinica;
import com.example.mesocorre.unidadesaude.model.repository.ClinicaRepository;

@Service
public class ClinicaService {
	
	@Autowired
	private ClinicaRepository repository;

	
	public void AddClinica(Clinica clinica) {

		
		repository.save(clinica);
	}
	
	public Collection<Clinica> GetCollection(){
		return (Collection<Clinica>) repository.findAll();
	}
	
	public void ExcluirUm(Integer id) {
		repository.deleteById(id);
	}
	
	public Clinica BuscarUm(Integer id) {
		return repository.findById(id).get();
	}
	
	public List<Clinica> BuscarPorIdPlano(Integer idPlano){
		return (List<Clinica>) repository.findByIdPlano(idPlano);
	}
}
