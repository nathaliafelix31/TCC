package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-16T22:12:24", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Contratos.class)
public class Contratos_ { 

    public static volatile SingularAttribute<Contratos, String> obs;
    public static volatile SingularAttribute<Contratos, Date> anoOrigem;
    public static volatile SingularAttribute<Contratos, String> empContratada;
    public static volatile SingularAttribute<Contratos, BigDecimal> valor;
    public static volatile SingularAttribute<Contratos, Integer> contrato;
    public static volatile SingularAttribute<Contratos, String> objeto;
    public static volatile SingularAttribute<Contratos, Date> publiDou;
    public static volatile SingularAttribute<Contratos, Integer> version;
    public static volatile SingularAttribute<Contratos, Date> inicioVigencia;
    public static volatile SingularAttribute<Contratos, String> fiscal;
    public static volatile SingularAttribute<Contratos, Integer> processo;
    public static volatile SingularAttribute<Contratos, Date> finalVigencia;
    public static volatile SingularAttribute<Contratos, String> vigenciaGarantia;
    public static volatile SingularAttribute<Contratos, Long> id;
    public static volatile SingularAttribute<Contratos, Date> dataAssinatura;

}