/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pt.ua.ibank.interfaces.internalFrames.staff.profile.card;

public class PerfilCardTableElementPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClientProfileListElementPanel
     *
     * @param numCartao
     * @param dataValidade
     * @param estado
     * @param saldo
     */
    public PerfilCardTableElementPanel(String numCartao, String dataValidade,
                                       String estado) {
        initComponents();
        this.lblNumeroCartao.setText(numCartao);
        this.lblEstadoValue.setText(estado);
        this.lblValidadeValue.setText(dataValidade);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTtitle = new javax.swing.JLabel();
        lblNumeroCartao = new javax.swing.JLabel();
        lblValidade = new javax.swing.JLabel();
        lblValidadeValue = new javax.swing.JLabel();
        lblEstadoValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        lblTtitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTtitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/card.png"))); // NOI18N

        lblNumeroCartao.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNumeroCartao.setText("**34");

        lblValidade.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblValidade.setText(" Validade:");

        lblValidadeValue.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblValidadeValue.setText("01/24");

        lblEstadoValue.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblEstadoValue.setText("Ativo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValidadeValue))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTtitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumeroCartao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lblEstadoValue)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroCartao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValidadeValue)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblValidade)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEstadoValue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEstadoValue;
    private javax.swing.JLabel lblNumeroCartao;
    private javax.swing.JLabel lblTtitle;
    private javax.swing.JLabel lblValidade;
    private javax.swing.JLabel lblValidadeValue;
    // End of variables declaration//GEN-END:variables
}
