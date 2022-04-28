/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.Administration;

/**
 *
 * @author supriyaa
 */
public class AdminMainPage extends javax.swing.JPanel {

    /**
     * Creates new form AdminMainPage
     */
    public AdminMainPage() {
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

        jPanel1 = new javax.swing.JPanel();
        Admintitle_lbl = new javax.swing.JLabel();
        username_lbl = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        pass_lbl = new javax.swing.JLabel();
        Passtxt = new javax.swing.JPasswordField();
        Loginbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admintitle_lbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Admintitle_lbl.setText("Administration");
        jPanel1.add(Admintitle_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 210, -1));

        username_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username_lbl.setText("Username:");
        jPanel1.add(username_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, 20));
        jPanel1.add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 197, 30));

        pass_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pass_lbl.setText("Password:");
        jPanel1.add(pass_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, 20));
        jPanel1.add(Passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 197, 30));

        Loginbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Loginbtn.setText("Login");
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/supriyaa/Desktop/INFOfinalproject/info5100-java-final-project/FinalProject/src/Backgrounds/AdobeStock_279753293.jpeg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1062, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        // TODO add your handling code here:
        if (usernametxt.getText().toString().equals("Admin") && Passtxt.getText().toString().equals("Admin")) {
            AdministrationSplitPage ap = new AdministrationSplitPage(mainScreen, dB4OUtil, ecoSystem);

            mainScreen.setContentPane(ap);
            mainScreen.invalidate();
            mainScreen.validate();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect credential");
        }

    }//GEN-LAST:event_LoginbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admintitle_lbl;
    private javax.swing.JButton Loginbtn;
    private javax.swing.JPasswordField Passtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pass_lbl;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
