package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.model.domain.Plano;
import br.edu.infnet.mesocorre.model.domain.Rede;
import br.edu.infnet.mesocorre.model.repository.PlanoRepository;
import br.edu.infnet.mesocorre.model.repository.RedeRepository;

@Service
public class RedeService {
	@Autowired
	private RedeRepository repository;

	public void Add(Rede r1) {
		repository.save(r1);
	}

	public Collection<Rede> GetCollection() {
		return (Collection<Rede>) repository.findAll();
	}

	public void ExcluirUm(Integer id) {
		repository.deleteById(id);
	}
	
}
