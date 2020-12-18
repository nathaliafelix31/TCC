/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonia
 */
public class RepositorioFactory {
    
    private static Properties propriedades = new Properties();
    
    private static UsuarioRepositorio usuario;
    private static FiscalRepositorio fiscal;
    private static CCCCrepositorio cccc;
    private static DOFrepositorio dof;
    private static EmpenhosRepositorio empenho;
    private static ContratosRepositorio contratos;
    private static TransacaoRepositorio transacao;
    
    static {
        FileReader leitorArquivo = null;
        
        try {
            
            File arquivoPropriedades = new File("config.properties");
            leitorArquivo = new FileReader(arquivoPropriedades);    
            propriedades.load(leitorArquivo);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                leitorArquivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private static Object getInstancia(String nomeclasse){
        try {
            Class classe = Class.forName(nomeclasse);
            Object instancia = classe.getDeclaredConstructor().newInstance();
            
            return instancia;
            
        } catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex){
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static UsuarioRepositorio getUsuarioRepositorio() {
        if(usuario == null){
            String nomeclasse = propriedades.getProperty("UsuarioRepositorio");
            usuario = (UsuarioRepositorio) getInstancia(nomeclasse);
        }
        return usuario;
    }
    
     public static FiscalRepositorio getFiscalRepositorio() {
        if(fiscal == null){
            String nomeclasse = propriedades.getProperty("FiscalRepositorio");
            fiscal = (FiscalRepositorio) getInstancia(nomeclasse);
        }
        return fiscal;
    }
      public static CCCCrepositorio getCCCCRepositorio() {
        if(cccc == null){
            String nomeclasse = propriedades.getProperty("CCCCrepositorio");
            cccc = (CCCCrepositorio) getInstancia(nomeclasse);
        }
        return cccc;
    }
       public static DOFrepositorio getDOFRepositorio() {
        if(dof == null){
            String nomeclasse = propriedades.getProperty("DOFrepositorio");
            dof = (DOFrepositorio) getInstancia(nomeclasse);
        }
        return dof;
    }
        public static EmpenhosRepositorio getEmpenhoRepositorio() {
        if(empenho == null){
            String nomeclasse = propriedades.getProperty("EmpenhoRepositorio");
            empenho = (EmpenhosRepositorio) getInstancia(nomeclasse);
        }
        return empenho;
    }
         public static ContratosRepositorio getContratosRepositorio() {
        if(contratos == null){
            String nomeclasse = propriedades.getProperty("EmpenhoRepositorio");
            contratos = (ContratosRepositorio) getInstancia(nomeclasse);
        }
        return contratos;
    }
          public static TransacaoRepositorio getTransacaoRepositorio() {
        if(transacao == null){
            String nomeclasse = propriedades.getProperty("TransacaoRepositorio");
            transacao = (TransacaoRepositorio) getInstancia(nomeclasse);
        }
        return transacao;
    }
    
}