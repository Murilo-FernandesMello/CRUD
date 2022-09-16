/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.entity.Usuario;
import br.ulbra.dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s.lucas
 */
public class FrCadastro extends javax.swing.JFrame {

    /**
     * Creates new form FrCadastro
     */
    public FrCadastro() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null); //coloca o formulário no centro da tela 
        ControlarBtn(1);
        EdIdCad.setEnabled(false);
        readJTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        EdPesquisar = new javax.swing.JTextField();
        BtPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        BtNovoCad = new javax.swing.JButton();
        PnCad = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        EdIdCad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        EdNomeCad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        EdEmailCadastro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RbMasc = new javax.swing.JRadioButton();
        RbFem = new javax.swing.JRadioButton();
        RbAlt = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        BtAlterar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtSalvar = new javax.swing.JButton();
        EdSenha1 = new javax.swing.JPasswordField();
        EdSenha2 = new javax.swing.JPasswordField();
        EdTel = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-mail");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE USUÁRIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 11, -1, -1));

        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 450, -1, 0));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pesquisar");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, -1, -1));

        EdPesquisar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(EdPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 56, 303, 19));

        BtPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        BtPesquisar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/cadastro_search_icon.png"))); // NOI18N
        BtPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        BtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(BtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 56, 28, -1));

        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "COD", "NOME", "E-MAIL", "TELEFONE", "SEXO", "SENHA"
            }
        ));
        tbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, 409, 76));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/bala.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 12, -1, -1));

        BtNovoCad.setBackground(new java.awt.Color(255, 255, 255));
        BtNovoCad.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BtNovoCad.setText("Novo Cadastro");
        BtNovoCad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        BtNovoCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNovoCadActionPerformed(evt);
            }
        });
        jPanel1.add(BtNovoCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 409, -1));

        PnCad.setBackground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID");

        EdIdCad.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdIdCad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdIdCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdIdCadActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nome");

        EdNomeCad.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdNomeCad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdNomeCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdNomeCadActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("E-mail");

        EdEmailCadastro.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        EdEmailCadastro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        EdEmailCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdEmailCadastroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefone");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Senha");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Confirme");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sexo");

        RbMasc.setBackground(new java.awt.Color(255, 0, 51));
        buttonGroup1.add(RbMasc);
        RbMasc.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        RbMasc.setForeground(new java.awt.Color(255, 255, 255));
        RbMasc.setText("Masculino");
        RbMasc.setBorderPainted(true);
        RbMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbMascActionPerformed(evt);
            }
        });

        RbFem.setBackground(new java.awt.Color(255, 0, 51));
        buttonGroup1.add(RbFem);
        RbFem.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        RbFem.setForeground(new java.awt.Color(255, 255, 255));
        RbFem.setText("Feminino");
        RbFem.setBorderPainted(true);
        RbFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbFemActionPerformed(evt);
            }
        });

        RbAlt.setBackground(new java.awt.Color(255, 0, 51));
        buttonGroup1.add(RbAlt);
        RbAlt.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        RbAlt.setForeground(new java.awt.Color(255, 255, 255));
        RbAlt.setText("Outro");
        RbAlt.setBorderPainted(true);
        RbAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbAltActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Opções");

        BtAlterar.setBackground(new java.awt.Color(255, 255, 255));
        BtAlterar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BtAlterar.setText("Alterar");
        BtAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        BtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarActionPerformed(evt);
            }
        });

        BtExcluir.setBackground(new java.awt.Color(255, 255, 255));
        BtExcluir.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BtExcluir.setText("Excluir");
        BtExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });

        BtSalvar.setBackground(new java.awt.Color(255, 255, 255));
        BtSalvar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BtSalvar.setText("Salvar");
        BtSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });

        EdSenha1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));

        EdSenha2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));

        EdTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102)));

        javax.swing.GroupLayout PnCadLayout = new javax.swing.GroupLayout(PnCad);
        PnCad.setLayout(PnCadLayout);
        PnCadLayout.setHorizontalGroup(
            PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadLayout.createSequentialGroup()
                .addGroup(PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnCadLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnCadLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(4, 4, 4)
                                .addComponent(EdIdCad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EdNomeCad))
                            .addGroup(PnCadLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EdEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PnCadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnCadLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnCadLayout.createSequentialGroup()
                                .addGroup(PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnCadLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EdTel, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                    .addGroup(PnCadLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EdSenha1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnCadLayout.createSequentialGroup()
                                        .addComponent(RbMasc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RbFem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RbAlt))
                                    .addGroup(PnCadLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EdSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        PnCadLayout.setVerticalGroup(
            PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addGroup(PnCadLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EdIdCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(PnCadLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(EdEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17)
                    .addComponent(EdSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EdSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(RbMasc)
                    .addComponent(RbFem)
                    .addComponent(RbAlt)
                    .addComponent(EdTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PnCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(BtSalvar)
                    .addComponent(BtExcluir)
                    .addComponent(BtAlterar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(PnCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, 424, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/bala.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 11, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        ControlarBtn(1);
        Usuario u = new Usuario();
        try {
            UsuarioDAO ud = new UsuarioDAO();
            u.setNomeUsu(EdNomeCad.getText());
            u.setEmailUsu(EdEmailCadastro.getText());
            u.setTelUsu(EdTel.getText());
            u.setSenhaUsu(EdSenha1.getText());

            if (RbMasc.isSelected()) {
                u.setSexoUsu(1);
            } else if (RbFem.isSelected()) {
                u.setSexoUsu(2);
            } else {
                u.setSexoUsu(3);
            }

            if (EdSenha1.getText().equals(EdSenha2.getText())) {
                ud.create(u);
                readJTable();
            } else {
                JOptionPane.showMessageDialog(null, "As senhas estão diferentes!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
        }
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed

        Usuario u = new Usuario();

        try {
            UsuarioDAO ud = new UsuarioDAO();
            u.setIdUsu(Integer.parseInt(EdIdCad.getText()));
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir?", "Confirme exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                ud.delete(u);
                readJTable();
                ControlarBtn(1);
            } else {
                JOptionPane.showMessageDialog(null, "Exclusão cancelada!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        }

    }//GEN-LAST:event_BtExcluirActionPerformed

    private void BtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarActionPerformed

        Usuario u = new Usuario();
        try {
            UsuarioDAO ud = new UsuarioDAO();
            u.setNomeUsu(EdNomeCad.getText());
            u.setEmailUsu(EdEmailCadastro.getText());
            u.setSenhaUsu(EdSenha1.getText());
            u.setTelUsu(EdTel.getText());
            if (RbMasc.isSelected()) {
                u.setSexoUsu(1);
            } else if (RbFem.isSelected()) {
                u.setSexoUsu(2);
            } else {
                u.setSexoUsu(3);
            }
            if (EdSenha1.getText().equals(EdSenha2.getText())) {
                u.setIdUsu(Integer.parseInt(EdIdCad.getText()));
                ud.update(u);
                readJTable();
                ControlarBtn(1);
            } else {
                JOptionPane.showMessageDialog(null, "Você inseriu senhas diferentes!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BtAlterarActionPerformed

    private void RbAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbAltActionPerformed

    private void RbFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbFemActionPerformed

    private void RbMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbMascActionPerformed

    private void EdEmailCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdEmailCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdEmailCadastroActionPerformed

    private void EdNomeCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdNomeCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdNomeCadActionPerformed

    private void EdIdCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdIdCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdIdCadActionPerformed

    private void BtNovoCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNovoCadActionPerformed
        ControlarBtn(2);

    }//GEN-LAST:event_BtNovoCadActionPerformed

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
        ControlarBtn(3);
        if (tbUsuario.getSelectedRow() != -1) {
            EdIdCad.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 0).toString());
            EdNomeCad.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 1).toString());
            EdEmailCadastro.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 2).toString());
            EdTel.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 3).toString());
            int s = (int) tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 4);
            if (s == 1) {
                RbMasc.setSelected(true);
            } else if (s == 2) {
                RbFem.setSelected(true);
            } else {
                RbAlt.setSelected(true);
            }

            EdSenha1.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 5).toString());
            EdSenha2.setText(EdSenha1.getText());
        }
    }//GEN-LAST:event_tbUsuarioMouseClicked

    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void EdPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdPesquisarActionPerformed

    public void ControlarBtn(int op) {
        switch (op) {
            case 1:
                PnCad.setVisible(false);
                BtSalvar.setEnabled(true);

                break;

            case 2:
                PnCad.setVisible(true);
                BtSalvar.setEnabled(true);
                BtAlterar.setEnabled(false);
                BtExcluir.setEnabled(false);
                break;

            case 3:
                PnCad.setVisible(true);
                BtAlterar.setEnabled(true);
                BtExcluir.setEnabled(true);
                BtSalvar.setEnabled(false);
                break;
        }
        this.pack();

    }

    public void readJTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbUsuario.getModel();
        modelo.setNumRows(0);
        UsuarioDAO udao = new UsuarioDAO();
        for (Usuario p : udao.read()) {
            modelo.addRow(new Object[]{
                p.getIdUsu(),
                p.getNomeUsu(),
                p.getEmailUsu(),
                p.getTelUsu(),
                p.getSexoUsu(),
                p.getSenhaUsu()
            });
        }
    }

    public void readJTableForDesc(String nome) throws SQLException {
        DefaultTableModel modelo
                = (DefaultTableModel) tbUsuario.getModel();
        modelo.setNumRows(0);
        UsuarioDAO pdao = new UsuarioDAO();
        for (Usuario p : pdao.readForDesc(nome)) {
            modelo.addRow(new Object[]{
                p.getIdUsu(),
                p.getNomeUsu(),
                p.getEmailUsu(),
                p.getTelUsu(),
                p.getSexoUsu(),
                p.getSenhaUsu()
            });
        }
    }

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
            java.util.logging.Logger.getLogger(FrArmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrArmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrArmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrArmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        try {
            new FrCadastro().setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(FrCadastro.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
}
);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAlterar;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtNovoCad;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JTextField EdEmailCadastro;
    private javax.swing.JTextField EdIdCad;
    private javax.swing.JTextField EdNomeCad;
    private javax.swing.JTextField EdPesquisar;
    private javax.swing.JPasswordField EdSenha1;
    private javax.swing.JPasswordField EdSenha2;
    private javax.swing.JTextField EdTel;
    private javax.swing.JPanel PnCad;
    private javax.swing.JRadioButton RbAlt;
    private javax.swing.JRadioButton RbFem;
    private javax.swing.JRadioButton RbMasc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUsuario;
    // End of variables declaration//GEN-END:variables
}