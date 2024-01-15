/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pt.ua.ibank.interfaces.internalFrames.staff.transferlist;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import pt.ua.ibank.DAO.ClientDAO;
import pt.ua.ibank.DAO.TransfersDAO;
import pt.ua.ibank.DTO.Cliente;
import pt.ua.ibank.DTO.Transferencias;

/**
 *
 * @author ricar
 */
public class TransfersMainInterface extends javax.swing.JPanel {

    /**
     * Creates new form ContasMainInterface
     */
    private TransfersTableModel ttm;
    private pt.ua.ibank.DTO.Cliente currAuthorClient;
    private pt.ua.ibank.DTO.Cliente currRecieverClient;
    private Transferencias selectedTransfer;

    public TransfersMainInterface(int id) {
        initComponents();
        jPanelTransactionDetails.setVisible(false);
        ttm.searchForClient(Integer.toString(id), "Cliente");
    }

    public TransfersMainInterface() {
        initComponents();
        jPanelTransactionDetails.setVisible(false);
    }

    public Cliente getCurrAuthorClient() {
        return currAuthorClient;
    }

    public Cliente getCurrRecieverClient() {
        return currRecieverClient;
    }

    public JButton getOpenAuthorProfileButton() {
        return btnAuthor;
    }

    public JButton getOpenRecieverProfileButton() {
        return btnReciever;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LayeredPaneContas = new javax.swing.JLayeredPane();
        jPanelTransactionDetails = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnReciever = new javax.swing.JButton();
        btnAuthor = new javax.swing.JButton();
        lblReceptorID = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblReceptorIDValue = new javax.swing.JLabel();
        lblReceptorIDNameValue = new javax.swing.JLabel();
        lblAuthorIDNameValue = new javax.swing.JLabel();
        lblTransactionValueValue = new javax.swing.JLabel();
        lblTransactionValue = new javax.swing.JLabel();
        lblAuthorIDValue = new javax.swing.JLabel();
        lblIDValue = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblTransactionDescriptionValue = new javax.swing.JLabel();
        lblTransactionDescription = new javax.swing.JLabel();
        lblAuthorIDValue1 = new javax.swing.JLabel();
        lblAuthorIDValue2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttm = new TransfersTableModel();
        jTableTransactionsContent = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblAddTransactionAuthor = new javax.swing.JLabel();
        lblAddTransactionReciever = new javax.swing.JLabel();
        inputFieldAddTransactionAuthor = new javax.swing.JTextField();
        inputFieldAddTransactionReciever = new javax.swing.JTextField();
        inputFieldAddTransactionValue = new javax.swing.JTextField();
        lblAddTransactionValue = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnAddTransaction = new javax.swing.JButton();
        inputFieldAddTransactionDescription = new javax.swing.JTextField();
        lblAddTransactionDescription = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jtextFieldProcurarConta = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnRemoveFilters = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        comboBoxSelectType = new javax.swing.JComboBox<>();

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setText("Numero");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(859, 562));

        LayeredPaneContas.setBackground(new java.awt.Color(102, 102, 102));
        LayeredPaneContas.setPreferredSize(new java.awt.Dimension(776, 553));

        jPanelTransactionDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Detalhes de Transação");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel21)
                .addGap(6, 6, 6))
        );

        btnReciever.setText("Abrir Perfil");

        btnAuthor.setText("Abrir Perfil");
        btnAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthorActionPerformed(evt);
            }
        });

        lblReceptorID.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblReceptorID.setText("Receptor:");

        lblAuthor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAuthor.setText("Autor: ");

        lblReceptorIDValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblReceptorIDValue.setText("ID");

        lblReceptorIDNameValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblReceptorIDNameValue.setText("Nome");

        lblAuthorIDNameValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAuthorIDNameValue.setText("Nome");

        lblTransactionValueValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblTransactionValueValue.setText("Valor");

        lblTransactionValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblTransactionValue.setText("Valor:");

        lblAuthorIDValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAuthorIDValue.setText("ID");

        lblIDValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblIDValue.setText("ID");

        lblID.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblID.setText("ID:");

        lblTransactionDescriptionValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblTransactionDescriptionValue.setText("Nome");

        lblTransactionDescription.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblTransactionDescription.setText("Descrição:");

        lblAuthorIDValue1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAuthorIDValue1.setText("ID:");

        lblAuthorIDValue2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAuthorIDValue2.setText("ID:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTransactionValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblReceptorID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTransactionDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTransactionDescriptionValue)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTransactionValueValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblReceptorIDNameValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAuthorIDNameValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIDValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(lblAuthorIDValue1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAuthorIDValue))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(lblAuthorIDValue2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblReceptorIDValue)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReciever)
                    .addComponent(btnAuthor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblIDValue))
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReceptorID)
                    .addComponent(lblReceptorIDNameValue)
                    .addComponent(btnReciever, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAuthorIDValue2)
                    .addComponent(lblReceptorIDValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthor)
                    .addComponent(lblAuthorIDNameValue)
                    .addComponent(btnAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAuthorIDValue1)
                    .addComponent(lblAuthorIDValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTransactionValueValue)
                    .addComponent(lblTransactionValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTransactionDescription)
                    .addComponent(lblTransactionDescriptionValue))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelTransactionDetailsLayout = new javax.swing.GroupLayout(jPanelTransactionDetails);
        jPanelTransactionDetails.setLayout(jPanelTransactionDetailsLayout);
        jPanelTransactionDetailsLayout.setHorizontalGroup(
            jPanelTransactionDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTransactionDetailsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanelTransactionDetailsLayout.setVerticalGroup(
            jPanelTransactionDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransactionDetailsLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableTransactionsContent.setModel(ttm);
        jTableTransactionsContent.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTableTransactionsContent);
        jTableTransactionsContent.getColumnModel().getColumn(5).setCellRenderer(
            new TransfersActionRenderer());

        jPanelTransactionDetails.setVisible(false);

        TransfersActionEvent event = (int row) -> {
            selectedTransfer = ((TransfersTableModel)jTableTransactionsContent.getModel()).getTransfer(row);
            currAuthorClient = ClientDAO.getClientByID(
                selectedTransfer.getclienteRealizaID());
            currRecieverClient = ClientDAO.getClientByID(
                selectedTransfer.getclienteRecebeID());
            lblIDValue.setText(Integer.toString(
                selectedTransfer.getTransferenciaID()));
        lblReceptorIDNameValue.setText(currRecieverClient.nome);
        lblReceptorIDValue.setText(
            Integer.toString(
                currRecieverClient.numCliente));
        lblAuthorIDNameValue.setText(currAuthorClient.nome);
        lblAuthorIDValue.setText(
            Integer.toString(
                currAuthorClient.numCliente));
        lblTransactionValueValue.setText(
            Double.toString(
                selectedTransfer.getvalorEmEuros()));
        lblTransactionDescriptionValue.setText(
            selectedTransfer.getDescricao());
        jPanelTransactionDetails.setVisible(true);
    };

    jTableTransactionsContent.getColumnModel().getColumn(5).setCellEditor(
        new TransfersCellEditor(event));

    jPanel4.setBackground(new java.awt.Color(0, 0, 0));

    jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jLabel15.setForeground(new java.awt.Color(255, 255, 255));
    jLabel15.setText("Lista de Transações");
    jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
    jLabel15.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6))
    );

    jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    lblAddTransactionAuthor.setText("Autor - ID: ");

    lblAddTransactionReciever.setText("Receptor - ID:");

    lblAddTransactionValue.setText("Valor: ");

    jPanel7.setBackground(new java.awt.Color(0, 0, 0));

    jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(255, 255, 255));
    jLabel16.setText("Adicionar Transação");
    jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
    jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6))
    );

    btnAddTransaction.setBackground(new java.awt.Color(0, 0, 0));
    btnAddTransaction.setForeground(new java.awt.Color(255, 255, 255));
    btnAddTransaction.setText("Adicionar");
    btnAddTransaction.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAddTransactionActionPerformed(evt);
        }
    });

    lblAddTransactionDescription.setText("Descrição");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnAddTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblAddTransactionReciever, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAddTransactionAuthor)
                        .addComponent(lblAddTransactionDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAddTransactionValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputFieldAddTransactionDescription)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputFieldAddTransactionAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addComponent(inputFieldAddTransactionReciever)
                                .addComponent(inputFieldAddTransactionValue))
                            .addGap(3, 3, 3)))))
            .addContainerGap())
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, 12)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblAddTransactionAuthor)
                .addComponent(inputFieldAddTransactionAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblAddTransactionReciever)
                .addComponent(inputFieldAddTransactionReciever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(inputFieldAddTransactionValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblAddTransactionValue))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(inputFieldAddTransactionDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblAddTransactionDescription))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnAddTransaction)
            .addContainerGap())
    );

    jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jPanel8.setBackground(new java.awt.Color(0, 0, 0));

    jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(255, 255, 255));
    jLabel17.setText("Procurar Transação");
    jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
    jLabel17.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

    btnRemoveFilters.setBackground(new java.awt.Color(204, 204, 204));
    btnRemoveFilters.setText("Tirar filtros");
    btnRemoveFilters.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRemoveFiltersActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addContainerGap(44, Short.MAX_VALUE)
            .addComponent(jLabel17)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
            .addComponent(btnRemoveFilters)
            .addContainerGap())
    );
    jPanel8Layout.setVerticalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnRemoveFilters, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    btnSearch.setBackground(new java.awt.Color(0, 0, 0));
    btnSearch.setForeground(new java.awt.Color(255, 255, 255));
    btnSearch.setText("Procurar");
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSearchActionPerformed(evt);
        }
    });

    comboBoxSelectType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Autor", "Receptor", "Cliente" }));

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jtextFieldProcurarConta)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(comboBoxSelectType, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jtextFieldProcurarConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(comboBoxSelectType))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    LayeredPaneContas.setLayer(jPanelTransactionDetails, javax.swing.JLayeredPane.DEFAULT_LAYER);
    LayeredPaneContas.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
    LayeredPaneContas.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
    LayeredPaneContas.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
    LayeredPaneContas.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

    javax.swing.GroupLayout LayeredPaneContasLayout = new javax.swing.GroupLayout(LayeredPaneContas);
    LayeredPaneContas.setLayout(LayeredPaneContasLayout);
    LayeredPaneContasLayout.setHorizontalGroup(
        LayeredPaneContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(LayeredPaneContasLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addGroup(LayeredPaneContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(LayeredPaneContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelTransactionDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10))
    );
    LayeredPaneContasLayout.setVerticalGroup(
        LayeredPaneContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(LayeredPaneContasLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(LayeredPaneContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LayeredPaneContasLayout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jScrollPane1))
                .addGroup(LayeredPaneContasLayout.createSequentialGroup()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanelTransactionDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 40, Short.MAX_VALUE)))
            .addContainerGap(45, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(LayeredPaneContas, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(LayeredPaneContas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
    );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAuthorActionPerformed

    private void btnAddTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransactionActionPerformed
        int author = Integer.parseInt(
            inputFieldAddTransactionAuthor.getText());
        int reciever = Integer.parseInt(
            inputFieldAddTransactionReciever.getText());
        Double value = Double.valueOf(
               inputFieldAddTransactionValue.getText());
        String description = inputFieldAddTransactionDescription.getText();
        if (value <= 0) {
            JOptionPane.showMessageDialog(this,
                                          "Valor não pode ser 0 ou negativo");
            return;
        }
        String resultado =
               TransfersDAO.createTransfer(value, author, reciever,
                                           description) ?
               "Transferencia de " + value + "€ Feita com sucesso" :
               "Operação feita sem sucesso, tente novamente";
        JOptionPane.showMessageDialog(this, resultado);
        ttm.resetSearchFilters();
    }//GEN-LAST:event_btnAddTransactionActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String selectedType =
               String.valueOf(comboBoxSelectType.getSelectedItem());
        String input = jtextFieldProcurarConta.getText();
        jPanelTransactionDetails.setVisible(false);
        ttm.searchForClient(input, selectedType);
        jTableTransactionsContent.repaint();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRemoveFiltersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFiltersActionPerformed
        ttm.resetSearchFilters();
        jTableTransactionsContent.repaint();
    }//GEN-LAST:event_btnRemoveFiltersActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LayeredPaneContas;
    private javax.swing.JButton btnAddTransaction;
    private javax.swing.JButton btnAuthor;
    private javax.swing.JButton btnReciever;
    private javax.swing.JButton btnRemoveFilters;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboBoxSelectType;
    private javax.swing.JTextField inputFieldAddTransactionAuthor;
    private javax.swing.JTextField inputFieldAddTransactionDescription;
    private javax.swing.JTextField inputFieldAddTransactionReciever;
    private javax.swing.JTextField inputFieldAddTransactionValue;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelTransactionDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTransactionsContent;
    private javax.swing.JTextField jtextFieldProcurarConta;
    private javax.swing.JLabel lblAddTransactionAuthor;
    private javax.swing.JLabel lblAddTransactionDescription;
    private javax.swing.JLabel lblAddTransactionReciever;
    private javax.swing.JLabel lblAddTransactionValue;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblAuthorIDNameValue;
    private javax.swing.JLabel lblAuthorIDValue;
    private javax.swing.JLabel lblAuthorIDValue1;
    private javax.swing.JLabel lblAuthorIDValue2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDValue;
    private javax.swing.JLabel lblReceptorID;
    private javax.swing.JLabel lblReceptorIDNameValue;
    private javax.swing.JLabel lblReceptorIDValue;
    private javax.swing.JLabel lblTransactionDescription;
    private javax.swing.JLabel lblTransactionDescriptionValue;
    private javax.swing.JLabel lblTransactionValue;
    private javax.swing.JLabel lblTransactionValueValue;
    // End of variables declaration//GEN-END:variables
}
