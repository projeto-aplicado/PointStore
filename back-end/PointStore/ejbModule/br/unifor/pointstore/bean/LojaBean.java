package br.unifor.pointstore.bean;

import java.util.Collection;

import javax.ejb.EJB;

import br.unifor.pointstore.dao.LojaDAO;
import br.unifor.pointstore.entity.Loja;

public class LojaBean implements LojaBeanRemote {
	
	@EJB
	private LojaDAO lojaDAO;

	@Override
	public Collection<Loja> listaLojas() {
		return this.lojaDAO.listarUsuario();
	}

}
