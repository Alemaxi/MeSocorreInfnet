package br.edu.infnet.mesocorre.model.domain;

import java.util.List;

public class Hospital extends UnidadeSaude {
	public boolean emergencia;
	public List<String> especialidades;
	public boolean internacao;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ";Emergencia:" + this.emergencia + ";Internação:" + this.internacao;
	}
}
