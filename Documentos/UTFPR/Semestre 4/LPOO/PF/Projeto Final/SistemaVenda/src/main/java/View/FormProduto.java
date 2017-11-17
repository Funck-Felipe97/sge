/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CategoriaController;
import Controller.ProdutoController;
import Model.valueObject.Categoria;
import Model.valueObject.Gerente;
import Model.valueObject.Produto;
import Singleton.FuncionarioSingleton;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;

/**
 *
 * @author funck
 */
public class FormProduto extends javax.swing.JInternalFrame {

   
    private Produto produto;
    private Categoria categoria;
    private ProdutoController produtoController;
    private CategoriaController categoriaController;
    private DefaultComboBoxModel<Categoria> CbModel;
    private DefaultComboBoxModel<Categoria> CbModelB;
    
    public FormProduto() {
        if(FuncionarioSingleton.getFuncionario() instanceof Gerente){
            this.CbModel = new DefaultComboBoxModel<>();
            this.CbModelB = new DefaultComboBoxModel<>();
            this.produtoController = new ProdutoController();
            iniciar();
            initComponents();  
        }else{
            JOptionPane.showMessageDialog(null , "Você não tem permissão para acessar esta área");
        }    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jTprodutoDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTprodutoValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCBprodutoCategoria = new javax.swing.JComboBox<Categoria>();
        jLabel4 = new javax.swing.JLabel();
        jTprodutoCategoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTprodutoEstoque = new javax.swing.JTextField();
        jBaddEstoque = new javax.swing.JButton();
        jTaddEstoque = new javax.swing.JTextField();
        jBsalvarProduto = new javax.swing.JButton();
        jBexcluirProduto = new javax.swing.JButton();
        jBalterarProduto = new javax.swing.JButton();
        jBnovoProduto = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTprodutos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTpesquisarDescricao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCBpesquisarCategoria = new javax.swing.JComboBox<Categoria>();
        jBpesquisarByCategoria = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setMaximizable(true);
        setTitle("Produtos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLayeredPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLayeredPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Descrição");

        jTprodutoDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Valor");

        jTprodutoValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Categoria");

        jCBprodutoCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCBprodutoCategoria.setModel(this.CbModel);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Outro");

        jTprodutoCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Quantidade em Estoque");

        jTprodutoEstoque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jBaddEstoque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBaddEstoque.setText("Add");
        jBaddEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddEstoqueActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTprodutoDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTprodutoValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jCBprodutoCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTprodutoCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTprodutoEstoque, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBaddEstoque, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTaddEstoque, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jCBprodutoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE))
                            .addComponent(jTprodutoCategoria)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTprodutoDescricao))
                .addGap(32, 32, 32)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jBaddEstoque)
                        .addGap(18, 18, 18)
                        .addComponent(jTaddEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jTprodutoValor)
                        .addComponent(jLabel5)
                        .addComponent(jTprodutoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTprodutoDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTprodutoValor))
                .addGap(34, 34, 34)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTprodutoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jTprodutoCategoria)
                    .addComponent(jCBprodutoCategoria))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTaddEstoque))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBaddEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jBsalvarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBsalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save.png"))); // NOI18N
        jBsalvarProduto.setText("salvar");
        jBsalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarProdutoActionPerformed(evt);
            }
        });

        jBexcluirProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBexcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jBexcluirProduto.setText("Excluir");
        jBexcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirProdutoActionPerformed(evt);
            }
        });

        jBalterarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBalterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Update.png"))); // NOI18N
        jBalterarProduto.setText("Alterar");
        jBalterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarProdutoActionPerformed(evt);
            }
        });

        jBnovoProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBnovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/new.png"))); // NOI18N
        jBnovoProduto.setText("Novo");
        jBnovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoProdutoActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jBsalvarProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jBexcluirProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jBalterarProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jBnovoProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBsalvarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(jBexcluirProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBalterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBnovoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBsalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBexcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBalterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBnovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTprodutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTprodutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTprodutos);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Descrição");

        jTpesquisarDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTpesquisarDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTpesquisarDescricaoKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Categoria");

        jCBpesquisarCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCBpesquisarCategoria.setModel(this.CbModelB);
        jCBpesquisarCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBpesquisarCategoriaItemStateChanged(evt);
            }
        });

        jBpesquisarByCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBpesquisarByCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/find.png"))); // NOI18N
        jBpesquisarByCategoria.setText("Pesquisar");
        jBpesquisarByCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarByCategoriaActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTpesquisarDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jCBpesquisarCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jBpesquisarByCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(jTpesquisarDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36)
                        .addComponent(jCBpesquisarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jBpesquisarByCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTpesquisarDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBpesquisarCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBpesquisarByCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FormProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jTprodutos.setModel(this.produtoController.getTableModel());
        this.produtoController.preencherTabela();
        iniciarCbCategoria();
        this.setBorder(null);
    }//GEN-LAST:event_formInternalFrameOpened

    private void jBsalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarProdutoActionPerformed
        try{ 
            
            getCampos();

             if(jCBprodutoCategoria.getSelectedItem() != null){
                this.categoria = (Categoria) jCBprodutoCategoria.getSelectedItem();
                this.produto.setCategoria(categoria);
                this.produtoController.atualizar();
            }else{
                this.categoria = new Categoria();
                this.categoria.setDescricacao(jTprodutoCategoria.getText());
                this.produto.setCategoria(categoria);
                this.produtoController.salvar();
                iniciarCbCategoria();
            }
             
            novo();
            
            if(jCBpesquisarCategoria.getSelectedItem() == null){
                atualizarTabela();
            }
            JOptionPane.showMessageDialog(this , "Produto Cadastrado com sucesso");
        } catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(this , "Preencha todos os campos corretamente");
        }    
    }//GEN-LAST:event_jBsalvarProdutoActionPerformed

    private void jBnovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoProdutoActionPerformed
        novo();
    }//GEN-LAST:event_jBnovoProdutoActionPerformed

    private void jBexcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirProdutoActionPerformed
        try{
            this.produtoController.exluir();
            iniciar();
            atualizarTabela();
            limparCampos();
            JOptionPane.showMessageDialog(this , "Produto excluido");
        } catch(IllegalArgumentException erro1){
            JOptionPane.showMessageDialog(this , "Selecione um produto para exclui-lo");
        }catch(PersistenceException erro2){
            JOptionPane.showMessageDialog(this , "Este produto esta contido em outras vendas");
        }catch(Exception erro3){
            JOptionPane.showMessageDialog(this , "Este produto esta contido em outras vendas \n"
                    + "por isto é impossível exclui-lo");
            System.err.println(erro3);
        }  
    }//GEN-LAST:event_jBexcluirProdutoActionPerformed

    private void jBalterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarProdutoActionPerformed
        try{
            getCampos();
            this.produtoController.atualizar();
            iniciar();
            atualizarTabela();
            limparCampos();
            JOptionPane.showMessageDialog(this , "Produto atualizado");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(this , "Erro ao atualizar Produto");
            System.err.println(erro);
        }    
    }//GEN-LAST:event_jBalterarProdutoActionPerformed

    private void jTprodutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTprodutosMouseClicked
        this.produto = this.produtoController.getProdutos().get(this.jTprodutos.getSelectedRow());
        this.produtoController.setProduto(this.produto);
        preencherCampos();
    }//GEN-LAST:event_jTprodutosMouseClicked

    private void jBpesquisarByCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarByCategoriaActionPerformed
        
    }//GEN-LAST:event_jBpesquisarByCategoriaActionPerformed

    private void jCBpesquisarCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBpesquisarCategoriaItemStateChanged
        if(this.jCBpesquisarCategoria.getSelectedItem() != null){
            this.categoria = (Categoria) this.jCBpesquisarCategoria.getSelectedItem();
            this.produtoController.listtByCategoria(this.categoria);
            atualizarTabela();
        }else{
            this.produtoController.listar();
            atualizarTabela();
        }  
    }//GEN-LAST:event_jCBpesquisarCategoriaItemStateChanged

    private void jTpesquisarDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesquisarDescricaoKeyReleased
        this.produtoController.listagemDinamica(jTpesquisarDescricao.getText());
    }//GEN-LAST:event_jTpesquisarDescricaoKeyReleased

    private void jBaddEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddEstoqueActionPerformed
        try{
            this.jTprodutoEstoque.setText(
                    String.valueOf(
                            Integer.valueOf(jTprodutoEstoque.getText())+ Integer.valueOf(jTaddEstoque.getText())
                    )
                );
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(this , "Insira uma quantidade válida");
        }    
    }//GEN-LAST:event_jBaddEstoqueActionPerformed

    private void iniciarCbCategoria(){
        this.CbModel.removeAllElements();
        this.CbModel.addElement(null);
        
        this.CbModelB.removeAllElements();
        this.CbModelB.addElement(null);
        
        this.categoriaController.listar().forEach(cat->{
            this.CbModel.addElement(cat);
            this.CbModelB.addElement(cat);
        });
        
    }
    
    private void iniciar(){
        this.categoriaController = new CategoriaController();
        this.produtoController.listar();
        this.produto = new Produto();
        this.categoria = new Categoria();
    }
    
    private void limparCampos(){
        jTpesquisarDescricao.setText(null);
        jTprodutoCategoria.setText(null);
        jTprodutoDescricao.setText(null);
        jTprodutoEstoque.setText(null);
        jTprodutoValor.setText(null);
    }
    
    private void preencherCampos(){
        jTprodutoDescricao.setText(this.produto.getDescricao());
        jTprodutoValor.setText(String.valueOf(this.produto.getValor()));
        jTprodutoEstoque.setText(String.valueOf(this.produto.getQuantidadeEstoque()));
        jCBprodutoCategoria.setSelectedItem(this.produto.getCategoria());
    }
    
    private void atualizarTabela(){
        this.produtoController.preencherTabela(this.produtoController.getProdutos());
    }
    
    private void getCampos(){
        this.produtoController.setProduto(produto);
        this.produto.setQuantidadeEstoque(Integer.valueOf(jTprodutoEstoque.getText()));
        this.produto.setDescricao(jTprodutoDescricao.getText());
        this.produto.setValor(Double.valueOf(jTprodutoValor.getText()));
    }
    
    private void novo(){
        iniciar();
        limparCampos();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBaddEstoque;
    private javax.swing.JButton jBalterarProduto;
    private javax.swing.JButton jBexcluirProduto;
    private javax.swing.JButton jBnovoProduto;
    private javax.swing.JButton jBpesquisarByCategoria;
    private javax.swing.JButton jBsalvarProduto;
    private javax.swing.JComboBox<Categoria> jCBpesquisarCategoria;
    private javax.swing.JComboBox<Categoria> jCBprodutoCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTaddEstoque;
    private javax.swing.JTextField jTpesquisarDescricao;
    private javax.swing.JTextField jTprodutoCategoria;
    private javax.swing.JTextField jTprodutoDescricao;
    private javax.swing.JTextField jTprodutoEstoque;
    private javax.swing.JTextField jTprodutoValor;
    private javax.swing.JTable jTprodutos;
    // End of variables declaration//GEN-END:variables
}
