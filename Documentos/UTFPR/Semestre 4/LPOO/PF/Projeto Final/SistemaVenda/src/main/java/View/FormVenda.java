
package View;

import Controller.PessoaController;
import Controller.ProdutoController;
import Controller.VendaController;
import Model.BusinessObject.TipoPagamento;
import Model.BusinessObject.Venda;
import Model.BusinessObject.VendaAprazo;
import Model.BusinessObject.VendaAvista;
import Model.Factory.VendaFactory;
import Singleton.CaixaSingleton;
import Singleton.FuncionarioSingleton;
import Model.valueObject.Cliente;
import Model.valueObject.Produto;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.NoResultException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author funck
 */
public class FormVenda extends javax.swing.JInternalFrame {

   
    private JDesktopPane jDesktoPanel;
    private VendaController vendaController;
    private ProdutoController produtoController;
    private Venda venda;
    private Produto produto;
    private Double valorTotal;
    private Cliente cliente;
    
    public FormVenda(JDesktopPane jDesktoPanel) {
        if(CaixaSingleton.getCaixa() != null){
            this.valorTotal = 0.0;
            this.vendaController = new VendaController();
            this.produtoController = new ProdutoController();
            this.venda = null;
            this.jDesktoPanel = jDesktoPanel;
            initComponents();
        }else{
            JOptionPane.showMessageDialog(this , "Você precisa abrir o caixa para realizar uma venda!");
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBbuscarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBnovoCliente = new javax.swing.JButton();
        jTbuscarCliente = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTprodutos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLvalorTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLvalorSelecionado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBexcluir = new javax.swing.JButton();
        jBfinalizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTprodutoCodigo = new javax.swing.JTextField();
        jTprodutoDescricao = new javax.swing.JTextField();
        jTdescontoP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTvalorUnitario = new javax.swing.JTextField();
        jTdesconto = new javax.swing.JTextField();
        jTvalorTotal = new javax.swing.JTextField();
        jBincluir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jCBtipoVenda = new javax.swing.JComboBox<>();
        jBnovaVenda = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Venda");
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
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CPF Cliente :");

        jBbuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBbuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/find.png"))); // NOI18N
        jBbuscarCliente.setText("Pesquisar");
        jBbuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("*Campo obrigatório somente para vendas a prazo");

        jBnovoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBnovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/new.png"))); // NOI18N
        jBnovoCliente.setText("Novo Cliente");
        jBnovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoClienteActionPerformed(evt);
            }
        });

        try {
            jTbuscarCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTbuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTbuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBnovoCliente)
                        .addGap(86, 86, 86))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTbuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jBbuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBnovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTprodutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTprodutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTprodutos);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Valor do item selecionado :");

        jLvalorTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLvalorTotal.setForeground(new java.awt.Color(255, 51, 51));
        jLvalorTotal.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Valor Total :");

        jLvalorSelecionado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLvalorSelecionado.setForeground(new java.awt.Color(255, 0, 0));
        jLvalorSelecionado.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Produtos da Venda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLvalorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLvalorSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLvalorTotal)
                    .addComponent(jLabel3)
                    .addComponent(jLvalorSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jBexcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });

        jBfinalizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBfinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/finish.png"))); // NOI18N
        jBfinalizar.setText("Finalizar");
        jBfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfinalizarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("  Codigo do Produto : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Descricação do produto :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Desconto % :");

        jTprodutoCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTprodutoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTprodutoCodigoKeyPressed(evt);
            }
        });

        jTprodutoDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTprodutoDescricao.setEnabled(false);

        jTdescontoP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTdescontoP.setText("0");
        jTdescontoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTdescontoPKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Valor Unitario :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Desconto :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Valor Total :");

        jTvalorUnitario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTvalorUnitario.setEnabled(false);

        jTdesconto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTdesconto.setEnabled(false);

        jTvalorTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTvalorTotal.setEnabled(false);

        jBincluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBincluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/incluir.png"))); // NOI18N
        jBincluir.setText("Incluir");
        jBincluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBincluirActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Tipo da Venda :");

        jCBtipoVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCBtipoVenda.setModel(new javax.swing.DefaultComboBoxModel(VendaFactory.values()));

        jBnovaVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBnovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/new.png"))); // NOI18N
        jBnovaVenda.setText("Nova Venda");
        jBnovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovaVendaActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBexcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBfinalizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTprodutoCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTprodutoDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTdescontoP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTvalorUnitario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTdesconto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTvalorTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBincluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jCBtipoVenda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBnovaVenda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jBnovaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addGap(12, 12, 12)))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTdescontoP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTprodutoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTvalorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(55, 55, 55)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(0, 36, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTprodutoDescricao)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTvalorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTdesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(111, 111, 111))))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jCBtipoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTprodutoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTprodutoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTdescontoP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTvalorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTdesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(13, 13, 13)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTvalorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBtipoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBfinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBnovaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
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
            Logger.getLogger(FormVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jTprodutos.setModel(this.produtoController.getTableModel());
    }//GEN-LAST:event_formInternalFrameOpened

    private void jBfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfinalizarActionPerformed
        if (jTprodutos.getRowCount() > 0) {
            try {
                VendaFactory v = (VendaFactory) this.jCBtipoVenda.getSelectedItem();
                
                this.venda = v.getVenda();
                this.venda.setProdutos(this.produtoController.getProdutos());
                this.venda.setValor(this.valorTotal);
                
                this.vendaController.setVenda(this.venda);
                
                if (this.venda instanceof VendaAprazo){
                    if(this.cliente != null){
                        VendaAprazo v1 = (VendaAprazo) this.venda;
                        v1.setCliente(this.cliente);
                        FormPrestacao form = new FormPrestacao(v1);
                        this.jDesktoPanel.add(form);
                        form.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null , "Insira um cliente para realizar uma venda ao prazo");
                    }
                } else {
                    FormPagamento form = new FormPagamento(this.vendaController);
                    this.jDesktoPanel.add(form);
                    form.setVisible(true);
                }
                     
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(this, "Digite apenas valores numericos para os campos de valores");
            } catch (Exception erro2) {
                JOptionPane.showMessageDialog(this, "Erro ao realizar Venda");
            }
        }else{
            JOptionPane.showMessageDialog(this , "Você precisa incluir algum produto para realizar uma venda");
        }
    }//GEN-LAST:event_jBfinalizarActionPerformed

    private void jBincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBincluirActionPerformed
        try{
            if(this.produto.getQuantidadeEstoque() > 0){
                adicionarProduto();
                this.produtoController.getProdutos().add(this.produto);
                this.valorTotal += this.produto.getValorFinal();
                this.jLvalorTotal.setText(String.valueOf(this.valorTotal));
                this.produto.setQuantidadeEstoque(this.produto.getQuantidadeEstoque() - 1);
                this.produtoController.atualizar();
            }else{
                JOptionPane.showMessageDialog(this , "Produto em baixa no estoque");
            }
            this.produto = null;
            this.produtoController.setProduto(null);
            limparCampos();
            desabilitarCampos();
        } catch (NullPointerException erro){
            JOptionPane.showMessageDialog(this , "Insira o codigo do produto antes de inclui-lo");
        }    
    }//GEN-LAST:event_jBincluirActionPerformed

    private void jBbuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarClienteActionPerformed
        try{
            cliente = (Cliente) new PessoaController("Cliente").ListByExample(jTbuscarCliente.getText());
            JOptionPane.showMessageDialog(this , "Nome : " + cliente.getNome()
                                                  +"\nRg  : " + cliente.getRg() +
                                                    "\nCPF : " + cliente.getCpf());
        }catch(NoResultException erro){
            JOptionPane.showMessageDialog(this , "Pessoa não encontrada");
        }      
    }//GEN-LAST:event_jBbuscarClienteActionPerformed

    private void jBnovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoClienteActionPerformed
        FormCliente form = new FormCliente();
        this.jDesktoPanel.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jBnovoClienteActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        try{
            this.produtoController.getProdutos().remove(this.produto);
            this.valorTotal -= this.produto.getValorFinal();
            this.jLvalorTotal.setText(String.valueOf(this.valorTotal));
            this.produto = null;
            removerProduto();
            limparCampos();
            desabilitarCampos();
        }catch(NullPointerException erro){
            JOptionPane.showMessageDialog(this , "Selecione um produto da tabela para exclui-lo da compra");
        }    
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jTprodutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTprodutosMouseClicked
        this.produto = this.produtoController.getProdutos().get(this.jTprodutos.getSelectedRow());
        this.produtoController.setProduto(produto);
        this.jLvalorSelecionado.setText(String.valueOf(this.produto.getValor()));
        preencherCampos();
        abilitarCampos();
    }//GEN-LAST:event_jTprodutosMouseClicked

    private void jTprodutoCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTprodutoCodigoKeyPressed
        try{
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                this.produto = this.produtoController.buscarProduto(Long.valueOf(jTprodutoCodigo.getText()));
                this.produto.setPorcentagemDesc(Double.valueOf(jTdescontoP.getText()));
                this.produto.setValorDesconto(this.produto.getValor() * this.produto.getPorcentagemDesc() / 100);
                this.produto.setValorFinal(this.produto.getValor() - (this.produto.getValor() * this.produto.getPorcentagemDesc() / 100));
                preencherCampos();
                abilitarCampos();
            }
        }catch(NullPointerException erro){
            JOptionPane.showMessageDialog(this , "Código invalido");
        }    
    }//GEN-LAST:event_jTprodutoCodigoKeyPressed

    private void jTdescontoPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdescontoPKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.produto.setPorcentagemDesc(Double.valueOf(jTdescontoP.getText()));
            this.produto.setValorDesconto(this.produto.getValor() * this.produto.getPorcentagemDesc() / 100);
            this.produto.setValorFinal(this.produto.getValor() - (this.produto.getValor() * this.produto.getPorcentagemDesc() / 100));
            preencherCampos();
        }    
    }//GEN-LAST:event_jTdescontoPKeyPressed

    private void jBnovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovaVendaActionPerformed
        novaVenda();
    }//GEN-LAST:event_jBnovaVendaActionPerformed
       
    private void preencherCampos(){
        jTprodutoDescricao.setText(this.produto.getDescricao());
        jTvalorUnitario.setText(String.valueOf(this.produto.getValor()));
        jTvalorTotal.setText(String.valueOf(this.produto.getValorFinal()));
        jTdesconto.setText(String.valueOf(this.produto.getValorDesconto()));
        jTdescontoP.setText(String.valueOf(this.produto.getPorcentagemDesc()));
        jTprodutoCodigo.setText(String.valueOf(this.produto.getCodigo()));
        
    }
    
    public void limparCampos(){
        jTbuscarCliente.setText(null);
        jTprodutoCodigo.setText(null);
        jTprodutoDescricao.setText(null);
        jTvalorUnitario.setText(null);
        jTvalorTotal.setText(null);
        jTdesconto.setText(null);
        jTbuscarCliente.setText(null);
        jTdescontoP.setText("0");
    }
    
    private void adicionarProduto(){
        this.produtoController.incluirProdutoTabela();
    }
    
    private void removerProduto(){
        this.produtoController.removerProdutoTabela();
    }
    
    private void novaVenda(){
        this.valorTotal = 0.0;
        this.vendaController = new VendaController();
        jLvalorSelecionado.setText("0");
        jLvalorTotal.setText("0");
        this.produtoController.getProdutos().clear();
        this.produtoController.limparTabela();
    }
    
    public void abilitarCampos(){
        jTdesconto.setEnabled(true);
        jTprodutoDescricao.setEnabled(true);
        jTvalorUnitario.setEnabled(true);
        jTvalorTotal.setEnabled(true);
    }
    
    public void desabilitarCampos(){
        jTdesconto.setEnabled(false);
        jTprodutoDescricao.setEnabled(false);
        jTvalorUnitario.setEnabled(false);
        jTvalorTotal.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarCliente;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBfinalizar;
    private javax.swing.JButton jBincluir;
    private javax.swing.JButton jBnovaVenda;
    private javax.swing.JButton jBnovoCliente;
    private javax.swing.JComboBox<String> jCBtipoVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jLvalorSelecionado;
    private javax.swing.JLabel jLvalorTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jTbuscarCliente;
    private javax.swing.JTextField jTdesconto;
    private javax.swing.JTextField jTdescontoP;
    private javax.swing.JTextField jTprodutoCodigo;
    private javax.swing.JTextField jTprodutoDescricao;
    private javax.swing.JTable jTprodutos;
    private javax.swing.JTextField jTvalorTotal;
    private javax.swing.JTextField jTvalorUnitario;
    // End of variables declaration//GEN-END:variables
}
