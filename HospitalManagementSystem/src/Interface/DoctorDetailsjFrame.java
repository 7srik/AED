/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import javax.swing.table.DefaultTableModel;
import Source.City;
import Source.Hospital;
import Source.Person;
import Source.PersonDirectory;
/**
 *
 * @author srikr
 */
public class DoctorDetailsjFrame extends javax.swing.JFrame {

    /**
     * Creates new form DoctorDetailsjFrame
     */
    PersonDirectory phistory;
    public DoctorDetailsjFrame() {
        initComponents();
        setExtendedState(MainFrame.MAXIMIZED_BOTH);
        this.phistory = new PersonDirectory();
        populateTable();
        loadComboBoxData();
    }
    private void loadComboBoxData(){
        
        jHospitaltxt.removeAllItems();
        for(City city: SystemHospitaljPanel.cityList){
            jHospitaltxt.addItem(city.getHospital());
        }
        for(City city: HospitalAdminHospitaljPanel.cityList){
            jHospitaltxt.addItem(city.getHospital());
        }
        jHospitaltxt.setSelectedIndex(-1);
    }
    
    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) jDoctortbl.getModel();
        model.setRowCount(0);
        
        for (Person pd : phistory.getPerson()){
          
            Object[] row = new Object[3];
            
            row[0] = pd.getPersonid();
            row[1] = pd.getHospital();
            row[2] = pd.getHospital();
            
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

        jPanel1 = new javax.swing.JPanel();
        jBackbtn = new javax.swing.JButton();
        jSugartxt = new javax.swing.JTextField();
        jRRatetxt = new javax.swing.JTextField();
        jDoctorlbl = new javax.swing.JLabel();
        jWeighttxt = new javax.swing.JTextField();
        jSearchbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDoctortbl = new javax.swing.JTable();
        jHRatelbl = new javax.swing.JLabel();
        jPatientlbl = new javax.swing.JLabel();
        jHRatetxt = new javax.swing.JTextField();
        jRRatelbl = new javax.swing.JLabel();
        jVitallbl = new javax.swing.JLabel();
        jCreatebtn = new javax.swing.JButton();
        jEncountertxt = new javax.swing.JTextField();
        jRecordlbl = new javax.swing.JLabel();
        jPatienttxt = new javax.swing.JTextField();
        jHeightlbl = new javax.swing.JLabel();
        jDoctortxt = new javax.swing.JComboBox<>();
        jWeightlbl = new javax.swing.JLabel();
        jHospitaltxt = new javax.swing.JComboBox<>();
        jPatientidlbl = new javax.swing.JLabel();
        jSearchtxt = new javax.swing.JTextField();
        jHospitallbl = new javax.swing.JLabel();
        jDoctorHeading = new javax.swing.JLabel();
        jEncounterlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DOCTOR");

        jBackbtn.setBackground(new java.awt.Color(255, 204, 51));
        jBackbtn.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jBackbtn.setText("BACK");
        jBackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackbtnActionPerformed(evt);
            }
        });

        jSugartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSugartxtActionPerformed(evt);
            }
        });

        jRRatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRRatetxtActionPerformed(evt);
            }
        });

        jDoctorlbl.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jDoctorlbl.setText("Doctor name :");

        jWeighttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWeighttxtActionPerformed(evt);
            }
        });

        jSearchbtn.setBackground(new java.awt.Color(255, 204, 51));
        jSearchbtn.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jSearchbtn.setText("SEARCH");
        jSearchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchbtnActionPerformed(evt);
            }
        });

        jDoctortbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient ID", "Hospital Name", "Doctor Name"
            }
        ));
        jScrollPane1.setViewportView(jDoctortbl);

        jHRatelbl.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jHRatelbl.setText("Heart Rate :");

        jPatientlbl.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPatientlbl.setText("Patient ID :");

        jHRatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHRatetxtActionPerformed(evt);
            }
        });

        jRRatelbl.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jRRatelbl.setText("Respiration Rate :");

        jVitallbl.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jVitallbl.setText("Vital Signs :");

        jCreatebtn.setBackground(new java.awt.Color(255, 204, 51));
        jCreatebtn.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jCreatebtn.setText("CREATE");
        jCreatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreatebtnActionPerformed(evt);
            }
        });

        jRecordlbl.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRecordlbl.setText("Record Patient Vitals :");

        jHeightlbl.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jHeightlbl.setText("Height :");

        jWeightlbl.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jWeightlbl.setText("Weight :");

        jPatientidlbl.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPatientidlbl.setText("Patient ID :");

        jSearchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchtxtActionPerformed(evt);
            }
        });

        jHospitallbl.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jHospitallbl.setText("Hospital name :");

        jDoctorHeading.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jDoctorHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDoctorHeading.setText("DOCTOR PANEL");

        jEncounterlbl.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jEncounterlbl.setText("Encounter No :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDoctorlbl)
                            .addComponent(jHospitallbl)
                            .addComponent(jPatientidlbl)
                            .addComponent(jEncounterlbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jHospitaltxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDoctortxt, javax.swing.GroupLayout.Alignment.TRAILING, 0, 97, Short.MAX_VALUE))
                            .addComponent(jPatienttxt)
                            .addComponent(jEncountertxt))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRRatelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jHRatelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jHeightlbl, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jWeightlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRRatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jHRatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSugartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jWeighttxt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRecordlbl)
                                .addGap(182, 182, 182)
                                .addComponent(jVitallbl))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPatientlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jSearchbtn))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(625, 625, 625)
                .addComponent(jDoctorHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBackbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(632, 632, 632)
                .addComponent(jCreatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jHRatetxt, jRRatetxt, jSugartxt, jWeighttxt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDoctortxt, jEncountertxt, jHospitaltxt, jPatienttxt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBackbtn, jCreatebtn, jSearchbtn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDoctorHeading))
                    .addComponent(jBackbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPatientlbl)
                    .addComponent(jSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRecordlbl)
                    .addComponent(jVitallbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRRatelbl)
                        .addComponent(jRRatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jHospitallbl)
                        .addComponent(jHospitaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDoctorlbl)
                            .addComponent(jDoctortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPatientidlbl)
                            .addComponent(jPatienttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jHRatelbl)
                            .addComponent(jHRatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jHeightlbl)
                            .addComponent(jSugartxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jEncounterlbl)
                        .addComponent(jEncountertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jWeightlbl)
                        .addComponent(jWeighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addComponent(jCreatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jHRatetxt, jRRatetxt, jSugartxt, jWeighttxt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDoctortxt, jEncountertxt, jHospitaltxt, jPatienttxt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBackbtn, jCreatebtn, jSearchbtn});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSearchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchtxtActionPerformed

    private void jCreatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCreatebtnActionPerformed

    private void jHRatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHRatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHRatetxtActionPerformed

    private void jSearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchbtnActionPerformed
        // TODO add your handling code here:
        String patient_ID =jSearchtxt.getText();
        Person personDetails = new Person();
        boolean test = false;
        for(Person pd:phistory.getPerson())
        {
            if(String.valueOf(pd.getPersonid()).equals(patient_ID))
            {
                personDetails = pd;

                jPatienttxt.setText(String.valueOf(personDetails.getPersonid()));
                jHospitaltxt.setSelectedItem(personDetails.getHospital());
                //jDoctortxt.setSelectedItem(personDetails.getDoctor());
                System.out.println(personDetails.getHospital());
                test = true;
                break;

            }

        }

        //
    }//GEN-LAST:event_jSearchbtnActionPerformed

    private void jWeighttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWeighttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jWeighttxtActionPerformed

    private void jRRatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRRatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRRatetxtActionPerformed

    private void jSugartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSugartxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSugartxtActionPerformed

    private void jBackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackbtnActionPerformed
        // TODO add your handling code here:
        MainFrame mf = new MainFrame();
        //splitPane.setRightComponent(sa);
        mf.setVisible(true);

        dispose();
    }//GEN-LAST:event_jBackbtnActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorDetailsjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDetailsjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDetailsjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDetailsjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDetailsjFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBackbtn;
    private javax.swing.JButton jCreatebtn;
    private javax.swing.JLabel jDoctorHeading;
    private javax.swing.JLabel jDoctorlbl;
    private javax.swing.JTable jDoctortbl;
    private javax.swing.JComboBox<String> jDoctortxt;
    private javax.swing.JLabel jEncounterlbl;
    private javax.swing.JTextField jEncountertxt;
    private javax.swing.JLabel jHRatelbl;
    private javax.swing.JTextField jHRatetxt;
    private javax.swing.JLabel jHeightlbl;
    private javax.swing.JLabel jHospitallbl;
    private javax.swing.JComboBox<String> jHospitaltxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPatientidlbl;
    private javax.swing.JLabel jPatientlbl;
    private javax.swing.JTextField jPatienttxt;
    private javax.swing.JLabel jRRatelbl;
    private javax.swing.JTextField jRRatetxt;
    private javax.swing.JLabel jRecordlbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearchbtn;
    private javax.swing.JTextField jSearchtxt;
    private javax.swing.JTextField jSugartxt;
    private javax.swing.JLabel jVitallbl;
    private javax.swing.JLabel jWeightlbl;
    private javax.swing.JTextField jWeighttxt;
    // End of variables declaration//GEN-END:variables
}
