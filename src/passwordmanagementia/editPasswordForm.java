package passwordmanagementia;

import java.awt.Color;
import java.util.Scanner;

public class editPasswordForm extends javax.swing.JFrame {

    public editPasswordForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new org.netbeans.modules.form.InvalidComponent();
        panelBorder2 = new swing.PanelBorder();
        editViewPasswords = new swing.MyButton();
        editUserTxt = new javax.swing.JTextField();
        editOldPassTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        editNewPassTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        editPasswordOutput = new javax.swing.JTextArea();
        backToMenuButton = new swing.MyButton();
        editSubmit = new swing.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editViewPasswords.setText("View Passwords");
        editViewPasswords.setBorderColor(new java.awt.Color(0, 0, 0));
        editViewPasswords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editViewPasswordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editViewPasswordsMouseExited(evt);
            }
        });
        editViewPasswords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editViewPasswordsActionPerformed(evt);
            }
        });
        panelBorder2.add(editViewPasswords);
        editViewPasswords.setBounds(90, 190, 320, 25);

        editUserTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editUserTxt.setForeground(new java.awt.Color(153, 153, 153));
        editUserTxt.setText("username");
        editUserTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editUserTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editUserTxtFocusLost(evt);
            }
        });
        panelBorder2.add(editUserTxt);
        editUserTxt.setBounds(90, 150, 320, 26);

        editOldPassTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editOldPassTxt.setForeground(new java.awt.Color(153, 153, 153));
        editOldPassTxt.setText("password will be replaced in database");
        editOldPassTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editOldPassTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editOldPassTxtFocusLost(evt);
            }
        });
        panelBorder2.add(editOldPassTxt);
        editOldPassTxt.setBounds(90, 260, 320, 26);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PLEASE INPUT OLD PASSWORD:");
        panelBorder2.add(jLabel7);
        jLabel7.setBounds(100, 230, 300, 21);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PLEASE INPUT YOUR USERNAME:");
        panelBorder2.add(jLabel8);
        jLabel8.setBounds(90, 110, 320, 21);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PLEASE INPUT NEW PASSWORD:");
        panelBorder2.add(jLabel9);
        jLabel9.setBounds(100, 320, 310, 21);

        editNewPassTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editNewPassTxt.setForeground(new java.awt.Color(153, 153, 153));
        editNewPassTxt.setText("password will be inserted/saved to database");
        editNewPassTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editNewPassTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editNewPassTxtFocusLost(evt);
            }
        });
        panelBorder2.add(editNewPassTxt);
        editNewPassTxt.setBounds(90, 350, 320, 26);

        editPasswordOutput.setColumns(20);
        editPasswordOutput.setRows(5);
        jScrollPane1.setViewportView(editPasswordOutput);

        panelBorder2.add(jScrollPane1);
        jScrollPane1.setBounds(460, 30, 480, 540);

        backToMenuButton.setText("Back to Menu");
        backToMenuButton.setBorderColor(new java.awt.Color(0, 0, 0));
        backToMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backToMenuButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backToMenuButtonMouseExited(evt);
            }
        });
        backToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuButtonActionPerformed(evt);
            }
        });
        panelBorder2.add(backToMenuButton);
        backToMenuButton.setBounds(90, 440, 320, 25);

        editSubmit.setText("Submit");
        editSubmit.setBorderColor(new java.awt.Color(0, 0, 0));
        editSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editSubmitMouseExited(evt);
            }
        });
        editSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSubmitActionPerformed(evt);
            }
        });
        panelBorder2.add(editSubmit);
        editSubmit.setBounds(90, 400, 320, 25);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSubmitActionPerformed
        final String secretKey = "SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
        db k = new db();
        String username = editUserTxt.getText();
        String editIndex = editOldPassTxt.getText();
        String editPass = editNewPassTxt.getText();
        editIndex = aes.encrypt(editIndex, secretKey); //necessary to send encrypted versions of passwords
        editPass = aes.encrypt(editPass, secretKey);
        k.editPassword(editIndex, editPass, username);
    }//GEN-LAST:event_editSubmitActionPerformed

    private void editSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSubmitMouseExited
        editSubmit.setBackground(new Color(230,146,50));
    }//GEN-LAST:event_editSubmitMouseExited

    private void editSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSubmitMouseEntered
        editSubmit.setBackground(new Color(255,188,111));
    }//GEN-LAST:event_editSubmitMouseEntered

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        menuForm menuForm = new menuForm();
        menuForm.setVisible(true);
        menuForm.pack();
        menuForm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backToMenuButtonActionPerformed

    private void backToMenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMenuButtonMouseExited
        backToMenuButton.setBackground(new Color(230,146,50));
    }//GEN-LAST:event_backToMenuButtonMouseExited

    private void backToMenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMenuButtonMouseEntered
        backToMenuButton.setBackground(new Color(255,188,111));
    }//GEN-LAST:event_backToMenuButtonMouseEntered

    private void editNewPassTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editNewPassTxtFocusLost
        if(editNewPassTxt.getText().trim().equals("") || editNewPassTxt.getText().trim().toLowerCase().equals("password will be inserted/saved to database")){
            editNewPassTxt.setText("password will be inserted/saved to database");
            editNewPassTxt.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_editNewPassTxtFocusLost

    private void editNewPassTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editNewPassTxtFocusGained
        if(editNewPassTxt.getText().trim().toLowerCase().equals("password will be inserted/saved to database")){
            editNewPassTxt.setText("");
            editNewPassTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_editNewPassTxtFocusGained

    private void editOldPassTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editOldPassTxtFocusLost
        //when focus is lost and text is empty or "username", sets text to gray "username"
        if(editOldPassTxt.getText().trim().equals("") || editOldPassTxt.getText().trim().toLowerCase().equals("password will be replaced in database")){
            editOldPassTxt.setText("password will be replaced in database");
            editOldPassTxt.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_editOldPassTxtFocusLost

    private void editOldPassTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editOldPassTxtFocusGained
        //clear the textfield on focus if the text is "username"
        if(editOldPassTxt.getText().trim().toLowerCase().equals("password will be replaced in database")){
            editOldPassTxt.setText("");
            editOldPassTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_editOldPassTxtFocusGained

    private void editUserTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editUserTxtFocusLost
        //when focus is lost and text is empty or "username", sets text to gray "username"
        if(editUserTxt.getText().trim().equals("") || editUserTxt.getText().trim().toLowerCase().equals("username")){
            editUserTxt.setText("username");
            editUserTxt.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_editUserTxtFocusLost

    private void editUserTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editUserTxtFocusGained
        //clear the textfield on focus if the text is "username"
        if(editUserTxt.getText().trim().toLowerCase().equals("username")){
            editUserTxt.setText("");
            editUserTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_editUserTxtFocusGained

    private void editViewPasswordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editViewPasswordsActionPerformed
        final String secretKey = "SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
        db k = new db();
        String username = editUserTxt.getText();
        int i = 1;
        for(String j: k.getEncryptedPassword(username)){ //prints numbered list
            editPasswordOutput.append(i + ": " + aes.decrypt(j, secretKey));//decrypt stored passwords
            editPasswordOutput.append("\n");
            i++;
        }
    }//GEN-LAST:event_editViewPasswordsActionPerformed

    private void editViewPasswordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editViewPasswordsMouseExited
        editViewPasswords.setBackground(new Color(230,146,50));
    }//GEN-LAST:event_editViewPasswordsMouseExited

    private void editViewPasswordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editViewPasswordsMouseEntered
        editViewPasswords.setBackground(new Color(255,188,111));
    }//GEN-LAST:event_editViewPasswordsMouseEntered

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
            java.util.logging.Logger.getLogger(editPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editPasswordForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton backToMenuButton;
    private javax.swing.JTextField editNewPassTxt;
    private javax.swing.JTextField editOldPassTxt;
    private javax.swing.JTextArea editPasswordOutput;
    private swing.MyButton editSubmit;
    private javax.swing.JTextField editUserTxt;
    private swing.MyButton editViewPasswords;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.modules.form.InvalidComponent kGradientPanel2;
    private swing.PanelBorder panelBorder2;
    // End of variables declaration//GEN-END:variables
}
