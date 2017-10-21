/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ParcelaController;
import Model.BusinessObject.Parcela;
import Model.BusinessObject.VendaAprazo;
import Singleton.CaixaSingleton;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author funck
 */
public class FormBuscarParcelas extends javax.swing.JInternalFrame {

    private ParcelaController parcelaController;
    private List<Parcela> parcelasPagar;
    private DefaultListModel<Parcela> modelList;
    private Parcela p;
    private javax.swing.JDesktopPane jDesktop;
    
    public FormBuscarParcelas(javax.swing.JDesktopPane jDesktop){
        if(CaixaSingleton.getCaixa() != null){
            this.jDesktop = jDesktop;
            initComponents();
            iniciar();
        }else{
            JOptionPane.showMessageDialog(this , "Você precisa abrir o caixa para realizar um pagamento");
        }    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTpesquisarConta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTparcelas = new javax.swing.JTable();
        jBaddPagamentos = new javax.swing.JButton();
        jRBnome = new javax.swing.JRadioButton();
        jRBcpf = new javax.swing.JRadioButton();
        jBpesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTclienteNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFclienteCpf = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jTvendaCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTvendaData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTparcelaCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTparcelaVencimento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTvendaValor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTparcelaValor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLparcelas = new javax.swing.JList<Parcela>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLvalorTotal = new javax.swing.JLabel();
        jBfinalizarPagamentos = new javax.swing.JButton();
        jBcancelarPagamento = new javax.swing.JButton();
        jBremoverParcela = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);
        setTitle("Pagamentos");
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

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisar Contas");

        jTparcelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTparcelasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTparcelas);

        jBaddPagamentos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBaddPagamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/incluir.png"))); // NOI18N
        jBaddPagamentos.setText("Adicionar ");
        jBaddPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddPagamentosActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBnome);
        jRBnome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRBnome.setText("Nome");

        buttonGroup1.add(jRBcpf);
        jRBcpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRBcpf.setText("CPF");

        jBpesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBpesquisar.setText("Pesquisar");
        jBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBaddPagamentos)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTpesquisarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jRBnome)
                                .addGap(18, 18, 18)
                                .addComponent(jRBcpf)
                                .addGap(36, 36, 36)
                                .addComponent(jBpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jBpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTpesquisarConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jRBnome)
                            .addComponent(jRBcpf))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBaddPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome do Cliente");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CPF Cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Código da Venda");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Data da Venda");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Codigo da Parcela");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Data de Vencimento");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Valor da Venda");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Valor da Parcela");

        jScrollPane2.setViewportView(jLparcelas);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Parcelas");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Valor Total :");

        jLvalorTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLvalorTotal.setForeground(new java.awt.Color(255, 0, 0));
        jLvalorTotal.setText("0");

        jBfinalizarPagamentos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBfinalizarPagamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/finish.png"))); // NOI18N
        jBfinalizarPagamentos.setText("Finalizar");
        jBfinalizarPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfinalizarPagamentosActionPerformed(evt);
            }
        });

        jBcancelarPagamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBcancelarPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jBcancelarPagamento.setText("Cancelar");

        jBremoverParcela.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBremoverParcela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/clean.png"))); // NOI18N
        jBremoverParcela.setText("Remover");
        jBremoverParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBremoverParcelaActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTclienteNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jFclienteCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTvendaCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTvendaData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTparcelaCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTparcelaVencimento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTvendaValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTparcelaValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLvalorTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBfinalizarPagamentos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBcancelarPagamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBremoverParcela, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTclienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTvendaCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5)
                                    .addComponent(jTparcelaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBfinalizarPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jTvendaData, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(jTparcelaVencimento)
                                    .addComponent(jBcancelarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jFclienteCpf)
                                    .addComponent(jLabel7)
                                    .addComponent(jTvendaValor)
                                    .addComponent(jLabel9)
                                    .addComponent(jTparcelaValor, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel11)))
                        .addGap(48, 48, 48)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLvalorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBremoverParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTclienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFclienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTvendaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTvendaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTvendaValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTparcelaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTparcelaVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTparcelaValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLvalorTotal)
                        .addComponent(jBremoverParcela))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBfinalizarPagamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBcancelarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FormBuscarParcelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void jBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarActionPerformed
        if(this.jRBcpf.isSelected()){
            this.parcelaController.listarByCliente("cpf" , jTpesquisarConta.getText());
        }else{
            this.parcelaController.listarByCliente("nome" , jTpesquisarConta.getText());
        }
    }//GEN-LAST:event_jBpesquisarActionPerformed

    private void jBaddPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddPagamentosActionPerformed
        if(parcelasPagar.contains(p)){
            JOptionPane.showMessageDialog(this , "Parcela já adicionada");
        }else{
            this.modelList.addElement(p);
            this.parcelasPagar.add(p);
            double valor = p.getValor() + Double.valueOf(this.jLvalorTotal.getText());
            this.jLvalorTotal.setText(String.valueOf(valor));
        }
    }//GEN-LAST:event_jBaddPagamentosActionPerformed

    private void jBremoverParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBremoverParcelaActionPerformed
        if(this.jLparcelas.getSelectedValue() != null){
            Parcela p = this.jLparcelas.getSelectedValue();
            this.parcelasPagar.remove(p);
            this.modelList.removeElement(p);
            double valor = Double.valueOf(this.jLvalorTotal.getText()) - p.getValor();
            this.jLvalorTotal.setText(String.valueOf(valor));
        }else{
            JOptionPane.showMessageDialog(this , "Selecione algum iten para remove-lo");
        }    
    }//GEN-LAST:event_jBremoverParcelaActionPerformed

    private void jBfinalizarPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfinalizarPagamentosActionPerformed
        if(this.parcelasPagar.size() > 0){
            this.parcelaController.setParcelas(this.parcelasPagar);
            this.modelList.removeAllElements();
            this.parcelasPagar = null;
            FormPagamento form = new FormPagamento(this.parcelaController);
            this.jDesktop.add(form);
            form.setVisible(true);
            novoPagamento();
        }else{
            JOptionPane.showMessageDialog(this , "Adicione uma parcela para realizar o pagamento");
        }
    }//GEN-LAST:event_jBfinalizarPagamentosActionPerformed

    private void jTparcelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTparcelasMouseClicked
        this.p = this.parcelaController.getParcelas().get(jTparcelas.getSelectedRow());
        preencherCampos();
    }//GEN-LAST:event_jTparcelasMouseClicked

    private void iniciar(){
        this.parcelaController = new ParcelaController();
        this.parcelasPagar = new ArrayList<>();
        this.jTparcelas.setModel(this.parcelaController.getTableModel());
        this.modelList = new DefaultListModel<>();
        this.jLparcelas.setModel(this.modelList);
    }
    
    public void preencherCampos(){
        jTclienteNome.setText(p.getVenda().getCliente().getNome());
        jFclienteCpf.setText(p.getVenda().getCliente().getCpf());
        jTparcelaCodigo.setText(String.valueOf(p.getCodigo()));
        jTparcelaValor.setText(String.valueOf(p.getValor()));
        jTparcelaVencimento.setText(String.valueOf(p.getDataVencimento()));
        jTvendaCodigo.setText(String.valueOf(p.getVenda().getCodigo()));
        jTvendaData.setText(String.valueOf(p.getVenda().getData()));
        jTvendaValor.setText(String.valueOf(p.getVenda().getValorFinal()));
    }
    
    public void novoPagamento(){
        jTclienteNome.setText(null);
        jTparcelaCodigo.setText(null);
        jTparcelaValor.setText(null);
        jTparcelaVencimento.setText(null);
        jTvendaCodigo.setText(null);
        jTvendaData.setText(null);
        jTvendaValor.setText(null);
        jTpesquisarConta.setText(null);
        jFclienteCpf.setText(null);
        jLvalorTotal.setText("0");
        this.parcelaController.limparTabela();
        iniciar();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBaddPagamentos;
    private javax.swing.JButton jBcancelarPagamento;
    private javax.swing.JButton jBfinalizarPagamentos;
    private javax.swing.JButton jBpesquisar;
    private javax.swing.JButton jBremoverParcela;
    private javax.swing.JFormattedTextField jFclienteCpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JList<Parcela> jLparcelas;
    private javax.swing.JLabel jLvalorTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBcpf;
    private javax.swing.JRadioButton jRBnome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTclienteNome;
    private javax.swing.JTextField jTparcelaCodigo;
    private javax.swing.JTextField jTparcelaValor;
    private javax.swing.JTextField jTparcelaVencimento;
    private javax.swing.JTable jTparcelas;
    private javax.swing.JTextField jTpesquisarConta;
    private javax.swing.JTextField jTvendaCodigo;
    private javax.swing.JTextField jTvendaData;
    private javax.swing.JTextField jTvendaValor;
    // End of variables declaration//GEN-END:variables
}
