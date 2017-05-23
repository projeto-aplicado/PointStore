package br.unifor.pointstore.restful.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
		Vendas vendas = new Vendas();
		vendas.setTitulo(vendasVO.getTitulo());
		vendas.setValor(vendasVO.getValor());
		vendas.setLoja(vendasVO.getLoja());
		vendas.setMeusPontos(vendasVO.getMeusPontos());
		vendas.setQualificacao(vendasVO.getQualificacao());
		
		return vendas;
	}
	
	private List<VendasVO> montarVendasVO(Collection<Vendas> collection) {
		List<VendasVO> list = new ArrayList<VendasVO>();
		for (Vendas vendas : collection) {
			VendasVO vendasVO = new VendasVO();
			vendasVO.setTitulo(vendas.getTitulo());
			vendasVO.setValor(vendas.getValor());
			vendasVO.setLoja(vendas.getLoja());
			vendasVO.setMeusPontos(vendas.getMeusPontos());
			vendasVO.setQualificacao(vendas.getQualificacao());
		}
        return list;
    }
	
	@GET
    @Produces("application/json")
    public Collection<VendasVO> listaVendas() {              

		return (Collection<VendasVO>) this.montarVendasVO(this.vendasBeanRemote.listaVendas());

    }
	
	@POST
    @Consumes("application/json")
    @Produces("text/plain")
	public String inserirVenda(VendasVO vendasVO){
		return this.vendasBeanRemote.insere(montarVendas(vendasVO));
	}
	
}
