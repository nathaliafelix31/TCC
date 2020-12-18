package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Pessoa;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.TransacaoCadastro;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.TransacaoTipo;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Usuario;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-18T13:15:43", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Transacao.class)
public class Transacao_ { 

    public static volatile SingularAttribute<Transacao, TransacaoTipo> tipo;
    public static volatile SingularAttribute<Transacao, Pessoa> pessoa;
    public static volatile SingularAttribute<Transacao, Usuario> usuario;
    public static volatile SingularAttribute<Transacao, Long> id;
    public static volatile ListAttribute<Transacao, TransacaoCadastro> cadastro;
    public static volatile SingularAttribute<Transacao, Date> criacao;
    public static volatile SingularAttribute<Transacao, Long> version;

}