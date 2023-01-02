/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author srikr
 */
public class DeliveryManWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryManWorkAreaPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    public DeliveryManWorkAreaPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel tablemodel = (DefaultTableModel) tblOrderDetails.getModel();
        
        tablemodel.setRowCount(0);
        
        for(DeliveryMan deliveryMan : business.getDeliveryManDirectory().getDeliveryManDirectory()){
            if(deliveryMan.getUserName().equals(userAccount.getUsername())){
                    
                for(Order order : deliveryMan.getOrderList()){
                Object[] row = new Object[6];
                row[2] = order.getCustomerName();
                row[1] = order.getRestaurantName();
               
                row[4] = order.getPrice();
                row[5] = order.getStatus();
                row[0] = order;
                row[3] = order.getDeliveryAddress();
                tablemodel.addRow(row);
                    
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearchRes = new javax.swing.JTextField();
        SearchResbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrderDetails.setBackground(new java.awt.Color(255, 255, 153));
        tblOrderDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblOrderDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "RestaurantName", "Customer Name", "Delivery Address", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrderDetails.setRowHeight(26);
        tblOrderDetails.setRowMargin(1);
        tblOrderDetails.setShowHorizontalLines(true);
        tblOrderDetails.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblOrderDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 650, 96));

        processJButton.setBackground(new java.awt.Color(0, 0, 0));
        processJButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        processJButton.setForeground(new java.awt.Color(255, 255, 255));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        refreshJButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshJButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Order Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));
        add(txtSearchRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 120, -1));

        SearchResbtn.setBackground(new java.awt.Color(0, 0, 0));
        SearchResbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchResbtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchResbtn.setText("Search");
        SearchResbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchResbtnActionPerformed(evt);
            }
        });
        add(SearchResbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        int selectedRow = tblOrderDetails.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        Order order = (Order)tblOrderDetails.getValueAt(selectedRow, 0); 
        ProcessWorkRequestPanel processWorkRequestJPanel = new ProcessWorkRequestPanel(userProcessContainer, order);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void SearchResbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchResbtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblOrderDetails.getModel();
        TableRowSorter<DefaultTableModel> tm = new TableRowSorter<>(model);
        tblOrderDetails.setRowSorter(tm);
        tm.setRowFilter(RowFilter.regexFilter(txtSearchRes.getText().trim()));
    }//GEN-LAST:event_SearchResbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchResbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable tblOrderDetails;
    private javax.swing.JTextField txtSearchRes;
    // End of variables declaration//GEN-END:variables
}