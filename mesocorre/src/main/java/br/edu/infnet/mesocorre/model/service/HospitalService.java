package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.model.domain.Hospital;
import br.edu.infnet.mesocorre.model.repository.HospitalRepository;

@Service
public class HospitalService {
	
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
}
