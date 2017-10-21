
package Controller;

import Model.BusinessObject.Caixa;
import Model.BusinessObject.MovimentoCaixa;
import Singleton.CaixaSingleton;
import Model.dataAccessObject.HibernateDao;
import java.util.List;

/**
 *
 * @author funck
 */

public class MovimentoController {
   
    private MovimentoCaixa movimentoCaixa;
    private HibernateDao<MovimentoCaixa> dao;
    private List<MovimentoCaixa> movimentos;

    public MovimentoController(){
        this.dao = new HibernateDao<MovimentoCaixa>();
    }
    
    public void salvar(){
        this.movimentoCaixa.atualizarCaixa();
        this.dao.salvar(this.movimentoCaixa);
    }
    
    public void excluir(){
        this.dao.excluir(this.movimentoCaixa);
    }
    
    public void atualizar(){
        this.dao.atualizar(this.movimentoCaixa);
    }
    
    public List<MovimentoCaixa> listar(){
        this.movimentos = this.dao.getBeans("MovimentoCaixa");
        return this.movimentos;
    }
    
    public MovimentoCaixa getMovimentoCaixa() {
        return movimentoCaixa;
    }

    public void setMovimentoCaixa(MovimentoCaixa movimentoCaixa) {
        this.movimentoCaixa = movimentoCaixa;
        this.movimentoCaixa.setCaixa(CaixaSingleton.getCaixa());
    }

    public List<MovimentoCaixa> getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(List<MovimentoCaixa> movimentos) {
        this.movimentos = movimentos;
    }

}
