package view;

import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class SaidaDeItens extends javax.swing.JInternalFrame {

    public SaidaDeItens() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtDataS = new javax.swing.JFormattedTextField();
        txtCodigoS = new javax.swing.JTextField();
        jMedidaS = new javax.swing.JComboBox<>();
        txtnome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUnidads = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidadeS = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutosS = new javax.swing.JTable();
        txtValorS = new javax.swing.JTextField();
        txtnome1 = new javax.swing.JLabel();
        txtNomeS = new javax.swing.JTextField();
        txtnome2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel2.setBackground(new java.awt.Color(238, 140, 60));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Item"));

        try {
            txtDataS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##  /  ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jMedidaS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Unidade(s)", "Caixa(s)", "Pacote(s)", "Kilo(s)", "Grama(s)", "Metro(s)" }));

        txtnome.setText("Código do produto:");

        jLabel2.setText("Quantidade:");

        txtUnidads.setText("Medida:");

        jLabel4.setText("Data de Retirada:");

        jButton1.setText("Retirar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTProdutosS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor (R$)", "Medida", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProdutosS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosSMouseClicked(evt);
            }
        });
        jTProdutosS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTProdutosSKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTProdutosS);

        txtnome1.setText("Valor(R$)");

        txtnome2.setText("Nome");

        jButton2.setText("Excluir");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Atualizar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidadeS, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoS, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnome)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnome2)
                            .addComponent(jMedidaS, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnidads)
                            .addComponent(txtNomeS, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnome1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorS, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataS, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addGap(0, 175, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome)
                    .addComponent(txtnome1)
                    .addComponent(txtnome2))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUnidads)
                    .addComponent(jLabel4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidadeS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMedidaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel dProdutosS = (DefaultTableModel) jTProdutosS.getModel();
        Object[] dados = {txtCodigoS.getText(), txtNomeS.getText(), txtValorS.getText(), txtQuantidadeS.getText(), jMedidaS.getSelectedItem(), txtDataS.getText()};
        dProdutosS.addRow(dados);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (jTProdutosS.getSelectedRow() != -1) {
            DefaultTableModel dProdutos = (DefaultTableModel) jTProdutosS.getModel();
            dProdutos.removeRow(jTProdutosS.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir.");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (jTProdutosS.getSelectedRow() != -1) {

            jTProdutosS.setValueAt(txtCodigoS.getText(), jTProdutosS.getSelectedRow(), 0);
            jTProdutosS.setValueAt(txtNomeS.getText(), jTProdutosS.getSelectedRow(), 1);
            jTProdutosS.setValueAt(txtValorS.getText(), jTProdutosS.getSelectedRow(), 2);
            jTProdutosS.setValueAt(txtQuantidadeS.getText(), jTProdutosS.getSelectedRow(), 3);
            jTProdutosS.setValueAt(jMedidaS.getSelectedItem(), jTProdutosS.getSelectedRow(), 4);
            jTProdutosS.setValueAt(txtDataS.getText(), jTProdutosS.getSelectedRow(), 5);
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    private void jTProdutosSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosSMouseClicked

        if (jTProdutosS.getSelectedRow() != -1) {
            txtCodigoS.setText(jTProdutosS.getValueAt(jTProdutosS.getSelectedRow(), 0).toString());
            txtNomeS.setText(jTProdutosS.getValueAt(jTProdutosS.getSelectedRow(), 1).toString());
            txtValorS.setText(jTProdutosS.getValueAt(jTProdutosS.getSelectedRow(), 2).toString());
            txtQuantidadeS.setText(jTProdutosS.getValueAt(jTProdutosS.getSelectedRow(), 3).toString());
            jMedidaS.setSelectedItem(jTProdutosS.getValueAt(jTProdutosS.getSelectedRow(), 4).toString());
            txtDataS.setText(jTProdutosS.getValueAt(jTProdutosS.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_jTProdutosSMouseClicked
    }
    private void jTProdutosSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdutosSKeyReleased

        if (jTProdutosS.getSelectedRow() != -1) {
            txtCodigoS.setText(jTProdutosS.getValueAt(jTProdutosS.getSelectedRow(), 0).toString());
            txtNomeS.setText(jTProdutosS.getValueAt(jTProdutosS.getSelectedRow(), 1).toString());
            txtValorS.setText(jTProdutosS.getValueAt(jTProdutosS.getSelectedRow(), 2).toString());
            txtQuantidadeS.setText(jTProdutosS.getValueAt(jTProdutosS.getSelectedRow(), 3).toString());
            jMedidaS.setSelectedItem(jTProdutosS.getValueAt(jTProdutosS.getSelectedRow(), 4).toString());
            txtDataS.setText(jTProdutosS.getValueAt(jTProdutosS.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jTProdutosSKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jMedidaS;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdutosS;
    private javax.swing.JTextField txtCodigoS;
    private javax.swing.JFormattedTextField txtDataS;
    private javax.swing.JTextField txtNomeS;
    private javax.swing.JTextField txtQuantidadeS;
    private javax.swing.JLabel txtUnidads;
    private javax.swing.JTextField txtValorS;
    private javax.swing.JLabel txtnome;
    private javax.swing.JLabel txtnome1;
    private javax.swing.JLabel txtnome2;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}