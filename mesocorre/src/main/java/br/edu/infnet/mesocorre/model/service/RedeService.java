package br.edu.infnet.mesocorre.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.mesocorre.model.domain.Rede;

@Service
public class RedeService {
	private static Map<Integer, Rede> mapa = new HashMap<Integer, Rede>();

	private static int id = 0;

	public void AddRede(Rede rede) {
		rede.setId(++id);

		mapa.put(id, rede);
	}

	public void ExcluirUm(Integer id) {
		mapa.remove(id);
	}

	public Collection<Rede> GetCollection() {
		return mapa.values();
	}
}
