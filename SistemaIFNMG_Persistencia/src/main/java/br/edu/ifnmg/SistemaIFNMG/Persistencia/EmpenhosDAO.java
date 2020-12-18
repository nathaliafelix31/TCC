/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.Persistencia;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Empenhos;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.EmpenhosRepositorio;
import java.util.List;
/**
 *
 * @author Antônia
 */
public class EmpenhosDAO
        extends DataAccessObject<Empenhos>
        implements EmpenhosRepositorio
{

    public EmpenhosDAO() {
        super(Empenhos.class);
    }
    
    

    @Override
    public List<Empenhos> Buscar(Empenhos obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}