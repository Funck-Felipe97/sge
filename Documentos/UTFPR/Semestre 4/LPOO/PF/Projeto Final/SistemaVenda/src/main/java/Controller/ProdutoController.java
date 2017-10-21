
package Controller;

import Model.dataAccessObject.HibernateDao;
import Model.valueObject.Categoria;
import Model.valueObject.Cliente;
import Model.valueObject.Pessoa;
import Model.valueObject.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author funck
 */

public class ProdutoController {
    
    private final HibernateDao<Produto> dao;
    private Produto produto;
    private List<Produto> produtos;
    private DefaultTableModel tableModel;
    private String[] columnModel;
    
    public ProdutoController(){
        this.dao = new HibernateDao<>();
        this.columnModel = new String[]{"Codigo" , "Descrição" , "Valor" , "Categoria" , "Estoque"};
        this.tableModel = new DefaultTableModel(null , this.columnModel);
        this.produtos = new ArrayList<>();
    }
    
    public void salvar(){
        dao.salvar(produto);
    }
    
    public void exluir(){
        dao.excluir(produto);
    }
    
    public void atualizar(){
        dao.atualizar(produto);
    }
    
    public List<Produto> listar(){
        this.produtos = this.dao.getBeans("Produto");
        return this.produtos;
    }
    
    public Produto buscarProduto(Long codigo){
        this.produto = this.dao.getBean(Produto.class , codigo);
        return this.produto;
    }
    
    public List<Produto> listtByCategoria(Categoria cat){
        try{
            this.produtos = this.dao.ListByExamplesCod("categoria" , cat.getCodigo(), "Produto");
            return this.produtos;
        }catch(NullPointerException erro){
            JOptionPane.showMessageDialog(null , "Selecione uma categoria para buscar");
        }    
        return null;
    }
    
    public void listagemDinamica(String valor){
        List<Produto> l = this.produtos.stream()
                          .filter(p-> p.getDescricao().contains(valor))
                          .collect(Collectors.toList());
        preencherTabela(l);
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public DefaultTableModel getTableModel(){
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }
    
    public void preencherTabela(){
        limparTabela();
        String[] linha = new String[]{null , null , null , null , null};
        for(int i = 0 ; i < this.produtos.size() ; ++i){
            this.tableModel.addRow(linha);
            this.tableModel.setValueAt(this.produtos.get(i).getCodigo() , i, 0);
            this.tableModel.setValueAt(this.produtos.get(i).getDescricao() , i, 1);
            this.tableModel.setValueAt(this.produtos.get(i).getValor() , i, 2);
            this.tableModel.setValueAt(this.produtos.get(i).getCategoria().getDescricacao(), i, 3);
            this.tableModel.setValueAt(this.produtos.get(i).getQuantidadeEstoque(), i, 4);
        }
    }
    
    public void preencherTabela(List<Produto> produtos){
        limparTabela();
        String[] linha = new String[]{null , null , null , null , null};
        for(int i = 0 ; i < produtos.size() ; ++i){            
            this.tableModel.addRow(linha);
            this.tableModel.setValueAt(produtos.get(i).getCodigo() , i, 0);
            this.tableModel.setValueAt(produtos.get(i).getDescricao() , i, 1);
            this.tableModel.setValueAt(produtos.get(i).getValor() , i, 2);
            this.tableModel.setValueAt(produtos.get(i).getCategoria().getDescricacao(), i, 3);
            this.tableModel.setValueAt(produtos.get(i).getQuantidadeEstoque(), i, 4);
        }
 
    }
    
    public void incluirProdutoTabela(){
        Object[] linha = new Object[]{produto.getCodigo() , produto.getDescricao() 
                , produto.getValor() , produto.getCategoria().getDescricacao() , produto.getQuantidadeEstoque()};
        this.tableModel.addRow(linha);
    }
    
    public void removerProdutoTabela(){
        for(int i = 0 ; i < this.tableModel.getRowCount() ; ++i){
            if((this.produto.getCodigo() == this.tableModel.getValueAt(i , 0))){
                this.tableModel.removeRow(i);
            } 
        }
    }
    
    public void limparTabela(){
        while(this.tableModel.getRowCount() != 0){
            this.tableModel.removeRow(0);
        }
    }
    
}
