package com.example.mesocorre.unidadesaude.model.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mesocorre.unidadesaude.model.domain.Hospital;
import com.example.mesocorre.unidadesaude.model.domain.Laboratorio;
import com.example.mesocorre.unidadesaude.model.repository.LaboratorioRepository;

@Service
public class LaboratorioService {

	@Autowired
	private LaboratorioRepository repository;

	public void AddLaboratorio(Laboratorio lab) {

		repository.save(lab);
	}

	public Collection<Laboratorio> GetCollection() {
		return (Collection<Laboratorio>) repository.findAll();
	}

	public void ExcluirUm(Integer id) {
		repository.deleteById(id);
	}

	public Laboratorio BuscarUm(Integer id) {
		return repository.findById(id).get();
	}
	
	public List<Laboratorio> BuscarPorIdPlano(Integer idPlano){
		return (List<Laboratorio>) repository.findByIdPlano(idPlano);
	}
}
