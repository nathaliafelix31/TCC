package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-17T23:27:49", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Empenhos.class)
public class Empenhos_ { 

    public static volatile SingularAttribute<Empenhos, String> telFornecedor;
    public static volatile SingularAttribute<Empenhos, String> itens;
    public static volatile SingularAttribute<Empenhos, String> licitacaoProceso;
    public static volatile SingularAttribute<Empenhos, String> pessoaAR;
    public static volatile SingularAttribute<Empenhos, String> solicitante;
    public static volatile SingularAttribute<Empenhos, String> objeto;
    public static volatile SingularAttribute<Empenhos, Integer> prazoEntregaDias;
    public static volatile SingularAttribute<Empenhos, String> emailFornecedor;
    public static volatile SingularAttribute<Empenhos, Date> dataEmissao;
    public static volatile SingularAttribute<Empenhos, Long> version;
    public static volatile SingularAttribute<Empenhos, String> nNota;
    public static volatile SingularAttribute<Empenhos, String> enderecoFornecedor;
    public static volatile SingularAttribute<Empenhos, Date> dataEntrega;
    public static volatile SingularAttribute<Empenhos, BigDecimal> valorTotal;
    public static volatile SingularAttribute<Empenhos, Date> prazoFinal;
    public static volatile SingularAttribute<Empenhos, Long> id;
    public static volatile SingularAttribute<Empenhos, String> fornecedor;

}