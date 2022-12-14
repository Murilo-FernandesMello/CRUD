/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.dao.ArmaDAO;
import br.ulbra.entity.Armas;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s.lucas
 */
public class FrArmas extends javax.swing.JFrame {

    /**
     * Creates new form FrArmas
     */
    public FrArmas() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null); //coloca o formulário no centro da tela 
        ControlarBtn(1);
        EdIdArm.setEnabled(false);
        readJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void ControlarBtn(int op) {
        switch (op) {
            case 1:
                PnArm.setVisible(false);
                BtSalvarArma.setEnabled(true);

                break;

            case 2:
                PnArm.setVisible(true);
                BtSalvarArma.setEnabled(true);
                BtAlterarArma.setEnabled(false);
                BtExcluirArma.setEnabled(false);
                break;

            case 3:
                PnArm.setVisible(true);
                BtAlterarArma.setEnabled(true);
                BtExcluirArma.setEnabled(true);
                BtSalvarArma.setEnabled(false);
                break;
        }
        this.pack();

    }

    public void readJTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) TbArmas.getModel();
        modelo.setNumRows(0);
        ArmaDAO adao = new ArmaDAO();
        for (Armas a : adao.readArm()) {
            modelo.addRow(new Object[]{
                a.getIdArm(),
                a.getNomeArm(),
                a.getTipoArm(),
                a.getCalibreArm(),
                a.getFuncArm(),
                a.getPrecoArm(),
                a.getNumArm()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        EdPesquisar = new javax.swing.JTextField();
        BtPesquisar = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        EdPesquisarArm = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BtPesquisarArm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbArmas = new javax.swing.JTable();
        BtNovoArm = new javax.swing.JButton();
        PnArm = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        EdIdArm = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        EdNomeArm = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        EdTipoArm = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        EdCalibreArm = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        EdFuncArm = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        EdPrecoArm = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        EdNum = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        BtSalvarArma = new javax.swing.JButton();
        BtExcluirArma = new javax.swing.JButton();
        BtAlterarArma = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE USUÁRIOS");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/bala.png"))); // NOI18N

        EdPesquisar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdPesquisarActionPerformed(evt);
            }
        });

        BtPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        BtPesquisar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/cadastro_search_icon.png"))); // NOI18N
        BtPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        BtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CADASTRO DE ARMAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 11, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/bala.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 12, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/bala.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 12, -1, -1));

        EdPesquisarArm.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdPesquisarArm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdPesquisarArm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdPesquisarArmActionPerformed(evt);
            }
        });
        EdPesquisarArm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EdPesquisarArmKeyPressed(evt);
            }
        });
        jPanel1.add(EdPesquisarArm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 140, 19));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pesquisar");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, -1, -1));

        BtPesquisarArm.setBackground(new java.awt.Color(255, 255, 255));
        BtPesquisarArm.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BtPesquisarArm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/cadastro_search_icon.png"))); // NOI18N
        BtPesquisarArm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        BtPesquisarArm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarArmActionPerformed(evt);
            }
        });
        jPanel1.add(BtPesquisarArm, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 28, -1));

        TbArmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Tipo", "Calibre", "Função", "Preço", "Numeração"
            }
        ));
        TbArmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbArmasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbArmas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, 469, 91));

        BtNovoArm.setBackground(new java.awt.Color(255, 255, 255));
        BtNovoArm.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BtNovoArm.setText("Novo Cadastro");
        BtNovoArm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        BtNovoArm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNovoArmActionPerformed(evt);
            }
        });
        jPanel1.add(BtNovoArm, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 188, 376, -1));

        PnArm.setBackground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID");

        EdIdArm.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdIdArm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdIdArm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdIdArmActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nome");

        EdNomeArm.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdNomeArm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdNomeArm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdNomeArmActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tipo");

        EdTipoArm.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdTipoArm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdTipoArm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdTipoArmActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Calibre");

        EdCalibreArm.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdCalibreArm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdCalibreArm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdCalibreArmActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Função");

        EdFuncArm.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdFuncArm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdFuncArm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdFuncArmActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Preço");

        EdPrecoArm.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdPrecoArm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdPrecoArm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdPrecoArmActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("N°");

        EdNum.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdNumActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Opções");

        BtSalvarArma.setBackground(new java.awt.Color(255, 255, 255));
        BtSalvarArma.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BtSalvarArma.setText("Salvar");
        BtSalvarArma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        BtSalvarArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarArmaActionPerformed(evt);
            }
        });

        BtExcluirArma.setBackground(new java.awt.Color(255, 255, 255));
        BtExcluirArma.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BtExcluirArma.setText("Excluir");
        BtExcluirArma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        BtExcluirArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirArmaActionPerformed(evt);
            }
        });

        BtAlterarArma.setBackground(new java.awt.Color(255, 255, 255));
        BtAlterarArma.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BtAlterarArma.setText("Alterar");
        BtAlterarArma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        BtAlterarArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarArmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnArmLayout = new javax.swing.GroupLayout(PnArm);
        PnArm.setLayout(PnArmLayout);
        PnArmLayout.setHorizontalGroup(
            PnArmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnArmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnArmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnArmLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EdIdArm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EdNomeArm))
                    .addGroup(PnArmLayout.createSequentialGroup()
                        .addGroup(PnArmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnArmLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EdFuncArm))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnArmLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EdTipoArm, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnArmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EdCalibreArm, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnArmLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EdPrecoArm, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EdNum, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnArmLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtSalvarArma, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtExcluirArma, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtAlterarArma, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PnArmLayout.setVerticalGroup(
            PnArmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnArmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnArmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(EdIdArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(EdNomeArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnArmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(EdTipoArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(EdCalibreArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnArmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(EdFuncArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(EdPrecoArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(EdNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PnArmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(BtSalvarArma)
                    .addComponent(BtExcluirArma)
                    .addComponent(BtAlterarArma))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jPanel1.add(PnArm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, -1, -1));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completa Cres.", "Completa Decresc.", "Nome", "Funcionamento", "Calibre" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });
        jPanel1.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EdPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdPesquisarActionPerformed

    private void EdPesquisarArmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdPesquisarArmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdPesquisarArmActionPerformed

    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtPesquisarActionPerformed

//    public void readJTableForDesc(String nome) throws
//            SQLException {
//        DefaultTableModel modelo = (DefaultTableModel) TbArmas.getModel();
//        modelo.setNumRows(0);
//        ArmaDAO adao = new ArmaDAO();
//        for (Armas a : adao.readForDesc(nome)) {
//            modelo.addRow(new Object[]{
//                a.getIdArm(),
//                a.getNomeArm(),
//                a.getTipoArm(),
//                a.getCalibreArm(),
//                a.getFuncArm(),
//                a.getPrecoArm(),
//                a.getNumArm()
//            });
//        }
//    }
    public void listarcD(String nome, int tipo) throws
            SQLException {
        DefaultTableModel modelo = (DefaultTableModel) TbArmas.getModel();
        modelo.setNumRows(0);
        ArmaDAO adao = new ArmaDAO();
        for (Armas a : adao.ListarCD(nome, tipo)) {
            modelo.addRow(new Object[]{
                a.getIdArm(),
                a.getNomeArm(),
                a.getTipoArm(),
                a.getCalibreArm(),
                a.getFuncArm(),
                a.getPrecoArm(),
                a.getNumArm()
            });
        }
    }

    public void listarNome(String nome, int tipo) throws
            SQLException {
        DefaultTableModel modelo = (DefaultTableModel) TbArmas.getModel();
        modelo.setNumRows(0);
        ArmaDAO adao = new ArmaDAO();
        for (Armas a : adao.ListarNome(nome, tipo)) {
            modelo.addRow(new Object[]{
                a.getIdArm(),
                a.getNomeArm(),
                a.getTipoArm(),
                a.getCalibreArm(),
                a.getFuncArm(),
                a.getPrecoArm(),
                a.getNumArm()
            });
        }
    }

    public void listarCalibre(String calibre, int tipo) throws
            SQLException {
        DefaultTableModel modelo = (DefaultTableModel) TbArmas.getModel();
        modelo.setNumRows(0);
        ArmaDAO adao = new ArmaDAO();
        for (Armas a : adao.ListarCalibre(calibre, tipo)) {
            modelo.addRow(new Object[]{
                a.getIdArm(),
                a.getNomeArm(),
                a.getTipoArm(),
                a.getCalibreArm(),
                a.getFuncArm(),
                a.getPrecoArm(),
                a.getNumArm()
            });
        }
    }

    public void listarFuncionamento(String funcionamento, int tipo) throws
            SQLException {
        DefaultTableModel modelo = (DefaultTableModel) TbArmas.getModel();
        modelo.setNumRows(0);
        ArmaDAO adao = new ArmaDAO();
        for (Armas a : adao.ListarFuncionamento(funcionamento, tipo)) {
            modelo.addRow(new Object[]{
                a.getIdArm(),
                a.getNomeArm(),
                a.getTipoArm(),
                a.getCalibreArm(),
                a.getFuncArm(),
                a.getPrecoArm(),
                a.getNumArm()
            });
        }
    }
    private void BtPesquisarArmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarArmActionPerformed
        /* Completa Cres. Completa Decresc. Nome Tipo Calibre*/

        try {
            int tipo = 0;
            if (cbTipo.getSelectedIndex() == 0) {
                listarcD(EdPesquisarArm.getText(), 0);
            } else if (cbTipo.getSelectedIndex() == 1) {
                listarcD(EdPesquisarArm.getText(), 1);
            } else if (cbTipo.getSelectedIndex() == 2) {
                listarNome(EdPesquisarArm.getText(), 2);
            } else if (cbTipo.getSelectedIndex() == 3) {
                listarFuncionamento(EdPesquisarArm.getText(), 3);
            } else {
                listarCalibre(EdPesquisarArm.getText(), 4);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        }
    }//GEN-LAST:event_BtPesquisarArmActionPerformed

    private void BtNovoArmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNovoArmActionPerformed
        ControlarBtn(2);
    }//GEN-LAST:event_BtNovoArmActionPerformed

    private void EdIdArmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdIdArmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdIdArmActionPerformed

    private void EdNomeArmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdNomeArmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdNomeArmActionPerformed

    private void EdTipoArmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdTipoArmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdTipoArmActionPerformed

    private void EdCalibreArmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdCalibreArmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdCalibreArmActionPerformed

    private void EdFuncArmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdFuncArmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdFuncArmActionPerformed

    private void EdPrecoArmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdPrecoArmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdPrecoArmActionPerformed

    private void EdNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdNumActionPerformed

    private void BtSalvarArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarArmaActionPerformed
        ControlarBtn(1);
        Armas a = new Armas();
        try {
            ArmaDAO ar = new ArmaDAO();
            a.setNomeArm(EdNomeArm.getText());
            a.setTipoArm(EdTipoArm.getText());
            a.setCalibreArm(EdCalibreArm.getText());
            a.setFuncArm(EdFuncArm.getText());
            a.setPrecoArm(EdPrecoArm.getText());
            a.setNumArm(EdNum.getText());
            ar.createArm(a);
            readJTable();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
        }
    }//GEN-LAST:event_BtSalvarArmaActionPerformed

    private void BtExcluirArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirArmaActionPerformed
        Armas a = new Armas();

        try {
            ArmaDAO ar = new ArmaDAO();
            a.setIdArm(Integer.parseInt(EdIdArm.getText()));
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir?", "Confirme exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                ar.deleteArm(a);
                readJTable();
                ControlarBtn(1);
            } else {
                JOptionPane.showMessageDialog(null, "Exclusão cancelada!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        }


    }//GEN-LAST:event_BtExcluirArmaActionPerformed

    private void BtAlterarArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarArmaActionPerformed

        Armas a = new Armas();
        try {
            ArmaDAO ar = new ArmaDAO();
            a.setNomeArm(EdNomeArm.getText());
            a.setTipoArm(EdTipoArm.getText());
            a.setCalibreArm(EdCalibreArm.getText());
            a.setFuncArm(EdFuncArm.getText());
            a.setPrecoArm(EdPrecoArm.getText());
            a.setNumArm(EdNum.getText());
            a.setIdArm(Integer.parseInt(EdIdArm.getText()));
            ar.updateArm(a);

            readJTable();
        } catch (SQLException ex) {
            Logger.getLogger(FrCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BtAlterarArmaActionPerformed

    private void TbArmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbArmasMouseClicked
        ControlarBtn(3);
        if (TbArmas.getSelectedRow() != -1) {
            EdIdArm.setText(TbArmas.getValueAt(TbArmas.getSelectedRow(), 0).toString());
            EdNomeArm.setText(TbArmas.getValueAt(TbArmas.getSelectedRow(), 1).toString());
            EdTipoArm.setText(TbArmas.getValueAt(TbArmas.getSelectedRow(), 2).toString());
            EdCalibreArm.setText(TbArmas.getValueAt(TbArmas.getSelectedRow(), 3).toString());
            EdFuncArm.setText(TbArmas.getValueAt(TbArmas.getSelectedRow(), 4).toString());
            EdPrecoArm.setText(TbArmas.getValueAt(TbArmas.getSelectedRow(), 5).toString());
            EdNum.setText(TbArmas.getValueAt(TbArmas.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_TbArmasMouseClicked

    private void EdPesquisarArmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EdPesquisarArmKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            /*
            try {
                readJTableForDesc(tipo, EdPesquisarArm.getText());
            } catch (SQLException ex) {
                Logger.getLogger(FrArmas.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }

    }//GEN-LAST:event_EdPesquisarArmKeyPressed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrArmas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrArmas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrArmas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrArmas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrArmas().setVisible(true);

                } catch (SQLException ex) {
                    Logger.getLogger(FrArmas.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAlterarArma;
    private javax.swing.JButton BtExcluirArma;
    private javax.swing.JButton BtNovoArm;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JButton BtPesquisarArm;
    private javax.swing.JButton BtSalvarArma;
    private javax.swing.JTextField EdCalibreArm;
    private javax.swing.JTextField EdFuncArm;
    private javax.swing.JTextField EdIdArm;
    private javax.swing.JTextField EdNomeArm;
    private javax.swing.JTextField EdNum;
    private javax.swing.JTextField EdPesquisar;
    private javax.swing.JTextField EdPesquisarArm;
    private javax.swing.JTextField EdPrecoArm;
    private javax.swing.JTextField EdTipoArm;
    private javax.swing.JPanel PnArm;
    private javax.swing.JTable TbArmas;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
