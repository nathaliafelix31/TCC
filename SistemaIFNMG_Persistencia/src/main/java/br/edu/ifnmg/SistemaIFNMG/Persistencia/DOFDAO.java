/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.Persistencia;


import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.DOF;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.DOFrepositorio;
import java.util.Hashtable;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author Antônia
 */
    public class DOFDAO 
        extends DataAccessObject<DOF>
        implements DOFrepositorio
{

    public DOFDAO() {
        super(DOF.class);
    }
    
    @Override
    public List<DOF> Buscar(DOF obj) {
        String jpql = "select D from DOF D";
        String filtros = "";
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(obj != null){
        
            if(obj.getNome().length() > 0){
                filtros += "D.nome like :nome";
                parametros.put("nome", obj.getNome() + "%");
            }

           
            if(obj.getEmail()!= null){
                if(filtros.length() > 0) filtros += " and ";
                filtros += "D.email like :email";
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
    public DOF AbrirPorEmail(String email) {
        Query consulta = this.manager.createQuery("select D from DOF D where D.email =:parametro");
        consulta.setParameter("parametro", email);
        return (DOF) consulta.getSingleResult();
    }*/
    
}