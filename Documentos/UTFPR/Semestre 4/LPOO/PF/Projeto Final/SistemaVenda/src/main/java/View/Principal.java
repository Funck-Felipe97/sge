/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CaixaController;
import Controller.PontoController;
import Singleton.CaixaSingleton;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */

public class Principal extends javax.swing.JFrame {

    private final CaixaController caixaController;
    private PontoController ponto;
    
    public Principal() {
        this.ponto = new PontoController();
        this.caixaController = new CaixaController();
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGerente = new javax.swing.JPanel();
        jBabrirCaixa = new javax.swing.JButton();
        jBfecharCaixa = new javax.swing.JButton();
        jLhoraSistema = new javax.swing.JLabel();
        jLstatusCaixa = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenuCliente = new javax.swing.JMenu();
        jMenuVenda = new javax.swing.JMenu();
        jMInovaVenda = new javax.swing.JMenuItem();
        jMIvizualizarVendas = new javax.swing.JMenuItem();
        jMenuProduto = new javax.swing.JMenu();
        jMenu1Funcionario = new javax.swing.JMenu();
        jMvizualizarFuncionario = new javax.swing.JMenuItem();
        jMrelatorioFuncionario = new javax.swing.JMenuItem();
        jMenuPagamentos = new javax.swing.JMenu();
        jMnewPagamento = new javax.swing.JMenuItem();
        jMvizualizarPagamentos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelGerente.setBackground(new java.awt.Color(66, 74, 75));
        jPanelGerente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jBabrirCaixa.setBackground(new java.awt.Color(255, 255, 255));
        jBabrirCaixa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBabrirCaixa.setText("ABRIR CAIXA");
        jBabrirCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBabrirCaixaActionPerformed(evt);
            }
        });

        jBfecharCaixa.setBackground(new java.awt.Color(255, 255, 255));
        jBfecharCaixa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBfecharCaixa.setText("FECHAR CAIXA");
        jBfecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfecharCaixaActionPerformed(evt);
            }
        });

        jLhoraSistema.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLhoraSistema.setForeground(new java.awt.Color(204, 204, 204));
        jLhoraSistema.setText("        ");

        jLstatusCaixa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanelGerenteLayout = new javax.swing.GroupLayout(jPanelGerente);
        jPanelGerente.setLayout(jPanelGerenteLayout);
        jPanelGerenteLayout.setHorizontalGroup(
            jPanelGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBabrirCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBfecharCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGerenteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLhoraSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGerenteLayout.createSequentialGroup()
                        .addComponent(jLstatusCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelGerenteLayout.setVerticalGroup(
            jPanelGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGerenteLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLstatusCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                .addComponent(jBabrirCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBfecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLhoraSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuCliente.setBackground(new java.awt.Color(153, 102, 255));
        jMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cliente.png"))); // NOI18N
        jMenuCliente.setText("Clientes");
        jMenuCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuClienteMouseClicked(evt);
            }
        });
        jMenuPrincipal.add(jMenuCliente);

        jMenuVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/venda_1.png"))); // NOI18N
        jMenuVenda.setText("Vendas");
        jMenuVenda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMInovaVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMInovaVenda.setText("Nova Venda");
        jMInovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInovaVendaActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMInovaVenda);

        jMIvizualizarVendas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMIvizualizarVendas.setText("Vizualizar");
        jMIvizualizarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIvizualizarVendasActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMIvizualizarVendas);

        jMenuPrincipal.add(jMenuVenda);

        jMenuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produtos_1.png"))); // NOI18N
        jMenuProduto.setText("Produtos");
        jMenuProduto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuProdutoMouseClicked(evt);
            }
        });
        jMenuPrincipal.add(jMenuProduto);

        jMenu1Funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Funcionario.png"))); // NOI18N
        jMenu1Funcionario.setText("Funcionario");
        jMenu1Funcionario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMvizualizarFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMvizualizarFuncionario.setText("Vizualizar");
        jMvizualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMvizualizarFuncionarioActionPerformed(evt);
            }
        });
        jMenu1Funcionario.add(jMvizualizarFuncionario);

        jMrelatorioFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMrelatorioFuncionario.setText("Relatorio");
        jMrelatorioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMrelatorioFuncionarioActionPerformed(evt);
            }
        });
        jMenu1Funcionario.add(jMrelatorioFuncionario);

        jMenuPrincipal.add(jMenu1Funcionario);

        jMenuPagamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pagamentos_1.png"))); // NOI18N
        jMenuPagamentos.setText("Pagamentos");
        jMenuPagamentos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMnewPagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnewPagamento.setText("Novo Pagamento");
        jMnewPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnewPagamentoActionPerformed(evt);
            }
        });
        jMenuPagamentos.add(jMnewPagamento);

        jMvizualizarPagamentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMvizualizarPagamentos.setText("Vizualizar");
        jMvizualizarPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMvizualizarPagamentosActionPerformed(evt);
            }
        });
        jMenuPagamentos.add(jMvizualizarPagamentos);

        jMenuPrincipal.add(jMenuPagamentos);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuClienteMouseClicked
       FormCliente form = new FormCliente();
       this.jDesktopPane1.add(form);
       form.setVisible(true);
    }//GEN-LAST:event_jMenuClienteMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        this.ponto.abrirPonto();
        horaSistema();
    }//GEN-LAST:event_formWindowOpened

    private void jMInovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInovaVendaActionPerformed
        FormVenda form = new FormVenda(this.jDesktopPane1);
        this.jDesktopPane1.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMInovaVendaActionPerformed

    private void jMnewPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnewPagamentoActionPerformed
        FormBuscarParcelas form = new FormBuscarParcelas(this.jDesktopPane1);
        this.jDesktopPane1.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMnewPagamentoActionPerformed

    private void jMIvizualizarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIvizualizarVendasActionPerformed
        FormVizualizarVendas form = new FormVizualizarVendas();
        this.jDesktopPane1.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMIvizualizarVendasActionPerformed

    private void jBabrirCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBabrirCaixaActionPerformed
        Double valor = Double.valueOf(JOptionPane.showInputDialog(this , "Informe o valor de Abertura do Caixa"));
        this.caixaController.abrirCaixa(valor);
    }//GEN-LAST:event_jBabrirCaixaActionPerformed

    private void jBfecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharCaixaActionPerformed
        finalizar();
    }//GEN-LAST:event_jBfecharCaixaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        finalizar();
        this.ponto.fecharPonto();
    }//GEN-LAST:event_formWindowClosing

    private void jMvizualizarPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMvizualizarPagamentosActionPerformed
        VizualizarPagamento form = new VizualizarPagamento();
        this.jDesktopPane1.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMvizualizarPagamentosActionPerformed

    private void jMvizualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMvizualizarFuncionarioActionPerformed
        FormFuncionario form = new FormFuncionario();
        jDesktopPane1.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMvizualizarFuncionarioActionPerformed

    private void jMrelatorioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMrelatorioFuncionarioActionPerformed
        FormPontoEletronico form = new FormPontoEletronico();
        jDesktopPane1.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMrelatorioFuncionarioActionPerformed

    private void jMenuProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuProdutoMouseClicked
        FormProduto form = new FormProduto();
        jDesktopPane1.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuProdutoMouseClicked

    private void finalizar(){
        try{
            if(CaixaSingleton.getCaixa() != null){
                JOptionPane.showMessageDialog(this ,"Valor em Caixa : " + this.caixaController.getCaixa().getValorAtual());
                this.caixaController.fecharCaixa();
            }       
        }catch(NullPointerException erro){
            System.err.println(erro.getClass());
            System.err.println(erro.getCause());
            System.err.println(erro.getLocalizedMessage());
        }    
    }
    
    private void horaSistema(){
        Runnable r = ()-> {
            Calendar data;
            String horaAtual;
            int hora;
            int min;
            int seg;
            while(true){
                data = Calendar.getInstance();
                hora = data.get(Calendar.HOUR_OF_DAY); 
                min = data.get(Calendar.MINUTE);
                seg = data.get(Calendar.SECOND);
                horaAtual = String.valueOf(hora) + ":" + String.valueOf(min) + ":" + String.valueOf(seg);
                this.jLhoraSistema.setText(horaAtual);
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBabrirCaixa;
    private javax.swing.JButton jBfecharCaixa;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLhoraSistema;
    private javax.swing.JLabel jLstatusCaixa;
    private javax.swing.JMenuItem jMInovaVenda;
    private javax.swing.JMenuItem jMIvizualizarVendas;
    private javax.swing.JMenu jMenu1Funcionario;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenu jMenuPagamentos;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JMenu jMenuProduto;
    private javax.swing.JMenu jMenuVenda;
    private javax.swing.JMenuItem jMnewPagamento;
    private javax.swing.JMenuItem jMrelatorioFuncionario;
    private javax.swing.JMenuItem jMvizualizarFuncionario;
    private javax.swing.JMenuItem jMvizualizarPagamentos;
    private javax.swing.JPanel jPanelGerente;
    // End of variables declaration//GEN-END:variables
}
