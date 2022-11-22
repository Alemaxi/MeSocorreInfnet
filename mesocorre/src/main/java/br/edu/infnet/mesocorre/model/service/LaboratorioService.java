package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.clients.ILaboratorioClient;
import br.edu.infnet.mesocorre.model.domain.Laboratorio;

@Service
public class LaboratorioService {
	
	@Autowired
	ILaboratorioClient client;
	
	public void AddLab(Laboratorio lab) {
		client.incluir(lab);
	}

	public Collection<Laboratorio> GetCollection() {
		return client.listaLaboratorio();
	}

	public void ExcluirUm(Integer id) {
		client.excluirLaboratorio(id);
	}
}
