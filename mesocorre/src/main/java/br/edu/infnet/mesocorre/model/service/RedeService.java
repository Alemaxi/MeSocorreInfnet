package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.clients.IRedeClient;
import br.edu.infnet.mesocorre.model.domain.Rede;

@Service
public class RedeService {
	
	@Autowired
	private IRedeClient client;

	public void Add(Rede r1) {
		client.incluirPost(r1);
	}

	public Collection<Rede> GetCollection() {
		return client.telaLista();
	}

	public void ExcluirUm(Integer id) {
		client.Excluir(id);
	}
	
	public Rede findById(Integer id) {
		return client.searchForId(id);
	}
}
