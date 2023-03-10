/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import javax.swing.JOptionPane;
import Source.DoctorDirectory;
import Source.Doctor;
/**
 *
 * @author srikr
 */
public class DoctorLoginjFrame extends javax.swing.JFrame {

    /**
     * Creates new form DoctorLoginjFrame
     */
    private DoctorDirectory doctors;
    int personid;
    public DoctorLoginjFrame() {
        initComponents();
        setExtendedState(MainFrame.MAXIMIZED_BOTH);
        this.doctors = new DoctorDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jUsernametxt = new javax.swing.JTextField();
        jPasswordlbl = new javax.swing.JLabel();
        jLoginbtn = new javax.swing.JButton();
        jCancelbtn = new javax.swing.JButton();
        jDoctorHeading = new javax.swing.JLabel();
        jUsernamelbl = new javax.swing.JLabel();
        jBackbtn = new javax.swing.JButton();
        jPasswordtxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DOCTOR LOGIN");

        jPasswordlbl.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jPasswordlbl.setText("PASSWORD");

        jLoginbtn.setBackground(new java.awt.Color(255, 204, 51));
        jLoginbtn.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLoginbtn.setText("LOGIN");
        jLoginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginbtnActionPerformed(evt);
            }
        });

        jCancelbtn.setBackground(new java.awt.Color(255, 204, 51));
        jCancelbtn.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jCancelbtn.setText("CLEAR");
        jCancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelbtnActionPerformed(evt);
            }
        });

        jDoctorHeading.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jDoctorHeading.setText("DOCTOR LOGIN");

        jUsernamelbl.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jUsernamelbl.setText("USERNAME");

        jBackbtn.setBackground(new java.awt.Color(255, 204, 51));
        jBackbtn.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jBackbtn.setText("BACK");
        jBackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(620, 620, 620)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jUsernamelbl)
                    .addComponent(jBackbtn)
                    .addComponent(jPasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordlbl)
                    .addComponent(jLoginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDoctorHeading))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBackbtn, jCancelbtn});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordtxt, jUsernametxt});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDoctorHeading)
                .addGap(100, 100, 100)
                .addComponent(jUsernamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUsernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLoginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBackbtn)
                .addGap(0, 161, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBackbtn, jCancelbtn});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswordtxt, jUsernametxt});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginbtnActionPerformed
        // TODO add your handling code here:
        String usn = jUsernametxt.getText();
        String pwd = jPasswordtxt.getText();
        int s=0;
        for(Doctor p : doctors.getDoctors()){
            int pid = p.getPersonid();
            String pass = p.getDocPassword();
            String uname = p.getDocUsername();
            if (pwd.equals(pass) && (usn.equals(uname)))
            {
                s=1;
                personid=pid;
                DoctorDetailsjFrame ddf = new DoctorDetailsjFrame();
                ddf.setVisible(true);
                dispose();
            }
        }
        if(s==0){
            JOptionPane.showMessageDialog(this ,"Please enter correct Username and Password ");
        }
    }//GEN-LAST:event_jLoginbtnActionPerformed

    private void jCancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelbtnActionPerformed
        // TODO add your handling code here:
        jUsernametxt.setText(null);
        jPasswordtxt.setText(null);
    }//GEN-LAST:event_jCancelbtnActionPerformed

    private void jBackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackbtnActionPerformed
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
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
            java.util.logging.Logger.getLogger(DoctorLoginjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorLoginjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorLoginjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorLoginjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorLoginjFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBackbtn;
    private javax.swing.JButton jCancelbtn;
    private javax.swing.JLabel jDoctorHeading;
    private javax.swing.JButton jLoginbtn;
    private javax.swing.JLabel jPasswordlbl;
    private javax.swing.JPasswordField jPasswordtxt;
    private javax.swing.JLabel jUsernamelbl;
    private javax.swing.JTextField jUsernametxt;
    // End of variables declaration//GEN-END:variables
}
