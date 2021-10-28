package view;

import java.awt.Color;
import java.awt.Image;
import javax.swing.JOptionPane;

public class RelatorioEmail extends javax.swing.JInternalFrame {

    public RelatorioEmail() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDescrevaEmail = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtData2 = new javax.swing.JFormattedTextField();
        enviar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);

        jDescrevaEmail.setBackground(new java.awt.Color(238, 140, 60));
        jDescrevaEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Email");

        jLabel2.setText("Relatório do dia:");

        try {
            txtData2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##  /  ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        enviar.setText("Enviar");
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarMouseClicked(evt);
            }
        });
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDescrevaEmailLayout = new javax.swing.GroupLayout(jDescrevaEmail);
        jDescrevaEmail.setLayout(jDescrevaEmailLayout);
        jDescrevaEmailLayout.setHorizontalGroup(
            jDescrevaEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDescrevaEmailLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jDescrevaEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(enviar)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtData2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jDescrevaEmailLayout.setVerticalGroup(
            jDescrevaEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDescrevaEmailLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enviar)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescrevaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescrevaEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseClicked
        enviar.setBackground(new Color(235, 235, 235));
    }//GEN-LAST:event_enviarMouseClicked

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed

        if (jTextEmail.getText().equals("") || txtData2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
        } else {
            JOptionPane.showMessageDialog(null, "Email enviado!");
            dispose();
    }//GEN-LAST:event_enviarActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviar;
    private javax.swing.JPanel jDescrevaEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JFormattedTextField txtData2;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
