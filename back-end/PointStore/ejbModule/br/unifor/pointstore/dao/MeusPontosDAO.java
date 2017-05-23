package br.unifor.pointstore.dao;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import br.unifor.pointstore.entity.MeusPontos;


@Stateless
public class MeusPontosDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public String inserirMeusPontos(MeusPontos meusPontos) {
		try {
			this.entityManager.persist(meusPontos);
			return "A loja " + meusPontos.getLoja() + " foi inserido com sucesso!";
		} catch (PersistenceException pe) {
			return "Erro ao inserir loja" + pe;
		}
	}
	
	
	public String atualizarMeusPontos(MeusPontos meusPontos){
		try {
			MeusPontos meusPontosDetached = this.entityManager.find(MeusPontos.class, meusPontos.getIdMeusPontos());
			MeusPontos meusPontosMerged = this.entityManager.merge(meusPontosDetached);
			
			meusPontosMerged.setQuantidade(meusPontos.getQuantidade());
			meusPontosMerged.setLoja(meusPontos.getLoja());
			
			return "Meu ponto " + meusPontos.getLoja() + " atualizado com sucesso";
		} catch (PersistenceException pe) {
			return "Erro ao atualizar meu ponto" + pe;
		}
	}
	
	public Collection<MeusPontos> listarMeusPontos() {

        return this.entityManager.createQuery("SELECT u FROM MeusPontos u").getResultList();
    }

}
