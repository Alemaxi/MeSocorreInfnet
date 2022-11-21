package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.model.domain.Clinica;

@Service
public class ClinicaService {
	
	@Autowired

	private static Map<Integer,Clinica> mapa = new HashMap<Integer,Clinica>();

	
	public void AddClinica(Clinica clinica) {

		
		//repository.save(clinica);
	}
	
	public Collection<Clinica> GetCollection(){
		//return (Collection<Clinica>) repository.findAll();
		return null;
	}
	
	public void ExcluirUm(Integer id) {
		//repository.deleteById(id);
	}
	
	public Clinica BuscarUm(Integer id) {
		//return repository.findById(id).get();
		return null;
	}
}
