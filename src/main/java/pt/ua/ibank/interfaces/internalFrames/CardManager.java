package pt.ua.ibank.interfaces.internalFrames;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pt.ua.ibank.DAO.CardsDAO;
import pt.ua.ibank.DTO.Cartao;
import static pt.ua.ibank.DTO.Cliente.LocalClient;
import pt.ua.ibank.utilities.ClientInfo;
import static pt.ua.ibank.utilities.ClientInfo.updateClientCardInfo;
import pt.ua.ibank.utilities.RoundedShadowPanel;

public class CardManager extends javax.swing.JInternalFrame {

    private final SimpleDateFormat dataFormat = new SimpleDateFormat("MM/yy");
    private final Color green = new Color(63, 153, 87);
    private final Color red = new Color(230, 45, 9);

    public CardManager() {
        initComponents();
        updateInfo();
    }

    private void updateInfo() {
        updateClientCardInfo(LocalClient);
        f_card.setText(printDividedString(LocalClient.cartaoDefault, 4));
        popular(CardsDAO.getCards(LocalClient.numCliente));
    }

    private void popular(ArrayList<Cartao> lcartao) {
        DefaultTableModel modelo = (DefaultTableModel) card_table.getModel();
        modelo.setNumRows(0);

        if (lcartao != null) {
            for (Cartao cartao : lcartao) {
                modelo.addRow(new Object[]{
                    cartao.numCartao,
                    dataFormat.format(cartao.dataValidade),
                    cartao.estado,
                    cartao.credito ? "Credito" : "Débito"
                });
            }
        }
    }

    private String printDividedString(String string, int size) {
        String tmp = "";
        for (int i = 0; i < string.length(); i += size) {
            int end = Math.min(i + size, string.length());
            String chunk = string.substring(i, end);
            tmp += chunk + " ";
        }
        return tmp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backdrop = new RoundedShadowPanel(5);
        see_cards = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        card_table = new javax.swing.JTable();
        cancel_card = new javax.swing.JButton();
        default_card = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        f_card = new javax.swing.JTextField();
        create_card = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_24/credit_card.png"))); // NOI18N

        backdrop.setBackground(new java.awt.Color(255, 255, 255));

        see_cards.setBackground(new java.awt.Color(255, 255, 255));

        card_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Núm Cartão", "Data validade", "Estado", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(card_table);

        cancel_card.setText("Cancelar cartão");
        cancel_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_cardActionPerformed(evt);
            }
        });

        default_card.setText("Tornar padrão");
        default_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                default_cardActionPerformed(evt);
            }
        });

        jLabel1.setText("Cartão padrão: ");

        f_card.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        f_card.setEnabled(false);

        create_card.setText("Criar novo cartão");
        create_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_cardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout see_cardsLayout = new javax.swing.GroupLayout(see_cards);
        see_cards.setLayout(see_cardsLayout);
        see_cardsLayout.setHorizontalGroup(
            see_cardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .addGroup(see_cardsLayout.createSequentialGroup()
                .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(default_card)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel_card))
            .addGroup(see_cardsLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f_card)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(create_card)
                .addContainerGap())
        );
        see_cardsLayout.setVerticalGroup(
            see_cardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(see_cardsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(see_cardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(f_card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(create_card))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(see_cardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_card)
                    .addComponent(default_card)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout backdropLayout = new javax.swing.GroupLayout(backdrop);
        backdrop.setLayout(backdropLayout);
        backdropLayout.setHorizontalGroup(
            backdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backdropLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(see_cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        backdropLayout.setVerticalGroup(
            backdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backdropLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(see_cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backdrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backdrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void default_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_default_cardActionPerformed
        status.setForeground(red);
        status.setText("");
        int selectedRowIndex = card_table.getSelectedRow();
        int selectedColumnIndex = 0;
        String selected_card = null;
        String card_status = null;
        selectedRowIndex = card_table.convertRowIndexToModel(selectedRowIndex);

        if (selectedRowIndex >= 0) {
            selected_card = (String) card_table.getValueAt(selectedRowIndex, selectedColumnIndex);
            card_status = (String) card_table.getValueAt(selectedRowIndex, 2);
        }

        if (!Objects.isNull(card_status) && card_status.equals("cancelado")) {
            status.setText("Cartão está cancelado não o pode tornar padrão!");
            return;
        }
        if (LocalClient.cartaoDefault.equals(selected_card)) {
            status.setText("O cartão já é o padrão, nada feito !");
            return;
        }

        if (!Objects.isNull(selected_card) && !selected_card.isEmpty()) {
            int reply = JOptionPane.showConfirmDialog(null, "Deseja tornar o cartão no padrão ?", title, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                if (CardsDAO.makeDefault(selected_card, LocalClient.numCliente) == 1) {
                    status.setForeground(green);
                    status.setText("Cartão principal alterado !");
                    updateInfo();
                } else {
                    status.setText("Algo de inesperado aconteceu !");
                }
            }
        }
    }//GEN-LAST:event_default_cardActionPerformed

    private void cancel_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_cardActionPerformed
        status.setForeground(red);
        status.setText("");
        int selectedRowIndex = card_table.getSelectedRow();
        int selectedColumnIndex = 0;
        String selected_card = null;
        String card_status = null;
        selectedRowIndex = card_table.convertRowIndexToModel(selectedRowIndex);

        if (selectedRowIndex >= 0) {
            selected_card = (String) card_table.getValueAt(selectedRowIndex, selectedColumnIndex);
            card_status = (String) card_table.getValueAt(selectedRowIndex, 2);
        }

        if (!Objects.isNull(card_status) && card_status.equals("cancelado")) {
            status.setText("Cartão já se encontra cancelado !");
            return;
        }

        if (LocalClient.cartaoDefault.equals(selected_card)) {
            status.setText("Não pode cancelar o cartão padrão !");
            return;
        }

        if (!Objects.isNull(selected_card) && !selected_card.isEmpty()) {
            int reply = JOptionPane.showConfirmDialog(null, "Deseja cancelar o cartão ? Não caminho de volta !", title, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                if (CardsDAO.cancelCard(selected_card) == 1) {
                    status.setForeground(green);
                    status.setText("Cartão cancelado !");
                    updateInfo();
                } else {
                    status.setText("Algo de inesperado aconteceu !");
                }
            }
        }
    }//GEN-LAST:event_cancel_cardActionPerformed

    private void create_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_cardActionPerformed
            int reply = JOptionPane.showConfirmDialog(null, "Deseja criar um novo cartão ? Todos os cartões têm uma valiadade de 5 anos !", title, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                if (CardsDAO.createCard(LocalClient.numCliente) == 1) {
                    status.setForeground(green);
                    status.setText("Novo cartão criado!");
                    updateInfo();
                } else {
                    status.setText("Algo de inesperado aconteceu !");
                }
            }
    }//GEN-LAST:event_create_cardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backdrop;
    private javax.swing.JButton cancel_card;
    private javax.swing.JTable card_table;
    private javax.swing.JButton create_card;
    private javax.swing.JButton default_card;
    private javax.swing.JTextField f_card;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel see_cards;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}