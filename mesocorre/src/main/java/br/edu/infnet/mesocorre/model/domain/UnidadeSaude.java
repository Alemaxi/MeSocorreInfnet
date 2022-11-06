package br.edu.infnet.mesocorre.model.domain;

import java.util.ArrayList;

public abstract class UnidadeSaude {
	private int id;
	private String endereco;
	private String nome;
	
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + ";" + this.endereco + ";" + this.id;
	}
}
