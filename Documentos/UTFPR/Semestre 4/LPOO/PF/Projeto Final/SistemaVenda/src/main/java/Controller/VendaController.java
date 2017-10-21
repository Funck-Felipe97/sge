
package Controller;

import Model.BusinessObject.Venda;
import Model.BusinessObject.VendaAprazo;
import Singleton.CaixaSingleton;
import Singleton.FuncionarioSingleton;
import Model.dataAccessObject.HibernateDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author funck
 */

public class VendaController {
    
    private HibernateDao<Venda> dao;
    private Venda venda;
    private List<Venda> vendas;
    private DefaultTableModel tableModel;
    private String[] column;
    
    public VendaController(){
        this.column = new String[]{"Codigo" , "Valor" , "Data" , "Tipo" , "Funcionario" , "Cliente"};
        this.tableModel = new DefaultTableModel(null , this.column);
        this.dao = new HibernateDao<>();
    }
    
    public void salvar(){
        this.dao.salvar(this.venda);
    }
    
    public void excluir(){
        this.dao.excluir(this.venda);
    }
    
    public void atualizar(){
        this.dao.atualizar(this.venda);
    }
    
    public List<Venda> listar(){
        this.vendas = this.dao.getBeans("Venda");
        return this.vendas;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
        this.venda.setCaixa(CaixaSingleton.getCaixa());
        this.venda.setFuncionario(FuncionarioSingleton.getFuncionario());
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }
    
    public void preencherTabela(){
        limparTabela();
        String[] linha = new String[]{null , null , null , null , null , null};
        for(int  i = 0 ; i < this.vendas.size() ; ++i){
            this.tableModel.addRow(linha);
            this.tableModel.setValueAt(this.vendas.get(i).getCodigo() , i , 0);
            this.tableModel.setValueAt(this.vendas.get(i).getValor() , i , 1);
            this.tableModel.setValueAt(this.vendas.get(i).getData() , i , 2);
            this.tableModel.setValueAt(this.vendas.get(i).getTipoVenda(), i , 3);
            this.tableModel.setValueAt(this.vendas.get(i).getFuncionario().getNome() , i , 4);
            
            if(this.vendas.get(i) instanceof VendaAprazo){
                VendaAprazo v = (VendaAprazo) this.vendas.get(i);
                this.tableModel.setValueAt(v.getCliente().getNome() , i , 5);
            }else{
                this.tableModel.setValueAt(null , i, 5);
            }
            
        }
    }
    
    private void limparTabela(){
        while(this.tableModel.getRowCount() != 0){
            this.tableModel.removeRow(0);
        }
    }
    
}
