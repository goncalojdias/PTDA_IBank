package pt.ua.ibank.interfaces.internalFrames;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.SwingUtilities;
import pt.ua.ibank.DTO.Client;
import pt.ua.ibank.DTO.Employee;
import static pt.ua.ibank.interfaces.clientInterface.localClientInterface;
import static pt.ua.ibank.interfaces.staffInterface.localStaffInterface;
import static pt.ua.ibank.utilities.Configs.EMAIL_ERROR_CODE;
import static pt.ua.ibank.utilities.Configs.ERROR_CODE;
import static pt.ua.ibank.utilities.Configs.SUCCESS_CODE;
import pt.ua.ibank.utilities.Hash;
import pt.ua.ibank.utilities.RoundedShadowPanel;

public class ProfilePage extends javax.swing.JInternalFrame {

    private Client cli;
    private Employee fun;

    public ProfilePage(Client cliente) {
        initComponents();
        this.cli = cliente;
        starUp();

        SwingUtilities.invokeLater(() -> {
            this.pack();
        });
    }

    public ProfilePage(Employee funcionario) {
        initComponents();
        this.fun = funcionario;
        starUp();

        SwingUtilities.invokeLater(() -> {
            this.pack();
        });
    }

    private void starUp() {
        hideStuff();
        populate();
    }

    private void populate() {
        if (this.cli != null && this.fun == null) {
            name_input.setText(this.cli.name);
            email_input.setText(this.cli.email);
            address_input.setText(this.cli.address);
            phone_input.setText(this.cli.phoneNumber);
            nif_input.setText(this.cli.nif);
            AC_input.setText(maskString(this.cli.accountNumber, 10));
        } else if (this.cli == null && this.fun != null) {
            name_input.setText(this.fun.name);
            email_input.setText(this.fun.email);
            address_input.setText(this.fun.address);
            phone_input.setText(this.fun.phoneNumber);
            nif_input.setText(this.fun.nif);
        }
    }

    private String maskString(String string, int char_visible) {
        return string.substring(0, char_visible) + "*".repeat(
                string.length() - char_visible);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new RoundedShadowPanel(5);
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        edit_profile = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name_input = new javax.swing.JTextField();
        email_input = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        address_input = new javax.swing.JTextField();
        phone_input = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nif_input = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        l_old_pass = new javax.swing.JLabel();
        old_password = new javax.swing.JPasswordField();
        new_password = new javax.swing.JPasswordField();
        l_new_pass = new javax.swing.JLabel();
        AC_input = new javax.swing.JTextField();
        num_conta = new javax.swing.JLabel();
        see = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Perfil");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/account_circle.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Página de perfil");

