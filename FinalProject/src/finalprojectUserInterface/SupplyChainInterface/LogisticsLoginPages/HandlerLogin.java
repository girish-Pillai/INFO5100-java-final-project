/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.SupplyChainInterface.LogisticsLoginPages;

import javax.swing.table.DefaultTableModel;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.SupplyChain.Handler;
import finalprojectBackend.Organization.DonationAssignment;

import finalprojectUserInterface.MainJFrameForm;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author supriyaa
 */
public class HandlerLogin extends javax.swing.JPanel {

    /**
     * Creates new form HandlerLogin
     */
    MainJFrameForm MainLPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    Handler ho;

    public HandlerLogin(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, Handler ho) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.ho = ho;
        populateTable(ho.getUserName().toLowerCase());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        LogoutBtn = new javax.swing.JButton();
        StatusLbl = new javax.swing.JLabel();
        status_txt = new javax.swing.JTextField();
        StatusBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Blood group", "Entity name", "Status", "Donor Enterprise", "Receiver Enterprise", "Patient Name", "Donor name", "ID"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 871, 270));

        LogoutBtn.setBackground(new java.awt.Color(255, 204, 204));
        LogoutBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 150, 30));

        StatusLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StatusLbl.setText("Status:");
        jPanel1.add(StatusLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 70, -1));

        status_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_txtActionPerformed(evt);
            }
        });
        jPanel1.add(status_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 150, 30));

        StatusBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        StatusBtn.setText("Add Status");
        StatusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusBtnActionPerformed(evt);
            }
        });
        jPanel1.add(StatusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/delivery.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1565, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 978, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void StatusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tb1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to add status");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        String id = model.getValueAt(selectedRow, 8).toString();
        //System.out.println("column count " + selectedRow);

        for (DonationAssignment c : operatingSystem.getDonationAssignmentList()) {
            try {
                if (c.getId().equals(id)) {
                    c.setDonationStatus(status_txt.getText().toString());
                }
            } catch (Exception e) {

            }
        }

        dB4OUtility.storeSystem(operatingSystem);
        populateTable(ho.getUserName());
    }//GEN-LAST:event_StatusBtnActionPerformed

    private void status_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status_txtActionPerformed

    private void populateTable(String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonationAssignment d : operatingSystem.getDonationAssignmentList()) {
            
            try{
                //System.out.println("print: "+d.getHandler().getUname()+" "+d.getHandler().getUname().matches(name));
            if (d.getHandler().getUserName().matches(name)) {
                Object[] row = new Object[9];
                row[0] = d.getType();
                row[1] = d.getbGroup();
                row[2] = d.getDonationEntityName();
                row[3] = d.getDonationStatus();
                try {
                    row[4] = d.getDonEnterprise().getEnterpriseName();
                } catch (Exception e) {

                }

                try {
                    row[5] = d.getRecEnterprise().getEnterpriseName();
                } catch (Exception e) {

                }
                try {
                    row[6] = d.getRecPatient().getPersonName();
                } catch (Exception e) {

                }
                try {
                    row[7] = d.getDonPatient().getPersonName();
                } catch (Exception e) {

                }
                row[8] = d.getId();

                model.addRow(row);
            }
            }catch(Exception e){
                //System.out.println("error: ");
//                e.printStackTrace();
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton StatusBtn;
    private javax.swing.JLabel StatusLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField status_txt;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
