package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Contratos;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Empenhos;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Transacao;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-18T13:15:43", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(TransacaoCadastro.class)
public class TransacaoCadastro_ { 

    public static volatile SingularAttribute<TransacaoCadastro, Transacao> transacao;
    public static volatile SingularAttribute<TransacaoCadastro, Empenhos> empenho;
    public static volatile SingularAttribute<TransacaoCadastro, Contratos> contrato;

}