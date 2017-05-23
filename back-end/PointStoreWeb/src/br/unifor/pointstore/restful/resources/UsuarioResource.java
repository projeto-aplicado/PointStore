package br.unifor.pointstore.restful.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.unifor.pointstore.bean.UsuarioBeanRemote;
import br.unifor.pointstore.entity.Loja;
import br.unifor.pointstore.entity.Usuario;
import br.unifor.pointstore.restful.model.LojaVO;
import br.unifor.pointstore.restful.model.UsuarioVO;

@Stateless
@Path("/usuario")
public class UsuarioResource {
	
	@EJB
    private UsuarioBeanRemote usuarioBeanRemote;
	

	private Usuario montarUsuario(UsuarioVO userVO) {

        Usuario user = new Usuario();
        user.setIdUsuario(userVO.getIdUsuario());
        user.setNome(userVO.getNome());
        user.setSobrenome(userVO.getSobrenome());
        user.setCredito(userVO.getCredito());
        user.setEmail(userVO.getEmail());
        user.setCpf(userVO.getCpf());
        user.setLogin(userVO.getLogin());
        user.setSenha(userVO.getSenha());

        return user;
    }
	
	private List<UsuarioVO> montarUsuarioVO(Collection<Usuario> collection) {
		List<UsuarioVO> list = new ArrayList<UsuarioVO>();
		for (Usuario user : collection) {
			UsuarioVO userVO = new UsuarioVO();
	        userVO.setIdUsuario(user.getIdUsuario());
	        userVO.setNome(user.getNome());
	        userVO.setSobrenome(user.getSobrenome());
	        userVO.setCredito(user.getCredito());
	        userVO.setEmail(user.getEmail());
	        userVO.setLogin(user.getLogin());
	        userVO.setSenha(user.getSenha());
	     
		}
        return list;
    }
	
	
	@GET
    @Produces("application/json")
    public Collection<UsuarioVO> listaUsuario() {              

        return (Collection<UsuarioVO>) this.montarUsuarioVO(this.usuarioBeanRemote.listaUsuario());
    }

	
	@POST
    @Consumes("application/json")
    @Produces("text/plain")
	public String inserirUsuario(UsuarioVO userVO){
		return this.usuarioBeanRemote.insere(montarUsuario(userVO));
	}
	

	
	@PUT
    @Consumes("application/json")
    @Produces("text/plain")
	public String atualizarUsuario(UsuarioVO userVO){
		return this.usuarioBeanRemote.altera(montarUsuario(userVO));
	}	
}
