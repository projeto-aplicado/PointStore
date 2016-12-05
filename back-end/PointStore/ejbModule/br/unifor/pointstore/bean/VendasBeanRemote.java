package br.unifor.pointstore.bean;

import java.util.Collection;

import javax.ejb.Remote;

import br.unifor.pointstore.entity.Vendas;

@Remote
public interface VendasBeanRemote {
	
	public Collection<Vendas> listaVendas();
    public String insere(Vendas vendas);
    public String remove(Long id);    
    public Vendas busca(Long id);
    //public String altera(Vendas vendas);

}
