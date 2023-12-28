/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pt.ua.ibank.interfaces.tmp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class dialogLogin extends javax.swing.JDialog {

    /**
     * Creates new form dialogLogin
     */
    public dialogLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtFieldEmailPhone.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtFieldPassword.setBackground(new java.awt.Color(0, 0, 0, 1));
        
        txtFieldFullName.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtFieldEmail.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtFieldPhoneNumber.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtFieldNIF.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtFieldPassword2.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtFieldPasswordRepeat.setBackground(new java.awt.Color(0, 0, 0, 1));
        
        panelCreateAccount.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblWrongCredentials = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFieldEmailPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFieldPassword = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        checkBoxSavePassword1 = new javax.swing.JCheckBox();
        lblForgotPassword1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lblCreateAccount1 = new javax.swing.JLabel();
        panelCreateAccount = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFieldPhoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFieldPassword2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFieldPasswordRepeat = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtFieldEmail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtFieldNIF = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtFieldFullName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblWrongCredentials2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelLogin.setBackground(new java.awt.Color(25, 118, 211));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 420, 41));

        lblWrongCredentials.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblWrongCredentials.setForeground(new java.awt.Color(255, 0, 0));
        lblWrongCredentials.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWrongCredentials.setText("Insira as credenciais!");
        panelLogin.add(lblWrongCredentials, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 420, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(199, 226, 255));
        jLabel9.setText("Nº de Telemóvel ou Email");
        panelLogin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 130, 360, -1));

        txtFieldEmailPhone.setFont(txtFieldEmailPhone.getFont().deriveFont(txtFieldEmailPhone.getFont().getSize()+2f));
        txtFieldEmailPhone.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldEmailPhone.setBorder(null);
        panelLogin.add(txtFieldEmailPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 310, 30));

        jLabel10.setForeground(new java.awt.Color(199, 226, 255));
        jLabel10.setText("_________________________________________________________________");
        panelLogin.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 154, 319, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Olá! Bem-vindo ao IBank!");
        panelLogin.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 420, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(199, 226, 255));
        jLabel13.setText("Password");
        panelLogin.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 200, 360, -1));

        txtFieldPassword.setFont(txtFieldPassword.getFont().deriveFont(txtFieldPassword.getFont().getSize()+2f));
        txtFieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldPassword.setBorder(null);
        txtFieldPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        panelLogin.add(txtFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 310, 30));

        jLabel14.setForeground(new java.awt.Color(199, 226, 255));
        jLabel14.setText("_________________________________________________________________");
        panelLogin.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 224, 319, 40));

        checkBoxSavePassword1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        checkBoxSavePassword1.setForeground(new java.awt.Color(199, 226, 255));
        checkBoxSavePassword1.setText("Lembrar Password");
        checkBoxSavePassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxSavePassword1ActionPerformed(evt);
            }
        });
        panelLogin.add(checkBoxSavePassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 276, -1, -1));

        lblForgotPassword1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblForgotPassword1.setForeground(new java.awt.Color(199, 226, 255));
        lblForgotPassword1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblForgotPassword1.setText("Esqueceu-se da password?");
        lblForgotPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelLogin.add(lblForgotPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 278, 189, -1));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(25, 118, 211));
        btnLogin.setText("LOGIN");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        panelLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 310, 360, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(199, 226, 255));
        jLabel15.setText("Ainda não tem conta?");
        panelLogin.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 368, -1, -1));

        lblCreateAccount1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblCreateAccount1.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateAccount1.setText("Criar Conta");
        lblCreateAccount1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreateAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateAccount1MouseClicked(evt);
            }
        });
        panelLogin.add(lblCreateAccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 368, -1, -1));

        panelCreateAccount.setBackground(new java.awt.Color(25, 118, 211));
        panelCreateAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Criar Conta");
        panelCreateAccount.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 41));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(199, 226, 255));
        jLabel4.setText("Nº de Telemóvel");
        panelCreateAccount.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 360, -1));

        txtFieldPhoneNumber.setFont(txtFieldPhoneNumber.getFont().deriveFont(txtFieldPhoneNumber.getFont().getSize()+2f));
        txtFieldPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldPhoneNumber.setBorder(null);
        panelCreateAccount.add(txtFieldPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 310, 30));

        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 319, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(199, 226, 255));
        jLabel7.setText("Password");
        panelCreateAccount.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 360, -1));

        txtFieldPassword2.setFont(txtFieldPassword2.getFont().deriveFont(txtFieldPassword2.getFont().getSize()+2f));
        txtFieldPassword2.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldPassword2.setBorder(null);
        txtFieldPassword2.setCaretColor(new java.awt.Color(255, 255, 255));
        panelCreateAccount.add(txtFieldPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 310, 30));

        jLabel8.setForeground(new java.awt.Color(199, 226, 255));
        jLabel8.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 319, 40));

        btnCreateAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(25, 118, 211));
        btnCreateAccount.setText("CRIAR CONTA");
        btnCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateAccountMouseClicked(evt);
            }
        });
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        panelCreateAccount.add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 360, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(199, 226, 255));
        jLabel11.setText("Já tem uma conta?");
        panelCreateAccount.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Login");
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        panelCreateAccount.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(199, 226, 255));
        jLabel16.setText("Repetir Password");
        panelCreateAccount.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 360, -1));

        txtFieldPasswordRepeat.setFont(txtFieldPasswordRepeat.getFont().deriveFont(txtFieldPasswordRepeat.getFont().getSize()+2f));
        txtFieldPasswordRepeat.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldPasswordRepeat.setBorder(null);
        txtFieldPasswordRepeat.setCaretColor(new java.awt.Color(255, 255, 255));
        panelCreateAccount.add(txtFieldPasswordRepeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 310, 30));

        jLabel17.setForeground(new java.awt.Color(199, 226, 255));
        jLabel17.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 319, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(199, 226, 255));
        jLabel18.setText("Email");
        panelCreateAccount.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 360, -1));

        txtFieldEmail.setFont(txtFieldEmail.getFont().deriveFont(txtFieldEmail.getFont().getSize()+2f));
        txtFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldEmail.setBorder(null);
        panelCreateAccount.add(txtFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 310, 30));

        jLabel19.setForeground(new java.awt.Color(199, 226, 255));
        jLabel19.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 319, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(199, 226, 255));
        jLabel20.setText("NIF");
        panelCreateAccount.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 360, -1));

        txtFieldNIF.setFont(txtFieldNIF.getFont().deriveFont(txtFieldNIF.getFont().getSize()+2f));
        txtFieldNIF.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldNIF.setBorder(null);
        panelCreateAccount.add(txtFieldNIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 310, 30));

        jLabel21.setForeground(new java.awt.Color(199, 226, 255));
        jLabel21.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 319, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(199, 226, 255));
        jLabel22.setText("Nome Completo");
        panelCreateAccount.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 360, -1));

        txtFieldFullName.setFont(txtFieldFullName.getFont().deriveFont(txtFieldFullName.getFont().getSize()+2f));
        txtFieldFullName.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldFullName.setBorder(null);
        panelCreateAccount.add(txtFieldFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 310, 30));

        jLabel23.setForeground(new java.awt.Color(199, 226, 255));
        jLabel23.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 319, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bem-vindo! Por favor, preencha as informações abaixo para criar sua nova conta.");
        panelCreateAccount.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 420, -1));

        lblWrongCredentials2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblWrongCredentials2.setForeground(new java.awt.Color(255, 0, 0));
        lblWrongCredentials2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWrongCredentials2.setText("Insira as credenciais!");
        panelCreateAccount.add(lblWrongCredentials2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 420, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxSavePassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxSavePassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxSavePassword1ActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String emailPhone = txtFieldPhoneNumber.getText();
        char[] passwordChars = txtFieldPassword2.getPassword();
        String password = new String(passwordChars);

        if (emailPhone.isEmpty() || password.isEmpty()) {
            lblWrongCredentials2.setText("As credenciais fornecidas estão incorretas!");
        }

        txtFieldPhoneNumber.setText("");
        txtFieldPassword2.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblCreateAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccount1MouseClicked
        // TODO add your handling code here:
        panelLogin.setVisible(false);
        panelCreateAccount.setVisible(true);
    }//GEN-LAST:event_lblCreateAccount1MouseClicked

    private void btnCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateAccountMouseClicked

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed

        String nomeCompleto = txtFieldFullName.getText();
        String email = txtFieldEmail.getText();
        String phoneNumber = txtFieldPhoneNumber.getText();
        String nif = txtFieldNIF.getText();
        char[] passwordChars = txtFieldPassword2.getPassword();
        String password = new String(passwordChars);
        char[] repeatPasswordChars = txtFieldPasswordRepeat.getPassword();
        String repeatPassword = new String(repeatPasswordChars);

        String regexNome = "^[a-zA-ZáéíóúÁÉÍÓÚäëïöüÄËÏÖÜãõÃÕñÑçÇ\\s'-]+$";
        String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        String regexTelefoneNif = "^\\d{9}$";
        String emailRegexSimples = "^(.+)@(.+)$";
        String regexPassword = "^.{8,}$";

        Pattern patternNome = Pattern.compile(regexNome);
        Matcher matcherNome = patternNome.matcher(nomeCompleto);

        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(email);

        Pattern patternPhoneNumberNif = Pattern.compile(regexTelefoneNif);
        Matcher matcherPhoneNumber = patternPhoneNumberNif.matcher(phoneNumber);
        Matcher matcherNIF = patternPhoneNumberNif.matcher(nif);

        Pattern patternPassword = Pattern.compile(regexPassword);
        Matcher matcherPassword = patternPassword.matcher(password);

        if (nomeCompleto.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || nif.isEmpty() || password.isEmpty() || repeatPassword.isEmpty()) {
            lblWrongCredentials2.setText("Um ou mais campos vazios! Por favor preencha-os!");
        } else if (!matcherNome.find()) {
            lblWrongCredentials2.setText("Nome inválido!");
            txtFieldFullName.setText("");
        } else if (!matcherEmail.find()) {
            lblWrongCredentials2.setText("Email inválido!");
            txtFieldEmail.setText("");
        } else if (!matcherPhoneNumber.find()) {
            lblWrongCredentials2.setText("Nº de Telemóvel Inválido!");
            txtFieldPhoneNumber.setText("");
        } else if (!matcherNIF.find()) {
            lblWrongCredentials2.setText("NIF inválido!");
            txtFieldNIF.setText("");
        } else if (!matcherPassword.find()) {
            lblWrongCredentials2.setText("Password inválida! Tem de conter pelo menos 8 caracteres!");
            txtFieldPassword2.setText("");
            txtFieldPasswordRepeat.setText("");
        } else if (!password.equals(repeatPassword)) {
            lblWrongCredentials2.setText("Passwords inseridas não são iguais!");
            txtFieldPassword2.setText("");
            txtFieldPasswordRepeat.setText("");
        }

        // se não houver erros, criar conta
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        // TODO add your handling code here:
        panelCreateAccount.setVisible(false);
        panelLogin.setVisible(true);
    }//GEN-LAST:event_lblLoginMouseClicked

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
            java.util.logging.Logger.getLogger(dialogLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogLogin dialog = new dialogLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox checkBoxSavePassword1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCreateAccount1;
    private javax.swing.JLabel lblForgotPassword1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblWrongCredentials;
    private javax.swing.JLabel lblWrongCredentials2;
    private javax.swing.JPanel panelCreateAccount;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JTextField txtFieldEmail;
    private javax.swing.JTextField txtFieldEmailPhone;
    private javax.swing.JTextField txtFieldFullName;
    private javax.swing.JTextField txtFieldNIF;
    private javax.swing.JPasswordField txtFieldPassword;
    private javax.swing.JPasswordField txtFieldPassword2;
    private javax.swing.JPasswordField txtFieldPasswordRepeat;
    private javax.swing.JTextField txtFieldPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
