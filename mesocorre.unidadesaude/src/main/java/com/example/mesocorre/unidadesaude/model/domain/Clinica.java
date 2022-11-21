package com.example.mesocorre.unidadesaude.model.domain;

import javax.persistence.Entity;



@Entity
public class Clinica extends UnidadeSaude {
	

	//private ArrayList<String> especialidades;
	private int abertura;
	private int fechamento;
	
	/*public ArrayList<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(ArrayList<String> especialidades) {
		this.especialidades = especialidades;
	}*/

	public int getAbertura() {
		return abertura;
	}

	public void setAbertura(int abertura) {
		this.abertura = abertura;
	}

	public int getFechamento() {
		return fechamento;
	}

	public void setFechamento(int fechamento) {
		this.fechamento = fechamento;
	}

}
