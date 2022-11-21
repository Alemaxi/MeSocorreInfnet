package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.clients.IPlanoClient;
import br.edu.infnet.mesocorre.model.domain.Plano;

@Service
public class PlanoService {
	
	@Autowired
	private IPlanoClient planoClient; 

	public void Add(Plano plano) {
		planoClient.incluir(plano);
	}

	public Collection<Plano> GetCollection() {
		return planoClient.BuscarTodos();
	}

	public void ExcluirUm(Integer id) {
		planoClient.Excluir(id);
	}
	
	public List<Plano> GetByUsuarioId(Integer id) {
		return planoClient.searchForIdUsuario(id);
	}
}
