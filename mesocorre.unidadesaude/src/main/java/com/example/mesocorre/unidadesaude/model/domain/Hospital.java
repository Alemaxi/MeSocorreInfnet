package com.example.mesocorre.unidadesaude.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospital extends UnidadeSaude {
	
	private boolean emergencia;
	//private List<String> especialidades;
	private boolean internacao;


	public boolean isEmergencia() {
		return emergencia;
	}

	public void setEmergencia(boolean emergencia) {
		this.emergencia = emergencia;
	}

	/*public List<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<String> especialidades) {
		this.especialidades = especialidades;
	}*/

	public boolean isInternacao() {
		return internacao;
	}

	public void setInternacao(boolean internacao) {
		this.internacao = internacao;
	}
}
