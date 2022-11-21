package com.example.mesocorre.plano.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mesocorre.plano.model.domain.Plano;
import com.example.mesocorre.plano.model.repository.PlanoRepository;

@Service
public class PlanoService {
	
	@Autowired
	private PlanoRepository repository;

	public void Add(Plano lab) {
		repository.save(lab);
	}
	
	public List<Plano> GetCollection() {
		return (List<Plano>) repository.findAll();
	}

	public List<Plano> GetCollection(Integer idUsuario) {
		return (List<Plano>) repository.findByIdUsuario(idUsuario);
	}

	public void ExcluirUm(Integer id) {
		repository.deleteById(id);
	}
}
