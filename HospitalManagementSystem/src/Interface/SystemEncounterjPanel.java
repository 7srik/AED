/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import Source.City;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Source.Encounter;
import Source.EncounterHistory;
import Source.Vital;
import Source.Person;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author srikr
 */
public class SystemEncounterjPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemEncounterjPanel
     */
    EncounterHistory phistory;
    static ArrayList<Person> plist = new ArrayList<Person>();
    public SystemEncounterjPanel() {
        initComponents();
        this.phistory = new EncounterHistory();
        populateTable();
        jUpdatebtn.setEnabled(false);
    }
    private void clearFields(){
        jPatienttxt.setText(null);
        jDoctortxt.setText(null);
        jRRatetxt.setText(null);
        jHRatetxt.setText(null);
        jAbnormaltxt.setSelectedItem(null);
        jHeighttxt.setText(null);
        jWeighttxt.setText(null);
        jEncountertxt.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jEncounterdetailslbl = new javax.swing.JLabel();
        jEScrollPane = new javax.swing.JScrollPane();
        jEncountertbl = new javax.swing.JTable();
        jCreatebtn = new javax.swing.JButton();
        jReadbtn = new javax.swing.JButton();
        jUpdatebtn = new javax.swing.JButton();
        jDeletebtn = new javax.swing.JButton();
        jPatientlbl = new javax.swing.JLabel();
        jDoctorlbl = new javax.swing.JLabel();
        jRRatelbl = new javax.swing.JLabel();
        jHRatelbl = new javax.swing.JLabel();
        jAbnormallbl = new javax.swing.JLabel();
        jRRatetxt = new javax.swing.JTextField();
        jHRatetxt = new javax.swing.JTextField();
        jHeightlbl = new javax.swing.JLabel();
        jHeighttxt = new javax.swing.JTextField();
        jWeighttxt = new javax.swing.JTextField();
        jWeightlbl = new javax.swing.JLabel();
        jSearchbtn = new javax.swing.JButton();
        jSearchtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jAbnormaltxt = new javax.swing.JComboBox<>();
        jPatienttxt = new javax.swing.JTextField();
        jDoctortxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jEncountertxt = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        jEncounterdetailslbl.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jEncounterdetailslbl.setText("ENCOUNTER DETAILS :");

        jEncountertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Doctor Name", "Respiration Rate", "Heart Rate", "Height", "Weight", "Abnormal", "Encounter ID"
            }
        ));
        jEScrollPane.setViewportView(jEncountertbl);

        jCreatebtn.setBackground(new java.awt.Color(255, 204, 51));
        jCreatebtn.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jCreatebtn.setText("CREATE");
        jCreatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreatebtnActionPerformed(evt);
            }
        });

        jReadbtn.setBackground(new java.awt.Color(255, 204, 51));
        jReadbtn.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jReadbtn.setText("READ");
        jReadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReadbtnActionPerformed(evt);
            }
        });

        jUpdatebtn.setBackground(new java.awt.Color(255, 204, 51));
        jUpdatebtn.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jUpdatebtn.setText("UPDATE");
        jUpdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdatebtnActionPerformed(evt);
            }
        });

        jDeletebtn.setBackground(new java.awt.Color(255, 204, 51));
        jDeletebtn.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jDeletebtn.setText("DELETE");
        jDeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeletebtnActionPerformed(evt);
            }
        });

        jPatientlbl.setText("Patient Name :");

        jDoctorlbl.setText("Doctor Name :");

        jRRatelbl.setText("Respiration Rate :");

        jHRatelbl.setText("Heart Rate :");

        jAbnormallbl.setText("Abnormal :");

        jRRatetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jRRatetxtKeyTyped(evt);
            }
        });

        jHRatetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jHRatetxtKeyTyped(evt);
            }
        });

        jHeightlbl.setText("Height :");

        jHeighttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jHeighttxtKeyTyped(evt);
            }
        });

        jWeighttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jWeighttxtKeyTyped(evt);
            }
        });

        jWeightlbl.setText("Weight :");

        jSearchbtn.setBackground(new java.awt.Color(255, 204, 51));
        jSearchbtn.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jSearchbtn.setText("SEARCH");
        jSearchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchbtnActionPerformed(evt);
            }
        });

        jSearchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchtxtActionPerformed(evt);
            }
        });

        jLabel1.setText("Cms");

        jLabel3.setText("Kgs");

        jAbnormaltxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "false", "true" }));

        jPatienttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPatienttxtKeyTyped(evt);
            }
        });

        jDoctortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDoctortxtKeyTyped(evt);
            }
        });

        jLabel4.setText("Encounter ID:");

        jEncountertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jEncountertxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCreatebtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jReadbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jUpdatebtn)
                                    .addComponent(jDeletebtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRRatelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jHeightlbl, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jPatientlbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRRatetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jHeighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addComponent(jPatienttxt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jHRatelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jWeightlbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDoctorlbl))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jWeighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDoctortxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jHRatetxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jAbnormallbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jAbnormaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jEncountertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jEncounterdetailslbl)
                                .addGap(18, 18, 18)
                                .addComponent(jSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSearchbtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jEScrollPane))))
                .addGap(49, 49, 49))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCreatebtn, jDeletebtn, jReadbtn, jUpdatebtn});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jHRatetxt, jRRatetxt});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEncounterdetailslbl)
                    .addComponent(jSearchbtn)
                    .addComponent(jSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jReadbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDeletebtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPatientlbl)
                    .addComponent(jDoctorlbl)
                    .addComponent(jPatienttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDoctortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jEncountertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRRatelbl)
                    .addComponent(jHRatelbl)
                    .addComponent(jAbnormallbl)
                    .addComponent(jRRatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHRatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAbnormaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jHeightlbl)
                    .addComponent(jHeighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jWeightlbl)
                    .addComponent(jWeighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCreatebtn)
                    .addComponent(jUpdatebtn))
                .addGap(29, 29, 29))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCreatebtn, jDeletebtn, jReadbtn, jUpdatebtn});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jHRatetxt, jHeighttxt, jRRatetxt, jWeighttxt});

    }// </editor-fold>//GEN-END:initComponents

    private void jSearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchbtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jEncountertbl.getModel();
        TableRowSorter<DefaultTableModel> tm = new TableRowSorter<>(model);
        jEncountertbl.setRowSorter(tm);
        tm.setRowFilter(RowFilter.regexFilter(jSearchtxt.getText().trim()));
        
    }//GEN-LAST:event_jSearchbtnActionPerformed

    private void jSearchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchtxtActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jEncountertbl.getModel();
        TableRowSorter<DefaultTableModel> tm = new TableRowSorter<>(model);
        jEncountertbl.setRowSorter(tm);
        tm.setRowFilter(RowFilter.regexFilter(jSearchtxt.getText().trim()));
    }//GEN-LAST:event_jSearchtxtActionPerformed

    private void jRRatetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRRatetxtKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jRRatetxtKeyTyped

    private void jHRatetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jHRatetxtKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jHRatetxtKeyTyped

    private void jHeighttxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jHeighttxtKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jHeighttxtKeyTyped

    private void jWeighttxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jWeighttxtKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jWeighttxtKeyTyped

    private void jUpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdatebtnActionPerformed
        // TODO add your handling code here:
        short checkPatient = 0;
        short checkDoctor = 0;
        short checkRrate = 0;
        short checkHrate = 0;
        short checkAbnormal = 0;
        short checkHeight = 0;
        short checkWeight = 0;
        short checkEncounter = 0;
        try{
            if (jPatienttxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please provide Patient Name");
                jPatienttxt.setText("");
                checkPatient = 1;
            }
            if (jDoctortxt.getText().isEmpty() && checkPatient==0){
                JOptionPane.showMessageDialog(null, "Please provide Doctor Name");
                jDoctortxt.setText("");
                checkDoctor = 1;
            }

            if (jRRatetxt.getText().isEmpty() && checkPatient==0 && checkDoctor==0){
                JOptionPane.showMessageDialog(null, "Please provide Respiration Rate");
                jRRatetxt.setText("");
                checkRrate = 1;
            }
            if (jHRatetxt.getText().isEmpty() && checkPatient==0 && checkDoctor==0 && checkRrate==0){
                JOptionPane.showMessageDialog(null, "Please provide Heart Rate");
                jHRatetxt.setText("");
                checkHrate = 1;
            }
            if (jAbnormaltxt.getSelectedItem().toString().isEmpty() && checkPatient==0 && checkDoctor==0 
                    && checkRrate==0 && checkHrate ==0){
                JOptionPane.showMessageDialog(null, "Please provide the Abnormal details");
                jAbnormaltxt.setSelectedItem(null);
                checkAbnormal = 1;
            }
            if (jHeighttxt.getText().isEmpty() && checkPatient==0 && checkDoctor==0 
                    && checkRrate==0 && checkHrate ==0 && checkAbnormal ==0){
                JOptionPane.showMessageDialog(null, "Please provide Height");
                jHeighttxt.setText("");
                checkHeight = 1;
            }
            if (jWeighttxt.getText().isEmpty() && checkPatient==0 && checkDoctor==0 
                    && checkRrate==0 && checkHrate ==0 && checkAbnormal ==0 && checkHeight ==0){
                JOptionPane.showMessageDialog(null, "Please provide Weight");
                jWeighttxt.setText("");
                checkWeight = 1;
            }
            if (jEncountertxt.getText().isEmpty() && checkPatient==0 && checkDoctor==0 
                    && checkRrate==0 && checkHrate ==0 && checkAbnormal ==0 && checkHeight ==0 && checkWeight ==0){
                JOptionPane.showMessageDialog(null, "Please provide Encounter ID");
                jEncountertxt.setText("");
                checkEncounter = 1;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in provided Details");
                }
        if (checkPatient==0 && checkDoctor==0 && checkRrate==0 && checkHrate==0 
                    && checkAbnormal==0 && checkHeight==0 && checkWeight==0){
                int selectedRowIndex = jEncountertbl.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) jEncountertbl.getModel();
                if (selectedRowIndex >= 0)
                {
                    model.setValueAt(jPatienttxt.getText(), selectedRowIndex,0);
                    model.setValueAt(jDoctortxt.getText(), selectedRowIndex,1);
                    model.setValueAt(jRRatetxt.getText(), selectedRowIndex,2);
                    model.setValueAt(jHRatetxt.getText(), selectedRowIndex, 3);
                    model.setValueAt(jHeighttxt.getText(), selectedRowIndex,4);
                    model.setValueAt(jWeighttxt.getText(), selectedRowIndex,5);
                    model.setValueAt(jAbnormaltxt.getSelectedItem(), selectedRowIndex,6);
                    model.setValueAt(jEncountertxt.getText(), selectedRowIndex,7);
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please Select a row to View.");
                }
                String personid = (jPatienttxt.getText());
                String doctor = (jDoctortxt.getText());
                int enc = (Integer.parseInt(jEncountertxt.getText()));
                int rrate = (Integer.parseInt(jRRatetxt.getText()));
                int hrate = (Integer.parseInt(jHRatetxt.getText()));
                int height = (Integer.parseInt(jHeighttxt.getText()));
                int weight = (Integer.parseInt(jWeighttxt.getText()));
                String abnormal = (jAbnormaltxt.getSelectedItem().toString());
                Vital v = new Vital();
                v.setRespirationRate(rrate);
                v.setHeartRate(hrate);
                v.setHeight(height);
                v.setWeight(weight);
                v.setAbnormal(abnormal);
                Encounter p = new Encounter(personid,doctor,enc,v);
                JOptionPane.showMessageDialog(null, "Encounter Data Updated for Unique id :  "+personid);
                clearFields();
        } else {
                JOptionPane.showMessageDialog(null, "Cannot Update Encounter, Please provide all the details");
        }

    }//GEN-LAST:event_jUpdatebtnActionPerformed

    private void jReadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReadbtnActionPerformed
        // TODO add your handling code here:
        jUpdatebtn.setEnabled(true);
        int selectedrow = jEncountertbl.getSelectedRow();
        if (selectedrow < 0){
            JOptionPane.showMessageDialog(null, "please select");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jEncountertbl.getModel();
        String patient = model.getValueAt(jEncountertbl.getSelectedRow(),0).toString();
        String doctor = model.getValueAt(jEncountertbl.getSelectedRow(),1).toString();
        String rrate = model.getValueAt(jEncountertbl.getSelectedRow(),2).toString();
        String hrrate = model.getValueAt(jEncountertbl.getSelectedRow(),3).toString();
        String height = model.getValueAt(jEncountertbl.getSelectedRow(),4).toString();
        String weight = model.getValueAt(jEncountertbl.getSelectedRow(),5).toString();
        String abnormal = model.getValueAt(jEncountertbl.getSelectedRow(),6).toString();
        String enc = model.getValueAt(jEncountertbl.getSelectedRow(),7).toString();
        
        jPatienttxt.setText(patient);
        jDoctortxt.setText(doctor);
        jRRatetxt.setText(rrate);
        jHRatetxt.setText(hrrate);
        jHeighttxt.setText(height);
        jWeighttxt.setText(weight); 
        jAbnormaltxt.setSelectedItem(abnormal);
        jEncountertxt.setText(enc);
    }//GEN-LAST:event_jReadbtnActionPerformed

    private void jDeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeletebtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jEncountertbl.getModel();
        if (jEncountertbl.getSelectedRowCount()==1) {
          model.removeRow(jEncountertbl.getSelectedRow());
          JOptionPane.showMessageDialog(this, "Encounter deleted.");
        }
        else{
            if(jEncountertbl.getSelectedRowCount()==0){
                JOptionPane.showMessageDialog(this, "Select a row");
            }
            else{
                JOptionPane.showMessageDialog(this,"Please select only one row to delete.");
            }
        }
        clearFields();
    }//GEN-LAST:event_jDeletebtnActionPerformed

    private void jCreatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreatebtnActionPerformed
        // TODO add your handling code here:
        short checkPatient = 0;
        short checkDoctor = 0;
        short checkRrate = 0;
        short checkHrate = 0;
        short checkAbnormal = 0;
        short checkHeight = 0;
        short checkWeight = 0;
        short checkEncounter = 0;
        try{
            if (jPatienttxt.getText().toString().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please provide Patient Name");
                jPatienttxt.setText("");
                checkPatient = 1;
            }
            if (jDoctortxt.getText().toString().isEmpty() && checkPatient==0){
                JOptionPane.showMessageDialog(null, "Please provide Age");
                jDoctortxt.setText("");
                checkDoctor = 1;
            }

            if (jRRatetxt.getText().isEmpty() && checkPatient==0 && checkDoctor==0){
                JOptionPane.showMessageDialog(null, "Please provide Respiration Rate");
                jRRatetxt.setText("");
                checkRrate = 1;
            }
            if (jHRatetxt.getText().isEmpty() && checkPatient==0 && checkDoctor==0 && checkRrate==0){
                JOptionPane.showMessageDialog(null, "Please provide Heart Rate");
                jHRatetxt.setText("");
                checkHrate = 1;
            }
            if (jAbnormaltxt.getSelectedItem().toString().isEmpty() && checkPatient==0 && checkDoctor==0 
                    && checkRrate==0 && checkHrate ==0){
                JOptionPane.showMessageDialog(null, "Please provide the Abnormal details");
                jAbnormaltxt.setSelectedItem(null);
                checkAbnormal = 1;
            }
            if (jHeighttxt.getText().isEmpty() && checkPatient==0 && checkDoctor==0 
                    && checkRrate==0 && checkHrate ==0 && checkAbnormal ==0){
                JOptionPane.showMessageDialog(null, "Please provide Height");
                jHeighttxt.setText("");
                checkHeight = 1;
            }
            if (jWeighttxt.getText().isEmpty() && checkPatient==0 && checkDoctor==0 
                    && checkRrate==0 && checkHrate ==0 && checkAbnormal ==0 && checkHeight ==0){
                JOptionPane.showMessageDialog(null, "Please provide Weight");
                jWeighttxt.setText("");
                checkWeight = 1;
            }
            if (jEncountertxt.getText().isEmpty() && checkPatient==0 && checkDoctor==0 
                    && checkRrate==0 && checkHrate ==0 && checkAbnormal ==0 && checkHeight ==0 && checkWeight ==0){
                JOptionPane.showMessageDialog(null, "Please provide Encounter ID");
                jEncountertxt.setText("");
                checkEncounter = 1;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in provided Details");
                }
        if (checkPatient==0 && checkDoctor==0 && checkRrate==0 && checkHrate==0 
                    && checkAbnormal==0 && checkHeight==0 && checkWeight==0){
                Encounter pr = phistory.addNewEncounterDetails();
                pr.setName(jPatienttxt.getText());
                pr.setDoctorName(jDoctortxt.getText());
                int enc = (Integer.parseInt(jEncountertxt.getText()));
                pr.setEncounter(enc);
                Vital v = new Vital();
                v.setRespirationRate(Integer.parseInt(jRRatetxt.getText()));
                v.setHeartRate(Integer.parseInt(jHRatetxt.getText()));
                v.setAbnormal( jAbnormaltxt.getSelectedItem().toString());
                v.setHeight(Integer.parseInt(jHeighttxt.getText()));
                v.setWeight(Integer.parseInt(jWeighttxt.getText()));
                pr.setVital(v);
                JOptionPane.showMessageDialog(null, "Encounter Created, For  Unique id  :  "+pr.getPersonid());
                populateTable();
                clearFields();
        } else {
                JOptionPane.showMessageDialog(null, "Cannot Create Encounter, Please provide all the details");
        }
    }//GEN-LAST:event_jCreatebtnActionPerformed

    private void jPatienttxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPatienttxtKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jPatienttxtKeyTyped

    private void jDoctortxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDoctortxtKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jDoctortxtKeyTyped

    private void jEncountertxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEncountertxtKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jEncountertxtKeyTyped

    
    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) jEncountertbl.getModel();
        model.setRowCount(0);
        
        for (Encounter pd : phistory.getEncounterHistory()){
          
            Object[] row = new Object[8];
            row[0] = pd.getName();
            row[1] = pd.getDoctorName();
            row[2] = pd.getVital().getRespirationRate();
            row[3] = pd.getVital().getHeartRate();
            row[4] = pd.getVital().getHeight();
            row[5] = pd.getVital().getWeight();
            row[6] = pd.getVital().isAbnormal();
            row[7] = pd.getEncounter();
            
            model.addRow(row);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAbnormallbl;
    private javax.swing.JComboBox<String> jAbnormaltxt;
    private javax.swing.JButton jCreatebtn;
    private javax.swing.JButton jDeletebtn;
    private javax.swing.JLabel jDoctorlbl;
    private javax.swing.JTextField jDoctortxt;
    private javax.swing.JScrollPane jEScrollPane;
    private javax.swing.JLabel jEncounterdetailslbl;
    private javax.swing.JTable jEncountertbl;
    private javax.swing.JTextField jEncountertxt;
    private javax.swing.JLabel jHRatelbl;
    private javax.swing.JTextField jHRatetxt;
    private javax.swing.JLabel jHeightlbl;
    private javax.swing.JTextField jHeighttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jPatientlbl;
    private javax.swing.JTextField jPatienttxt;
    private javax.swing.JLabel jRRatelbl;
    private javax.swing.JTextField jRRatetxt;
    private javax.swing.JButton jReadbtn;
    private javax.swing.JButton jSearchbtn;
    private javax.swing.JTextField jSearchtxt;
    private javax.swing.JButton jUpdatebtn;
    private javax.swing.JLabel jWeightlbl;
    private javax.swing.JTextField jWeighttxt;
    // End of variables declaration//GEN-END:variables
}
