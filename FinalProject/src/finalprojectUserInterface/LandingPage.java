/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface;

/**
 *
 * @author giris
 */
public class LandingPage extends javax.swing.JPanel {

    /**
     * Creates new form LandingPage
     */
    public LandingPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LandingPage = new javax.swing.JPanel();
        cmb_Role = new javax.swing.JComboBox<>();
        lbl_username = new javax.swing.JLabel();
        lbl_Hosptitle = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbl_pswd = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btnSignin = new javax.swing.JButton();
        lbl_role = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        LandingPage.setBackground(new java.awt.Color(255, 153, 153));
        LandingPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmb_Role.setEditable(true);
        cmb_Role.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmb_Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Nurse", "Doctor","Hospital Admin"}));
        cmb_Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_RoleActionPerformed(evt);
            }
        });
        LandingPage.add(cmb_Role, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 197, -1));

        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_username.setText("Username:");
        LandingPage.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        lbl_Hosptitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_Hosptitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Hosptitle.setText("Boston Hospital");
        lbl_Hosptitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LandingPage.add(lbl_Hosptitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 290, 90));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        LandingPage.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 200, -1));

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_pswd.setText("Password:");
        LandingPage.add(lbl_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));
        LandingPage.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 197, -1));

        btn_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        LandingPage.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 100, 40));

        btnSignin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSignin.setText("Sign Up");
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });
        LandingPage.add(btnSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 379, 100, 40));

        lbl_role.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_role.setText("Role:");
        LandingPage.add(lbl_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 60, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/supriyaa/Desktop/INFOfinalproject/info5100-java-final-project/FinalProject/src/Backgrounds/1282794.jpg")); // NOI18N
        LandingPage.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 1040));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LandingPage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LandingPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_RoleActionPerformed
        // TODO add your handling code here:
        System.out.println(cmb_Role.getSelectedItem().toString());
        if (cmb_Role.getSelectedItem().toString() == "Admin") {
            btnSignin.setEnabled(false);
        } else {
            btnSignin.setEnabled(true);
        }
    }//GEN-LAST:event_cmb_RoleActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        try{
            if (cmb_Role.getSelectedItem().toString() == "Hospital Admin") {
                Hospital ho = (Hospital) ecoSystem.loginCheck(txtUsername.getText(), txtPassword.getText());
                if(ho == null){
                    JOptionPane.showMessageDialog(this, "Incorrect credential");
                }else{
                    AdminLogin ap = new AdminLogin(mainScreen, dB4OUtil, ecoSystem, ho);
                    mainScreen.setContentPane(ap);
                    mainScreen.invalidate();
                    mainScreen.validate();
                    return;
                }

            }
        }catch(Exception e){

        }

        if (cmb_Role.getSelectedItem().toString() == "Patient") {
            System.out.println("selecteditem");
            Patient pa = (Patient) ecoSystem.loginCheck(txtUsername.getText(), txtPassword.getText());
            if (pa == null) {
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            } else {
                PatientLogin pl = new PatientLogin(mainScreen, dB4OUtil, ecoSystem, pa);
                mainScreen.setContentPane(pl);
                mainScreen.invalidate();
                mainScreen.validate();
                return;
            }
        }

        if (cmb_Role.getSelectedItem().toString() == "Doctor") {
            System.out.println("selecteditem");
            Doctor dr = (Doctor) ecoSystem.loginCheck(txtUsername.getText(), txtPassword.getText());
            if (dr == null) {
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            } else {
                DoctorLogin dl = new DoctorLogin(mainScreen, dB4OUtil, ecoSystem, dr);
                mainScreen.setContentPane(dl);
                mainScreen.invalidate();
                mainScreen.validate();
                return;
            }
        }

        if (cmb_Role.getSelectedItem().toString() == "Nurse") {

            JOptionPane.showMessageDialog(this, "Not allowed to login.");

        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        // TODO add your handling code here:

        if (cmb_Role.getSelectedItem().toString() == "Doctor") {

            SignUpDoctor doc = new SignUpDoctor(mainScreen, dB4OUtil, ecoSystem);
            mainScreen.setContentPane(doc);
            mainScreen.invalidate();
            mainScreen.validate();

            //            this.setContentPane(docsign);
            //            this.invalidate();
            //            this.validate();
            return;

        }
        if (cmb_Role.getSelectedItem().toString() == "Nurse") {

            //            this.setContentPane(nursesign);
            //            this.invalidate();
            //            this.validate();
            SignUpNurse n = new SignUpNurse(mainScreen, dB4OUtil, ecoSystem);

            //suc.setVisible(true);
            mainScreen.setContentPane(n);
            //             this.add(s);

            mainScreen.invalidate();
            mainScreen.validate();

        }

        if (cmb_Role.getSelectedItem().toString() == "Patient") {

            SignUpPatient signpat = new SignUpPatient(mainScreen, dB4OUtil, ecoSystem);

            //suc.setVisible(true);
            mainScreen.setContentPane(signpat);
            //             this.add(s);

            mainScreen.invalidate();
            mainScreen.validate();

        }

        if (cmb_Role.getSelectedItem().toString() == "Hospital Admin") {
            //System.out.println("Hospital");
            SignUpHospitalAdmin s = new SignUpHospitalAdmin(mainScreen, dB4OUtil, ecoSystem);

            //suc.setVisible(true);
            mainScreen.setContentPane(s);
            //             this.add(s);

            mainScreen.invalidate();
            mainScreen.validate();

        }
    }//GEN-LAST:event_btnSigninActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LandingPage;
    private javax.swing.JButton btnSignin;
    private javax.swing.JButton btn_login;
    private javax.swing.JComboBox<String> cmb_Role;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_Hosptitle;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
