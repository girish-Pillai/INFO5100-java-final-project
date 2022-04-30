/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.HospitalInterface;

import javax.swing.JOptionPane;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.Hospital.Doc;
import finalprojectBackend.Enterprise.Hospital.Patient;
import finalprojectBackend.Enterprise.Hospital.Hospital;
import finalprojectUserInterface.HospitalInterface.LoginPage.AdminLogin;
import finalprojectUserInterface.HospitalInterface.LoginPage.HospitalDoctorLoginPages.DoctorLogin;
import finalprojectUserInterface.HospitalInterface.LoginPage.HospitalPatientLoginPages.PatientLogin;
import finalprojectUserInterface.MainJFrameForm;


/**
 *
 * @author girish
 */
public class HospitalLandingPage extends javax.swing.JPanel {

    /**
     * Creates new form MainJpanel
     */
    
    MainJFrameForm MainLPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    
    public HospitalLandingPage(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
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
        cmbxRole = new javax.swing.JComboBox<>();
        lbUsername = new javax.swing.JLabel();
        lbBostonHospital = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();
        btSignUp = new javax.swing.JButton();
        lbRoleName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbxRole.setEditable(true);
        cmbxRole.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Nurse", "Doctor","Hospital Admin"}));
        cmbxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxRoleActionPerformed(evt);
            }
        });
        jPanel1.add(cmbxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 220, 40));

        lbUsername.setBackground(new java.awt.Color(0, 0, 0));
        lbUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(0, 0, 0));
        lbUsername.setText("Username:");
        jPanel1.add(lbUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 90, 30));

        lbBostonHospital.setBackground(new java.awt.Color(0, 0, 0));
        lbBostonHospital.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lbBostonHospital.setForeground(new java.awt.Color(0, 0, 0));
        lbBostonHospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBostonHospital.setText("Boston Hospital");
        jPanel1.add(lbBostonHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 240, 60));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 220, 40));

        lbPassword.setBackground(new java.awt.Color(0, 0, 0));
        lbPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(0, 0, 0));
        lbPassword.setText("Password:");
        jPanel1.add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 80, 30));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 220, 40));

        btLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 220, 40));

        btSignUp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSignUp.setText("Sign Up");
        btSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 220, 40));

        lbRoleName.setBackground(new java.awt.Color(0, 0, 0));
        lbRoleName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRoleName.setForeground(new java.awt.Color(0, 0, 0));
        lbRoleName.setText("RoleName:");
        jPanel1.add(lbRoleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 170, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/AdobeStock_279753293.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 1110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxRoleActionPerformed
        // TODO add your handling code here:
        System.out.println(cmbxRole.getSelectedItem().toString());
        if (cmbxRole.getSelectedItem().toString() == "Admin") {
            btSignUp.setEnabled(false);
        } else {
            btSignUp.setEnabled(true);
        }
    }//GEN-LAST:event_cmbxRoleActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        // TODO add your handling code here:
        try{
            if (cmbxRole.getSelectedItem().toString() == "Hospital Admin") {
                Hospital ho = (Hospital) operatingSystem.loginAuthentication(txtUsername.getText(), txtPassword.getText());
                if(ho == null){
                    JOptionPane.showMessageDialog(this, "Incorrect credential");
                }else{
                    AdminLogin ap = new AdminLogin(MainLPage, dB4OUtility, operatingSystem, ho);
                    MainLPage.setContentPane(ap);
                    MainLPage.invalidate();
                    MainLPage.validate();
                    return;
                }

            }
        }catch(Exception e){

        }

        if (cmbxRole.getSelectedItem().toString() == "Patient") {
            System.out.println("selecteditem");
            Patient pa = (Patient) operatingSystem.loginAuthentication(txtUsername.getText(), txtPassword.getText());
            if (pa == null) {
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            } else {
                PatientLogin pl = new PatientLogin(MainLPage, dB4OUtility, operatingSystem, pa);
                MainLPage.setContentPane(pl);
                MainLPage.invalidate();
                MainLPage.validate();
                return;
            }
        }

        if (cmbxRole.getSelectedItem().toString() == "Doctor") {
            System.out.println("selecteditem");
            Doc dr = (Doc) operatingSystem.loginAuthentication(txtUsername.getText(), txtPassword.getText());
            if (dr == null) {
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            } else {
                DoctorLogin dl = new DoctorLogin(MainLPage, dB4OUtility, operatingSystem, dr);
                MainLPage.setContentPane(dl);
                MainLPage.invalidate();
                MainLPage.validate();
                return;
            }
        }

        if (cmbxRole.getSelectedItem().toString() == "Nurse") {

            JOptionPane.showMessageDialog(this, "Not allowed to login.");

        }
    }//GEN-LAST:event_btLoginActionPerformed

    private void btSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignUpActionPerformed
        // TODO add your handling code here:

        if (cmbxRole.getSelectedItem().toString() == "Doctor") {

            DoctorSignUp doc = new DoctorSignUp(MainLPage, dB4OUtility, operatingSystem);
            MainLPage.setContentPane(doc);
            MainLPage.invalidate();
            MainLPage.validate();

            //            this.setContentPane(docsign);
            //            this.invalidate();
            //            this.validate();
            return;

        }
        if (cmbxRole.getSelectedItem().toString() == "Nurse") {

            //            this.setContentPane(nursesign);
            //            this.invalidate();
            //            this.validate();
            NurseSignUp n = new NurseSignUp(MainLPage, dB4OUtility, operatingSystem);

            //suc.setVisible(true);
            MainLPage.setContentPane(n);
            //             this.add(s);

            MainLPage.invalidate();
            MainLPage.validate();

        }

        if (cmbxRole.getSelectedItem().toString() == "Patient") {

            PatientSignUp signpat = new PatientSignUp(MainLPage, dB4OUtility, operatingSystem);

            //suc.setVisible(true);
            MainLPage.setContentPane(signpat);
            //             this.add(s);

            MainLPage.invalidate();
            MainLPage.validate();

        }

        if (cmbxRole.getSelectedItem().toString() == "Hospital Admin") {
            //System.out.println("Hospital");
            HospitalAdminSignUp s = new HospitalAdminSignUp(MainLPage, dB4OUtility, operatingSystem);

            //suc.setVisible(true);
            MainLPage.setContentPane(s);
            //             this.add(s);

            MainLPage.invalidate();
            MainLPage.validate();

        }
    }//GEN-LAST:event_btSignUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btSignUp;
    private javax.swing.JComboBox<String> cmbxRole;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBostonHospital;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbRoleName;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
