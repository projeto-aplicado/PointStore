package br.unifor.pointstore.bean;

import java.util.Collection;

import javax.ejb.Remote;

import br.unifor.pointstore.entity.Loja;

@Remote
public interface LojaBeanRemote {
	
	public Collection<Loja> listaLojas();

}
