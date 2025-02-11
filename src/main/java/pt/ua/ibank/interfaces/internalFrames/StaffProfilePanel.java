/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pt.ua.ibank.interfaces.internalFrames;

import java.awt.event.ActionEvent;
import pt.ua.ibank.interfaces.staffInterface;

public class StaffProfilePanel extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFramePerfil
     *
     * @param userEmail
     */
    private final int userID;

    public StaffProfilePanel(staffInterface parent, int userID) {
        this.userID = userID;
        initComponents();

        javax.swing.JButton openTransactionButton =
                            perfilMainInterface1.getTransactionButton();
        openTransactionButton.addActionListener((ActionEvent e) -> {
            parent.addWindow(new StaffTransferList(parent, userID));
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

        perfilMainInterface1 = new pt.ua.ibank.interfaces.internalFrames.staff.profile.PerfilMainInterface(userID);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        perfilMainInterface1.setMinimumSize(new java.awt.Dimension(859, 562));
        getContentPane().add(perfilMainInterface1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pt.ua.ibank.interfaces.internalFrames.staff.profile.PerfilMainInterface perfilMainInterface1;
    // End of variables declaration//GEN-END:variables
}
