package br.unifor.pointstore.bean;

import java.util.Collection;

import javax.ejb.Remote;

import br.unifor.pointstore.entity.MeusPontos;


@Remote
public interface MeusPontosBeanRemote {
	
	public Collection<MeusPontos> listaMeusPontos();
    public String insere(MeusPontos meusPontos);
    public String atualizar(MeusPontos meusPontos);
    public MeusPontos busca(Long id);

}
