package br.unifor.pointstore.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="lojas")
public class Loja implements Serializable {
	
	private static final long serialVersionUID = -8465864272756825777L;

	@Id 
	@Column(name="id_loja")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idLoja;
	
	private String nome;
	
	public Integer getIdLoja() {
		return idLoja;
	}
	public void setIdLoja(Integer idLoja) {
		this.idLoja = idLoja;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}