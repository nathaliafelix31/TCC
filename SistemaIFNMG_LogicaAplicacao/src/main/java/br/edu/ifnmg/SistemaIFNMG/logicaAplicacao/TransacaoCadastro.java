/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import  java.io.Serializable ;
import  java.math.BigDecimal ;
import  java.util.Objects ;
import  javax.persistence.Column ;
import  javax.persistence.Entity ;
import  javax.persistence.Id ;
import  javax.persistence.JoinColumn ;
import  javax.persistence.ManyToOne ;
import  javax.persistence.Table ;
/**
 *
 * @author Antônia
 */

@Entity
@Table(name="transacaoCadastro")
public  class  TransacaoCadastro  implements  Serializable {
    
    @Id
    @ManyToOne
    @JoinColumn (name="transacao_id ",nullable = false )
    private Transacao transacao;
    
    @Id
    @ManyToOne
    @JoinColumn (name="empenho_id " , nullable = false )
    private  Empenhos empenho;
    
    @Id
    @ManyToOne
    @JoinColumn(name="contrato_id " , nullable = false )
    private  Contratos contrato;
    
    
       public  TransacaoCadastro() {
        this.empenho =  null ;
        this.transacao =  null ;
        this.contrato =  null ;
       
    }

    public  TransacaoCadastro(Empenhos empenho, Contratos contrato) {
        this.empenho = empenho;
        this.contrato = contrato;
    }

    public  Transacao  getTransacao () {
        return transacao;
    }

    public  void  setTransacao (Transacao  transacao) {
       this.transacao = transacao;
    }

    public Empenhos getEmpenho() {
        return empenho;
    }

    public void setEmpenho(Empenhos empenho) {
        this.empenho = empenho;
    }

    public Contratos getContrato() {
        return contrato;
    }

    public void setContrato(Contratos contrato) {
        this.contrato = contrato;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.transacao);
        hash = 29 * hash + Objects.hashCode(this.empenho);
        hash = 29 * hash + Objects.hashCode(this.contrato);
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
        final TransacaoCadastro other = (TransacaoCadastro) obj;
        if (!Objects.equals(this.transacao, other.transacao)) {
            return false;
        }
        if (!Objects.equals(this.empenho, other.empenho)) {
            return false;
        }
        if (!Objects.equals(this.contrato, other.contrato)) {
            return false;
        }
        return true;
    }


    

    @Override
    public  String  toString () {
        return  " transacaoCadastro " ;
    }
    
    
    
}
