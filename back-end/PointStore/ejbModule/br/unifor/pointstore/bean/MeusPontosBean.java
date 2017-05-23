package br.unifor.pointstore.bean;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.unifor.pointstore.dao.MeusPontosDAO;
import br.unifor.pointstore.entity.MeusPontos;

@Stateless
public class MeusPontosBean implements MeusPontosBeanRemote {
	
	@EJB
	private MeusPontosDAO meuPontosDAO;

	@Override
	public Collection<MeusPontos> listaMeusPontos() {
		return this.meuPontosDAO.listarMeusPontos();
	}

	@Override
	public String insere(MeusPontos meusPontos) {
		return this.meuPontosDAO.inserirMeusPontos(meusPontos);
	}

	@Override
	public String atualizar(MeusPontos meusPontos) {
		return this.meuPontosDAO.atualizarMeusPontos(meusPontos);
	}

	@Override
	public MeusPontos busca(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
