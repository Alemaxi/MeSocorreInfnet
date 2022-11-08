package br.edu.infnet.mesocorre.model.domain;

import java.util.ArrayList;

public class Laboratorio extends UnidadeSaude {
	private int horaAbertura;
	private int horaFechamento;
	private ArrayList<String> exames;
	
	public int getHoraAbertura() {
		return horaAbertura;
	}

	public void setHoraAbertura(int horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public int getHoraFechamento() {
		return horaFechamento;
	}

	public void setHoraFechamento(int horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	public ArrayList<String> getExames() {
		return exames;
	}

	public void setExames(ArrayList<String> exames) {
		this.exames = exames;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ";Abertura:" + this.horaAbertura + ";Fechamento:" + this.horaFechamento;
	}
}
