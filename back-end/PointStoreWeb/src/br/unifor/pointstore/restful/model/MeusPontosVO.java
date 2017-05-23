package br.unifor.pointstore.restful.model;

import br.unifor.pointstore.entity.Loja;

public class MeusPontosVO {
	
	private Integer idMeusPontos;
	private String quantidade;
	private Loja loja;
	
	
	public Integer getIdMeusPontos() {
		return idMeusPontos;
	}
	public void setIdMeusPontos(Integer idMeusPontos) {
		this.idMeusPontos = idMeusPontos;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public Loja getLoja() {
		return loja;
	}
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
}
