package com.example.mesocorre.unidadesaude.model.domain;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
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
}
