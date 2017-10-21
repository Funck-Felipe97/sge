/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MovimentoController;
import Controller.ParcelaController;
import Controller.VendaController;
import Model.BusinessObject.MovimentoCaixa;
import Model.BusinessObject.Pagamento;
import Model.BusinessObject.PagamentoCaixa;
import Model.BusinessObject.Parcela;
import Model.BusinessObject.TipoPagamento;
import Model.BusinessObject.TrocoCaixa;
import Model.BusinessObject.Venda;
import Model.BusinessObject.VendaAvista;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author funck
 */
public class FormPagamento extends javax.swing.JInternalFrame {

    private VendaController vendaController;
    private VendaAvista venda;
    private ParcelaController parcelaController;
    private Pagamento pagamento;
    private MovimentoController caixaController;
    private MovimentoCaixa movimentoCaixa;
    private Double valorPagamento , troco , valorPago;
    
    public FormPagamento() {
        initComponents();
    }
    
    public FormPagamento(VendaController vendaController){
        this.vendaController =  vendaController;
        this.venda = (VendaAvista) this.vendaController.getVenda();
        this.valorPagamento = this.venda.getValor();
        initComponents();
        iniciar();
    }
    
    public FormPagamento(ParcelaController parcelaController){
        this.parcelaController = parcelaController;
        
        this.valorPagamento = this.parcelaController.getParcelas().stream()
                  .mapToDouble(Parcela::getValor)
                  .sum();
        
       
        initComponents();
        iniciar();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JlvalorConta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCBtipopagamento = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTvalorPago = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTpagamentoTroco = new javax.swing.JTextField();
        jBsalvarPagamento = new javax.swing.JButton();
        jBcancelarPagamento = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);
        setTitle("Pagamento");
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Maestro.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MasterCard.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Visa.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Valor : ");

        JlvalorConta.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        JlvalorConta.setForeground(new java.awt.Color(255, 0, 0));
        JlvalorConta.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Forma de Pagamento : ");

        jCBtipopagamento.setModel(new javax.swing.DefaultComboBoxModel(TipoPagamento.values()));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Valor Pago : ");

        jTvalorPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTvalorPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTvalorPagoKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Troco :");

        jTpagamentoTroco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jBsalvarPagamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBsalvarPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save.png"))); // NOI18N
        jBsalvarPagamento.setText("Salvar");
        jBsalvarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarPagamentoActionPerformed(evt);
            }
        });

        jBcancelarPagamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBcancelarPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jBcancelarPagamento.setText("Cancelar");
        jBcancelarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBsalvarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jBcancelarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(27, 27, 27)
                                        .addComponent(jTvalorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(JlvalorConta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel4)))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCBtipopagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTpagamentoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2)))
                .addGap(62, 62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JlvalorConta)
                    .addComponent(jLabel4)
                    .addComponent(jCBtipopagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTvalorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTpagamentoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalvarPagamento)
                    .addComponent(jBcancelarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalvarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarPagamentoActionPerformed
     
        gerarLancamentos();
        finalizarTransacao();
           
        try {
            this.setClosed(true);
        } catch (Throwable ex) {
            Logger.getLogger(FormPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jBsalvarPagamentoActionPerformed
    
    
    private void jBcancelarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarPagamentoActionPerformed
        
    }//GEN-LAST:event_jBcancelarPagamentoActionPerformed

    private void jTvalorPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTvalorPagoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(Double.valueOf(jTvalorPago.getText()) > this.valorPagamento){
                try{
                   this.valorPago = Double.valueOf(jTvalorPago.getText());
                   this.troco = this.valorPago - this.valorPagamento;
                   this.jTpagamentoTroco.setText(String.valueOf(this.troco));
                }catch(NumberFormatException erro){
                    JOptionPane.showMessageDialog(this , "Só é permitido digitar numeros para os valores numericos");
                }  
            }else{
                JOptionPane.showMessageDialog(this , "Valor insuficiente");
            }    
        }
    }//GEN-LAST:event_jTvalorPagoKeyPressed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        this.JlvalorConta.setText(String.valueOf(this.valorPagamento));
        this.setAlignmentX(this.getAlignmentX() + 900);
        this.setAlignmentY(this.getAlignmentY() + 900);
    }//GEN-LAST:event_formInternalFrameOpened
    
    private void gerarLancamentos(){
        this.movimentoCaixa = new PagamentoCaixa();
        this.movimentoCaixa.setValor(this.valorPago);
        this.caixaController.setMovimentoCaixa(this.movimentoCaixa);
        this.caixaController.salvar();
        
        this.movimentoCaixa = new TrocoCaixa();
        this.movimentoCaixa.setValor(this.troco);
        this.caixaController.setMovimentoCaixa(this.movimentoCaixa);
        this.caixaController.salvar();
    }
    
    private void finalizarTransacao(){
        this.pagamento.setTipoPagamento((TipoPagamento) this.jCBtipopagamento.getSelectedItem());
        this.pagamento.setValor(this.valorPagamento);
        
        if(this.venda != null){
            this.venda.setPagamento(this.pagamento);
            this.vendaController.salvar();
        }else{
            this.pagamento.setValor(this.pagamento.getValor() / this.parcelaController.getParcelas().size());
            this.parcelaController.getParcelas().forEach(p->p.setPagamento(this.pagamento));
            this.parcelaController.pagarParcelas();
            
        }
    }
    
    private void iniciar(){
        this.pagamento = new Pagamento();
        this.caixaController = new MovimentoController();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlvalorConta;
    private javax.swing.JButton jBcancelarPagamento;
    private javax.swing.JButton jBsalvarPagamento;
    private javax.swing.JComboBox<String> jCBtipopagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTpagamentoTroco;
    private javax.swing.JTextField jTvalorPago;
    // End of variables declaration//GEN-END:variables
}
