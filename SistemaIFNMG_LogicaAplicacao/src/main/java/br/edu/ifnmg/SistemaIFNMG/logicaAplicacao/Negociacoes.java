/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author Antônia
 */
@Entity
@Table(name = "Negociacoes")
public class Negociacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }
    @ManyToOne
    private Empenhos negociacoes;
    
    @Version
    private long version;
    
    public Negociacoes() {
        this.negociacoes = null;
        this.id = 0L;
        this.version = 1;
    }
    public Negociacoes(Empenhos negociacoes) {
        this.negociacoes = negociacoes;
        this.id = 0L;
        this.version = 1;
    }
    

    public Empenhos getNegociacoes() {
        return negociacoes;
    }

    public void setNegociacoes(Empenhos negociacoes) {
        this.negociacoes = negociacoes;
    }
    
    
    public void setId(Long id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Negociacoes)) {
            return false;
        }
        Negociacoes other = (Negociacoes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Negociacoes{" + "id=" + id + ", negociacoes=" + negociacoes + '}';
    }

   
    
}