        edit_profile.setText("Editar perfil");
        edit_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_profileActionPerformed(evt);
            }
        });

        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        save.setText("Guardar alterações");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome completo");

        name_input.setToolTipText("");
        name_input.setEnabled(false);

        email_input.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Morada");

        address_input.setEnabled(false);

        phone_input.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Número telemóvel");

        nif_input.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Número de identificação fiscal");

        l_old_pass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_old_pass.setText("Antiga password (Obrigatório)");

        l_new_pass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_new_pass.setText("Nova password");

        AC_input.setEnabled(false);

        num_conta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num_conta.setText("Número de conta");

        see.setText("Ver");
        see.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_profile))
                    .addComponent(old_password, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(name_input)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email_input)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(address_input)
                    .addComponent(phone_input)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nif_input)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addComponent(l_old_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(new_password, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_new_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num_conta, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AC_input)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(see)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phone_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nif_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(num_conta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AC_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(see))
                .addGap(8, 8, 8)
                .addComponent(l_old_pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(old_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(l_new_pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edit_profile)
                        .addComponent(cancel)
                        .addComponent(save))
                    .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edit_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_profileActionPerformed
        cancel.setVisible(true);
        save.setVisible(true);
        edit_profile.setVisible(false);

        l_old_pass.setVisible(true);
        l_new_pass.setVisible(true);
        old_password.setVisible(true);
        new_password.setVisible(true);

        name_input.setEnabled(true);
        email_input.setEnabled(true);
        address_input.setEnabled(true);
        phone_input.setEnabled(true);
        this.pack();
    }//GEN-LAST:event_edit_profileActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        hideStuff();
    }//GEN-LAST:event_cancelActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String name = name_input.getText();
        String email = email_input.getText();
        String address = address_input.getText();
        String phone = phone_input.getText();
        String old_email = this.cli != null ? this.cli.email : this.fun.email;

        try {
            if (this.cli != null && this.fun == null) {
                if (!Hash.validatePassword(
                        new String(old_password.getPassword()),
                        this.cli.password)) {
                    status.setText("Password antiga não corresponde !");
                    return;
                }
            } else if (this.cli == null && this.fun != null) {
                if (!Hash.validatePassword(
                        new String(old_password.getPassword()),
                        this.fun.password)) {
                    status.setText("Password antiga não corresponde !");
                    return;
                }
            }

            if (name.isEmpty()) {
                status.setText("Campo nome vazio !");
                name_input.requestFocus();
                return;
            }

            if (email.isEmpty()) {
                status.setText("Campo email vazio !");
                email_input.requestFocus();
                return;
            }

            if (address.isEmpty()) {
                status.setText("Campo morada vazio !");
                address_input.requestFocus();
                return;
            }

            if (phone.isEmpty()) {
                status.setText("Campo telefone vazio !");
                phone_input.requestFocus();
                return;
            }

            String regexNome = "^[a-zA-ZáéíóúÁÉÍÓÚäëïöüÄËÏÖÜãõÃÕñÑçÇ\\s'-]+$";
            String regexEmail =
                   "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            String regexTelefoneNif = "^\\d{9}$";
            String regexPassword = "^.{8,}$";

            Pattern patternNome = Pattern.compile(regexNome);
            Matcher matcherNome = patternNome.matcher(name_input.getText());

            Pattern patternEmail = Pattern.compile(regexEmail);
            Matcher matcherEmail = patternEmail.matcher(email_input.getText());

            Pattern patternPhoneNumberNif = Pattern.compile(regexTelefoneNif);
            Matcher matcherPhoneNumber = patternPhoneNumberNif.matcher(
                    phone_input.getText());
            Matcher matcherNIF = patternPhoneNumberNif.matcher(
                    nif_input.getText());

            String novaPassword = new String(new_password.getPassword());
            Pattern patternPassword = Pattern.compile(regexPassword);
            Matcher matcherPassword = patternPassword.matcher(novaPassword);

            if (!matcherNome.find() && !name.isEmpty()) {
                status.setText("Nome inválido!");
                name_input.setText("");
                return;
            } else if (!matcherEmail.find() && !email.isEmpty()) {
                status.setText("Email inválido!");
                email_input.setText("");
                return;
            } else if (!matcherPhoneNumber.find() && !phone.isEmpty()) {
                status.setText("Nº de Telemóvel Inválido!");
                phone_input.setText("");
                return;
            } else if (!matcherNIF.find() && !nif_input.getText().isEmpty()) {
                status.setText("NIF inválido!");
                nif_input.setText("");
                return;
            } else if (!matcherPassword.find() && !novaPassword.isEmpty()) {
                status.setText("Password inválida! (min 8 caracteres)");
                new_password.setText("");
                return;
            }

            //Pós-Verificação
            if (!new String(new_password.getPassword()).isEmpty()) {
                if (this.cli != null && this.fun == null) {
                    this.cli.password = Hash.generateStorngPasswordHash(
                    new String(new_password.getPassword()));
                } else if (this.cli == null && this.fun != null) {
                    this.fun.password = Hash.generateStorngPasswordHash(
                    new String(new_password.getPassword()));
                }
            }

            if (this.cli != null && this.fun == null) {
                this.cli.name =
                name.equals(this.cli.name) ? this.cli.name : name;
                this.cli.email = email.equals(this.cli.email) ?
                                 this.cli.email : email;
                this.cli.address = address.equals(this.cli.address) ?
                                   this.cli.address : address;
                this.cli.phoneNumber = phone.equals(this.cli.phoneNumber) ?
                                       this.cli.phoneNumber : phone;

                int status_int = this.cli.alterInformation(old_email);

                switch (status_int) {
                    case EMAIL_ERROR_CODE -> {
                        status.setText("Endereço de email já existente !");
                        this.cli.email = old_email;
                    }
                    case ERROR_CODE -> {
                        status.setText(
                                "Algo inesperado aconteceu tente novamente mais tarde !");
                        this.cli.email = old_email;
                    }
                    case SUCCESS_CODE -> {
                        status.setText("Sucesso ao atualizar infromações!");
                        SwingUtilities.invokeLater(() -> {
                            try {
                                Thread.sleep(1500);
                                hideStuff();
                                populate();
                                localClientInterface.UpdateInfo();
                            } catch (InterruptedException ex) {
                            }
                        });
                    }

                }
            } else if (this.cli == null && this.fun != null) {
                this.fun.name =
                name.equals(this.fun.name) ? this.fun.name : name;
                this.fun.email = email.equals(this.fun.email) ?
                                 this.fun.email : email;
                this.fun.address = address.equals(this.fun.address) ?
                                   this.fun.address : address;
                this.fun.phoneNumber = phone.equals(this.fun.phoneNumber) ?
                                       this.fun.phoneNumber : phone;

                int status_int = this.fun.alterInformation(old_email);

                switch (status_int) {
                    case EMAIL_ERROR_CODE -> {
                        status.setText("Endereço de email já existente !");
                        this.fun.email = old_email;
                    }
                    case ERROR_CODE -> {
                        status.setText(
                                "Algo inesperado aconteceu tente novamente mais tarde !");
                        this.fun.email = old_email;
                    }
                    case SUCCESS_CODE -> {
                        status.setText("Sucesso ao atualizar infromações!");
                        SwingUtilities.invokeLater(() -> {
                            try {
                                Thread.sleep(1500);
                                hideStuff();
                                populate();
                                localStaffInterface.updateInfo();
                            } catch (InterruptedException ex) {
                            }
                        });
                    }

                }
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_saveActionPerformed

    private void seeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeActionPerformed
        if (see.isSelected()) {
            AC_input.setText(this.cli.accountNumber);
        } else {
            AC_input.setText(maskString(this.cli.accountNumber, 10));
        }
    }//GEN-LAST:event_seeActionPerformed

    private void hideStuff() {
        status.setText("");
        cancel.setVisible(false);
        save.setVisible(false);
        edit_profile.setVisible(true);

        l_old_pass.setVisible(false);
        l_new_pass.setVisible(false);
        old_password.setVisible(false);
        new_password.setVisible(false);

        name_input.setEnabled(false);
        email_input.setEnabled(false);
        address_input.setEnabled(false);
        phone_input.setEnabled(false);

        if (this.cli == null && this.fun != null) {
            num_conta.setVisible(false);
            AC_input.setVisible(false);
            see.setVisible(false);
        }

        clearCamps();
        this.pack();
    }

    private void clearCamps() {
        old_password.setText("");
        new_password.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AC_input;
    private javax.swing.JTextField address_input;
    private javax.swing.JButton cancel;
    private javax.swing.JButton edit_profile;
    private javax.swing.JTextField email_input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l_new_pass;
    private javax.swing.JLabel l_old_pass;
    private javax.swing.JTextField name_input;
    private javax.swing.JPasswordField new_password;
    private javax.swing.JTextField nif_input;
    private javax.swing.JLabel num_conta;
    private javax.swing.JPasswordField old_password;
    private javax.swing.JTextField phone_input;
    private javax.swing.JButton save;
    private javax.swing.JCheckBox see;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
