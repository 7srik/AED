/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;
import Company.Employee;
import Company.Employees;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Tag.OPTION;
/**
 *
 * @author srikr
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    private Employees employees;
    CreatePanel(Employees employees) {
        initComponents();
        this.employees=employees;
    }
    int g = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGenderGroup = new javax.swing.ButtonGroup();
        jAge = new javax.swing.JLabel();
        jLGBTQ = new javax.swing.JRadioButton();
        jPhoneNo = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();
        jFemale = new javax.swing.JRadioButton();
        jMale = new javax.swing.JRadioButton();
        jCreate = new javax.swing.JButton();
        jEmailId = new javax.swing.JLabel();
        jPanelImage = new javax.swing.JPanel();
        jImage = new javax.swing.JLabel();
        jEmployeeId = new javax.swing.JLabel();
        jTeamInfo = new javax.swing.JLabel();
        jEmployeeIdtf = new javax.swing.JTextField();
        jEmployee = new javax.swing.JLabel();
        jGender = new javax.swing.JLabel();
        jStartDate = new javax.swing.JLabel();
        jEmailidtf = new javax.swing.JTextField();
        jAgetf = new javax.swing.JTextField();
        jPositionTitletf = new javax.swing.JTextField();
        jLevel = new javax.swing.JLabel();
        jPhoneNotf = new javax.swing.JTextField();
        jLeveltf = new javax.swing.JTextField();
        jTeamInfotf = new javax.swing.JTextField();
        jNametf = new javax.swing.JTextField();
        jPositionTitle = new javax.swing.JLabel();
        jStartDatetf = new com.toedter.calendar.JDateChooser();
        jBrowse = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jAge.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jAge.setText("Age");

        jGenderGroup.add(jLGBTQ);
        jLGBTQ.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLGBTQ.setText("LGBTQ+");
        jLGBTQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLGBTQActionPerformed(evt);
            }
        });

        jPhoneNo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPhoneNo.setText("Phone No");

        jName.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jName.setText("Name");

        jGenderGroup.add(jFemale);
        jFemale.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jFemale.setText("Female");
        jFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFemaleActionPerformed(evt);
            }
        });

        jGenderGroup.add(jMale);
        jMale.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jMale.setText("Male");
        jMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaleActionPerformed(evt);
            }
        });

        jCreate.setBackground(new java.awt.Color(255, 204, 0));
        jCreate.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jCreate.setText("Create");
        jCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateActionPerformed(evt);
            }
        });

        jEmailId.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jEmailId.setText("Email ID");

        javax.swing.GroupLayout jPanelImageLayout = new javax.swing.GroupLayout(jPanelImage);
        jPanelImage.setLayout(jPanelImageLayout);
        jPanelImageLayout.setHorizontalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jImage, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelImageLayout.setVerticalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jImage, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        jEmployeeId.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jEmployeeId.setText("Employee ID");

        jTeamInfo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTeamInfo.setText("Team Info");

        jEmployeeIdtf.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jEmployee.setBackground(new java.awt.Color(255, 255, 255));
        jEmployee.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jEmployee.setText("Employee Details");

        jGender.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jGender.setText("Gender");

        jStartDate.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jStartDate.setText("Start Date");

        jEmailidtf.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jAgetf.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jAgetf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jAgetfKeyTyped(evt);
            }
        });

        jPositionTitletf.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jLevel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLevel.setText("Level");

        jPhoneNotf.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPhoneNotf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPhoneNotfKeyTyped(evt);
            }
        });

        jLeveltf.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jTeamInfotf.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jNametf.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jNametf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNametfKeyTyped(evt);
            }
        });

        jPositionTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPositionTitle.setText("Position Title");

        jStartDatetf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jStartDatetfKeyTyped(evt);
            }
        });

        jBrowse.setText("Browse Image");
        jBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jStartDate)
                            .addComponent(jEmployeeId)
                            .addComponent(jAge)
                            .addComponent(jTeamInfo)
                            .addComponent(jName)
                            .addComponent(jPositionTitle)
                            .addComponent(jPhoneNo)
                            .addComponent(jEmailId))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jAgetf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFemale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLGBTQ))
                            .addComponent(jPositionTitletf)
                            .addComponent(jNametf)
                            .addComponent(jEmployeeIdtf, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(jTeamInfotf, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(jPhoneNotf, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(jEmailidtf, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jStartDatetf, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLevel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLeveltf))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jEmployee)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBrowse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(335, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jEmailidtf, jEmployeeIdtf, jPhoneNotf, jTeamInfotf});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jEmployee)
                        .addGap(33, 33, 33)
                        .addComponent(jBrowse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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
                    .addComponent(jStartDate)
                    .addComponent(jStartDatetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLeveltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTeamInfotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTeamInfo))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addComponent(jCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jAgetf, jEmailidtf, jEmployeeIdtf, jLeveltf, jNametf, jPhoneNotf, jPositionTitletf, jStartDatetf, jTeamInfotf});

    }// </editor-fold>//GEN-END:initComponents

    private void jLGBTQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLGBTQActionPerformed
        // TODO add your handling code here:
        if (jLGBTQ.isSelected()) {
            g=3;
        }
    }//GEN-LAST:event_jLGBTQActionPerformed

    private void jFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFemaleActionPerformed
        // TODO add your handling code here:
        if (jFemale.isSelected()) {
            g=2;
        }
    }//GEN-LAST:event_jFemaleActionPerformed

    private void jMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaleActionPerformed
        // TODO add your handling code here:
        if (jMale.isSelected()) {
            g=1;
        }
    }//GEN-LAST:event_jMaleActionPerformed

    private void jCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateActionPerformed
        // TODO add your handling code here:
        if(jNametf.getText().isEmpty() || jEmployeeIdtf.getText().isEmpty() || jAgetf.getText().isEmpty() 
                || jLeveltf.getText().isEmpty() || jTeamInfotf.getText().isEmpty() || jPositionTitletf.getText().isEmpty() 
                || jPhoneNotf.getText().isEmpty() || jEmailidtf.getText().isEmpty() || g==0) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String date="";
        try{
            date=sdf.format(jStartDatetf.getDate());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please Enter Start Date");
            return;
        }
        Employee employee=employees.addEmployee(); 
        employee.setName(jNametf.getText());
        employee.setEmployeeId(jEmployeeIdtf.getText());
        employee.setAge(Integer.parseInt(jAgetf.getText()));
        switch (g) {
            case 1 -> employee.setGender(jMale.getText());
            case 2 -> employee.setGender(jFemale.getText());
            default -> employee.setGender(jLGBTQ.getText());
        }
        employee.setStartDate(date);
        employee.setLevel(jLeveltf.getText());
        employee.setTeamInfo(jTeamInfotf.getText());
        employee.setPositionTitle(jPositionTitletf.getText());
        employee.setPhoneNumber(Long.parseLong(jPhoneNotf.getText()));
        employee.setEmailId(jEmailidtf.getText());
        
        JOptionPane.showMessageDialog(null, "Employee Profile Created Successfully");
        jNametf.setText("");
        jEmployeeIdtf.setText("");
        jAgetf.setText("");
        jMale.setSelected(false);
        jFemale.setSelected(false);
        jLGBTQ.setSelected(false);
        jStartDatetf.setDate(null);
        jLeveltf.setText("");
        jTeamInfotf.setText("");
        jPositionTitletf.setText("");
        jPhoneNotf.setText("");
        jEmailidtf.setText("");
    }//GEN-LAST:event_jCreateActionPerformed

    private void jBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrowseActionPerformed
        /*TODO add your handling code here:
        JFileChooser imageFile = new JFileChooser();
        int showOpenDialog = imageFile.showOpenDialog(null);
        if (showOpenDialog == APPROVE_OPTION){
            File selImageFile = imageFile.getSelectedFile()
        }*/
    }//GEN-LAST:event_jBrowseActionPerformed

    private void jAgetfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAgetfKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jAgetfKeyTyped

    private void jNametfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNametfKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jNametfKeyTyped

    private void jPhoneNotfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPhoneNotfKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jPhoneNotfKeyTyped

    private void jStartDatetfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jStartDatetfKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
        if((!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_jStartDatetfKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAge;
    private javax.swing.JTextField jAgetf;
    private javax.swing.JButton jBrowse;
    private javax.swing.JButton jCreate;
    private javax.swing.JLabel jEmailId;
    private javax.swing.JTextField jEmailidtf;
    private javax.swing.JLabel jEmployee;
    private javax.swing.JLabel jEmployeeId;
    private javax.swing.JTextField jEmployeeIdtf;
    private javax.swing.JRadioButton jFemale;
    private javax.swing.JLabel jGender;
    private javax.swing.ButtonGroup jGenderGroup;
    private javax.swing.JLabel jImage;
    private javax.swing.JRadioButton jLGBTQ;
    private javax.swing.JLabel jLevel;
    private javax.swing.JTextField jLeveltf;
    private javax.swing.JRadioButton jMale;
    private javax.swing.JLabel jName;
    private javax.swing.JTextField jNametf;
    private javax.swing.JPanel jPanelImage;
    private javax.swing.JLabel jPhoneNo;
    private javax.swing.JTextField jPhoneNotf;
    private javax.swing.JLabel jPositionTitle;
    private javax.swing.JTextField jPositionTitletf;
    private javax.swing.JLabel jStartDate;
    private com.toedter.calendar.JDateChooser jStartDatetf;
    private javax.swing.JLabel jTeamInfo;
    private javax.swing.JTextField jTeamInfotf;
    // End of variables declaration//GEN-END:variables
}
