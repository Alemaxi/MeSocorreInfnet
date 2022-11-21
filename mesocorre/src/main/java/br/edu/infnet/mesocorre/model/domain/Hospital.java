package br.edu.infnet.mesocorre.model.domain;


public class Hospital extends UnidadeSaude {
	
	private boolean emergencia;
	private boolean internacao;

	public boolean isEmergencia() {
		return emergencia;
	}

	public void setEmergencia(boolean emergencia) {
		this.emergencia = emergencia;
	}

	public boolean isInternacao() {
		return internacao;
	}

	public void setInternacao(boolean internacao) {
		this.internacao = internacao;
	}
}
