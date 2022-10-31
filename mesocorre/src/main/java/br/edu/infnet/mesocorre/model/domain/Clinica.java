package br.edu.infnet.mesocorre.model.domain;

import java.util.ArrayList;

public class Clinica extends UnidadeSaude {
	
	public ArrayList<String> especialidades;
	public int horaAbertura;
	public int horaFechamento;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ";Abertura:" + this.horaAbertura + ";Fechamento:" + this.horaFechamento;
	}
}
