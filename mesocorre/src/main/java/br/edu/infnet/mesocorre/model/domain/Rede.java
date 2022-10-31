package br.edu.infnet.mesocorre.model.domain;

import org.springframework.stereotype.Component;

@Component
public class Rede {
	
	public Rede() {
		
	}
	
	public Rede(int id, String nome, String telefone) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public int id;
	public String nome;
	public String telefone;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ";" + nome + "; 5123555";
	}
}
