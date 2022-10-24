package br.edu.infnet.mesocorre.model.domain;

public abstract class UnidadeSaude {
	public int id;
	public String endereco;
	public String nome;
	public String linkFoto;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + ";" + this.endereco + ";" + this.id;
	}
}
