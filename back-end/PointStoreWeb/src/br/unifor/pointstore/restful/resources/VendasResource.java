package br.unifor.pointstore.restful.resources;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
		
		Vendas vendas = new Vendas();
		
		return vendas;
	}
	
	private VendasVO montarVendasVO(Vendas vendas) {
		
		VendasVO vendasVO = new VendasVO();
		
		
		return vendasVO;
		
	}
	
	@GET
    @Produces("application/json")
    public Collection<VendasVO> listaVendas() {              

        //return this.montarVendasVO(this.vendasBeanRemote.listaVendas());  
		return null;

    }
	
	@POST
    @Consumes("application/json")
    @Produces("text/plain")
	public String inserirVenda(VendasVO vendasVO){
		return this.vendasBeanRemote.insere(montarVendas(vendasVO));
	}
	
	@PUT
    @Consumes("application/json")
    @Produces("text/plain")
	public String atualizarVenda(VendasVO vendasVO){
		return this.vendasBeanRemote.altera(montarVendas(vendasVO));
	}
	
}
