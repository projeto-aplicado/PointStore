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
@Table(name="minhas_compras")
public class MinhasCompras implements Serializable {
	
	private static final long serialVersionUID = 315340146863733238L;

	@Id
	@Column(name="id_minhas_compras")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idMinhasCompras;
	
	//@OneToMany(cascade=CascadeType.PERSIST)
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_vendas")
	private Vendas vendas;

	public Integer getIdMinhasCompras() {
		return idMinhasCompras;
	}

	public void setIdMinhasCompras(Integer idMinhasCompras) {
		this.idMinhasCompras = idMinhasCompras;
	}

	public Vendas getVendas() {
		return vendas;
	}

	public void setVendas(Vendas vendas) {
		this.vendas = vendas;
	}
	
}
