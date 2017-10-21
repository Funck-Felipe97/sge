

package Controller;

import Model.BusinessObject.Pagamento;
import Model.dataAccessObject.HibernateDao;
import Model.dataAccessObject.PagamentoDao;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author funck
 */

public class PagamentoController {
    
    private PagamentoDao dao;
    private Pagamento pagamento;
    private List<Pagamento> pagamentos;
    private DefaultTableModel tableModel;
    private String[] modeloTabela;
    
    public PagamentoController(){
        this.modeloTabela = new String[]{"Código" , "Data" , "Tipo do Pagamento" , "Valor"};
        this.tableModel = new DefaultTableModel(null, modeloTabela);
        this.dao = new PagamentoDao();
    }
    
    public void salvar(){
        this.dao.salvar(this.pagamento);
    }
    
    public void excluir(){
        this.dao.excluir(this.pagamento);
    }
    
    public void atualizar(){
        this.dao.atualizar(this.pagamento);
    }
    
    public List<Pagamento> listar(){
        this.pagamentos = this.dao.getBeans("Pagamento");
        return this.pagamentos;
    }
    
    public void listar(Date dataInicial , Date dataFinal){
        this.pagamentos = this.dao.listar(dataInicial, dataFinal);
        preencherTabela();
    }
    
    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
    
    public void preencherTabela(){
        
        removerLinhas();
        String[] linha = new String[]{null , null , null , null};
        for(int i = 0 ; i < this.pagamentos.size() ; i++){
            this.tableModel.addRow(linha);
            this.tableModel.setValueAt(this.pagamentos.get(i).getCodigo() , i, 0);
            this.tableModel.setValueAt(this.pagamentos.get(i).getData() , i, 1);
            this.tableModel.setValueAt(this.pagamentos.get(i).getTipoPagamento(), i, 2);
            this.tableModel.setValueAt(this.pagamentos.get(i).getValor(), i, 3);
        }
    }
    
    public void removerLinhas(){
        while(this.tableModel.getRowCount() > 0){
            this.tableModel.removeRow(0);
        }
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }
    
}
