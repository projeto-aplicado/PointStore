package br.unifor.pointstore.restful.resources;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.unifor.pointstore.bean.UsuarioBeanRemote;

@Stateless
@Path("/usuario")
public class UsuarioResource {
	
	@EJB
    private UsuarioBeanRemote usuarioBeanRemote;
	
	@GET
    @Produces("text/plain")
    public String showHelloWorld() {
        return "Ola mundo!";
    }
	
}
