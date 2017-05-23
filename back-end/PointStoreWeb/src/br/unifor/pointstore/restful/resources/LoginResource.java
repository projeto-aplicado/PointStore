package br.unifor.pointstore.restful.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.unifor.pointstore.bean.UsuarioBeanRemote;
import br.unifor.pointstore.entity.Usuario;
import br.unifor.pointstore.restful.model.UsuarioVO;

@Stateless
@Path("/usuarioLogin")
public class LoginResource {
	
	@EJB
    private UsuarioBeanRemote usuarioBeanRemote;
	
	
	
	private Usuario montarUsuario(UsuarioVO userVO) {

        Usuario user = new Usuario();
        user.setEmail(userVO.getEmail());
        user.setSenha(userVO.getSenha());

        return user;
    }
	
	private List<UsuarioVO> montarUsuarioVO(Collection<Usuario> collection) {
		List<UsuarioVO> list = new ArrayList<UsuarioVO>();
		for (Usuario usuario : collection) {
	
			UsuarioVO userVO = new UsuarioVO();
			userVO.setEmail(usuario.getEmail());
			userVO.setSenha(usuario.getSenha());
		}


        return list;
    }
	
	@GET
    @Produces("application/json")
    public Collection<UsuarioVO> listaUsuario() {              

        return (Collection<UsuarioVO>) this.montarUsuarioVO(this.usuarioBeanRemote.listaUsuario());
    }
	
	
	@PUT
	@Path("{email}")
    @Consumes("application/json")
    @Produces("text/plain")
	public String recuperarSenhaUsuario(UsuarioVO userVO, @PathParam("email") String email){
		return this.usuarioBeanRemote.recuperarSenha(montarUsuario(userVO));
	}
	
	
	@POST
    @Consumes("application/json")
    @Produces("application/json")
	public Usuario logarUsuario(Usuario userLogin){
		return this.usuarioBeanRemote.logarUsuario(userLogin);
	}

}
