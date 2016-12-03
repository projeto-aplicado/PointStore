package br.unifor.pointstore.restful.resources;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.unifor.pointstore.bean.LojaBeanRemote;
import br.unifor.pointstore.entity.Loja;
import br.unifor.pointstore.restful.model.LojaVO;

@Stateless
@Path("/lojas")
public class LojaResource {
	
	@EJB
	private LojaBeanRemote lojaBeanRemote;
	
	private Loja montarLoja(LojaVO lojaVO) {

        Loja loja = new Loja();
        loja.setNome(lojaVO.getNome());

        return loja;
    }
	
	private LojaVO montarLojaVO(Collection<Loja> collection) {

        LojaVO lojaVO = new LojaVO();
        lojaVO.setNome(lojaVO.getNome());

        return lojaVO;
    }
	
	@GET
    @Produces("application/json")
    public Collection<LojaVO> listaUsuario() {              

        return (Collection<LojaVO>) this.montarLojaVO(this.lojaBeanRemote.listaLojas());
    }

}
