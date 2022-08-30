package passwordmanagementia;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

public class emailForm extends javax.swing.JFrame {
    Random rnd = new Random();
    int randomEmailCode = 100000 + rnd.nextInt(900000);
    
    public emailForm() {
        initComponents();

    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButtonTwoStepVerification = new swing.MyButton();
        verificationCodeTxt = new javax.swing.JPasswordField();
        transferUserData = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emailTemplate = new javax.swing.JLabel();
        panelBorder1 = new swing.PanelBorder();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(86, 180, 211));
        kGradientPanel1.setkStartColor(new java.awt.Color(52, 143, 80));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("Two-Step Verification");

        jButtonTwoStepVerification.setBackground(new java.awt.Color(86, 180, 211));
        jButtonTwoStepVerification.setForeground(new java.awt.Color(51, 51, 255));
        jButtonTwoStepVerification.setText("CONTINUE");
        jButtonTwoStepVerification.setBorderColor(new java.awt.Color(52, 143, 80));
        jButtonTwoStepVerification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonTwoStepVerificationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonTwoStepVerificationMouseExited(evt);
            }
        });
        jButtonTwoStepVerification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTwoStepVerificationActionPerformed(evt);
            }
        });

        verificationCodeTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        verificationCodeTxt.setForeground(new java.awt.Color(153, 153, 153));
        verificationCodeTxt.setText("password");
        verificationCodeTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                verificationCodeTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                verificationCodeTxtFocusLost(evt);
            }
        });

        transferUserData.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        transferUserData.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                transferUserDataPropertyChange(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Verification Code:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Email:");

        emailTemplate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transferUserData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(verificationCodeTxt)
                    .addComponent(jButtonTwoStepVerification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailTemplate, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(emailTemplate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(transferUserData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(verificationCodeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonTwoStepVerification, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

    private void jButtonTwoStepVerificationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTwoStepVerificationMouseEntered
        //set jbutton background light orange
        jButtonTwoStepVerification.setBackground(new Color(255,188,111));
    }//GEN-LAST:event_jButtonTwoStepVerificationMouseEntered

    private void jButtonTwoStepVerificationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTwoStepVerificationMouseExited
        //set jbutton background dark orange
        jButtonTwoStepVerification.setBackground(new Color(230,146,50));
    }//GEN-LAST:event_jButtonTwoStepVerificationMouseExited

    private void jButtonTwoStepVerificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTwoStepVerificationActionPerformed
        String verificationCode = String.valueOf(verificationCodeTxt.getPassword());
        String randomEmailCode2 = String.valueOf(randomEmailCode); //transforms int to string
        if(verificationCode.equals(randomEmailCode2)){ //runs if scanned number equals randomly generated int, resembles two-step verification
                menuForm menuForm = new menuForm();
                menuForm.setVisible(true); //open menu gui after successful verification code is inputted
                menuForm.pack();
                menuForm.setLocationRelativeTo(null);
                this.dispose();
        }else{ //sends error if verification code is incorrect
                JOptionPane.showMessageDialog(null, "Invalid verification code.");
            }
    }//GEN-LAST:event_jButtonTwoStepVerificationActionPerformed

    private void verificationCodeTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verificationCodeTxtFocusGained
        String pass = String.valueOf(verificationCodeTxt.getPassword());
        if(pass.trim().toLowerCase().equals("password")){
            verificationCodeTxt.setText("");
            verificationCodeTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_verificationCodeTxtFocusGained

    private void verificationCodeTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verificationCodeTxtFocusLost
        String pass = String.valueOf(verificationCodeTxt.getPassword());
        if(pass.trim().equals("") || pass.trim().toLowerCase().equals("password")){
            verificationCodeTxt.setText("password");
            verificationCodeTxt.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_verificationCodeTxtFocusLost

    private void transferUserDataPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_transferUserDataPropertyChange
        db k = new db();
        String usernameEmail = transferUserData.getText();
        String recepient = k.retrieveEmail(usernameEmail); //retrieves email associated with account
        String output1 = "The following email was sent to: " + usernameEmail + ".";
        String output2 = "  (Subject) Password Management System Login Key.";
        String output3 = "  (Body) Your verification code is: " + randomEmailCode +".";
        String output4 = "  Please input your individualized verification code in the space provided below:";
        String emailOutput = output1 + output2 + output3 + output4; //email template printed in textArea
        emailTemplate.setText("<html>" + emailOutput + "</html>"); //<html> forces string emailOutput to wrap
    }//GEN-LAST:event_transferUserDataPropertyChange
    
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
            java.util.logging.Logger.getLogger(emailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emailForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailTemplate;
    private swing.MyButton jButtonTwoStepVerification;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private swing.PanelBorder panelBorder1;
    public static javax.swing.JLabel transferUserData;
    private javax.swing.JPasswordField verificationCodeTxt;
    // End of variables declaration//GEN-END:variables
}
