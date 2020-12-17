/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.Persistencia;


import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Transacao;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.TransacaoRepositorio;
import java.util.List;

/**
 *
 * @author Antônia
 */
public class TransacaoDAO 
        extends DataAccessObject<Transacao>
        implements TransacaoRepositorio
{

    public TransacaoDAO() {
        super(Transacao.class);
    }
    
    @Override
    public List<Transacao> Buscar(Transacao obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}