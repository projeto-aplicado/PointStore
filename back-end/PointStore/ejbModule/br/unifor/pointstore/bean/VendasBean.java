package br.unifor.pointstore.bean;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import br.unifor.pointstore.entity.MinhasVendas;
import br.unifor.pointstore.entity.Vendas;

@Stateless
public class VendasBean implements VendasBeanRemote {

	@PersistenceContext
	private EntityManager entityManager;
		
	private Vendas vendas;
	private MinhasVendas minhasVendas;
	
	
	public void avaliarVenda(){}
	
	public void atualizarPontosVendedorComprador(){}


	@Override
	public Collection<Vendas> listaVendas() {
		return ((EntityManager) this.entityManager).createQuery("SELECT v FROM Vendas v ORDER BY v.nome ", Vendas.class).getResultList();
	}

	@Override
	public String insere(Vendas vendas) {
		try {
			this.entityManager.persist(vendas);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			this.entityManager.getTransaction().rollback();
		}
		return null;
	}

	@Override
	public String remove(Long id) {
		try {
			this.vendas = this.entityManager.find(Vendas.class, id);
			this.entityManager.remove(id);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			this.entityManager.getTransaction().rollback();
		}
		return null;
	}

	@Override
	public Vendas busca(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String altera(Vendas vendas) {
		try {
			this.entityManager.merge(vendas);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			this.entityManager.getTransaction().rollback();
		}
		return null;
	}
	
}
