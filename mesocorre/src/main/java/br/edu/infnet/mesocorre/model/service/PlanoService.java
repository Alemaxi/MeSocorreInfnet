package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.model.domain.Plano;

@Service
public class PlanoService {
	private static Map<Integer, Plano> mapa = new HashMap<Integer, Plano>();

	private static int id = 0;

	public void AddPlano(Plano plano) {
		plano.setId(++id);

		mapa.put(id, plano);
	}

	public Collection<Plano> GetCollection() {
		return mapa.values();
	}

	public void ExcluirUm(Integer id) {
		mapa.remove(id);
	}
}
