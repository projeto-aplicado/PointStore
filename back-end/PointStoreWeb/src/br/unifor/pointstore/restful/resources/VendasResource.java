package br.unifor.pointstore.restful.resources;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.unifor.pointstore.bean.VendasBeanRemote;
import br.unifor.pointstore.entity.Vendas;
import br.unifor.pointstore.restful.model.VendasVO;

@Stateless
@Path("/vendas")
public class VendasResource {
	
	@EJB
	private VendasBeanRemote vendasBeanRemote;
	
	private Vendas montarVendas(VendasVO vendasVO) {
		
//		Vendas vendas = new Vendas();
//		
//		return vendas;
		return null;
	}
	
	private VendasVO montarVendasVO(Collection<Vendas> collection) {
		
//		VendasVO vendasVO = new VendasVO();
//	
//		return vendasVO;
		
		return null;
		
	}
	
	@GET
    @Produces("application/json")
    public Collection<VendasVO> listaVendas() {              

        //return this.montarVendasVO(this.vendasBeanRemote.listaVendas());  
		return (Collection<VendasVO>) this.montarVendasVO(this.vendasBeanRemote.listaVendas());

    }
	
	@POST
    @Consumes("application/json")
    @Produces("text/plain")
	public String inserirVenda(VendasVO vendasVO){
		return this.vendasBeanRemote.insere(montarVendas(vendasVO));
	}
	
}
