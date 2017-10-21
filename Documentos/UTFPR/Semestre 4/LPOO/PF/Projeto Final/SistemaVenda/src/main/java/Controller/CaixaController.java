
package Controller;

import Model.BusinessObject.Caixa;
import Model.BusinessObject.RelatorioCaixa;
import Singleton.FuncionarioSingleton;
import Model.dataAccessObject.HibernateDao;
import java.util.Date;

/**
 *   @author funck  
 */

public class CaixaController {
    
    private HibernateDao<Caixa> dao;
    private HibernateDao<RelatorioCaixa> daoRelatorio;
    private Caixa caixa;
    private RelatorioCaixa relatorio;
    
    
    public CaixaController(){
        this.relatorio = new RelatorioCaixa();
        this.dao = new HibernateDao<>();
    }

    public Caixa getCaixa(){
        return this.caixa;
    }
  
    /**
    * Abrindo o caixa e relatorio diário;
    */
    
    public void abrirCaixa(Double valor){
        this.caixa = dao.getBean(Caixa.class , 1L);
        this.caixa.abrirCaixa(valor);
        this.relatorio.setFuncAbertura(FuncionarioSingleton.getFuncionario());
        this.relatorio.setCaixa(this.caixa);
        this.relatorio.setValorAbertura(this.caixa.getValorAbertura());
    }
    
    /**
    * Feichando o caixa e relatorio diário;
    */
    
    public void fecharCaixa(){
        this.daoRelatorio = new HibernateDao<RelatorioCaixa>();
        this.relatorio.setFuncFechamento(FuncionarioSingleton.getFuncionario());
        this.relatorio.setValorFechamento(this.caixa.getValorAtual());
        this.daoRelatorio.salvar(this.relatorio);
        this.caixa.fecharCaixa();
    }
    
    
    
}
