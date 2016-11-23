package br.unifor.pointstore.bean;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.unifor.pointstore.dao.UsuarioDAO;
import br.unifor.pointstore.entity.Usuario;

@Stateless
public class UsuarioBean implements UsuarioBeanRemote{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	//private Usuario usuario;
	private UsuarioDAO usuarioDao;


	@Override
	public Collection<Usuario> listaUsuario() {
		return this.usuarioDao.listarUsuario();
	}


	@Override
	public String insere(Usuario usuario) {
		return this.usuarioDao.inserirUsuario(usuario);
	}


	@Override
	public String remove(Long id) {
		return this.usuarioDao.removerUsuario(id);
	}


	@Override
	public Usuario busca(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String altera(Usuario usuario) {
		return this.usuarioDao.atualizarUsuario(usuario);
	}

}
