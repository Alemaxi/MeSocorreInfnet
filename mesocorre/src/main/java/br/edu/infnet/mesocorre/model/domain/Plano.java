package br.edu.infnet.mesocorre.model.domain;

public class Plano {
	
	public Plano() {
		
	}
	
	public Plano(int id, String nome, String acomodacao) {
		this.id = id;
		this.nome = nome;
		this.acomodacao = acomodacao;
	}
	
	public int id;
	public String nome;
	public String acomodacao;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ";" + this.nome + ";" + this.acomodacao;
	}
}
