/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.Persistencia;

import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.CCCC;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.CCCCrepositorio;
import java.util.Hashtable;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author Antônia
 */
    public class CCCCDAO 
        extends DataAccessObject<CCCC>
        implements CCCCrepositorio
{

    public CCCCDAO() {
        super(CCCC.class);
    }
    
    @Override
    public List<CCCC> Buscar(CCCC obj) {
        String jpql = "select C from CCCC C";
        String filtros = "";
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(obj != null){
        
            if(obj.getNome().length() > 0){
                filtros += "C.nome like :nome";
                parametros.put("nome", obj.getNome() + "%");
            }

           
            if(obj.getEmail()!= null){
                if(filtros.length() > 0) filtros += " and ";
                filtros += "C.email like :email";
                parametros.put("email", obj.getEmail() + "%");
            }
        
        }
        
        if(filtros.length() > 0)
            jpql = jpql + " where " + filtros;
        
        Query consulta = this.manager.createQuery(jpql);
        
        for(String chave : parametros.keySet())
            consulta.setParameter(chave, parametros.get(chave));
        
        return consulta.getResultList();
    }

    /*@Override
    public CCCC AbrirPorEmail(String email) {
        Query consulta = this.manager.createQuery("select C from CCCC C where C.email =:parametro");
        consulta.setParameter("parametro", email);
        return (CCCC) consulta.getSingleResult();
    }*/
    
}
