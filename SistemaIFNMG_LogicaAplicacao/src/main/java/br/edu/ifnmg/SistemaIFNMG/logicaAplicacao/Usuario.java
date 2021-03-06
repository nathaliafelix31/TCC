/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nathalia
 */
@Entity
@Table(name="Usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name= "Login", length= 150, nullable = false, unique = true)
    private String login;
    
    @Column(name= "Senha", length= 150, nullable = false, unique = true)
    private String senha;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimoAcesso;
    
    /*@Column(name= "Tipo")
    private Cargo tipo;*/
    
    public Usuario(){
        this.login = "";
        this.senha = "";
        this.ultimoAcesso = new Date();
    }

      public Usuario(String login, String senha) {
        this.id = 0L;
        this.login = login;
        this.senha = senha;
    }
    
    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

   /* public Cargo getTipo() {
        return tipo;
    }*/

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   /* public void setTipo(Cargo tipo) {
        this.tipo = tipo;
    }*/
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(Date ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.login;
    }
    
}
