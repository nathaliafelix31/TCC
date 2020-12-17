package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Pessoa;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-16T22:12:24", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Transacao.class)
public class Transacao_ { 

    public static volatile SingularAttribute<Transacao, Pessoa> pessoa;
    public static volatile SingularAttribute<Transacao, BigDecimal> valorTotal;
    public static volatile SingularAttribute<Transacao, Long> id;
    public static volatile SingularAttribute<Transacao, Date> criacao;
    public static volatile SingularAttribute<Transacao, Integer> version;

}