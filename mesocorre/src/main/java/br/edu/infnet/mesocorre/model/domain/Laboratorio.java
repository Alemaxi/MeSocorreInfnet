package br.edu.infnet.mesocorre.model.domain;

import java.util.ArrayList;

public class Laboratorio extends UnidadeSaude {
	public int horaAbertura;
	public int horaFechamento;
	public ArrayList<String> exames;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ";Abertura:" + this.horaAbertura + ";Fechamento:" + this.horaFechamento;
	}
}
