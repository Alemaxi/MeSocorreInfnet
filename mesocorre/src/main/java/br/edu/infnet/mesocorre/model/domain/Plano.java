package br.edu.infnet.mesocorre.model.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
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
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String acomodacao;
	
	@ManyToOne
	private Rede rede;
	
	@OneToMany
	private List<UnidadeSaude> unidades = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="usuario_id")
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

	public void setUnidades(List<UnidadeSaude> unidades) {
		this.unidades = unidades;
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
