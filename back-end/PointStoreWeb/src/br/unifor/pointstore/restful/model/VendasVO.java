package br.unifor.pointstore.restful.model;


import br.unifor.pointstore.entity.Loja;
import br.unifor.pointstore.entity.MeusPontos;
import br.unifor.pointstore.entity.Qualificacao;

public class VendasVO {
	
	private Integer idVendas;
	private String titulo;
	private String valor;
	private Loja loja;
	private MeusPontos meusPontos;
	private Qualificacao qualificacao;
	private String status;
	
	public Integer getIdVendas() {
		return idVendas;
	}
	public void setIdVendas(Integer idVendas) {
		this.idVendas = idVendas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Loja getLoja() {
		return loja;
	}
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	public MeusPontos getMeusPontos() {
		return meusPontos;
	}
	public void setMeusPontos(MeusPontos meusPontos) {
		this.meusPontos = meusPontos;
	}
	public Qualificacao getQualificacao() {
		return qualificacao;
	}
	public void setQualificacao(Qualificacao qualificacao) {
		this.qualificacao = qualificacao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
