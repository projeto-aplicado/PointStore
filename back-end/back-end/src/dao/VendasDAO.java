package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import util.JPAUtil;
import entitys.MinhasVendas;
import entitys.Vendas;

@Path("/vendas")
public class VendasDAO {

	@PersistenceContext
	private JPAUtil entytiManager;
	private Vendas vendas;
	private MinhasVendas minhasVendas;
	

	@GET
    @Produces("text/plain")
    public String showHelloWorld() {
        return "Olá mundo!";
    }
	
	
	
	@POST
	@Consumes("application/json")
	@Produces("text/plain")
	public void inserir(Vendas vendas) {
		
		try {
			this.entytiManager.getEntityManager().getTransaction().begin();
			this.entytiManager.getEntityManager().persist(vendas);
			this.entytiManager.getEntityManager().getTransaction().commit();
			this.entytiManager.getEntityManager().close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			this.entytiManager.getEntityManager().getTransaction().rollback();
		}

	}
	
	@PUT
	@Consumes("application/json")
	@Produces("text/plain")
	public void alterar(Vendas vendas) {
		try {
			this.entytiManager.getEntityManager().getTransaction().begin();
			this.entytiManager.getEntityManager().merge(vendas);
			this.entytiManager.getEntityManager().getTransaction().commit();
			this.entytiManager.getEntityManager().close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			this.entytiManager.getEntityManager().getTransaction().rollback();
		}
	}
	
	@Path("{id}")
	@DELETE
	@Produces("text/plain")
	public void remover(Integer id) {
		try {
			this.entytiManager.getEntityManager().getTransaction().begin();
			this.vendas = this.entytiManager.getEntityManager().find(Vendas.class, id);
			this.entytiManager.getEntityManager().remove(id);
			this.entytiManager.getEntityManager().getTransaction().commit();
			this.entytiManager.getEntityManager().close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			this.entytiManager.getEntityManager().getTransaction().rollback();
		}
	}
	
	public List<Vendas> getVendas(){
		 
		return ((EntityManager) this.entytiManager).createQuery("SELECT v FROM Vendas v ORDER BY v.nome ", Vendas.class).getResultList();
	}
	
}
