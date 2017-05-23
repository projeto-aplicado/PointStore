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

import br.unifor.pointstore.bean.LojaBeanRemote;
import br.unifor.pointstore.entity.Loja;
import br.unifor.pointstore.restful.model.LojaVO;

@Stateless
@Path("/lojas")
public class LojaResource {
	
	@EJB
	private LojaBeanRemote lojaBean;
	
	private Loja montarLoja(LojaVO lojaVO) {

        Loja loja = new Loja();
        loja.setNome(lojaVO.getNome());

        return loja;
    }
	
	private List<LojaVO> montarLojaVO(Collection<Loja> collection) {
		List<LojaVO> list = new ArrayList<LojaVO>();
		for (Loja loja : collection) {
	
			LojaVO lojaVO = new LojaVO();
			lojaVO.setNome(loja.getNome());
		}


        return list;
    }
	
	@GET
    @Produces("application/json")
    public Collection<LojaVO> listaLojas() {              

        return (Collection<LojaVO>) this.montarLojaVO(this.lojaBean.listaLojas());
    }
}
