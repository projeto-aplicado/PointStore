package br.unifor.pointstore.bean;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.unifor.pointstore.dao.LojaDAO;
import br.unifor.pointstore.entity.Loja;

@Stateless
public class LojaBean implements LojaBeanRemote {
	
	@EJB
	private LojaDAO lojaDAO;

	@Override
	public Collection<Loja> listaLojas() {
		return this.lojaDAO.listarLojas();
	}

}
