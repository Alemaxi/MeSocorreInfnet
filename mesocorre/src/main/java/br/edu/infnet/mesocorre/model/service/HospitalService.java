package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.clients.IHospitalClient;
import br.edu.infnet.mesocorre.model.domain.Hospital;

@Service
public class HospitalService {
	
	@Autowired
	IHospitalClient client;

	public void AddHospital(Hospital hospital) {
		client.incluir(hospital);
	}

	public Collection<Hospital> GetCollection() {
		return client.listaHospital();
	}

	public void ExcluirUm(Integer id) {
		client.excluirHospital(id);
	}
}
