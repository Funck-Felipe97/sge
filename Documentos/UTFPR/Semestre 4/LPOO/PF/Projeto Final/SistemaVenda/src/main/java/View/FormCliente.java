/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PessoaController;
import Model.Util.ValidarPessoa;
import Model.valueObject.Cliente;
import Model.valueObject.Endereco;
import Model.valueObject.Pessoa;
import Model.valueObject.Sexo;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class FormCliente extends javax.swing.JInternalFrame {
    
    private PessoaController pessoaController;
    private Pessoa pessoa;
    private Endereco endereco;

    
    public FormCliente(){
        iniciar();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanelTabela = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTclientePesquisar = new javax.swing.JTextField();
        jRBclienteNome = new javax.swing.JRadioButton();
        jRBclienteCpf = new javax.swing.JRadioButton();
        jRBclienteCodigo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTclientes = new javax.swing.JTable();
        jPdadosClientes = new javax.swing.JPanel();
        jBclienteAlterar = new javax.swing.JButton();
        jBclienteExcluir = new javax.swing.JButton();
        jBclienteSalvar = new javax.swing.JButton();
        jBclienteNovo = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTclienteNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFclienteCpf = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFclienteRg = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFclienteTelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jCBclienteSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTclienteEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateNascimento = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTenderecoLogradouro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jFenderecoCep = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jTbairroDescricao = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTcidadeDescricao = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setTitle("Clientes");
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

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanelTabela.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Pesquisar ");

        jTclientePesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTclientePesquisarKeyReleased(evt);
            }
        });

        buttonGroup1.add(jRBclienteNome);
        jRBclienteNome.setText("Nome");

        buttonGroup1.add(jRBclienteCpf);
        jRBclienteCpf.setText("CPF");

        buttonGroup1.add(jRBclienteCodigo);
        jRBclienteCodigo.setText("Codigo");

        jTclientes.setBackground(new java.awt.Color(204, 204, 204));
        jTclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTclientes);

        javax.swing.GroupLayout jPanelTabelaLayout = new javax.swing.GroupLayout(jPanelTabela);
        jPanelTabela.setLayout(jPanelTabelaLayout);
        jPanelTabelaLayout.setHorizontalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTabelaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelTabelaLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jTclientePesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jRBclienteNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBclienteCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBclienteCodigo)
                        .addGap(46, 46, 46))))
        );
        jPanelTabelaLayout.setVerticalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTabelaLayout.createSequentialGroup()
                        .addGroup(jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBclienteNome)
                            .addComponent(jRBclienteCpf)
                            .addComponent(jRBclienteCodigo))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(jPanelTabelaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTclientePesquisar))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPdadosClientes.setBackground(new java.awt.Color(255, 255, 255));
        jPdadosClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBclienteAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBclienteAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Update.png"))); // NOI18N
        jBclienteAlterar.setText("Alterar");
        jBclienteAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclienteAlterarActionPerformed(evt);
            }
        });

        jBclienteExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBclienteExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jBclienteExcluir.setText("  Excluir");
        jBclienteExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclienteExcluirActionPerformed(evt);
            }
        });

        jBclienteSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBclienteSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save.png"))); // NOI18N
        jBclienteSalvar.setText("Salvar");
        jBclienteSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclienteSalvarActionPerformed(evt);
            }
        });

        jBclienteNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBclienteNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/new.png"))); // NOI18N
        jBclienteNovo.setText("   Novo");
        jBclienteNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclienteNovoActionPerformed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        jTclienteNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CPF");

        try {
            jFclienteCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFclienteCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("RG");

        try {
            jFclienteRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFclienteRg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Telefone");

        try {
            jFclienteTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFclienteTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Sexo");

        jCBclienteSexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCBclienteSexo.setModel(new javax.swing.DefaultComboBoxModel(Sexo.values()));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        jTclienteEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nascimento");

        jDateNascimento.setDateFormatString("yyyy/MM/dd");
        jDateNascimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jTclienteEmail)
                    .addComponent(jTclienteNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(98, 98, 98))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jFclienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jDateNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBclienteSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jFclienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jFclienteRg)))
                    .addComponent(jLabel2))
                .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTclienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jTclienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFclienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFclienteRg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBclienteSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFclienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Dados Pessoais", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Logradouro");

        jTenderecoLogradouro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("CEP");

        try {
            jFenderecoCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFenderecoCep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Bairro");

        jTbairroDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Cidade");

        jTcidadeDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTcidadeDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTenderecoLogradouro)
                            .addComponent(jLabel12)
                            .addComponent(jTbairroDescricao)
                            .addComponent(jLabel11)
                            .addComponent(jFenderecoCep, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                        .addContainerGap(64, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTbairroDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTenderecoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTcidadeDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jFenderecoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Endereço", jPanel2);

        javax.swing.GroupLayout jPdadosClientesLayout = new javax.swing.GroupLayout(jPdadosClientes);
        jPdadosClientes.setLayout(jPdadosClientesLayout);
        jPdadosClientesLayout.setHorizontalGroup(
            jPdadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdadosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPdadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPdadosClientesLayout.createSequentialGroup()
                        .addComponent(jBclienteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBclienteExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBclienteNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBclienteSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jPdadosClientesLayout.setVerticalGroup(
            jPdadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdadosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPdadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBclienteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBclienteExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPdadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBclienteSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBclienteNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane2.setLayer(jPanelTabela, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPdadosClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPdadosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPdadosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FormCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizarTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jBclienteNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclienteNovoActionPerformed
        iniciar();
        limparCampos();
    }//GEN-LAST:event_jBclienteNovoActionPerformed

    private void jBclienteSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclienteSalvarActionPerformed
       
       preencherDadosCliente();
        
        try{
            this.pessoaController.setPessoa(this.pessoa);
            this.pessoaController.salvar();
            iniciar();
            atualizarTabela();
            limparCampos();
        }catch(NullPointerException erro){
            JOptionPane.showMessageDialog(this , "Preencha todos os campos corretamente");
            System.err.println(erro);  
        }
            
    }//GEN-LAST:event_jBclienteSalvarActionPerformed

    private void jBclienteExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclienteExcluirActionPerformed
        try{
            this.pessoaController.exluir();
            atualizarTabela();
            iniciar();
            limparCampos();
        }catch(IllegalArgumentException erro){
            JOptionPane.showMessageDialog(this , "Selecione um cliente para exclui-lo");
        }catch(Exception erro2){
            System.err.println(erro2);  
        }
    }//GEN-LAST:event_jBclienteExcluirActionPerformed

    private void jBclienteAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclienteAlterarActionPerformed
        try{
            preencherDadosCliente();
            this.pessoaController.atualizar();
            atualizarTabela();
            iniciar();
            limparCampos();
        }catch(NullPointerException erro){
            JOptionPane.showMessageDialog(this , "Selecione um cliente para altera-lo");
        }catch(Exception erro){
            System.err.println(erro);
        }    
    }//GEN-LAST:event_jBclienteAlterarActionPerformed

    private void jTclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTclientesMouseClicked
        this.pessoa = pessoaController.getPessoas().get(jTclientes.getSelectedRow());
        this.pessoaController.setPessoa(this.pessoa);
        preencherCampos((Cliente) this.pessoaController.getPessoa());
    }//GEN-LAST:event_jTclientesMouseClicked

    private void jTclientePesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTclientePesquisarKeyReleased
        if(jRBclienteNome.isSelected())
            this.pessoaController.ListagemDinamica("nome" , jTclientePesquisar.getText());
        if(jRBclienteCpf.isSelected()) 
            this.pessoaController.ListagemDinamica("cpf" , jTclientePesquisar.getText());
        if(jRBclienteCodigo.isSelected()) 
            this.pessoaController.ListagemDinamica("codigo" , jTclientePesquisar.getText());
        
    }//GEN-LAST:event_jTclientePesquisarKeyReleased
    
    private void preencherDadosCliente(){
        this.endereco.setLogradouro(jTenderecoLogradouro.getText());
        this.endereco.setBairro(jTbairroDescricao.getText());
        this.endereco.setCidade(jTcidadeDescricao.getText());
        this.endereco.setCep(jFenderecoCep.getText());
      
        this.pessoa.setNome(jTclienteNome.getText());
        this.pessoa.setCpf(jFclienteCpf.getText());
        this.pessoa.setEmail(jTclienteEmail.getText());
        this.pessoa.setRg(jFclienteRg.getText());
        this.pessoa.setSexo((Sexo) jCBclienteSexo.getSelectedItem());
        this.pessoa.setTelefone(jFclienteTelefone.getText());
        this.pessoa.setDataNascimento(jDateNascimento.getDate());
        this.pessoa.setEndereco(endereco);
         
    }
    
    private void preencherCampos(Cliente cliente){
        jTbairroDescricao.setText(cliente.getEndereco().getBairro());
        jTcidadeDescricao.setText(cliente.getEndereco().getCidade());
        jTclienteEmail.setText(cliente.getEmail());
        jTclienteNome.setText(cliente.getNome());
        jTclientePesquisar.setText(null);
        jTenderecoLogradouro.setText(cliente.getEndereco().getLogradouro());
        jFclienteCpf.setText(cliente.getCpf());
        jFclienteRg.setText(cliente.getRg());
        jFclienteTelefone.setText(cliente.getTelefone());
        jDateNascimento.setDate(cliente.getDataNascimento());
        jCBclienteSexo.setSelectedItem(cliente.getSexo());
        jFenderecoCep.setText(cliente.getEndereco().getCep());
        jBclienteSalvar.setEnabled(false);
    }
    
    private void iniciar(){
        this.pessoaController = new PessoaController("Cliente");
        this.endereco = new Endereco();
        this.pessoa = new Cliente();
        Endereco endereco = new Endereco();
        this.pessoaController.listar();
    }
    
    private void limparCampos(){
        jTbairroDescricao.setText(null);
        jTcidadeDescricao.setText(null);
        jTclienteEmail.setText(null);
        jTclienteNome.setText(null);
        jTclientePesquisar.setText(null);
        jTenderecoLogradouro.setText(null);
        jFclienteCpf.setText(null);
        jFclienteRg.setText(null);
        jFclienteTelefone.setText(null);
        jFenderecoCep.setText(null);
        jDateNascimento.setDate(null);
        jBclienteSalvar.setEnabled(true);
    }
    
    private void atualizarTabela(){
        this.pessoaController.listar();
        this.jTclientes.setModel(this.pessoaController.getTableModel());
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBclienteAlterar;
    private javax.swing.JButton jBclienteExcluir;
    private javax.swing.JButton jBclienteNovo;
    private javax.swing.JButton jBclienteSalvar;
    private javax.swing.JComboBox<String> jCBclienteSexo;
    private com.toedter.calendar.JDateChooser jDateNascimento;
    public javax.swing.JFormattedTextField jFclienteCpf;
    public javax.swing.JFormattedTextField jFclienteRg;
    private javax.swing.JFormattedTextField jFclienteTelefone;
    private javax.swing.JFormattedTextField jFenderecoCep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTabela;
    private javax.swing.JPanel jPdadosClientes;
    private javax.swing.JRadioButton jRBclienteCodigo;
    private javax.swing.JRadioButton jRBclienteCpf;
    private javax.swing.JRadioButton jRBclienteNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTbairroDescricao;
    private javax.swing.JTextField jTcidadeDescricao;
    private javax.swing.JTextField jTclienteEmail;
    private javax.swing.JTextField jTclienteNome;
    private javax.swing.JTextField jTclientePesquisar;
    private javax.swing.JTable jTclientes;
    private javax.swing.JTextField jTenderecoLogradouro;
    // End of variables declaration//GEN-END:variables
}
