/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.Persistencia;

import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Contratos;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.ContratosRepositorio;
import java.util.List;

/**
 *
 * @author Antônia
 */
public class ContratosDAO
        extends DataAccessObject<Contratos>
        implements ContratosRepositorio
{

    public ContratosDAO() {
        super(Contratos.class);
    }
    
    

    @Override
    public List<Contratos> Buscar(Contratos obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
