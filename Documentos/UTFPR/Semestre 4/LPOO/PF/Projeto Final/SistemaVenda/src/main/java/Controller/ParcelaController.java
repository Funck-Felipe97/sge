
package Controller;

import Model.BusinessObject.Parcela;
import Model.dataAccessObject.ParcelaDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author funck
 */

public class ParcelaController {
    
    private Parcela parcela;
    private List<Parcela> parcelas;
    private final ParcelaDao dao;
    private String[] column;
    private DefaultTableModel tableModel;

    public ParcelaController(){
        this.column = new String[]{"Codigo" , "Valor" , " Data de Vencimento" , "Codigo da Venda" , "Cliente"};
        this.tableModel = new DefaultTableModel(null , this.column);
        this.dao = new ParcelaDao();
    }
    
    public void salvar(){
        dao.salvar(this.parcela);
    }
    
    public void exluir(){
        dao.excluir(this.parcela);
    }
    
    public void atualizar(Parcela p){
        dao.atualizar(p);
    }
    
    public List<Parcela> listar(){
        this.parcelas = dao.getBeans("Parcela");
        return this.parcelas;
    }
    
    public void listarByCliente(String campo , String valor){
        this.parcelas = this.dao.ListarParcelas(campo , valor);
        preencherTabela();
    }
    
    public Parcela getParcela() {
        return parcela;
    }

    public void setParcela(Parcela parcela) {
        this.parcela = parcela;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }
    
    public DefaultTableModel preencherTabela(){
        limparTabela();
        String[] linha  = new String[]{null , null , null , null , null};
        for(int i = 0 ; i < this.parcelas.size() ; ++i){
            this.tableModel.addRow(linha);
            this.tableModel.setValueAt(this.parcelas.get(i).getCodigo() , i, 0);
            this.tableModel.setValueAt(this.parcelas.get(i).getValor() , i, 1);
            this.tableModel.setValueAt(this.parcelas.get(i).getDataVencimento(), i, 2);
            this.tableModel.setValueAt(this.parcelas.get(i).getVenda().getCodigo(), i, 3);
            this.tableModel.setValueAt(this.parcelas.get(i).getVenda().getCliente().getNome() , i, 4);
        }
        return this.tableModel;
    } 
    
    public void limparTabela(){
        while(this.tableModel.getRowCount() > 0 ){
            this.tableModel.removeRow(0);
        }
    }
    
    public void pagarParcelas(){
        this.parcelas.forEach(p->{
            p.setStatus("Pago");
            atualizar(p);
        });      
    }
    
}
