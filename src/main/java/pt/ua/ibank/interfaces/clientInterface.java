package pt.ua.ibank.interfaces;

import pt.ua.ibank.interfaces.internalFrames.DashBoard;
import java.awt.Component;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import static pt.ua.ibank.DTO.Cliente.LocalClient;
import pt.ua.ibank.interfaces.internalFrames.PayServices;
import pt.ua.ibank.interfaces.internalFrames.ProfilePage;
import pt.ua.ibank.interfaces.internalFrames.TransferPage;
import pt.ua.ibank.services.DBConnection;
import static pt.ua.ibank.services.DBConnection.conn;
import pt.ua.ibank.utilities.MDIDesktopPane;
import pt.ua.ibank.utilities.WindowMenu;
import pt.ua.ibank.utilities.RoundedShadowPanel;

public class clientInterface extends javax.swing.JFrame {

    public static clientInterface localClientInterface;
    public static Thread updateThread = null;

    @Override
    public void dispose() {
        DBConnection.closeConnection(conn);
        updateThread = null;
    }
    
    public clientInterface() {
        initComponents();
        start_up();
    }

    public void addWindow(Component comp) {
        this.desktop.add(comp);
        center(comp);
        comp.setVisible(true);
        this.desktop.setComponentZOrder(comp, 0);
    }

    private void start_up() {
        small_side_bar.setVisible(false);
        menu_bar.add(new WindowMenu((MDIDesktopPane) desktop));
        UpdateInfo();

        try {
            DashBoard ds = new DashBoard();
            ds.setMaximum(true);
            addWindow(ds);
        } catch (PropertyVetoException ex) {
        }
    }

    public void UpdateInfo() {
        display_user.setText(LocalClient.nome);
        logout.setText("Fechar (" + LocalClient.email + ")");
    }

    private void center(Component comp) {
        Dimension desktopSize = this.desktop.getSize();
        Dimension jInternalFrameSize = comp.getSize();
        comp.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_bar = new RoundedShadowPanel(5);
        jSeparator1 = new javax.swing.JSeparator();
        display_user = new javax.swing.JLabel();
        dashboard = new javax.swing.JButton();
        transfers = new javax.swing.JButton();
        services = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        desktop = new MDIDesktopPane();
        logo = new javax.swing.JLabel();
        small_side_bar = new RoundedShadowPanel(5);
        sdashboard = new javax.swing.JButton();
        stransfers = new javax.swing.JButton();
        scard = new javax.swing.JButton();
        sservices = new javax.swing.JButton();
        saccount = new javax.swing.JButton();
        slogout = new javax.swing.JButton();
        menu_bar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        hide = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IBank");

        side_bar.setBackground(new java.awt.Color(255, 255, 255));

        display_user.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        display_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                display_userMouseClicked(evt);
            }
        });

        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/dashboard.png"))); // NOI18N
        dashboard.setText("DashBoard");
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });

        transfers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/payments.png"))); // NOI18N
        transfers.setText("Transferencias");
        transfers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transfers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfersActionPerformed(evt);
            }
        });

        services.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/shopping_bag.png"))); // NOI18N
        services.setText("Serviços e compras");
        services.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        services.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicesActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/credit_card.png"))); // NOI18N
        jButton1.setText("Cartões");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/logout.png"))); // NOI18N
        logout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/account_circle.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout side_barLayout = new javax.swing.GroupLayout(side_bar);
        side_bar.setLayout(side_barLayout);
        side_barLayout.setHorizontalGroup(
            side_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_barLayout.createSequentialGroup()
                .addGroup(side_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(side_barLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(side_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(display_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(transfers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(services, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(side_barLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(side_barLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        side_barLayout.setVerticalGroup(
            side_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display_user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transfers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(services)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 528, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logo_png_BW.png"))); // NOI18N

        desktop.setLayer(logo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addGap(0, 593, Short.MAX_VALUE)
                .addComponent(logo))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        small_side_bar.setBackground(new java.awt.Color(255, 255, 255));

        sdashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/dashboard.png"))); // NOI18N
        sdashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sdashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdashboardActionPerformed(evt);
            }
        });

        stransfers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/payments.png"))); // NOI18N
        stransfers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stransfers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stransfersActionPerformed(evt);
            }
        });

        scard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/credit_card.png"))); // NOI18N
        scard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        sservices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/shopping_bag.png"))); // NOI18N
        sservices.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        saccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/account_circle.png"))); // NOI18N
        saccount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        saccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saccountActionPerformed(evt);
            }
        });

        slogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/logout.png"))); // NOI18N
        slogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        slogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout small_side_barLayout = new javax.swing.GroupLayout(small_side_bar);
        small_side_bar.setLayout(small_side_barLayout);
        small_side_barLayout.setHorizontalGroup(
            small_side_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(small_side_barLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(small_side_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sdashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stransfers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sservices, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, small_side_barLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(slogout)
                .addContainerGap())
        );
        small_side_barLayout.setVerticalGroup(
            small_side_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(small_side_barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sdashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stransfers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sservices)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(slogout)
                .addContainerGap())
        );

        jMenu1.setText("File");

        hide.setText("Esconder / Mostrar Menu");
        hide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hideActionPerformed(evt);
            }
        });
        jMenu1.add(hide);

        menu_bar.add(jMenu1);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(small_side_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(side_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(side_bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(small_side_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transfersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfersActionPerformed
        addWindow(new TransferPage());
    }//GEN-LAST:event_transfersActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        addWindow(new DashBoard());
    }//GEN-LAST:event_dashboardActionPerformed

    private void hideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hideActionPerformed
        if (side_bar.isVisible()) {
            side_bar.setVisible(false);
            small_side_bar.setVisible(true);
        } else {
            side_bar.setVisible(true);
            small_side_bar.setVisible(false);
        }
    }//GEN-LAST:event_hideActionPerformed

    private void sdashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdashboardActionPerformed
        addWindow(new DashBoard());
    }//GEN-LAST:event_sdashboardActionPerformed

    private void stransfersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stransfersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stransfersActionPerformed

    private void slogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slogoutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_slogoutActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_logoutActionPerformed

    private void saccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saccountActionPerformed
        addWindow(new ProfilePage());
    }//GEN-LAST:event_saccountActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        addWindow(new ProfilePage());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void display_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_display_userMouseClicked
        addWindow(new ProfilePage());
    }//GEN-LAST:event_display_userMouseClicked

    private void servicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesActionPerformed
        // TODO add your handling code here:
        addWindow(new PayServices());
    }//GEN-LAST:event_servicesActionPerformed

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
            java.util.logging.Logger.getLogger(clientInterface.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientInterface.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientInterface.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientInterface.class.getName()).log(
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboard;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel display_user;
    private javax.swing.JMenuItem hide;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logout;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JButton saccount;
    private javax.swing.JButton scard;
    private javax.swing.JButton sdashboard;
    private javax.swing.JButton services;
    private javax.swing.JPanel side_bar;
    private javax.swing.JButton slogout;
    private javax.swing.JPanel small_side_bar;
    private javax.swing.JButton sservices;
    private javax.swing.JButton stransfers;
    private javax.swing.JButton transfers;
    // End of variables declaration//GEN-END:variables
}
