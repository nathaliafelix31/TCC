package br.edu.ifnmg.SistemaIFNMG.logicaAplicacao;

import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Cargo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-18T13:15:43", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, Long> id;
    public static volatile SingularAttribute<Pessoa, Cargo> cargo;
    public static volatile SingularAttribute<Pessoa, Long> version;

}