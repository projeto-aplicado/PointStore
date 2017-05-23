package br.unifor.pointstore.bean;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import br.unifor.pointstore.dao.VendaDAO;
import br.unifor.pointstore.entity.MinhasVendas;
import br.unifor.pointstore.entity.Vendas;

@Stateless
public class VendasBean implements VendasBeanRemote {

	@EJB
	private VendaDAO vendasDAO;
	
	
	public void avaliarVenda(){}
	
	public void atualizarPontosVendedorComprador(){}


	@Override
	public Collection<Vendas> listaVendas() {
		return this.vendasDAO.listarVendas();
	}

	@Override
	public String insere(Vendas vendas) {
		return this.vendasDAO.inserirVendas(vendas);
	}

	@Override
	public String remove(Long id) {
		return null;
	}

	@Override
	public Vendas busca(Long id) {
		// TODO Auto-generated method stub
		return null;
	}	
}
