/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.HealthcareInterface;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.Hospital.Hospital;
import finalprojectBackend.Enterprise.Hospital.Doc;
import finalprojectUserInterface.MainJFrameForm;
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author supriyaa
 */
public class DoctorSignUp extends javax.swing.JPanel {

    /**
     * Creates new form DoctorSignUp
     */
    
    Random rand = new Random();
    long docnumber = rand.nextInt(900000000) + 100000000;
    
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    
    MainJFrameForm MainLPage;
    //FirebaseHelper firebaseHelper;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    public DoctorSignUp(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        for(Hospital h: operatingSystem.getHospitalDirectory().getListOfHospitals()){
            hospitalList.addItem(h.getEnterpriseName());
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
        lbl_admintitle = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        txtUsrName = new javax.swing.JTextField();
        lbl_pswd = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lbl_address = new javax.swing.JLabel();
        txtAdd = new javax.swing.JTextField();
        txt_City = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txt_state = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txt_Zip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        hospitalList = new javax.swing.JComboBox<>();
        btn_signup = new javax.swing.JButton();
        lbl_speciality = new javax.swing.JLabel();
        lbl_hospname = new javax.swing.JLabel();
        txt_spc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_admintitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_admintitle.setForeground(new java.awt.Color(0, 0, 0));
        lbl_admintitle.setText("Create Doctor Profile");
        jPanel1.add(lbl_admintitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 24, -1, -1));
        jPanel1.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 64, 216, -1));

        lbl_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(0, 0, 0));
        lbl_name.setText("Name:");
        jPanel1.add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        lbl_uname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_uname.setForeground(new java.awt.Color(0, 0, 0));
        lbl_uname.setText("Username:");
        jPanel1.add(lbl_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));
        jPanel1.add(txtUsrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 108, 216, -1));

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_pswd.setForeground(new java.awt.Color(0, 0, 0));
        lbl_pswd.setText("Password:");
        jPanel1.add(lbl_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 152, 216, 27));

        lbl_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(0, 0, 0));
        lbl_address.setText("Address:");
        jPanel1.add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));
        jPanel1.add(txtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 304, 216, 27));

        txt_City.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_City.setForeground(new java.awt.Color(0, 0, 0));
        txt_City.setText("City:");
        jPanel1.add(txt_City, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));
        jPanel1.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 355, 216, 27));

        txt_state.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_state.setForeground(new java.awt.Color(0, 0, 0));
        txt_state.setText("State:");
        jPanel1.add(txt_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));
        jPanel1.add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 400, 216, 27));

        txt_Zip.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Zip.setForeground(new java.awt.Color(0, 0, 0));
        txt_Zip.setText("Zip Code:");
        jPanel1.add(txt_Zip, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));
        jPanel1.add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 220, 30));

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 87, -1));

        hospitalList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jPanel1.add(hospitalList, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 203, 216, -1));

        btn_signup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_signup.setText("Sign Up");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        jPanel1.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 87, -1));

        lbl_speciality.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_speciality.setForeground(new java.awt.Color(0, 0, 0));
        lbl_speciality.setText("Speciality:");
        jPanel1.add(lbl_speciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        lbl_hospname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_hospname.setForeground(new java.awt.Color(0, 0, 0));
        lbl_hospname.setText("Hospital Name:");
        jPanel1.add(lbl_hospname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));
        jPanel1.add(txt_spc, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 250, 216, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/AdobeStock_279753293.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -4, 1420, 1190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1422, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        
        try {
            if(EmpytyFieldValidation())
            {
                if(RegexValidation())
                {
                    String address = txtAdd.getText() + txtCity.getText() + txtState.getText() + txtZip.getText();


                    Doc doctor = new Doc(txtUsrName.getText(), txtPass.getText(), txtUsrName.getText(), txtFullName.getText(), address, "male", String.valueOf(docnumber), new Date(),txt_spc.getText(),hospitalList.getSelectedItem().toString());

                    operatingSystem.addDoctor(doctor);
                    dB4OUtility.storeSystem(operatingSystem);

                    MainJFrameForm suc = new MainJFrameForm();
                    ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
                    suc.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Some Error in entered data.Please check over the red fields to know more.");
                    validationCheck=true;
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Data Cant be empty. Please check over the red fields to know more.");
                emptyValidationStatus=true;
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Patient not registered, Try again");
            emptyValidationStatus=true;
        }
        

    }//GEN-LAST:event_btn_signupActionPerformed


    private boolean RegexValidation() {
    if(!txtFullName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtFullName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtFullName.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        // if(!txtContact.getText().matches("^[0-9]{10}$"))
        // {
        //     txtContact.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        //     txtContact.setToolTipText("Please enter a 10 digit number");
        //     validationCheck=false;
        // }


        if(!txtZip.getText().matches("^[0-9]{5}$"))
        {
            txtZip.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtZip.setToolTipText("Please enter a 5 digit number");
            validationCheck=false;
        }

        // if(!txt_spc.getText().matches("^[0-9]{5}$"))
        // {
        //     txt_spc.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        //     txt_spc.setToolTipText("Please enter a 5 digit number");
        //     validationCheck=false;
        // }

        return validationCheck;


    }   


    private boolean EmpytyFieldValidation() {
        if(txtAdd.getText().equals(null) || txtAdd.getText().trim().isEmpty() )
        {
            txtAdd.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtAdd.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtAdd.getText().equals(null) && !txtAdd.getText().trim().isEmpty() )
        {
            txtAdd.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(txtCity.getText().equals(null) || txtCity.getText().trim().isEmpty() )
        {
            txtCity.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCity.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtCity.getText().equals(null) && !txtCity.getText().trim().isEmpty() )
        {
            txtCity.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(txtFullName.getText().equals(null) || txtFullName.getText().trim().isEmpty() )
        {
            txtFullName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtFullName.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtFullName.getText().equals(null) && !txtFullName.getText().trim().isEmpty() )
        {
            txtFullName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(txtPass.getText().equals(null) || txtPass.getText().trim().isEmpty() )
        {
            txtPass.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPass.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtPass.getText().equals(null) && !txtPass.getText().trim().isEmpty() )
        {
            txtPass.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(txtState.getText().equals(null) || txtState.getText().trim().isEmpty() )
        {
            txtState.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtState.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtState.getText().equals(null) && !txtState.getText().trim().isEmpty() )
        {
            txtState.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(txtUsrName.getText().equals(null) || txtUsrName.getText().trim().isEmpty() )
            {
                txtUsrName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                txtUsrName.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!txtUsrName.getText().equals(null) && !txtUsrName.getText().trim().isEmpty() )
        {
            txtUsrName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(txtZip.getText().equals(null) || txtZip.getText().trim().isEmpty() )
            {
                txtZip.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                txtZip.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!txtZip.getText().equals(null) && !txtZip.getText().trim().isEmpty() )
        {
            txtZip.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(txt_spc.getText().equals(null) || txt_spc.getText().trim().isEmpty() )
            {
                txt_spc.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                txt_spc.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!txt_spc.getText().equals(null) && !txt_spc.getText().trim().isEmpty() )
        {
            txt_spc.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        // if(txtContact.getText().equals(null) || txtContact.getText().trim().isEmpty() )
        //     {
        //         txtContact.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        //         txtContact.setToolTipText("This Field Cannot be empty");
        //         emptyValidationStatus= false;
        //     }
        // if(!txtContact.getText().equals(null) && !txtContact.getText().trim().isEmpty() )
        // {
        //     txtContact.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        // }
        
        return emptyValidationStatus;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_signup;
    private javax.swing.JComboBox<String> hospitalList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_admintitle;
    private javax.swing.JLabel lbl_hospname;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_speciality;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUsrName;
    private javax.swing.JTextField txtZip;
    private javax.swing.JLabel txt_City;
    private javax.swing.JLabel txt_Zip;
    private javax.swing.JTextField txt_spc;
    private javax.swing.JLabel txt_state;
    // End of variables declaration//GEN-END:variables
}
