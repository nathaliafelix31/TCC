/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.SistemaIFNMG.Apresentacao_Console;

import br.edu.ifnmg.SistemaIFNMG.Persistencia.CCCCDAO;
import br.edu.ifnmg.SistemaIFNMG.Persistencia.ContratosDAO;
import br.edu.ifnmg.SistemaIFNMG.Persistencia.DOFDAO;
import br.edu.ifnmg.SistemaIFNMG.Persistencia.EmpenhosDAO;
import br.edu.ifnmg.SistemaIFNMG.Persistencia.UsuarioDAO;
import br.edu.ifnmg.SistemaIFNMG.Persistencia.FISCALDAO;
import br.edu.ifnmg.SistemaIFNMG.Persistencia.TransacaoDAO;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.CCCC;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Usuario;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Cargo;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.UsuarioRepositorio;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.CCCCrepositorio;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Contratos;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.ContratosRepositorio;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.DOF;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.DOFrepositorio;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.Empenhos;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.EmpenhosRepositorio;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.FISCAL;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.FiscalRepositorio;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.RepositorioFactory;
import br.edu.ifnmg.SistemaIFNMG.logicaAplicacao.TransacaoRepositorio;
import java.util.Date;
/**
 *
 * @author nathalia
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void criaBase() {
         UsuarioRepositorio repou = new UsuarioDAO();
        repou.Salvar(new Usuario("Alisson", "123"));
        repou.Salvar(new Usuario("Joao", "123"));
        repou.Salvar(new Usuario("Roberto","123"));
        
        CCCCrepositorio repoC = new CCCCDAO();
        repoC.Salvar(new CCCC("Alisson","alisson.faria@ifnmg.edu.br",Cargo.CCCC));
        repoC.Salvar(new CCCC("Maria","maria@ifnmg.edu.br",Cargo.CCCC));
        repoC.Salvar(new CCCC("José","jose@ifnmg.edu.br",Cargo.CCCC));
        repoC.Salvar(new CCCC("Ana","ana@ifnmg.edu.br",Cargo.CCCC));
        
        DOFrepositorio repoD = new DOFDAO();
        repoD.Salvar(new DOF("Joao","joao@ifnmg.edu.br",Cargo.DOF));
        repoD.Salvar(new DOF("Lais","lais@ifnmg.edu.br",Cargo.DOF));
        
        
        FiscalRepositorio repof = new FISCALDAO();
        repof.Salvar(new FISCAL("Roberto","roberto@ifnmg.edu.br",Cargo.FISCAL));
        repof.Salvar(new FISCAL("Marina","marina@ifnmg.edu.br",Cargo.FISCAL));
        
        EmpenhosRepositorio repoe = new EmpenhosDAO();
        repoe.Salvar(new Empenhos("Pregão 01/2018","Aquisição de Carnes	Depart. Nutrição - Clarissa","COMERCIAL ANGOS LTDA","07.301.845/0001-66 ","1,2,3,4 e 6","(31)3565-2963","comercialangos@gmail.com","RUA JOSÉ BARRA DO NASCIMENTO. N° 346, LOJA 03, CIDADE JARDIM ELDORADO – CONTAGEM/MG",30,"2018NE800024","67367.20", new Date(06/03/18),new Date(16/03/18),"Larissa",new Date(15/04/2018)));
        repoe.Salvar(new Empenhos("01/02/2018","Aquisição de Carnes Depart.","Nutrição - Clarissa","17.238.122/0001-13 - MARIA URSULINA DE ANDRADE E CIA LTDA$","5","(38)3621-1819","casadasferragensseuantonio@hotmail.com","Rua Quintino Bocaiúva Nº62, Centro, Januária-MG. Cep: 39480-000",30,"2018NE800025","29640.00",new Date(06/03/18),new Date(16/03/18),"Larissa",new Date(15/04/18)));
        
        
        ContratosRepositorio repoco = new ContratosDAO();
        repoco.Salvar(new Contratos(new Date(13-10-2010),"21065000100209-2010","23393.000041/2014-39","Fornecimento de energia elétrica (2014 a 2018)","1700000.00","CEMIG",new Date(13-10-2010),new Date(13-10-2010),new Date(31-05-2020),new Date(17-02-2014),"","","Roberto"));
        repoco.Salvar(new Contratos(new Date(2015-06-02),"038/2015","23393.000273/2015-78","Serviços de publicidade legal","20000.00","EBC - EMPRESA BRASIL DE COMUNIC.",new Date(2015-06-02),new Date(2015-06-02),new Date(2020-05-02),new Date(2015-07-21),"","","Roberto"));
        repoco.Salvar(new Contratos(new Date(30-05-2015),"038/2015","23393.000273/2015-78","TERMO ADITIVO 001/2016","20000.00","EBC - EMPRESA BRASIL DE COMUNIC.",new Date(31-05-2016),new Date(01-06-2016),new Date(31-05-2020),new Date(05-07-2016),"","","Marina"));
        repoco.Salvar(new Contratos(new Date(05-04-2015),"038/2015","23393.000273/2015-78","TERMO ADITIVO 002/2017","20000.00","EBC - EMPRESA BRASIL DE COMUNIC.",new Date(05-04-2017),new Date(01-06-2017),new Date(31-05-2020),new Date(04-05-2017),"","","Marina"));
        
       /* var user1 = repou.Abrir(1L);
        var user2 = repou.Abrir(2L);
        var user3 = repou.Abrir(3L);
        
        var pc1 = repoC.Abrir(1L);
        var pc2 = repoC.Abrir(2L);
        var pd1 = repoD.Abrir(5L);
        var pd2 = repoD.Abrir(6L);
        var pf1 = repof.Abrir(5L);
        var pf2 = repof.Abrir(6L);
        
        var emp1 = repoe.Abrir(1L);
        var emp2 = repoe.Abrir(2L);
        var con1 = repoco.Abrir(1L);
        var con2 = repoco.Abrir(2L);
        var con3 = repoco.Abrir(3L);
        var con4 = repoco.Abrir(4L);
        
          
       // TransacaoRepositorio repot = new TransacaoDAO();
        
       // Transacao t1 = new Transacao(pc1, user1);*/
       
        
    }
   public static void main(String[] args) {
        
        UsuarioRepositorio repo = RepositorioFactory.getUsuarioRepositorio();
        
        //criarBase();
        
        Usuario uw = new Usuario();
        uw.setLogin("Alisson");
        
        for(Usuario u : repo.Buscar(uw))
            System.out.println(u);
        
    
    }
    }
    
    
