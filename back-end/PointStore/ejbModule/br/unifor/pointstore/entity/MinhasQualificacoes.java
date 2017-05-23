package br.unifor.pointstore.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="minhas_qualificacoes")
public class MinhasQualificacoes implements Serializable{
	
	private static final long serialVersionUID = 1277565450796553665L;

	@Id 
	@Column(name="id_minhas_qualificacoes")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idMinhasQualificacoes;
	
	private Integer quantidade;
	
	//@OneToMany(cascade=CascadeType.PERSIST)
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_qualificacao")
	private Qualificacao qualificacao;

	public Integer getIdMinhasQualificacoes() {
		return idMinhasQualificacoes;
	}

	public void setIdMinhasQualificacoes(Integer idMinhasQualificacoes) {
		this.idMinhasQualificacoes = idMinhasQualificacoes;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Qualificacao getQualificacao() {
		return qualificacao;
	}

	public void setQualificacao(Qualificacao qualificacao) {
		this.qualificacao = qualificacao;
	}
	
}
