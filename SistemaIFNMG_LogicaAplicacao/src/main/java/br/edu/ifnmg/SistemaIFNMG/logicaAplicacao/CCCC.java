/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author Antônia
 */
@Entity
@Table(name = "CCCC")
@DiscriminatorValue(value = "1")
public class CCCC extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(nullable = false, length = 250, unique = true)
    private String email;
   
    
    @Version
    private int version;
   
       public CCCC(){
       super();
        this.setCargo(Cargo.CCCC);
        this.email = "";
        this.version = 1;
    }
      
      public CCCC(String nome, String email, Cargo cargo){
       super();
        this.setCargo(Cargo.CCCC);
        this.setNome(nome);
        this.email = "";
        this.version = 1;
      }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CCCC other = (CCCC) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return email ;
    }
    
    

}