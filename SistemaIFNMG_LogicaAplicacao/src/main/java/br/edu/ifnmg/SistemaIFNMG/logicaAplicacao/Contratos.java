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
@Table(name="Contratos")
public class Contratos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(TemporalType.DATE)
    private Date anoOrigem;
    
    private int contrato; 
    private int processo; 
    
    @Column(length = 250, nullable = false)
    private String objeto; 
    
    @Column(precision = 8, scale = 2 )
    private BigDecimal valor; 
    
    @Column(length = 250, nullable = false)
    private String empContratada; 
    
    @Temporal(TemporalType.DATE)
    private Date dataAssinatura; 
    
    @Temporal(TemporalType.DATE)
    private Date inicioVigencia;
    
    @Temporal(TemporalType.DATE)
    private Date finalVigencia;
    
    @Temporal(TemporalType.DATE)
    private Date publiDou;
    
    @Column(length = 250)
    private String obs; 
    
    @Column(length = 250)
    private String vigenciaGarantia;
    
    @Column(length = 250, nullable = false)
    private String fiscal; 
    
    @Version
    private int version;
    
    public Contratos(){
        this.id = 0L;
        this.anoOrigem = new Date();
        this.contrato = 0;
        this.dataAssinatura = new Date();
        this.empContratada = "";
        this.finalVigencia = new Date();
        this.fiscal = "";
        this.inicioVigencia = new Date();
        this.objeto = "";
        this.obs = "";
        this.processo = 0 ;
        this.publiDou = new Date();
        this.valor = new BigDecimal(0.00);
        this.vigenciaGarantia = "";
        this.version = 1;
                
    }

    public Date getAnoOrigem() {
        return anoOrigem;
    }

    public void setAnoOrigem(Date anoOrigem) {
        this.anoOrigem = anoOrigem;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getProcesso() {
        return processo;
    }

    public void setProcesso(int processo) {
        this.processo = processo;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getEmpContratada() {
        return empContratada;
    }

    public void setEmpContratada(String empContratada) {
        this.empContratada = empContratada;
    }

    public Date getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(Date dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public Date getFinalVigencia() {
        return finalVigencia;
    }

    public void setFinalVigencia(Date finalVigencia) {
        this.finalVigencia = finalVigencia;
    }

    public Date getPubliDou() {
        return publiDou;
    }

    public void setPubliDou(Date publiDou) {
        this.publiDou = publiDou;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getVigenciaGarantia() {
        return vigenciaGarantia;
    }

    public void setVigenciaGarantia(String vigenciaGarantia) {
        this.vigenciaGarantia = vigenciaGarantia;
    }

    public String getFiscal() {
        return fiscal;
    }

    public void setFiscal(String fiscal) {
        this.fiscal = fiscal;
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
        if (!(object instanceof Contratos)) {
            return false;
        }
        Contratos other = (Contratos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Contratos[ id=" + id + " ]";
    }
    
}
