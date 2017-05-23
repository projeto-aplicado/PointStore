package br.unifor.pointstore.dao;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import br.unifor.pointstore.entity.Vendas;

@Stateless
public class VendaDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public String inserirVendas(Vendas vendas) {
		try {
			this.entityManager.persist(vendas);
			return "Venda do produdo " +vendas.getTitulo()+ "foi inserido com sucesso!";
		} catch (PersistenceException pe) {
			return "Erro ao inserir venda " + pe;
		}
	}
	
	public Collection<Vendas> listarVendas() {

        return this.entityManager.createQuery("SELECT v FROM Vendas v").getResultList();
    }
}
