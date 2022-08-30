package passwordmanagementia;

import java.awt.Color;
import java.util.Scanner;

public class addPasswordForm extends javax.swing.JFrame {

    public addPasswordForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        panelBorder1 = new swing.PanelBorder();
        addSubmit = new swing.MyButton();
        addUserTxt = new javax.swing.JTextField();
        addPassTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        backToMenuButton = new swing.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(246, 114, 69));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 255));

        addSubmit.setText("Submit");
        addSubmit.setBorderColor(new java.awt.Color(0, 0, 0));
        addSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addSubmitMouseExited(evt);
            }
        });
        addSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubmitActionPerformed(evt);
            }
        });
        panelBorder1.add(addSubmit);
        addSubmit.setBounds(330, 350, 320, 25);

        addUserTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addUserTxt.setForeground(new java.awt.Color(153, 153, 153));
        addUserTxt.setText("username");
        addUserTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addUserTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addUserTxtFocusLost(evt);
            }
        });
        panelBorder1.add(addUserTxt);
        addUserTxt.setBounds(330, 220, 320, 26);

        addPassTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addPassTxt.setForeground(new java.awt.Color(153, 153, 153));
        addPassTxt.setText("password will be saved to database");
        addPassTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addPassTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addPassTxtFocusLost(evt);
            }
        });
        panelBorder1.add(addPassTxt);
        addPassTxt.setBounds(330, 300, 320, 26);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PLEASE INPUT YOUR PASSWORD IN THE SPACE BELOW:");
        panelBorder1.add(jLabel5);
        jLabel5.setBounds(220, 270, 520, 21);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PLEASE INPUT YOUR USERNAME IN THE SPACE BELOW:");
        panelBorder1.add(jLabel6);
        jLabel6.setBounds(220, 180, 530, 21);

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
        panelBorder1.add(backToMenuButton);
        backToMenuButton.setBounds(330, 400, 320, 25);

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

    private void addSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSubmitMouseEntered
        addSubmit.setBackground(new Color(255,188,111));
    }//GEN-LAST:event_addSubmitMouseEntered

    private void addSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSubmitMouseExited
        addSubmit.setBackground(new Color(230,146,50));
    }//GEN-LAST:event_addSubmitMouseExited

    private void addSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubmitActionPerformed
        final String secretKey = "SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
        String originalString = addPassTxt.getText();
        String addUser = addUserTxt.getText();
        String addEncryptedPass = aes.encrypt(originalString, secretKey); //encrypts originalString from user input
        db k = new db();
        k.insertPassword(addUser, addEncryptedPass); //sends encrypted version of pass to database
    }//GEN-LAST:event_addSubmitActionPerformed

    private void addUserTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addUserTxtFocusGained
        //clear the textfield on focus if the text is "username"
        if(addUserTxt.getText().trim().toLowerCase().equals("username")){
            addUserTxt.setText("");
            addUserTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_addUserTxtFocusGained

    private void addUserTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addUserTxtFocusLost
        //when focus is lost and text is empty or "username", sets text to gray "username"
        if(addUserTxt.getText().trim().equals("") || addUserTxt.getText().trim().toLowerCase().equals("username")){
            addUserTxt.setText("username");
            addUserTxt.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_addUserTxtFocusLost

    private void addPassTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addPassTxtFocusGained
        //clear the textfield on focus if the text is "username"
        if(addPassTxt.getText().trim().toLowerCase().equals("password will be saved to database")){
            addPassTxt.setText("");
            addPassTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_addPassTxtFocusGained

    private void addPassTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addPassTxtFocusLost
        //when focus is lost and text is empty or "username", sets text to gray "username"
        if(addPassTxt.getText().trim().equals("") || addPassTxt.getText().trim().toLowerCase().equals("password will be saved to database")){
            addPassTxt.setText("password will be saved to database");
            addPassTxt.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_addPassTxtFocusLost

    private void backToMenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMenuButtonMouseEntered
        backToMenuButton.setBackground(new Color(255,188,111));
    }//GEN-LAST:event_backToMenuButtonMouseEntered

    private void backToMenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMenuButtonMouseExited
        backToMenuButton.setBackground(new Color(230,146,50));
    }//GEN-LAST:event_backToMenuButtonMouseExited

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        menuForm menuForm = new menuForm();
        menuForm.setVisible(true);
        menuForm.pack();
        menuForm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backToMenuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(addPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addPasswordForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addPassTxt;
    private swing.MyButton addSubmit;
    private javax.swing.JTextField addUserTxt;
    private swing.MyButton backToMenuButton;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
