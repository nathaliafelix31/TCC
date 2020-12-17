/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.Persistencia;

import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Pessoa;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.PessoaRepositorio;
import java.util.List;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author Antônia
 */
public class PessoaDAO extends DataAccessObject<Pessoa> implements PessoaRepositorio {

    public PessoaDAO() {
        super(Pessoa.class);
    }
     @Override
    public List<Pessoa> Buscar(Pessoa obj) {
        
        String jpql = "select a from Pessoa a";
        
        String filtros = "";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(obj.getNome().length() > 0){
            filtros += "a.nome like :nome"; 
            parametros.put("nome", obj.getNome()+"%");
        }
        
       /* if(obj.getTipo() != null){
            if(filtros.length() > 0)
                filtros += " and ";
            filtros += "a.tipo = :tipo"; 
            parametros.put("tipo", obj.getTipo());
        }
        */
        if(filtros.length() > 0)
            jpql = jpql + " where " + filtros;
        
        var query = this.manager.createQuery(jpql);
        
        for(String chave : parametros.keySet()){
            query.setParameter(chave, parametros.get(chave));
        }
        
        return query.getResultList();
    }
    
}
