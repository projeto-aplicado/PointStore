package entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class MeusPontos {
	
	@Id
	@Column(name="id_meus_pontos")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idMeusPontos;
	
	private Integer quantidade;
	
	@OneToOne
	@JoinColumn(name="id_loja")
	private Loja loja;

	public Integer getIdMeusPontos() {
		return idMeusPontos;
	}

	public void setIdMeusPontos(Integer idMeusPontos) {
		this.idMeusPontos = idMeusPontos;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

}
