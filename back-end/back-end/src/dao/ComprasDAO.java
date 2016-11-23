package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import util.JPAUtil;
import entitys.MinhasCompras;

@Path("/compras")
public class ComprasDAO {
	
	@PersistenceContext
	private JPAUtil entytiManager;
	
	
	@GET
    @Produces("text/plain")
    public String showHelloWorld() {
        return "Olá mundo fudido!";
    }
	
	
	public List<MinhasCompras> getMinhasCompras(){
		 
		return ((EntityManager) this.entytiManager).createQuery("SELECT mc FROM MinhasCompras mc ORDER BY mc.nome ", MinhasCompras.class).getResultList();	
	}

}