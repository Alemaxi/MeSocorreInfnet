package br.edu.infnet.mesocorre.model.domain;

import java.util.ArrayList;

import java.util.List;


public class Plano {
	
	private int id;
	private String nome;
	private String acomodacao;
	private Integer idRede;
	private Integer idUsuario;
	private Rede rede;
	private Usuario usuario;

	private List<UnidadeSaude> unidades = new ArrayList<>();
	

	public Integer getIdRede() {
		return idRede;
	}

	public void setIdRede(Integer idRede) {
		this.idRede = idRede;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setUnidades(List<UnidadeSaude> unidades) {
		this.unidades = unidades;
	}

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
