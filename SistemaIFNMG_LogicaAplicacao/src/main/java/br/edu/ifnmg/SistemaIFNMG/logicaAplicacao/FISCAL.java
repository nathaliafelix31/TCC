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

/**
 *
 * @author Antônia
 */
@Entity
@Table(name = "FISCAL")
@DiscriminatorValue(value = "3")
public class FISCAL extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(nullable = false, length = 250, unique = true)
     private String email;
     
      public FISCAL(){
       super();
        this.email = "";
    }
      
      public String getEmail() {
        return email;
    }

      public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final FISCAL other = (FISCAL) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return email;
    }
    
    
}