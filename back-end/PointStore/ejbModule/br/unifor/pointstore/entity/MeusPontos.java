package br.unifor.pointstore.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="meus_pontos")
public class MeusPontos implements Serializable{

	private static final long serialVersionUID = 7063838044768556546L;

	@Id
	@Column(name="id_meus_pontos")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idMeusPontos;
	
	private String quantidade;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_loja")
	private Loja loja;

	public Integer getIdMeusPontos() {
		return idMeusPontos;
	}

	public void setIdMeusPontos(Integer idMeusPontos) {
		this.idMeusPontos = idMeusPontos;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

}
