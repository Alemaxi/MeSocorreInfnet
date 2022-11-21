package br.edu.infnet.mesocorre.model.domain;

import java.util.ArrayList;

import java.util.List;


public class Usuario {

	
	private int id;
	private String nome;
	private String email;
	private String senha;

	
	private List<Plano> plano = new ArrayList<>();

	public List<Plano> getPlano() {
		return plano;
	}

	public void setPlano(List<Plano> plano) {
		this.plano = plano;
	}

	public Usuario() {

	}

	public Usuario(int id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ";" + nome + ";" + email;
	}

	public int getId() {
		return id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
