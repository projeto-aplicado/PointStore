package br.unifor.pointstore.restful.resources;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
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
	

//	private Usuario montarUsuario(UsuarioVO userVO) {
//
//        Usuario user = new Usuario();
//        user.setIdUsuario(userVO.getIdUsuario());
//        user.setNome(userVO.getNome());
//        user.setSobrenome(userVO.getSobrenome());
//        user.setCredito(userVO.getCredito());
//        user.setEmail(userVO.getEmail());
//        user.setLogin(userVO.getLogin());
//        user.setSenha(userVO.getSenha());
//        user.setMeusPontos(userVO.getMeusPontos());
//        user.setMinhasCompras(userVO.getMinhasCompras());
//        user.setMinhasVenda(userVO.getMinhasVenda());
//        user.setMinhasQualificacoes(userVO.getMinhasQualificacoes());
//
//        return user;
//    }
//	
//	private UsuarioVO montarUsuarioVO(Collection<Usuario> collection) {
//
//        UsuarioVO userVO = new UsuarioVO();
//        userVO.setIdUsuario(userVO.getIdUsuario());
//        userVO.setNome(userVO.getNome());
//        userVO.setSobrenome(userVO.getSobrenome());
//        userVO.setCredito(userVO.getCredito());
//        userVO.setEmail(userVO.getEmail());
//        userVO.setLogin(userVO.getLogin());
//        userVO.setSenha(userVO.getSenha());
//        userVO.setMeusPontos(userVO.getMeusPontos());
//        userVO.setMinhasCompras(userVO.getMinhasCompras());
//        userVO.setMinhasVenda(userVO.getMinhasVenda());
//        userVO.setMinhasQualificacoes(userVO.getMinhasQualificacoes());
//
//        return userVO;
//    }
	
	
	private Usuario montarUsuario(UsuarioVO userVO) {

        Usuario user = new Usuario();
        user.setSenha(userVO.getSenha());

        return user;
    }
	
	private UsuarioVO montarUsuarioVO(Collection<Usuario> collection) {

        UsuarioVO userVO = new UsuarioVO();
        userVO.setSenha(userVO.getSenha());

        return userVO;
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
	public String recuperarSenhaUsuario(UsuarioVO userVO){
		return this.usuarioBeanRemote.recuperarSenha(montarUsuario(userVO));
	}

}
