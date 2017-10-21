/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PessoaController;
import Model.Factory.FuncionarioFactory;
import Model.valueObject.Endereco;
import Model.valueObject.Funcionario;
import Model.valueObject.Gerente;
import Model.valueObject.Login;
import Model.valueObject.Sexo;
import Singleton.FuncionarioSingleton;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author funck
 */

public class FormFuncionario extends javax.swing.JInternalFrame {

   private PessoaController funcionarioController;
   private Endereco endereco;
   private Login login;
   private Funcionario funcionario;
    
    public FormFuncionario(){
        if(FuncionarioSingleton.getFuncionario() instanceof Gerente){
            iniciar();
            initComponents();
        }else{
            JOptionPane.showMessageDialog(null , "Você não tem permissão para acessar esta aréa");
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanelTabela = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTclientePesquisar = new javax.swing.JTextField();
        jRBclienteNome = new javax.swing.JRadioButton();
        jRBclienteCpf = new javax.swing.JRadioButton();
        jRBclienteCodigo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTfuncionario = new javax.swing.JTable();
        jPdadosClientes = new javax.swing.JPanel();
        jBfuncionarioAlterar = new javax.swing.JButton();
        jBfuncionarioExcluir = new javax.swing.JButton();
        jBfuncionarioSalvar = new javax.swing.JButton();
        jBfuncionarioNovo = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTfuncionarioNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFfuncionarioCpf = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFfuncionarioRg = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFfuncionarioTelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jCBfuncionarioSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTfuncionarioEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateNascimento = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jTfuncionarioLogin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPfuncionarioSenha = new javax.swing.JPasswordField();
        jCBfuncionarioCargo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTenderecoLogradouro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jFenderecoCep = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jTbairroDescricao = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTcidadeDescricao = new javax.swing.JTextField();

        setBorder(null);
        setClosable(true);
        setMaximizable(true);
        setTitle("Funcionario");
        setFocusTraversalPolicyProvider(true);
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

        jTclientePesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTclientePesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTclientePesquisarKeyReleased(evt);
            }
        });

        jRBclienteNome.setText("Nome");

        jRBclienteCpf.setText("CPF");

        jRBclienteCodigo.setText("Codigo");

        jTfuncionario.setBackground(new java.awt.Color(204, 204, 204));
        jTfuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTfuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTfuncionario);

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
                        .addGap(18, 18, 18)
                        .addComponent(jRBclienteCpf)
                        .addGap(18, 18, 18)
                        .addComponent(jRBclienteCodigo)
                        .addGap(44, 44, 44))))
        );
        jPanelTabelaLayout.setVerticalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRBclienteNome)
                        .addComponent(jRBclienteCpf)
                        .addComponent(jRBclienteCodigo))
                    .addGroup(jPanelTabelaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTclientePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPdadosClientes.setBackground(new java.awt.Color(255, 255, 255));
        jPdadosClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBfuncionarioAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBfuncionarioAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Update.png"))); // NOI18N
        jBfuncionarioAlterar.setText("Alterar");
        jBfuncionarioAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfuncionarioAlterarActionPerformed(evt);
            }
        });

        jBfuncionarioExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBfuncionarioExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jBfuncionarioExcluir.setText("  Excluir");
        jBfuncionarioExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfuncionarioExcluirActionPerformed(evt);
            }
        });

        jBfuncionarioSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBfuncionarioSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save.png"))); // NOI18N
        jBfuncionarioSalvar.setText("Salvar");
        jBfuncionarioSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfuncionarioSalvarActionPerformed(evt);
            }
        });

        jBfuncionarioNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBfuncionarioNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/new.png"))); // NOI18N
        jBfuncionarioNovo.setText("   Novo");
        jBfuncionarioNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfuncionarioNovoActionPerformed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        jTfuncionarioNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CPF");

        try {
            jFfuncionarioCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFfuncionarioCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("RG");

        try {
            jFfuncionarioRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFfuncionarioRg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Telefone");

        try {
            jFfuncionarioTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFfuncionarioTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Sexo");

        jCBfuncionarioSexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCBfuncionarioSexo.setModel(new javax.swing.DefaultComboBoxModel(Sexo.values()));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        jTfuncionarioEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nascimento");

        jDateNascimento.setDateFormatString("yyyy/MM/dd");
        jDateNascimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Login");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Senha");

        jCBfuncionarioCargo.setModel(new javax.swing.DefaultComboBoxModel(FuncionarioFactory.values()));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Cargo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPfuncionarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jCBfuncionarioCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTfuncionarioLogin)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jFfuncionarioCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 219, Short.MAX_VALUE))
                            .addComponent(jFfuncionarioRg)))
                    .addComponent(jTfuncionarioEmail)
                    .addComponent(jTfuncionarioNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(98, 98, 98))
                            .addComponent(jFfuncionarioTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jDateNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jCBfuncionarioSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(219, 219, 219)
                                .addComponent(jLabel15))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTfuncionarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(jTfuncionarioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFfuncionarioCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFfuncionarioRg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 9, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateNascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFfuncionarioTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBfuncionarioSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTfuncionarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBfuncionarioCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPfuncionarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel15))
                .addGap(17, 17, 17))
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
                        .addGap(0, 375, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTcidadeDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTenderecoLogradouro)
                            .addComponent(jLabel12)
                            .addComponent(jTbairroDescricao)
                            .addComponent(jLabel11)
                            .addComponent(jFenderecoCep, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Endereço", jPanel2);

        javax.swing.GroupLayout jPdadosClientesLayout = new javax.swing.GroupLayout(jPdadosClientes);
        jPdadosClientes.setLayout(jPdadosClientesLayout);
        jPdadosClientesLayout.setHorizontalGroup(
            jPdadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdadosClientesLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jBfuncionarioAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBfuncionarioExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBfuncionarioNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBfuncionarioSalvar)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPdadosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPdadosClientesLayout.setVerticalGroup(
            jPdadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdadosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPdadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdadosClientesLayout.createSequentialGroup()
                        .addGroup(jPdadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBfuncionarioAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBfuncionarioExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBfuncionarioNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jBfuncionarioSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
            Logger.getLogger(FormFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizarTabela();
        limparCampos();
        this.setBorder(null);
    }//GEN-LAST:event_formInternalFrameOpened

    private void jTfuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTfuncionarioMouseClicked
        if(this.jTfuncionario.getSelectedRow() == 0){
            JOptionPane.showMessageDialog(this , "Você não pode alterar o usuario root");
        }else{
            this.funcionario = (Funcionario) this.funcionarioController.getPessoas().get(jTfuncionario.getSelectedRow());
            this.funcionarioController.setPessoa(this.funcionario);
            preencherCampos();
        }    
    }//GEN-LAST:event_jTfuncionarioMouseClicked

    private void jBfuncionarioAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfuncionarioAlterarActionPerformed
        preencherDadosFuncionario(this.funcionario);
        this.funcionarioController.atualizar();
        atualizarTabela();
        limparCampos();
    }//GEN-LAST:event_jBfuncionarioAlterarActionPerformed

    private void jBfuncionarioExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfuncionarioExcluirActionPerformed
        this.funcionarioController.exluir();        
        atualizarTabela(); 
        limparCampos();
    }//GEN-LAST:event_jBfuncionarioExcluirActionPerformed

    private void jBfuncionarioSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfuncionarioSalvarActionPerformed
        preencherDadosFuncionario();
        this.funcionarioController.setPessoa(funcionario);
        funcionarioController.salvar();
        iniciar();
        atualizarTabela(); 
        limparCampos();
    }//GEN-LAST:event_jBfuncionarioSalvarActionPerformed

    private void jBfuncionarioNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfuncionarioNovoActionPerformed
        limparCampos();
        iniciar();
    }//GEN-LAST:event_jBfuncionarioNovoActionPerformed

    private void jTclientePesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTclientePesquisarKeyReleased
        if(jRBclienteNome.isSelected())
            this.funcionarioController.ListagemDinamica("nome" , jTclientePesquisar.getText());
        if(jRBclienteCpf.isSelected())
            this.funcionarioController.ListagemDinamica("cpf" , jTclientePesquisar.getText());
        if(jRBclienteCodigo.isSelected())
            this.funcionarioController.ListagemDinamica("codigo" , jTclientePesquisar.getText());
    }//GEN-LAST:event_jTclientePesquisarKeyReleased

    
    private void iniciar(){
        this.funcionarioController = new PessoaController("Funcionario");
        this.funcionarioController.listar();
        this.endereco = new Endereco();
        this.login = new Login();
    }
     
    private void preencherCampos(){
         jTbairroDescricao.setText(this.funcionario.getEndereco().getBairro());
         jTcidadeDescricao.setText(this.funcionario.getEndereco().getCidade());
         jTenderecoLogradouro.setText(this.funcionario.getEndereco().getLogradouro());
         jTfuncionarioEmail.setText(this.funcionario.getEmail());
         jTfuncionarioLogin.setText(this.funcionario.getLogin().getUsuario());
         jTfuncionarioNome.setText(this.funcionario.getNome());
         jPfuncionarioSenha.setText(this.funcionario.getLogin().getSenha());
         jFenderecoCep.setText(null);
         jFfuncionarioCpf.setText(this.funcionario.getCpf());
         jFfuncionarioRg.setText(this.funcionario.getRg());
         jFfuncionarioTelefone.setText(this.funcionario.getTelefone());
         jDateNascimento.setDate(this.funcionario.getDataNascimento());
         jCBfuncionarioSexo.setSelectedItem(this.funcionario.getSexo());
         jCBfuncionarioCargo.setSelectedItem(this.funcionario.getClass());
         this.jBfuncionarioSalvar.setEnabled(false);
    }
    
     private void limparCampos() {
         jTbairroDescricao.setText(null);
         jTcidadeDescricao.setText(null);
         jTenderecoLogradouro.setText(null);
         jTfuncionarioEmail.setText(null);
         jTfuncionarioLogin.setText(null);
         jTfuncionarioNome.setText(null);
         jPfuncionarioSenha.setText(null);
         jFenderecoCep.setText(null);
         jFfuncionarioCpf.setText(null);
         jFfuncionarioRg.setText(null);
         jFfuncionarioTelefone.setText(null);
         this.jBfuncionarioSalvar.setEnabled(true);
    }
    
    private void preencherDadosFuncionario(){
        FuncionarioFactory factory = (FuncionarioFactory) jCBfuncionarioCargo.getSelectedItem();
        this.funcionario = factory.getFuncionario();
        
        this.endereco.setLogradouro(jTenderecoLogradouro.getText());
        this.endereco.setBairro(jTbairroDescricao.getText());
        this.endereco.setCidade(jTcidadeDescricao.getText());
        
        this.login.setUsuario(jTfuncionarioLogin.getText());
        this.login.setSenha(jPfuncionarioSenha.getText());
        
        
        this.funcionario.setCpf(jFfuncionarioCpf.getText());
        this.funcionario.setDataNascimento(jDateNascimento.getDate());
        this.funcionario.setRg(jFfuncionarioRg.getText());
        this.funcionario.setTelefone(jFfuncionarioTelefone.getText());
        this.funcionario.setNome(jTfuncionarioNome.getText());
        this.funcionario.setEmail(jTfuncionarioEmail.getText());
        this.funcionario.setSexo((Sexo) jCBfuncionarioSexo.getSelectedItem());
        this.funcionario.setEndereco(endereco);
        this.funcionario.setLogin(login);
        
    } 
    
    private void preencherDadosFuncionario(Funcionario funcionario){
       
        endereco.setLogradouro(jTenderecoLogradouro.getText());
        endereco.setBairro(jTbairroDescricao.getText());
        endereco.setCidade(jTcidadeDescricao.getText());
        
        login.setUsuario(jTfuncionarioLogin.getText());
        login.setSenha(jPfuncionarioSenha.getText());
        
        
        funcionario.setCpf(jFfuncionarioCpf.getText());
        funcionario.setDataNascimento(jDateNascimento.getDate());
        funcionario.setRg(jFfuncionarioRg.getText());
        funcionario.setTelefone(jFfuncionarioTelefone.getText());
        funcionario.setNome(jTfuncionarioNome.getText());
        funcionario.setEmail(jTfuncionarioEmail.getText());
        funcionario.setSexo((Sexo) jCBfuncionarioSexo.getSelectedItem());
        funcionario.setEndereco(endereco);
        funcionario.setLogin(login);
        
    }
    
    private void atualizarTabela(){
        jTfuncionario.removeAll();
        this.funcionarioController.listar();
        this.jTfuncionario.setModel(this.funcionarioController.getTableModel());
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBfuncionarioAlterar;
    private javax.swing.JButton jBfuncionarioExcluir;
    private javax.swing.JButton jBfuncionarioNovo;
    private javax.swing.JButton jBfuncionarioSalvar;
    private javax.swing.JComboBox<String> jCBfuncionarioCargo;
    private javax.swing.JComboBox<String> jCBfuncionarioSexo;
    private com.toedter.calendar.JDateChooser jDateNascimento;
    private javax.swing.JFormattedTextField jFenderecoCep;
    public javax.swing.JFormattedTextField jFfuncionarioCpf;
    public javax.swing.JFormattedTextField jFfuncionarioRg;
    private javax.swing.JFormattedTextField jFfuncionarioTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTabela;
    private javax.swing.JPanel jPdadosClientes;
    private javax.swing.JPasswordField jPfuncionarioSenha;
    private javax.swing.JRadioButton jRBclienteCodigo;
    private javax.swing.JRadioButton jRBclienteCpf;
    private javax.swing.JRadioButton jRBclienteNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTbairroDescricao;
    private javax.swing.JTextField jTcidadeDescricao;
    private javax.swing.JTextField jTclientePesquisar;
    private javax.swing.JTextField jTenderecoLogradouro;
    private javax.swing.JTable jTfuncionario;
    private javax.swing.JTextField jTfuncionarioEmail;
    private javax.swing.JTextField jTfuncionarioLogin;
    private javax.swing.JTextField jTfuncionarioNome;
    // End of variables declaration//GEN-END:variables

   
}
