package com.example.mesocorre.rede.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mesocorre.rede.model.domain.Rede;
import com.example.mesocorre.rede.model.repository.RedeRepository;

@Service
public class RedeService {
	@Autowired
	private RedeRepository repository;

	public void Add(Rede r1) {
		repository.save(r1);
	}
	
	public List<Rede> GetCollection() {
		return  (List<Rede>) repository.findAll();
	}

	public List<Rede> GetCollection(List<Integer> ids) {
		return  (List<Rede>) repository.findAllById(ids);
	}

	public void ExcluirUm(Integer id) {
		repository.deleteById(id);
	}
	
	public Rede findById(Integer id) {
		return repository.findById(id).get();
	}
}
