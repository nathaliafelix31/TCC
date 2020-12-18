/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 *
 * @author nathalia
 */
@Entity
@Table(name="Empenhos")
public class Empenhos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 250, nullable = false)
    private String licitacaoProceso;
    
    @Column(length = 250,  nullable = false)
    private String objeto;
    
    @Column(length = 250,  nullable = false)
    private String solicitante;
    
    @Column(length = 250,  nullable = false)
    private String fornecedor;
    
    @Column(length = 20,  nullable = false)
    private String telFornecedor;
    
    private int prazoEntregaDias;
    
    @Column(length = 250,  nullable = false)
    private String emailFornecedor;
    
    @Column(length = 250,  nullable = false)
    private String enderecoFornecedor;
    
    @Column(length = 100,  nullable = false)
    private String itens; 

    
    @Column(length = 30, nullable = false)
    private String nNota;
    
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    
    @Temporal(TemporalType.DATE)
    private Date dataEntrega;
    
    @Column(precision = 8, scale = 2 )
    private BigDecimal valorTotal;
    
    @Column(length = 250,  nullable = false )
    private String pessoaAR;
    
    @Temporal(TemporalType.DATE)
    private Date prazoFinal;
    
    @Version
    private long version;
    
    public Empenhos(){
        this.id = 0L;
        this.valorTotal = new BigDecimal("0.00");
        this.dataEmissao = new Date();
        this.dataEntrega = new Date();
        this.emailFornecedor = "";
        this.enderecoFornecedor = "";
        this.fornecedor = "";
        this.itens = "";
        this.licitacaoProceso = "";
        this.nNota = "";
        this.objeto = "";
        this.pessoaAR = "";
        this.prazoEntregaDias = 0;
        this.prazoFinal = new Date();
        this.solicitante = "";
        this.telFornecedor = "";
        this.version = 1;
    }

        public Empenhos(String licitacaoProcesso, String objeto,String solicitante,
        String fornecedor, String itens, String telFornecedor,String emailFornecedor,String enderecoFornecedor,
        int prazoEntregaDias,String nNota, String valorTotal,Date dataEmissao, Date dataEntrega, String pessoaAR, Date prazoFinal){
        this.id = 0L;
        this.valorTotal = new BigDecimal(valorTotal);
        this.dataEmissao = new Date();
        this.dataEntrega = new Date();
        this.emailFornecedor = "";
        this.enderecoFornecedor = "";
        this.fornecedor = "";
        this.itens = "";
        this.licitacaoProceso = "";
        this.nNota = "";
        this.objeto = "";
        this.pessoaAR = "";
        this.prazoEntregaDias = 0;
        this.prazoFinal = new Date();
        this.solicitante = "";
        this.telFornecedor = "";
        this.version = 1;
    }
    
    public String getLicitacaoProceso() {
        return licitacaoProceso;
    }

    public String getObjeto() {
        return objeto;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public String getTelFornecedor() {
        return telFornecedor;
    }

    public int getPrazoEntregaDias() {
        return prazoEntregaDias;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public String getItens() {
        return itens;
    }

    public String getnNota() {
        return nNota;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public String getPessoaAR() {
        return pessoaAR;
    }

    public Date getPrazoFinal() {
        return prazoFinal;
    }

    public void setLicitacaoProceso(String licitacaoProceso) {
        this.licitacaoProceso = licitacaoProceso;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setTelFornecedor(String telFornecedor) {
        this.telFornecedor = telFornecedor;
    }

    public void setPrazoEntregaDias(int prazoEntregaDias) {
        this.prazoEntregaDias = prazoEntregaDias;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public void setnNota(String nNota) {
        this.nNota = nNota;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setPessoaAR(String pessoaAR) {
        this.pessoaAR = pessoaAR;
    }

    public void setPrazoFinal(Date prazoFinal) {
        this.prazoFinal = prazoFinal;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
  
    
 



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Empenhos)) {
            return false;
        }
        Empenhos other = (Empenhos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return objeto;
    }
    
}
