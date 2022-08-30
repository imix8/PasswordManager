package passwordmanagementia;

import java.awt.Color;
import java.util.Scanner;

public class viewPasswordForm extends javax.swing.JFrame {

    public viewPasswordForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        panelBorder1 = new swing.PanelBorder();
        backToMenu = new swing.MyButton();
        viewUserTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        viewDecrypted = new swing.MyButton();
        viewEncrypted = new swing.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        passwordOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(246, 114, 69));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 255));

        backToMenu.setText("Back to Menu");
        backToMenu.setBorderColor(new java.awt.Color(0, 0, 0));
        backToMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backToMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backToMenuMouseExited(evt);
            }
        });
        backToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuActionPerformed(evt);
            }
        });
        panelBorder1.add(backToMenu);
        backToMenu.setBounds(80, 370, 320, 25);

        viewUserTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewUserTxt.setForeground(new java.awt.Color(153, 153, 153));
        viewUserTxt.setText("username");
        viewUserTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                viewUserTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                viewUserTxtFocusLost(evt);
            }
        });
        panelBorder1.add(viewUserTxt);
        viewUserTxt.setBounds(80, 210, 320, 26);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PLEASE INPUT YOUR USERNAME:");
        panelBorder1.add(jLabel6);
        jLabel6.setBounds(80, 160, 320, 30);

        viewDecrypted.setText("View Decrypted Passwords");
        viewDecrypted.setBorderColor(new java.awt.Color(0, 0, 0));
        viewDecrypted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewDecryptedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewDecryptedMouseExited(evt);
            }
        });
        viewDecrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDecryptedActionPerformed(evt);
            }
        });
        panelBorder1.add(viewDecrypted);
        viewDecrypted.setBounds(80, 320, 320, 25);

        viewEncrypted.setText("View Encrypted Passwords");
        viewEncrypted.setBorderColor(new java.awt.Color(0, 0, 0));
        viewEncrypted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewEncryptedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewEncryptedMouseExited(evt);
            }
        });
        viewEncrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEncryptedActionPerformed(evt);
            }
        });
        panelBorder1.add(viewEncrypted);
        viewEncrypted.setBounds(80, 270, 320, 25);

        passwordOutput.setColumns(20);
        passwordOutput.setRows(5);
        jScrollPane1.setViewportView(passwordOutput);

        panelBorder1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 30, 480, 540);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMenuMouseEntered
        backToMenu.setBackground(new Color(255,188,111));
    }//GEN-LAST:event_backToMenuMouseEntered

    private void backToMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMenuMouseExited
        backToMenu.setBackground(new Color(230,146,50));
    }//GEN-LAST:event_backToMenuMouseExited

    private void backToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuActionPerformed
        menuForm menuForm = new menuForm();
        menuForm.setVisible(true);
        menuForm.pack();
        menuForm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backToMenuActionPerformed

    private void viewUserTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewUserTxtFocusGained
        //clear the textfield on focus if the text is "username"
        if(viewUserTxt.getText().trim().toLowerCase().equals("username")){
            viewUserTxt.setText("");
            viewUserTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_viewUserTxtFocusGained

    private void viewUserTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewUserTxtFocusLost
        //when focus is lost and text is empty or "username", sets text to gray "username"
        if(viewUserTxt.getText().trim().equals("") || viewUserTxt.getText().trim().toLowerCase().equals("username")){
            viewUserTxt.setText("username");
            viewUserTxt.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_viewUserTxtFocusLost

    private void viewDecryptedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDecryptedMouseEntered
        viewDecrypted.setBackground(new Color(255,188,111));
    }//GEN-LAST:event_viewDecryptedMouseEntered

    private void viewDecryptedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDecryptedMouseExited
        viewDecrypted.setBackground(new Color(230,146,50));
    }//GEN-LAST:event_viewDecryptedMouseExited

    private void viewDecryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDecryptedActionPerformed
        final String secretKey = "SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
        //secretKey for encryption and decryption storage on inputpass
        db k = new db();
        String username = viewUserTxt.getText();
        int i = 1;
        for(String j: k.getEncryptedPassword(username)){ //prints numbered list
            passwordOutput.append(i + ": " + aes.decrypt(j, secretKey));//decrypt stored passwords
            passwordOutput.append("\n");
            i++;
        }
    }//GEN-LAST:event_viewDecryptedActionPerformed

    private void viewEncryptedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewEncryptedMouseEntered
        viewEncrypted.setBackground(new Color(255,188,111));
    }//GEN-LAST:event_viewEncryptedMouseEntered

    private void viewEncryptedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewEncryptedMouseExited
        viewEncrypted.setBackground(new Color(230,146,50));
    }//GEN-LAST:event_viewEncryptedMouseExited

    private void viewEncryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEncryptedActionPerformed
        db k = new db();
        String username = viewUserTxt.getText();
        int i = 1;
        for(String j: k.getEncryptedPassword(username)){ //prints numbered list
            passwordOutput.append(i + ": " + j);
            passwordOutput.append("\n");
            i++;
        }
    }//GEN-LAST:event_viewEncryptedActionPerformed

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
            java.util.logging.Logger.getLogger(viewPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewPasswordForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton backToMenu;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private swing.PanelBorder panelBorder1;
    private javax.swing.JTextArea passwordOutput;
    private swing.MyButton viewDecrypted;
    private swing.MyButton viewEncrypted;
    private javax.swing.JTextField viewUserTxt;
    // End of variables declaration//GEN-END:variables
}
