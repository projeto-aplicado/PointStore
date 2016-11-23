package entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loja {
	
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
