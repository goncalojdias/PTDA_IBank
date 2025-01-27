/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ua.ibank.interfaces.internalFrames.staff.profile.card;

import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import pt.ua.ibank.DTO.Cartao;

public class PerfilCardTableCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected,
                                                   boolean hasFocus, int row,
                                                   int column) {
        Component comm = super.getTableCellRendererComponent(table, value,
                                                             isSelected,
                                                             hasFocus, row,
                                                             column);
        var currCardObject = (Cartao) value;

        SimpleDateFormat dateDisplay = new SimpleDateFormat("MM/yy");
        String expireDate = dateDisplay.format(currCardObject.dataValidade);
        String cardNumber = currCardObject.numCartao
               .substring(currCardObject.numCartao.length() - 4);

        var profileCardElement = new PerfilCardTableElementPanel(
        cardNumber,
        expireDate,
        currCardObject.isValid() ? "Valido" : "Invalido"
);

        return profileCardElement;
    }

}
