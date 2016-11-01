package entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class MinhasCompras {
	
	@Id
	@Column(name="id_minhas_compras")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idMinhasCompras;
	
	@OneToMany
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
