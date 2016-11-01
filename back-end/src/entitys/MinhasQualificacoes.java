package entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class MinhasQualificacoes {
	
	@Id 
	@Column(name="id_minhas_qualificacoes")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idMinhasQualificacoes;
	
	private Integer quantidade;
	
	@OneToMany
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
