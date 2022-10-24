package br.edu.infnet.mesocorre.model.domain;

public class BuscaHospital {

	public String nomeBusca;
	public int idBusca;
	public String enderecoBusca;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nomeBusca + ";" + idBusca + ";" + enderecoBusca;
	}
}
