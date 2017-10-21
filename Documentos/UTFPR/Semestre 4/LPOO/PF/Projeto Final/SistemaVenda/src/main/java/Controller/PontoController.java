
package Controller;

import Model.dataAccessObject.PontoDao;
import Model.valueObject.PontoEletronico;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author funck
 */

public class PontoController {
    
    private PontoDao dao;
    private PontoEletronico ponto;
    private List<PontoEletronico> pontos;
    private DefaultTableModel tablemodel;
    private String[] column;
    
    public PontoController(){
        this.column = new String[]{"Codigo" , "Data" , "Hora Entrada" , "Hora Saida" , "Funcionario"};
        this.tablemodel = new DefaultTableModel(null , column);
        this.ponto = new PontoEletronico();
        this.dao = new PontoDao();
    }
   
    public void abrirPonto(){
        this.ponto.abrir();
    }
    
    public void fecharPonto(){
        this.ponto.fechar();
        this.dao.salvar(this.ponto);
    }
    
    public void listar(){
        this.pontos = this.dao.getBeans("PontoEletronico");
        preecherTabela(this.pontos);
    }
    
    public void filtarPorNome(Date data1 , Date data2 ,  String nome){
        List<PontoEletronico> l = this.pontos.stream()
                .filter(
                    p->p.getFuncionario().getNome().equals(nome) &&
                    p.getData().compareTo(data1) >= 0 &&
                    p.getData().compareTo(data2) <= 0
                )
                .collect(Collectors.toList());
        
        preecherTabela(l);
    }
    
   
    public void preecherTabela(List<PontoEletronico> pontos){
        limparTabela();
        String[] linha = new String[]{null , null , null , null , null};
        for(int i = 0 ; i < pontos.size() ; ++i){
            this.tablemodel.addRow(linha);
            this.tablemodel.setValueAt(pontos.get(i).getCodigo() , i, 0);
            this.tablemodel.setValueAt(pontos.get(i).getData(), i, 1);
            this.tablemodel.setValueAt(pontos.get(i).getHoraEntrada(), i, 2);
            this.tablemodel.setValueAt(pontos.get(i).getHoraSaida(), i, 3);
            this.tablemodel.setValueAt(pontos.get(i).getFuncionario().getNome(), i, 4);
        }
    }
    
    private void limparTabela(){
        while(this.tablemodel.getRowCount() != 0){
            this.tablemodel.removeRow(0);
        }
    }

    public PontoEletronico getPonto() {
        return ponto;
    }

    public List<PontoEletronico> getPontos() {
        return pontos;
    }

    public DefaultTableModel getTablemodel() {
        return tablemodel;
    }
  
}
