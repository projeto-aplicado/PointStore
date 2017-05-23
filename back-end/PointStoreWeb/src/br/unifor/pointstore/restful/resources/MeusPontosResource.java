package br.unifor.pointstore.restful.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.unifor.pointstore.bean.MeusPontosBeanRemote;
import br.unifor.pointstore.entity.MeusPontos;
import br.unifor.pointstore.restful.model.MeusPontosVO;
import br.unifor.pointstore.restful.model.UsuarioVO;

@Stateless
@Path("/meuspontos")
public class MeusPontosResource {

	@EJB
    private MeusPontosBeanRemote meusPontosBeanRemote;
	
	
	private MeusPontos montarMeusPontos(MeusPontosVO meusPontosVO) {

		MeusPontos meusPontos = new MeusPontos();
		meusPontos.setQuantidade(meusPontosVO.getQuantidade());
		meusPontos.setLoja(meusPontosVO.getLoja());
        return meusPontos;
    }
	
	private List<MeusPontosVO> montarMeusPontosVO(Collection<MeusPontos> collection) {
		List<MeusPontosVO> list = new ArrayList<MeusPontosVO>();
		for (MeusPontos meusPontos : collection) {
	
			MeusPontosVO meusPontosVO = new MeusPontosVO();
			meusPontosVO.setQuantidade(meusPontos.getQuantidade());
			meusPontosVO.setLoja(meusPontos.getLoja());
		}
        return list;
    }
	
	
	@POST
    @Consumes("application/json")
    @Produces("text/plain")
	public String inserirMeusPontos(MeusPontosVO meusPontosVO){
		return this.meusPontosBeanRemote.insere(montarMeusPontos(meusPontosVO));
	}
	

	@PUT
    @Consumes("application/json")
    @Produces("text/plain")
	public String atualizarMeusPontos(MeusPontosVO meusPontosVO){
		return this.meusPontosBeanRemote.atualizar(montarMeusPontos(meusPontosVO));
	}
	
	
}
