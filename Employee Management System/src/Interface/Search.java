/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;
import Company.Employees;
import Company.Employee;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author srikr
 */
public class Search extends javax.swing.JPanel {

    /**
     * Creates new form Search
     */
    private Employees employees;
    public Search(Employees employees) {
        initComponents();
        this.employees=employees;
        jNametf.setEditable(false);
        jEmployeeIdtf.setEditable(false);
        jAgetf.setEditable(false);
        jStartDatetf.setEditable(false);
        jLeveltf.setEditable(false);
        jTeamInfotf.setEditable(false);
        jPositionTitletf.setEditable(false);
        jPhoneNotf.setEditable(false);
        jEmailidtf.setEditable(false);
        jUpdate.setEnabled(false);
        
        populateTable();
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        
        for (Employee employee : employees.getEmployees()){
          
            Object[] row = new Object[10];
            row[0] = employee.getName();
            row[1] = employee.getEmployeeId();
            row[2] = employee.getAge();
            row[3] = employee.getGender();
            row[4] = employee.getStartDate();
            row[5] = employee.getLevel();
            row[6] = employee.getTeamInfo();
            row[7] = employee.getPositionTitle();
            row[8] = employee.getPhoneNumber();
            row[9] = employee.getEmailId();
            
            model.addRow(row);
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

        jGenderGroup = new javax.swing.ButtonGroup();
        jEmployeeId = new javax.swing.JLabel();
        jGender = new javax.swing.JLabel();
        jEmailId = new javax.swing.JLabel();
        jAge = new javax.swing.JLabel();
        jImage2 = new javax.swing.JPanel();
        jImage = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();
        jPhoneNo = new javax.swing.JLabel();
        jAgetf = new javax.swing.JTextField();
        jEmployee = new javax.swing.JLabel();
        jTeamInfo = new javax.swing.JLabel();
        jLevel = new javax.swing.JLabel();
        jStartDate = new javax.swing.JLabel();
        jMale = new javax.swing.JRadioButton();
        jPhoneNotf = new javax.swing.JTextField();
        jLGBTQ = new javax.swing.JRadioButton();
        jNametf = new javax.swing.JTextField();
        jFemale = new javax.swing.JRadioButton();
        jEmailidtf = new javax.swing.JTextField();
        jTeamInfotf = new javax.swing.JTextField();
        jDelete = new javax.swing.JButton();
        jPositionTitletf = new javax.swing.JTextField();
        jPositionTitle = new javax.swing.JLabel();
        jUpdate = new javax.swing.JButton();
        jEmployeeIdtf = new javax.swing.JTextField();
        jSearch1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jViewDetails = new javax.swing.JButton();
        jSearchtf = new javax.swing.JTextField();
        jStartDatetf = new javax.swing.JTextField();
        jLeveltf = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jEmployeeId.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jEmployeeId.setText("Employee ID");

        jGender.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jGender.setText("Gender");

        jEmailId.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jEmailId.setText("Email ID");

        jAge.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jAge.setText("Age");

        javax.swing.GroupLayout jImage2Layout = new javax.swing.GroupLayout(jImage2);
        jImage2.setLayout(jImage2Layout);
        jImage2Layout.setHorizontalGroup(
            jImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jImage2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jImage, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jImage2Layout.setVerticalGroup(
            jImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jImage2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jImage, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        jName.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jName.setText("Name");

        jPhoneNo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jPhoneNo.setText("Phone No");

        jAgetf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jAgetfKeyTyped(evt);
            }
        });

        jEmployee.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jEmployee.setText("Employees Details");

        jTeamInfo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jTeamInfo.setText("Team Info");

        jLevel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLevel.setText("Level");

        jStartDate.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jStartDate.setText("Start Date");

        jGenderGroup.add(jMale);
        jMale.setText("Male");
        jMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaleActionPerformed(evt);
            }
        });

        jPhoneNotf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPhoneNotfKeyTyped(evt);
            }
        });

        jGenderGroup.add(jLGBTQ);
        jLGBTQ.setText("LGBTQ+");
        jLGBTQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLGBTQActionPerformed(evt);
            }
        });

        jNametf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNametfKeyTyped(evt);
            }
        });

        jGenderGroup.add(jFemale);
        jFemale.setText("Female");
        jFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFemaleActionPerformed(evt);
            }
        });

        jDelete.setBackground(new java.awt.Color(255, 204, 0));
        jDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jPositionTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jPositionTitle.setText("Position Title");

        jUpdate.setBackground(new java.awt.Color(255, 204, 0));
        jUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        jSearch1.setBackground(new java.awt.Color(255, 204, 0));
        jSearch1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSearch1.setText("Search");
        jSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearch1ActionPerformed(evt);
            }
        });
        jSearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearch1KeyReleased(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee Id", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Phone No", "Email Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jViewDetails.setBackground(new java.awt.Color(255, 204, 0));
        jViewDetails.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jViewDetails.setText("View Details");
        jViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewDetailsActionPerformed(evt);
            }
        });

        jSearchtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchtfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jStartDate)
                            .addComponent(jEmployeeId)
                            .addComponent(jAge)
                            .addComponent(jTeamInfo)
                            .addComponent(jName)
                            .addComponent(jPositionTitle)
                            .addComponent(jPhoneNo)
                            .addComponent(jEmailId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPositionTitletf, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(jPhoneNotf, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(jEmailidtf, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jEmployeeIdtf, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jAgetf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jGender)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLGBTQ))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jStartDatetf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLeveltf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTeamInfotf, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                    .addComponent(jNametf, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jViewDetails)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(105, 105, 105)
                            .addComponent(jSearchtf, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jEmailidtf, jEmployeeIdtf, jPhoneNotf, jPositionTitletf, jTeamInfotf});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDelete, jSearch1, jUpdate, jViewDetails});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearchtf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jViewDetails))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jName)
                            .addComponent(jNametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEmployeeId)
                            .addComponent(jEmployeeIdtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAge)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jAgetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGender)
                                .addComponent(jMale)
                                .addComponent(jFemale)
                                .addComponent(jLGBTQ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLevel)
                                .addComponent(jStartDatetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLeveltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jStartDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTeamInfotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTeamInfo)))
                    .addComponent(jImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPositionTitle)
                    .addComponent(jPositionTitletf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPhoneNotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPhoneNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmailidtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmailId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDelete, jSearch1, jUpdate, jViewDetails});

    }// </editor-fold>//GEN-END:initComponents

    private void jMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMaleActionPerformed

    private void jLGBTQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLGBTQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLGBTQActionPerformed

    private void jFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFemaleActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        if (jTable.getSelectedRowCount()==1) {
          model.removeRow(jTable.getSelectedRow());
          JOptionPane.showMessageDialog(this, "Employee Profile deleted.");
        }
        else{
            if(jTable.getSelectedRowCount()==0){
                JOptionPane.showMessageDialog(this, "Select a row");
            }
            else{
                JOptionPane.showMessageDialog(this,"Please select only one row to delete.");
            }
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        if (selectedRowIndex >= 0)
        {
            if("".equals(jNametf.getText())||"".equals(jEmployeeIdtf.getText())||
            "".equals(jAgetf.getText())||"".equals(jStartDatetf.getText())||
            "".equals(jLeveltf.getText())||"".equals(jTeamInfotf.getText())||
            "".equals(jPositionTitletf.getText())||"".equals(jPhoneNotf.getText())||
            "".equals(jEmailidtf.getText())||(jMale.isSelected()&&
            jFemale.isSelected()&&jLGBTQ.isSelected()))             {
                
                JOptionPane.showMessageDialog(this, "Please Fill All the Fields");
            }
            else{
                model.setValueAt(jNametf.getText(), selectedRowIndex, 0);
                model.setValueAt(jEmployeeIdtf.getText(), selectedRowIndex, 1);
                model.setValueAt(jAgetf.getText(), selectedRowIndex, 2);
                String genderValue="";
                    if (jMale.isSelected()) genderValue="Male";
                    else if (jFemale.isSelected()) genderValue="Female";
                    else if (jLGBTQ.isSelected()) genderValue="LGBTQ+";
                model.setValueAt(genderValue, selectedRowIndex, 3);
                model.setValueAt(jStartDatetf.getText(), selectedRowIndex, 4);
                model.setValueAt(jLeveltf.getText(), selectedRowIndex, 5);
                model.setValueAt(jTeamInfotf.getText(), selectedRowIndex, 6);
                model.setValueAt(jPositionTitletf.getText(), selectedRowIndex, 7);
                model.setValueAt(jPhoneNotf.getText(), selectedRowIndex, 8);
                model.setValueAt(jEmailidtf.getText(), selectedRowIndex, 9);
            }
        }
        else{
          JOptionPane.showMessageDialog(this, "Please Select a row to View.");
        }  
        jNametf.setText("");
        jEmployeeIdtf.setText("");
        jAgetf.setText("");
        jMale.setSelected(false);
        jFemale.setSelected(false);
        jLGBTQ.setSelected(false);
        jStartDatetf.setText("");
        jLeveltf.setText("");
        jTeamInfotf.setText("");
        jPositionTitletf.setText("");
        jPhoneNotf.setText("");
        jEmailidtf.setText("");
    }//GEN-LAST:event_jUpdateActionPerformed

    private void jSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearch1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        TableRowSorter<DefaultTableModel> tm = new TableRowSorter<>(model);
        jTable.setRowSorter(tm);
        tm.setRowFilter(RowFilter.regexFilter(jSearchtf.getText().trim()));
    }//GEN-LAST:event_jSearch1ActionPerformed

    private void jViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedrow = jTable.getSelectedRow();
        if (selectedrow < 0){
            JOptionPane.showMessageDialog(null, "please select");
            return;
        }
        jNametf.setEditable(true);
        jEmployeeIdtf.setEditable(true);
        jAgetf.setEditable(true);
        jStartDatetf.setEditable(true);
        jLeveltf.setEditable(true);
        jTeamInfotf.setEditable(true);
        jPositionTitletf.setEditable(true);
        jPhoneNotf.setEditable(true);
        jEmailidtf.setEditable(true);
        jUpdate.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        String name = model.getValueAt(jTable.getSelectedRow(),0).toString();
        String empid = model.getValueAt(jTable.getSelectedRow(),1).toString();
        String age = model.getValueAt(jTable.getSelectedRow(),2).toString();
        String gender = model.getValueAt(jTable.getSelectedRow(),3).toString();
        String level = model.getValueAt(jTable.getSelectedRow(),5).toString();
        String team_info = model.getValueAt(jTable.getSelectedRow(),6).toString();
        String title = model.getValueAt(jTable.getSelectedRow(),7).toString();
        String start_date = model.getValueAt(jTable.getSelectedRow(),4).toString();
        String ph_no = model.getValueAt(jTable.getSelectedRow(),8).toString();
        String email = model.getValueAt(jTable.getSelectedRow(),9).toString();
        
        jNametf.setText(name);
        jEmployeeIdtf.setText(empid);
        jAgetf.setText(age);
        switch (gender) {
            case "Male" -> //genderGroup.setSelected((ButtonModel) btnMale, true);
                jMale.setSelected(true);
            case "Female" -> //genderGroup.setSelected(btnF, true);
                jFemale.setSelected(true);
            default -> jLGBTQ.setSelected(true);
        }
        jStartDatetf.setText(start_date);
        jLeveltf.setText(level);
        jTeamInfotf.setText(team_info);
        jPositionTitletf.setText(title);
        jPhoneNotf.setText(ph_no);
        jEmailidtf.setText(email);
        
    }//GEN-LAST:event_jViewDetailsActionPerformed

    private void jSearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearch1KeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        TableRowSorter<DefaultTableModel> tm = new TableRowSorter<>(model);
        jTable.setRowSorter(tm);
        tm.setRowFilter(RowFilter.regexFilter(jSearchtf.getText().trim()));
    }//GEN-LAST:event_jSearch1KeyReleased

    private void jSearchtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchtfActionPerformed

    private void jNametfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNametfKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jNametfKeyTyped

    private void jAgetfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAgetfKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jAgetfKeyTyped

    private void jPhoneNotfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPhoneNotfKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jPhoneNotfKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAge;
    private javax.swing.JTextField jAgetf;
    private javax.swing.JButton jDelete;
    private javax.swing.JLabel jEmailId;
    private javax.swing.JTextField jEmailidtf;
    private javax.swing.JLabel jEmployee;
    private javax.swing.JLabel jEmployeeId;
    private javax.swing.JTextField jEmployeeIdtf;
    private javax.swing.JRadioButton jFemale;
    private javax.swing.JLabel jGender;
    private javax.swing.ButtonGroup jGenderGroup;
    private javax.swing.JLabel jImage;
    private javax.swing.JPanel jImage2;
    private javax.swing.JRadioButton jLGBTQ;
    private javax.swing.JLabel jLevel;
    private javax.swing.JTextField jLeveltf;
    private javax.swing.JRadioButton jMale;
    private javax.swing.JLabel jName;
    private javax.swing.JTextField jNametf;
    private javax.swing.JLabel jPhoneNo;
    private javax.swing.JTextField jPhoneNotf;
    private javax.swing.JLabel jPositionTitle;
    private javax.swing.JTextField jPositionTitletf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearch1;
    private javax.swing.JTextField jSearchtf;
    private javax.swing.JLabel jStartDate;
    private javax.swing.JTextField jStartDatetf;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel jTeamInfo;
    private javax.swing.JTextField jTeamInfotf;
    private javax.swing.JButton jUpdate;
    private javax.swing.JButton jViewDetails;
    // End of variables declaration//GEN-END:variables


}