package entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Qualificacao {
	
	@Id 
	@Column(name="id_qualificacao")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idQualificacao;
	
	private String tipo;
	
	
	public Integer getIdQualificacao() {
		return idQualificacao;
	}
	public void setIdQualificacao(Integer idQualificacao) {
		this.idQualificacao = idQualificacao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
