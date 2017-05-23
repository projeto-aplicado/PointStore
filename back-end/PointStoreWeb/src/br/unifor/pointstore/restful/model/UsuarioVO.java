package br.unifor.pointstore.restful.model;

import br.unifor.pointstore.entity.MeusPontos;
import br.unifor.pointstore.entity.MinhasCompras;
import br.unifor.pointstore.entity.MinhasQualificacoes;
import br.unifor.pointstore.entity.MinhasVendas;

public class UsuarioVO {
	
	private Integer idUsuario;
	private String nome;
	private String sobrenome;
	private String credito;
	private String cpf;
	private String email;
	private String login;
	private String senha;
	private MeusPontos meusPontos;
	private MinhasCompras minhasCompras;	
	private MinhasVendas minhasVenda;	
	private MinhasQualificacoes minhasQualificacoes;
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
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
