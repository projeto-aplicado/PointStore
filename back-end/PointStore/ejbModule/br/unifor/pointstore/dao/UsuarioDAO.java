package br.unifor.pointstore.dao;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import br.unifor.pointstore.entity.Usuario;

@Stateless
public class UsuarioDAO {

	@PersistenceContext
	private EntityManager entityManager;
	

	public String inserirUsuario(Usuario usuario) {
		try {
			this.entityManager.persist(usuario);
			return "Usuario " + usuario.getNome() + " foi inserido com sucesso!";
		} catch (PersistenceException pe) {
			return "Erro ao inserir usuario" + pe;
		}
	}
	
	public String removerUsuario(Long id){
		try {
			Usuario usuario = this.entityManager.find(Usuario.class, id);
			this.entityManager.remove(usuario);
			return "Usuario " + usuario.getNome() + " foi removido com sucesso!";
		} catch (PersistenceException pe) {
			return "Erro ao remover usuario" + pe;
		}
	}
	
	public String atualizarUsuario(Usuario usuario){
		try {
			Usuario usuarioDetached = this.entityManager.find(Usuario.class, usuario.getIdUsuario());
			Usuario usuarioMerged = this.entityManager.merge(usuarioDetached);
			
			usuarioMerged.setNome(usuario.getNome());
			usuarioMerged.setSobrenome(usuario.getSobrenome());
			usuarioMerged.setCpf(usuario.getCpf());
			usuarioMerged.setCredito(usuario.getCredito());
			usuarioMerged.setLogin(usuario.getLogin());
			usuarioMerged.setSenha(usuario.getSenha());
			
			
			return "Usuario " + usuario.getNome() + " atualizado com sucesso";
		} catch (PersistenceException pe) {
			return "Erro ao atualizar usuario" + pe;
		}
	}
	
	public String recuperarSenha(Usuario user){
		try {
			Usuario usuarioDetached = (Usuario) this.entityManager.createQuery("SELECT user from Usuario user where user.email = :email")
					 											  .setParameter("email",user.getEmail() ).getSingleResult();
			Usuario usuarioMerged = this.entityManager.merge(usuarioDetached);
			
			
			
			usuarioMerged.setSenha(user.getSenha());
			
			return "Usuario " + usuarioDetached.getNome() + " atualizado com sucesso";
		} catch (PersistenceException pe) {
			return "Erro ao atualizar usuario" + pe;
		}
	}
	
	public Collection<Usuario> listarUsuario() {

        return this.entityManager.createQuery("SELECT u FROM Usuario u").getResultList();
    }
	
	public Usuario logarUsuario(Usuario userLogin){
		Usuario usuarioDetached = (Usuario) this.entityManager.createQuery("SELECT user from Usuario user where user.login = :login and user.senha = :senha")
				  .setParameter("login", userLogin.getLogin() ).setParameter("senha", userLogin.getSenha()).getSingleResult();
		
		return usuarioDetached;
	}
	
}
