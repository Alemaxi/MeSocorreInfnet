package br.edu.infnet.mesocorre.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class UnidadeSaude {
	
	@Id
	@GeneratedValue
	private int id;
	private String endereco;
	private String nome;
	

	@OneToOne
	private Plano plano;
	
	
	
	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

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
