/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.Persistencia;


import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.FISCAL;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.FiscalRepositorio;
import java.util.Hashtable;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author Antônia
 */
    public class FISCALDAO 
        extends DataAccessObject<FISCAL>
        implements FiscalRepositorio
{

    public FISCALDAO() {
        super(FISCAL.class);
    }
    
    @Override
    public List<FISCAL> Buscar(FISCAL obj) {
        String jpql = "select F from FISCAL F";
        String filtros = "";
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(obj != null){
        
            if(obj.getNome().length() > 0){
                filtros += "F.nome like :nome";
                parametros.put("nome", obj.getNome() + "%");
            }

           
            if(obj.getEmail()!= null){
                if(filtros.length() > 0) filtros += " and ";
                filtros += "F.email like :email";
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

    @Override
    public FISCAL AbrirPorEmail(String email) {
        Query consulta = this.manager.createQuery("select F from FISCAL F where F.email =:parametro");
        consulta.setParameter("parametro", email);
        return (FISCAL) consulta.getSingleResult();
    }
    
}
