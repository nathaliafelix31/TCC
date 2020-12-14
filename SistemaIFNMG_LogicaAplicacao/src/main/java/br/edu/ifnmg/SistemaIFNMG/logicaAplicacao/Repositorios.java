/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nathalia
 */
public class Repositorios {
    private static Object carregarClasse(String classe){
        try{
            Object obj = (Object)Class.forName(classe).getDeclaredConstructor().newInstance();
            return obj;
        } catch (ClassNotFoundException ex ) {
            Logger.getLogger(Repositorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex ) {
            Logger.getLogger(Repositorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Repositorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex ) {
            Logger.getLogger(Repositorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex ) {
            Logger.getLogger(Repositorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex ) {
            Logger.getLogger(Repositorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex ) {
            Logger.getLogger(Repositorios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    private static UsuarioRepositorio usuarios;
    
    public static UsuarioRepositorio getUsuarios(){
        if (usuarios == null)
            usuarios = (UsuarioRepositorio) carregarClasse("br.edu.ifnmg.SistemaIFNMG.Persistncia.UsuarioDAO");
        return usuarios;
    }
}
