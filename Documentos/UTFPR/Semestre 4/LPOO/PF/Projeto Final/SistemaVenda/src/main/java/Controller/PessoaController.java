
package Controller;

import Model.Util.ValidarPessoa;
import Model.dataAccessObject.HibernateDao;
import Model.valueObject.Cliente;
import Model.valueObject.Pessoa;
import java.util.List;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author funck
 */

public final class PessoaController {
    
    private HibernateDao<Pessoa> dao;
    private Pessoa pessoa;
    private List<Pessoa> pessoas;
    private String tipoPessoa;
    private String[] colunas;
    DefaultTableModel tableModel;
    
    public PessoaController(String tipoPessoa){
        dao = new HibernateDao<Pessoa>();
        this.tipoPessoa = tipoPessoa;
        this.colunas = new String[]{"Codigo" , "Nome" , "Cpf" , "RG" , "Telefone" };
        this.tableModel = new DefaultTableModel(null , colunas);
    }
    
    public void salvar(){
        if(ValidarPessoa.validar(this.pessoa)){
            try{
                this.dao.salvar(this.pessoa);
                JOptionPane.showMessageDialog(null , "Registro cadastrado com sucesso");
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null , "Erro ao realizar Cadastro");
                System.err.println(erro);
            }
        } 
    }
    
    public void exluir(){
        try{
            dao.excluir(this.pessoa);
            JOptionPane.showMessageDialog(null , "Registro excluido com sucesso");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null , "Erro ao excluir registro");
            JOptionPane.showMessageDialog(null, "Este registro esta contido em alguma venda\n");
        }
    }
    
    public void atualizar(){
        
        try{
           this.dao.atualizar(this.pessoa);
           JOptionPane.showMessageDialog(null , "Registro alterado");
        }catch(Exception erro){
           JOptionPane.showMessageDialog(null , "Erro ao atualizar registro");
            System.err.println(erro);
        }
        
    }
    
    public List<Pessoa> listar(){
        this.pessoas = dao.getBeans(this.tipoPessoa);
        return this.pessoas;
    }
    
    public Pessoa ListByExample(String cpf){
        this.pessoa = dao.ListByExample("cpf" , cpf , this.tipoPessoa);
        return this.pessoa; 
    }
    
    public void ListagemDinamica(String chave , String valor){
        this.pessoas = this.dao.ListaDinamica(chave , valor , this.tipoPessoa);
        preencherTabela();
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    public void preencherTabela(){
        limparTabela();
        String [ ] linha = new String [ ] { null, null, null,null , null} ;
        for(int i = 0 ; i < this.pessoas.size() ; ++i){
            this.tableModel.addRow(linha);
            this.tableModel.setValueAt(this.pessoas.get(i).getCodigo() , i , 0);
            this.tableModel.setValueAt(this.pessoas.get(i).getNome() , i , 1);
            this.tableModel.setValueAt(this.pessoas.get(i).getCpf() , i , 2);
            this.tableModel.setValueAt(this.pessoas.get(i).getRg() , i , 3);
            this.tableModel.setValueAt(this.pessoas.get(i).getTelefone(), i , 4);
        }
           
    }
    
    public DefaultTableModel getTableModel(){
        preencherTabela();
        return this.tableModel; 
    }
    
    private void limparTabela(){
         while(this.tableModel.getRowCount() > 0){
             this.tableModel.removeRow(0);
         }
    }
    
}
