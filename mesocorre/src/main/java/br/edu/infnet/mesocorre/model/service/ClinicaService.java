package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.clients.IClinicaClient;
import br.edu.infnet.mesocorre.model.domain.Clinica;

@Service
public class ClinicaService {
	
	@Autowired
	IClinicaClient client;

	private static Map<Integer,Clinica> mapa = new HashMap<Integer,Clinica>();

	
	public void AddClinica(Clinica clinica) {
		client.incluir(clinica);
	}
	
	public Collection<Clinica> GetCollection(){
		return client.listaClinica();
	}
	
	public void ExcluirUm(Integer id) {
		client.excluirClinica(id);
	}
	
	public Clinica BuscarUm(Integer id) {
		return client.searchForId(id);
	}
}
