package pt.ua.ibank.interfaces.internalFrames.staff.accounts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pt.ua.ibank.DAO.CardsDAO;
import pt.ua.ibank.DAO.ClientDAO;
import pt.ua.ibank.DAO.DepositsDAO;
import pt.ua.ibank.DTO.Cliente;

/**
 * Implementação tabela de Transferencias a ser usada na interface de staff.
 * ultima modificação: 04 Janeiro 2024
 */
public class ContasTableModel extends AbstractTableModel {

    private List<String> header = null;
    private List<Cliente> data = null;

    public ContasTableModel() {
        data = ClientDAO.getClientList();
        header = new ArrayList<>(Arrays.asList(
        "N.Conta", "N.Cliente", "Nome",
        "Email", "NIF", "Depositos pendente", ""));
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return header.size();
    }

    @Override
    public String getColumnName(int column) {
        return header.get(column);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public Cliente getAccount(int rowIndex) {
        return data.get(rowIndex);

    }

    public void resetSearchFilters() {
        data.clear();
        if ((data = ClientDAO.getClientList()) != null) {
            fireTableRowsDeleted(0, data.size() - 1);
        }
    }

    public void searchForClient(String value, String searchType) {
        switch (searchType) {
            case "ID" -> {
                data.clear();
                Cliente result;
                if ((result = ClientDAO.getClientByID(
                     Integer.parseInt(value))) != null) {
                    data.add(result);
                    fireTableRowsDeleted(0, data.size() - 1);
                }
            }
            case "Email" -> {
                data.clear();
                Cliente result;
                if ((result = ClientDAO.getClientByEmail(value)) != null) {
                    data.add(result);
                    fireTableRowsDeleted(0, data.size() - 1);
                }
            }
            case "NIF" -> {
                data.clear();
                Cliente result;
                if ((result = ClientDAO.getClientByNIF(value)) != null) {
                    data.add(result);
                    fireTableRowsDeleted(0, data.size() - 1);
                }
            }
            case "Morada" -> {
                data.clear();
                if ((data = ClientDAO.getClientListByAddress(value)) != null) {
                    // fireTableRowsDeleted(data.size() - 1, data.size() - 1);
                }
            }
            default -> {
                System.out.println("Invalid search type.");
            }
        }
    }

    public int getDepositAmountNumberFromID(int id) {
        return DepositsDAO.getDepositCount(id);

    }

    public int getCardAmountNumberFromID(int id) {
        return CardsDAO.getCardAmountByID(id);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 -> {
                return data.get(rowIndex).numConta;
            }
            case 1 -> {
                return data.get(rowIndex).numCliente;
            }
            case 2 -> {
                return data.get(rowIndex).nome;
            }
            case 3 -> {
                return data.get(rowIndex).email;
            }
            case 4 -> {
                return data.get(rowIndex).nif;
            }
            case 5 -> {
                var id = data.get(rowIndex).numCliente;
                return getDepositAmountNumberFromID(id);
            }
            default -> {
                return -1;
            }
        }
    }

}
