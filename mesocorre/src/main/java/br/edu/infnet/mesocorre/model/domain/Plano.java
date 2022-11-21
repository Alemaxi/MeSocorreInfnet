package br.edu.infnet.mesocorre.model.domain;

import java.util.ArrayList;

import java.util.List;


public class Plano {
	
	public Plano() {
		
	}
	
	public Plano(int id, String nome, String acomodacao, Rede rede,ArrayList<UnidadeSaude> unidades) {
		this.id = id;
		this.nome = nome;
		this.acomodacao = acomodacao;
		this.rede = rede;
		this.unidades = unidades;
	}
	
	private int id;
	private String nome;
	private String acomodacao;
	

	private Rede rede;
	

	private List<UnidadeSaude> unidades = new ArrayList<>();
	

	private Usuario usuario;
	
	

	public Rede getRede() {
		return rede;
	}

	public void setRede(Rede rede) {
		this.rede = rede;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

	public List<UnidadeSaude> getUnidades() {
		return unidades;
	}

	public void setUnidades(ArrayList<UnidadeSaude> unidades) {
		this.unidades = unidades;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAcomodacao() {
		return acomodacao;
	}

	public void setAcomodacao(String acomodacao) {
		this.acomodacao = acomodacao;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ";" + this.nome + ";" + this.acomodacao + ";"  + ";";
	}
}
