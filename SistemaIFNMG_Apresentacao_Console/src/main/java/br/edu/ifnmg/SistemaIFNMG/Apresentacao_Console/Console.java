/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.Apresentacao_Console;

import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Usuario;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.UsuarioRepositorio;
import br.edu.ifnmg.SistemaIFNMG.Persistencia.UsuarioDAO;

/**
 *
 * @author nathalia
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioDAO();
        Usuario u = new Usuario();
        u.setLogin("Alisson");
        u.setSenha("123");
        
        if(repo.Salvar(u)){
            System.out.println("Sucesso");
        
        } else {
            System.out.println("Falha");
        }
    }
    
}
