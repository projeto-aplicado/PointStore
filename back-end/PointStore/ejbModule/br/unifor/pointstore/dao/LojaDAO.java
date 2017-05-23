package br.unifor.pointstore.dao;

import java.util.ArrayList;
import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import br.unifor.pointstore.entity.Loja;
import br.unifor.pointstore.entity.Usuario;

@Stateless
public class LojaDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Collection<Loja> listarLojas() {

        return this.entityManager.createQuery("SELECT l FROM lojas l").getResultList();
    }
	
	
}
