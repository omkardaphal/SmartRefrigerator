/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FamilyRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Community.FamilyOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class FamilyRoleWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private FamilyOrganization organization;
    private Enterprise enterprise;

    /**
     * Creates new form FamilyRefrigeratorJPanel
     */
    public FamilyRoleWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FamilyOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.organization = organization;
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setProudctBtn = new javax.swing.JButton();
        refrigeratorBtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        setProudctBtn.setBackground(new java.awt.Color(153, 153, 153));
        setProudctBtn.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        setProudctBtn.setText("Set Proudcts ");
        setProudctBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setProudctBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setProudctBtnActionPerformed(evt);
            }
        });
        add(setProudctBtn);
        setProudctBtn.setBounds(320, 110, 70, 30);

        refrigeratorBtn1.setBackground(new java.awt.Color(153, 153, 153));
        refrigeratorBtn1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        refrigeratorBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrigeratorBtn1ActionPerformed(evt);
            }
        });
        add(refrigeratorBtn1);
        refrigeratorBtn1.setBounds(200, 210, 20, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/FamilyRole/ref.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(-6, -6, 590, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void setProudctBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setProudctBtnActionPerformed
        SetFamilyRefPeoudcts panel = new SetFamilyRefPeoudcts(userProcessContainer, enterprise,
                organization, userAccount, business);
        userProcessContainer.add("SetFamilyRefPeoudcts", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_setProudctBtnActionPerformed

    private void refrigeratorBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrigeratorBtn1ActionPerformed
        // TODO add your handling code here:
        FamilyRefrigeratorWorkQueue panel = new FamilyRefrigeratorWorkQueue(userProcessContainer, enterprise,
                organization, userAccount, business);
        userProcessContainer.add("SetFamilyRefPeoudcts", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_refrigeratorBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton refrigeratorBtn1;
    private javax.swing.JButton setProudctBtn;
    // End of variables declaration//GEN-END:variables
}
