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
@Table(name="minhas_vendas")
public class MinhasVendas implements Serializable {
		
	private static final long serialVersionUID = -1152337379070314928L;

	@Id
	@Column(name="id_minhas_vendas")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idMinhasVendas;
	
	//@OneToMany(cascade=CascadeType.PERSIST)
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_vendas")
	private Vendas vendas;
	

	public Integer getIdMinhasVendas() {
		return idMinhasVendas;
	}

	public void setIdMinhasVendas(Integer idMinhasVendas) {
		this.idMinhasVendas = idMinhasVendas;
	}

	public Vendas getVendas() {
		return vendas;
	}

	public void setVendas(Vendas vendas) {
		this.vendas = vendas;
	}

}
