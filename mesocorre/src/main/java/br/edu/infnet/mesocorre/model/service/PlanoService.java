package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.model.domain.Laboratorio;
import br.edu.infnet.mesocorre.model.domain.Plano;
import br.edu.infnet.mesocorre.model.repository.LaboratorioRepository;
import br.edu.infnet.mesocorre.model.repository.PlanoRepository;

@Service
public class PlanoService {
	
	@Autowired
	private PlanoRepository repository;

	public void Add(Plano lab) {
		repository.save(lab);
	}

	public Collection<Plano> GetCollection() {
		return (Collection<Plano>) repository.findAll();
	}

	public void ExcluirUm(Integer id) {
		repository.deleteById(id);
	}
	
	public List<Plano> GetByUsuarioId(Integer id) {
		return repository.findByUsuarioId(id);
	}
}
