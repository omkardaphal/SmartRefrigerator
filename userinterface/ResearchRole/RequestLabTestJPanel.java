/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ResearchRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HealthCare.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Refrigerator.ConsumedProudcts;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
    private ConsumedProudcts consumedProudcts;
     String id;
   

    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel userProcessContainer, String id, ConsumedProudcts consumedProudcts, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.organization = organization;
        this.consumedProudcts = consumedProudcts;
        this.id=id;
       
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        requestTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton);
        requestTestJButton.setBounds(190, 140, 140, 25);

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ResearchRole/back-icon.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(0, 470, 110, 41);

        valueLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(200, 90, 170, 17);

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        enterpriseLabel.setText("ID:");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(120, 80, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ResearchRole/lab and research.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, -70, 600, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        LabTestWorkRequest request = new LabTestWorkRequest();
        request.setMessage("Check Status ");
        request.setSender(userAccount);
     
        request.setStatus("Sent");
        request.setProductDirectory(consumedProudcts);
        request.setResult("Waiting");
        request.setFamilyID(id);
        

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof LabOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            //userAccount.getWorkQueue().getWorkRequestList().add(request);
        }

        JOptionPane.showMessageDialog(null, "Request sent!", "Informaton", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //    ResearchRoleWorkAreaJPanel dwjp = (ResearchRoleWorkAreaJPanel) component;
        // dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
