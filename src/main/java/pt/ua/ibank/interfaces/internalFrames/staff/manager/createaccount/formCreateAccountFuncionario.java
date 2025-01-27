/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pt.ua.ibank.interfaces.internalFrames.staff.manager.createaccount;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.SwingUtilities;
import pt.ua.ibank.DAO.FuncionarioDAO;
import static pt.ua.ibank.utilities.Configs.CODIGO_ERRO;
import static pt.ua.ibank.utilities.Configs.CODIGO_ERRO_EMAIL;
import static pt.ua.ibank.utilities.Configs.CODIGO_SUCESSO;
import static pt.ua.ibank.utilities.Configs.LocalFuncionario;
import pt.ua.ibank.utilities.Hash;

public class formCreateAccountFuncionario extends javax.swing.JPanel {

    /**
     * Creates new form seila
     */
    public formCreateAccountFuncionario() {
        initComponents();
        Fnome.setBackground(new java.awt.Color(0, 0, 0, 1));
        Femail.setBackground(new java.awt.Color(0, 0, 0, 1));
        Ftelemovel.setBackground(new java.awt.Color(0, 0, 0, 1));
        FNif.setBackground(new java.awt.Color(0, 0, 0, 1));
        FPass.setBackground(new java.awt.Color(0, 0, 0, 1));
        FRPass.setBackground(new java.awt.Color(0, 0, 0, 1));
        FMorada.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCreateAccount = new javax.swing.JPanel();
        erro_create = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Ftelemovel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FPass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        FRPass = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Femail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        FNif = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Fnome = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        FMorada = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();

        panelCreateAccount.setBackground(new java.awt.Color(0, 51, 51));
        panelCreateAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        erro_create.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        erro_create.setForeground(new java.awt.Color(255, 200, 96));
        erro_create.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelCreateAccount.add(erro_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 420, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Criar Conta");
        panelCreateAccount.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 420, 41));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(199, 226, 255));
        jLabel4.setText("Nº de Telemóvel");
        panelCreateAccount.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 360, -1));

        Ftelemovel.setFont(Ftelemovel.getFont().deriveFont(Ftelemovel.getFont().getSize()+2f));
        Ftelemovel.setForeground(new java.awt.Color(255, 255, 255));
        Ftelemovel.setBorder(null);
        panelCreateAccount.add(Ftelemovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 310, 30));

        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 319, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(199, 226, 255));
        jLabel7.setText("Password");
        panelCreateAccount.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 360, -1));

        FPass.setFont(FPass.getFont().deriveFont(FPass.getFont().getSize()+2f));
        FPass.setForeground(new java.awt.Color(255, 255, 255));
        FPass.setBorder(null);
        FPass.setCaretColor(new java.awt.Color(255, 255, 255));
        panelCreateAccount.add(FPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 310, 30));

        jLabel8.setForeground(new java.awt.Color(199, 226, 255));
        jLabel8.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 319, 40));

        btnCreateAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(0, 51, 51));
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
        panelCreateAccount.add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 360, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(199, 226, 255));
        jLabel16.setText("Repetir Password");
        panelCreateAccount.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 360, -1));

        FRPass.setFont(FRPass.getFont().deriveFont(FRPass.getFont().getSize()+2f));
        FRPass.setForeground(new java.awt.Color(255, 255, 255));
        FRPass.setBorder(null);
        FRPass.setCaretColor(new java.awt.Color(255, 255, 255));
        panelCreateAccount.add(FRPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 310, 30));

        jLabel17.setForeground(new java.awt.Color(199, 226, 255));
        jLabel17.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 319, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(199, 226, 255));
        jLabel18.setText("Email");
        panelCreateAccount.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 360, -1));

        Femail.setFont(Femail.getFont().deriveFont(Femail.getFont().getSize()+2f));
        Femail.setForeground(new java.awt.Color(255, 255, 255));
        Femail.setBorder(null);
        panelCreateAccount.add(Femail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 310, 30));

        jLabel19.setForeground(new java.awt.Color(199, 226, 255));
        jLabel19.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 319, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(199, 226, 255));
        jLabel20.setText("NIF");
        panelCreateAccount.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 360, -1));

        FNif.setFont(FNif.getFont().deriveFont(FNif.getFont().getSize()+2f));
        FNif.setForeground(new java.awt.Color(255, 255, 255));
        FNif.setBorder(null);
        panelCreateAccount.add(FNif, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 310, 30));

        jLabel21.setForeground(new java.awt.Color(199, 226, 255));
        jLabel21.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 319, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(199, 226, 255));
        jLabel22.setText("Nome Completo");
        panelCreateAccount.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 360, -1));

        Fnome.setFont(Fnome.getFont().deriveFont(Fnome.getFont().getSize()+2f));
        Fnome.setForeground(new java.awt.Color(255, 255, 255));
        Fnome.setBorder(null);
        panelCreateAccount.add(Fnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 310, 30));

        jLabel23.setForeground(new java.awt.Color(199, 226, 255));
        jLabel23.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 319, 40));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(199, 226, 255));
        jLabel24.setText("Morada");
        panelCreateAccount.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 360, -1));

        FMorada.setFont(FMorada.getFont().deriveFont(FMorada.getFont().getSize()+2f));
        FMorada.setForeground(new java.awt.Color(255, 255, 255));
        FMorada.setBorder(null);
        panelCreateAccount.add(FMorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 310, 30));

        jLabel25.setForeground(new java.awt.Color(199, 226, 255));
        jLabel25.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 319, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateAccountMouseClicked

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        erro_create.setText("");

        String password = new String(FPass.getPassword());
        String repeatPassword = new String(FRPass.getPassword());

        String regexNome = "^[a-zA-ZáéíóúÁÉÍÓÚäëïöüÄËÏÖÜãõÃÕñÑçÇ\\s'-]+$";
        String regexEmail =
               "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        String regexTelefoneNif = "^\\d{9}$";
        String regexPassword = "^.{8,}$";

        Pattern patternNome = Pattern.compile(regexNome);
        Matcher matcherNome = patternNome.matcher(Fnome.getText());

        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(Femail.getText());

        Pattern patternPhoneNumberNif = Pattern.compile(regexTelefoneNif);
        Matcher matcherPhoneNumber = patternPhoneNumberNif.matcher(
                Ftelemovel.getText());
        Matcher matcherNIF = patternPhoneNumberNif.matcher(FNif.getText());

        Pattern patternPassword = Pattern.compile(regexPassword);
        Matcher matcherPassword = patternPassword.matcher(password);

        if (Fnome.getText().isEmpty() || Femail.getText().isEmpty() || Ftelemovel.getText().isEmpty() || FNif.getText().isEmpty() || password.isEmpty() || repeatPassword.isEmpty()) {
            erro_create.setText(
                    "Um ou mais campos vazios! Por favor preencha-os!");
        } else if (!matcherNome.find()) {
            erro_create.setText("Nome inválido!");
            Fnome.setText("");
        } else if (!matcherEmail.find()) {
            erro_create.setText("Email inválido!");
            Femail.setText("");
        } else if (!matcherPhoneNumber.find()) {
            erro_create.setText("Nº de Telemóvel Inválido!");
            Ftelemovel.setText("");
        } else if (!matcherNIF.find()) {
            erro_create.setText("NIF inválido!");
            FNif.setText("");
        } else if (!matcherPassword.find()) {
            erro_create.setText(
                    "Password inválida! Tem de conter pelo menos 8 caracteres!");
            FPass.setText("");
            FRPass.setText("");
        } else if (!password.equals(repeatPassword)) {
            erro_create.setText("Passwords inseridas não são iguais!");
            FPass.setText("");
            FRPass.setText("");
        } else {
            try {
                String hashedPassword = Hash.generateStorngPasswordHash(
                       new String(FPass.getPassword()));
                int verify = FuncionarioDAO.CreateFuncionario(Fnome.getText(),
                                                              FMorada.getText(),
                                                              Femail.getText(),
                                                              Ftelemovel.getText(),
                                                              FNif.getText(),
                                                              hashedPassword,
                                                              LocalFuncionario.numFun);

                switch (verify) {
                    case CODIGO_ERRO_EMAIL ->
                        erro_create.setText("Endereço de email já existente !");
                    case CODIGO_ERRO ->
                        erro_create.setText(
                                "Algo inesperado aconteceu tente novamente mais tarde !");
                    case CODIGO_SUCESSO -> {
                        erro_create.setText("Sucesso ao criar funcionário!");
                        SwingUtilities.invokeLater(() -> {
                            try {
                                Thread.sleep(1500);

                            } catch (InterruptedException ex) {
                                System.out.println(ex);
                            }
                        });

                    }
                }

            } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FMorada;
    private javax.swing.JTextField FNif;
    private javax.swing.JPasswordField FPass;
    private javax.swing.JPasswordField FRPass;
    private javax.swing.JTextField Femail;
    private javax.swing.JTextField Fnome;
    private javax.swing.JTextField Ftelemovel;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JLabel erro_create;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panelCreateAccount;
    // End of variables declaration//GEN-END:variables
}
