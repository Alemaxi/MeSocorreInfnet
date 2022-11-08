package br.edu.infnet.mesocorre.model.domain;

import java.util.List;

public class Hospital extends UnidadeSaude {
	private boolean emergencia;
	private List<String> especialidades;
	private boolean internacao;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ";Emergencia:" + this.emergencia + ";Internação:" + this.internacao;
	}

	public boolean isEmergencia() {
		return emergencia;
	}

	public void setEmergencia(boolean emergencia) {
		this.emergencia = emergencia;
	}

	public List<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<String> especialidades) {
		this.especialidades = especialidades;
	}

	public boolean isInternacao() {
		return internacao;
	}

	public void setInternacao(boolean internacao) {
		this.internacao = internacao;
	}
}
