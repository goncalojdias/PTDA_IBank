package pt.ua.ibank.interfaces;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import pt.ua.ibank.DTO.Employee;
import pt.ua.ibank.utilities.Configs;
import static pt.ua.ibank.utilities.Configs.LocalEmployee;

public class EmployeeLoginDialog extends javax.swing.JDialog {

    public EmployeeLoginDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        startup();
    }

    private void startup() {
        email_input.requestFocus();
        email_input.setBackground(new java.awt.Color(0, 0, 0, 1));
        password_input.setBackground(new java.awt.Color(0, 0, 0, 1));

        Configs.loadF();
        email_input.setText(Configs.Fname);
        save_email.setSelected(Configs.Fsave);
        KeyListeners();
    }

    private void KeyListeners() {
        email_input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    password_input.requestFocus();
                }
            }
        });

        password_input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    login.requestFocus();
                    loginActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    email_input.requestFocus();
                }
            }
        });

        login.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    password_input.requestFocus();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        image_1 = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        error = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email_input = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        password_input = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        save_email = new javax.swing.JCheckBox();
        login = new javax.swing.JButton();
        see = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        image_1.setBackground(new java.awt.Color(255, 255, 255));
        image_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logo_png.png"))); // NOI18N

        panelLogin.setBackground(new java.awt.Color(15, 101, 105));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        error.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        error.setForeground(new java.awt.Color(255, 200, 96));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelLogin.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 420, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 420, 41));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(199, 226, 255));
        jLabel9.setText("Email");
        panelLogin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 360, -1));

        email_input.setFont(email_input.getFont().deriveFont(email_input.getFont().getSize()+2f));
        email_input.setForeground(new java.awt.Color(255, 255, 255));
        email_input.setBorder(null);
        panelLogin.add(email_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 310, 30));

        jLabel10.setForeground(new java.awt.Color(199, 226, 255));
        jLabel10.setText("_________________________________________________________________");
        panelLogin.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 319, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Olá, funcionário! Bem-vindo ao IBank!");
        panelLogin.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 420, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(199, 226, 255));
        jLabel13.setText("Password");
        panelLogin.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 360, -1));

        password_input.setFont(password_input.getFont().deriveFont(password_input.getFont().getSize()+2f));
        password_input.setForeground(new java.awt.Color(255, 255, 255));
        password_input.setBorder(null);
        password_input.setCaretColor(new java.awt.Color(255, 255, 255));
        panelLogin.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 310, 30));

        jLabel14.setForeground(new java.awt.Color(199, 226, 255));
        jLabel14.setText("_________________________________________________________________");
        panelLogin.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 319, 40));

        save_email.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        save_email.setForeground(new java.awt.Color(199, 226, 255));
        save_email.setText("Guardar email");
        save_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_emailActionPerformed(evt);
            }
        });
        panelLogin.add(save_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(15, 101, 105));
        login.setText("LOGIN");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        panelLogin.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 360, 40));

        see.setForeground(new java.awt.Color(255, 255, 255));
        see.setText("Ver");
        see.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeActionPerformed(evt);
            }
        });
        panelLogin.add(see, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 60, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(image_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void save_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save_emailActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String email = email_input.getText();
        String password = new String(password_input.getPassword());

        if (password.isEmpty() && email.isEmpty()) {
            error.setText("Campos vazios!");
            return;
        } else if (email.isEmpty()) {
            email_input.requestFocus();
            error.setText("Campo de email vazio!");
            return;
        } else if (password.isEmpty()) {
            password_input.requestFocus();
            error.setText("Campo de password vazio!");
            return;
        }

        error.setText("");
        if (save_email.isSelected()) {
            Configs.Fname = email_input.getText();
            Configs.Fsave = save_email.isSelected();
            Configs.saveF();
        } else {
            Configs.Fname = "";
            Configs.Fsave = false;
            Configs.saveF();
        }

        LocalEmployee = new Employee(email, password);

        if (LocalEmployee.authenticate() && !LocalEmployee.dismissed) {
            Configs.loginOK = true;
            this.dispose();
        } else {
            error.setText("Erro ao autenticar! Credenciais incorretas!");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void seeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeActionPerformed
        if (see.isSelected()) {
            password_input.setEchoChar((char) 0);
        } else {
            password_input.setEchoChar('*');
        }
    }//GEN-LAST:event_seeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                         : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeLoginDialog.class
                    .getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeLoginDialog.class
                    .getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeLoginDialog.class
                    .getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeLoginDialog.class
                    .getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmployeeLoginDialog dialog = new EmployeeLoginDialog(
                                    new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField email_input;
    private javax.swing.JLabel error;
    private javax.swing.JLabel image_1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField password_input;
    private javax.swing.JCheckBox save_email;
    private javax.swing.JCheckBox see;
    // End of variables declaration//GEN-END:variables
}
