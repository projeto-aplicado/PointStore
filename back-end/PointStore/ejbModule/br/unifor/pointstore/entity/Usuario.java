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
@Table(name="usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 828008828781527649L;

	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idUsuario;
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private String credito;
	private String email;
	private String login;
	private String senha;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_meus_pontos")
	private MeusPontos meusPontos;
	
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_minhas_compras")
	private MinhasCompras minhasCompras;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_minhas_vendas")
	private MinhasVendas minhasVenda;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_minhas_qualificacoes")
	private MinhasQualificacoes minhasQualificacoes;
	
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCredito() {
		return credito;
	}
	public void setCredito(String credito) {
		this.credito = credito;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public MeusPontos getMeusPontos() {
		return meusPontos;
	}
	public void setMeusPontos(MeusPontos meusPontos) {
		this.meusPontos = meusPontos;
	}
	public MinhasCompras getMinhasCompras() {
		return minhasCompras;
	}
	public void setMinhasCompras(MinhasCompras minhasCompras) {
		this.minhasCompras = minhasCompras;
	}
	public MinhasVendas getMinhasVenda() {
		return minhasVenda;
	}
	public void setMinhasVenda(MinhasVendas minhasVenda) {
		this.minhasVenda = minhasVenda;
	}
	public MinhasQualificacoes getMinhasQualificacoes() {
		return minhasQualificacoes;
	}
	public void setMinhasQualificacoes(MinhasQualificacoes minhasQualificacoes) {
		this.minhasQualificacoes = minhasQualificacoes;
	}
	
}
