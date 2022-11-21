package com.example.mesocorre.unidadesaude.model.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mesocorre.unidadesaude.model.domain.Hospital;
import com.example.mesocorre.unidadesaude.model.repository.HospitalRepository;

@Service
public class HospitalService {

	@Autowired
	private HospitalRepository repository;

	public void AddHospital(Hospital hospital) {

		repository.save(hospital);
	}

	public Collection<Hospital> GetCollection() {
		return (Collection<Hospital>) repository.findAll();
	}

	public void ExcluirUm(Integer id) {
		repository.deleteById(id);
	}

	public Hospital BuscarUm(Integer id) {
		return repository.findById(id).get();
	}
	
	public List<Hospital> BuscarPorIdPlano(Integer idPlano){
		return (List<Hospital>) repository.findByIdPlano(idPlano);
	}
}
