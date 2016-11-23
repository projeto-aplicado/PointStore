package br.unifor.pointstore.bean;

import java.util.Collection;

import br.unifor.pointstore.entity.Usuario;

public interface UsuarioBeanRemote {
	
	public Collection<Usuario> listaUsuario();
    public String insere(Usuario usuario);
    public String remove(Long id);    
    public Usuario busca(Long id);
    public String altera(Usuario usuario);

}
