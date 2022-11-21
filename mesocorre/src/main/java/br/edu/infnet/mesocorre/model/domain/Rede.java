package br.edu.infnet.mesocorre.model.domain;

import java.util.List;


public class Rede {
	
	public Rede() {
		
	}
	
	public Rede(int id, String nome, String telefone) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	private int id;
	private String nome;
	private String telefone;
	
	private List<Plano> planos;
	
	public int getId() {
		return id;
	}

	public List<Plano> getPlanos() {
		return planos;
	}

	public void setPlanos(List<Plano> planos) {
		this.planos = planos;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ";" + nome + "; 5123555";
	}
}
