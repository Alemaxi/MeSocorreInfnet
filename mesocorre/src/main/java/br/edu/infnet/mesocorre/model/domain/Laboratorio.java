package br.edu.infnet.mesocorre.model.domain;


public class Laboratorio extends UnidadeSaude {
	private int horaAbertura;
	private int horaFechamento;
	
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ";Abertura:" + this.horaAbertura + ";Fechamento:" + this.horaFechamento;
	}
}
