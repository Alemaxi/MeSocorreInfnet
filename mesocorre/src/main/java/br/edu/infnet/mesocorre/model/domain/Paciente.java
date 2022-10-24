package br.edu.infnet.mesocorre.model.domain;

public class Paciente {
	public int id;
	public String nome;
	public int idade;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ";" + nome + ";" + idade;
	}
}
